/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Conexao.ConectorMySql;
import Model.Estoque;
import Model.Produto;
import Model.Vendas;
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
           JOptionPane.showMessageDialog(null," Erro ao encontrar produto!"+ ex);
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
    
    public void atualizaQtde (String operador, int qtde, int codProd ) {
          
        Connection con = ConectorMySql.getConnection();
        PreparedStatement stmt = null;
        
        
        try {
            
           if((operador).equals("soma")){
               stmt = con.prepareStatement("update estoque set qtde = qtde + ? where idProduto = ?");
           }else if((operador).equals("diminui")){
               stmt = con.prepareStatement("update estoque set qtde = qtde - ? where idProduto = ?");
           }
           stmt.setInt(1, qtde);
           stmt.setInt(2, codProd);
           
           stmt.executeUpdate();
           
           } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null," Erro ao dar baixa no estoque: "+ ex);
        }finally{
           ConectorMySql.closeConnection(con, stmt);
        }
              
      
      }
    
}
