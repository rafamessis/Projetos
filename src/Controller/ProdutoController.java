/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Conexao.ConectorMySql;
import Model.Produto;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Model.Categorias;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;



/**
 *
 * @author Rafael
 */


public class ProdutoController {

  public void create (Produto p) {

    Connection con = ConectorMySql.getConnection();
    PreparedStatement stmt = null;


    try {
       stmt = con.prepareStatement("insert into produto (nomeProd,codSKU,idcategoria,precoCompra,idFornecedor,qtdmin) "
               + "values( ?, ?, ?, ?, ?, ?)");
       stmt.setString(1,p.getNomeProd());
       stmt.setInt(2,p.getCodSKU());
       stmt.setInt(3,p.getIdCategoria());
       stmt.setFloat(4, p.getPrecoCompra());
       stmt.setInt(5,p.getIdFornecedor());
       stmt.setInt(6,p.getQtdmin());

       stmt.executeUpdate();
       JOptionPane.showMessageDialog(null," Salvo com sucesso!");

       } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null," Erro ao salvar!"+ ex);
    }finally{
       ConectorMySql.closeConnection(con, stmt);
    }



  }

  public List<Produto> read(){
    java.sql.Connection con = ConectorMySql.getConnection();
    PreparedStatement stmt = null;
    ResultSet rs = null;


    List<Produto> produtos = new ArrayList<>();

      try {
          stmt = con.prepareStatement("select * from produto ");
          rs = stmt.executeQuery();

          while(rs.next()){
              Produto prod = new Produto();

              prod.setIdProduto(rs.getInt("idProduto"));
              prod.setNomeProd(rs.getString("nomeProd"));
              prod.setCodSKU(rs.getInt("codSKU"));
              prod.setIdCategoria(rs.getInt("idCategoria"));
              prod.setPrecoCompra(rs.getFloat("precoCompra"));
              prod.setIdFornecedor(rs.getInt("idFornecedor"));
              prod.setQtdin(rs.getInt("qtdmin"));
              

              produtos.add(prod);

         }

       } catch (SQLException ex) {
          java.util.logging.Logger.getLogger(ProdutoController.class.getName()).log(Level.SEVERE, null, ex);
      }finally{
       ConectorMySql.closeConnection(con, stmt,rs);
    }

      return produtos;

  }


  public Produto pesquisaProduto (int cod) { //Declaração da função recebendo um o idTipoVenda que foi digitado na tela

    Connection con = ConectorMySql.getConnection();
    PreparedStatement stmt = null;
    ResultSet rs = null;
    Produto prod = new Produto();

    try {
       stmt = con.prepareStatement("select idProduto, nomeProd from produto where idProduto = ?");
       stmt.setInt(1, cod); //substitui no SELECT o interrogação pelo código que veio por parametro
       rs = stmt.executeQuery();

       if(rs.next()){

           prod.setIdProduto(rs.getInt("idProduto"));
            prod.setNomeProd(rs.getString("nomeProd"));
            return prod;

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





  public void update(Produto p) {

    java.sql.Connection con = ConectorMySql.getConnection();
    PreparedStatement stmt = null;


    try {
        stmt = con.prepareStatement("update produto set nomeProd = ?,codSKU = ?,idcategoria = ?,"
                + "precoCompra = ?,idFornecedor = ?, qtdmin = ? where idProduto = ? ");
       stmt.setString(1,p.getNomeProd());
       stmt.setInt(2,p.getCodSKU());
       stmt.setInt(3,p.getIdCategoria());
       stmt.setFloat(4, p.getPrecoCompra());
       stmt.setInt(5,p.getIdFornecedor());
       stmt.setInt(6,p.getQtdmin());
       stmt.setInt(7, p.getIdProduto());
       
       stmt.executeUpdate();
       JOptionPane.showMessageDialog(null," Atualização realizada com sucesso!");

       } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null," Erro ao atualizar!"+ ex);
    }finally{
       ConectorMySql.closeConnection(con, stmt);
    }



  }
  public void deleteproduto(Produto p) {

    java.sql.Connection con = ConectorMySql.getConnection();
    PreparedStatement stmt = null;


    try {
       stmt = con.prepareStatement("delete from produto where idProduto = ?");
       stmt.setInt(1,p.getIdProduto());
       stmt.executeUpdate();

       JOptionPane.showMessageDialog(null," Exclusão realizada com sucesso!");

       } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null," Erro ao excluir!"+ ex);
    }finally{
       ConectorMySql.closeConnection(con, stmt);
    }



  }


  public void createCategoria(Categorias c) {

    java.sql.Connection con = ConectorMySql.getConnection();
    PreparedStatement stmt = null;



    try {
        stmt = con.prepareStatement("insert into categoria (nomeCat, setorCat) values(?, ?)");
       stmt.setString(1,c.getNomeCat());
       stmt.setString(2,c.getSetorCat());

       stmt.executeUpdate();

       JOptionPane.showMessageDialog(null," Salvo com sucesso!");

       } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null," Erro ao salvar!"+ ex);
    }finally{
       ConectorMySql.closeConnection(con, stmt);
    }
}




  public List<Categorias> readCategorias(){
    java.sql.Connection con = ConectorMySql.getConnection();
    PreparedStatement stmt = null;
    ResultSet rs = null;


    List<Categorias> categoria = new ArrayList<>();

      try {
          stmt = con.prepareStatement("select * from categoria");
          rs = stmt.executeQuery();

          while(rs.next()){
              Categorias cat = new Categorias();

              cat.setIdCategoria(rs.getInt("idCategoria"));
              cat.setNomeCat(rs.getString("nomeCat"));
              cat.setSetorCat(rs.getString("setorCat"));

              categoria.add(cat);

         }
       } catch (SQLException ex) {
          java.util.logging.Logger.getLogger(ProdutoController.class.getName()).log(Level.SEVERE, null, ex);
      }finally{
       ConectorMySql.closeConnection(con, stmt,rs);
    }

      return categoria;

  }
  public Categorias pesquisaCategorias (int codcat) { //Declaração da função recebendo um o idTipoVenda que foi digitado na tela

    Connection con = ConectorMySql.getConnection();
    PreparedStatement stmt = null;
    ResultSet rs = null;
    Categorias cat = new Categorias();
    

    try {
       stmt = con.prepareStatement("select idCategoria, nomeCat from categoria where idCategoria = ?");
       stmt.setInt(1, codcat); //substitui no SELECT o interrogação pelo código que veio por parametro
       rs = stmt.executeQuery();

       if(rs.next()){

            cat.setIdCategoria(rs.getInt("idCategoria"));
            cat.setNomeCat(rs.getString("nomeCat"));
            return cat;

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

  
  
  public void updateCategorias(Categorias c) {

    java.sql.Connection con = ConectorMySql.getConnection();
    PreparedStatement stmt = null;


    try {
       stmt = con.prepareStatement("update categoria set nomecat = ?,setorCat = ?, where idCategoria = ? ");
       stmt.setString(1,c.getNomeCat());
       stmt.setString(2,c.getSetorCat());
       stmt.setInt(3,c.getIdCategoria());
       JOptionPane.showMessageDialog(null,"teste: " + stmt);

       stmt.executeUpdate();

       JOptionPane.showMessageDialog(null," Atualização realizada com sucesso!");

       } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null," Erro ao atualizar!"+ ex);
    }finally{
       ConectorMySql.closeConnection(con, stmt);
    }



  }
public int pesquisaCategoriasNome (String categ) { //Ao receber o nome da categoria aqui, está pesquisando na tabela categoria e selecionando o seu nome 

    Connection con = ConectorMySql.getConnection();
    PreparedStatement stmt = null;
    ResultSet rs = null;
    Categorias cat = new Categorias();
    

    try {
       stmt = con.prepareStatement("select idCategoria from categoria where nomeCat = ?");
       stmt.setString(1, categ); //substitui no SELECT o interrogação pelo código que veio por parametro
       rs = stmt.executeQuery();

       if(rs.next()){

           
            return rs.getInt("idCategoria");
            

        }else{
           return 0; //caso não encontre o código, retorna nulo.
       }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null," Erro ao encontrar o produto: "+ ex);
    }finally{
       ConectorMySql.closeConnection(con, stmt, rs);
    }
    return 0; //retorno apenas para satisfazer warning do IDE
}

  
  
   public void deleteCategorias(Categorias c) {

       java.sql.Connection con = ConectorMySql.getConnection();
       PreparedStatement stmt = null;


       try {
          stmt = con.prepareStatement("delete from categoria where idCategoria = ?");
          stmt.setInt(1,c.getIdCategoria());
          stmt.executeUpdate();

          JOptionPane.showMessageDialog(null," Exclusão realizada com sucesso!");

          } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null," Erro ao excluir!"+ ex);
       }finally{
          ConectorMySql.closeConnection(con, stmt);
       }



     }
 
    public ArrayList<Produto> RetornaTodos() {

       ArrayList<Produto> produtos = new ArrayList<Produto>();
       Connection con = ConectorMySql.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
       try {
            stmt = con.prepareStatement("select * from produto");
            rs = stmt.executeQuery();

            while(rs.next()) {
                Produto prop = new Produto();
                prop.setIdProduto(rs.getInt("idProduto"));
                prop.setNomeProd(rs.getString("nomeProd"));
                prop.setIdCategoria(rs.getInt("idCategoria"));
                prop.setCodSKU(rs.getInt("codSKU"));
                prop.setIdCategoria(rs.getInt("idCategoria"));
                prop.setPrecoCompra(rs.getFloat("precoCompra"));
                prop.setIdFornecedor(rs.getInt("idFornecedor"));
                produtos.add(prop);
            }   
            return produtos;
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null," Erro ao listar produtos!"+ ex);
       }finally{
          ConectorMySql.closeConnection(con, stmt, rs);
       }
       return null;
   }

}