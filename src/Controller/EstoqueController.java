/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Conexao.ConectorMySql;
import Model.Estoque;
import Model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Karina
 */
public class EstoqueController {
    
      
    public Estoque RecuperaEstoqueProduto(int produtoId) {
        
       Connection con = ConectorMySql.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
       try {
            stmt = con.prepareStatement("select * from estoque where idProduto = ?");
            stmt.setInt(1, produtoId);
            rs = stmt.executeQuery();
            Estoque estoque = new Estoque();
            while(rs.next())
            {
              estoque.setQuantidade(rs.getInt("qtde"));
              estoque.setProdutoId(rs.getInt("idProduto"));
            }
            return estoque;
            } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null," Erro ao retonar!"+ ex);
       }finally{
          ConectorMySql.closeConnection(con, stmt, rs);
       }
       return null;
    }
    
    public void Salvar(Estoque estoque) {
        
       Connection con = ConectorMySql.getConnection();
       PreparedStatement stmt = null;
       
       try {
            stmt = con.prepareStatement("delete from estoque where idProduto = ?");
            stmt.setInt(1, estoque.getProdutoId());
            stmt.executeUpdate();
            
            stmt = null;
            stmt = con.prepareStatement("insert into estoque (qtde, idProduto) values (?, ?)");
            stmt.setInt(1, estoque.getQuantidade());
            stmt.setInt(2, estoque.getProdutoId());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Salvo com sucesso!");
            
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null," Erro ao salvar estoque!"+ ex);
       }finally{
          ConectorMySql.closeConnection(con, stmt);
       }
       
    }
    public void Estoqueupdate(Estoque est) {

    java.sql.Connection con = ConectorMySql.getConnection();
    PreparedStatement stmt = null;


    try {
        stmt = con.prepareStatement("update estoque set qtde = ?,idProduto= ? where idProduto = ?");
      
       stmt.setInt(1,est.getProdutoId());
       stmt.setInt(2,est.getQuantidade());
       
       
       stmt.executeUpdate();
       JOptionPane.showMessageDialog(null," Estoque atualizado!");

       } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null," Estoque não existe!"+ ex);
    }finally{
       ConectorMySql.closeConnection(con, stmt);
    }



  }
     public void createEstoque (Estoque est) {

    Connection con = ConectorMySql.getConnection();
    PreparedStatement stmt = null;


    try {
       stmt = con.prepareStatement("insert into produto (idProduto,qtde) values( ?, ?)");
       stmt.setInt(1, est.getProdutoId());
       stmt.setInt(2,est.getQuantidade());

       stmt.executeUpdate();
       JOptionPane.showMessageDialog(null," Salvo com sucesso!");

       } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null," Erro ao salvar!"+ ex);
    }finally{
       ConectorMySql.closeConnection(con, stmt);
    }



  }
    public Estoque pesquisaEstoque (int codest) { //Declaração da função recebendo um o idTipoVenda que foi digitado na tela

    Connection con = ConectorMySql.getConnection();
    PreparedStatement stmt = null;
    ResultSet rs = null;
    Estoque est = new Estoque();
    

    try {
       stmt = con.prepareStatement("select idProduto, qtde from estoque where idProduto = ?");
       stmt.setInt(1, codest); //substitui no SELECT o interrogação pelo código que veio por parametro
       rs = stmt.executeQuery();

       if(rs.next()){

            est.setProdutoId(rs.getInt("idProduto"));
            est.setQuantidade(rs.getInt("qtde"));
            return est;

        }else{
           return null; //caso não encontre o código, retorna nulo.
       }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null," Erro ao encontrar o produto: "+ ex);
    }finally{
       ConectorMySql.closeConnection(con, stmt, rs);
    }
    return null; //returno apenas para satisfazer warning do IDE
}
}
