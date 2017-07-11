
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Conexao.ConectorMySql;
import Model.Categorias;
import Model.ItemVenda;
import Model.TipoVenda;
import Model.Vendas;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JOptionPane;

/**
 *
 * @author Hudson
 */
public class VendasController {
    
    DateFormat dataFormatada = new SimpleDateFormat("yyMMdd");

    
    public void create (Vendas v) {
          
        Connection con = ConectorMySql.getConnection();
        PreparedStatement stmt = null;
        
        
        try {
           stmt = con.prepareStatement("insert into venda (data,idCliente,tipoVenda,formaPagamento) values( ?, ?, ?, ?)");
           stmt.setString(1, dataFormatada.format(v.getDataVenda()));
           stmt.setInt(2,v.getIdCliente());
           stmt.setInt(3, v.getIdTipoVenda());
           stmt.setInt(4,v.getIdFormaPagto());
           
           stmt.executeUpdate();
           JOptionPane.showMessageDialog(null," Venda Gravada !");
            
           } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null," Erro ao salvar: "+ ex);
        }finally{
           ConectorMySql.closeConnection(con, stmt);
        }
              
      
      }
    
    public void update (Vendas v, int codVenda) {
          
        Connection con = ConectorMySql.getConnection();
        PreparedStatement stmt = null;
        
        
        try {
            
            
           stmt = con.prepareStatement("update venda set data = ?, idCliente = ?, tipoVenda = ?, formaPagamento = ? where idVenda = ?");
           stmt.setString(1, dataFormatada.format(v.getDataVenda()));
           stmt.setInt(2,v.getIdCliente());
           stmt.setInt(3, v.getIdTipoVenda());
           stmt.setInt(4,v.getIdFormaPagto());
           stmt.setInt(5,codVenda);
           
           stmt.executeUpdate();
           JOptionPane.showMessageDialog(null," Venda Gravada !");
            
           } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null," Erro ao salvar: "+ ex);
        }finally{
           ConectorMySql.closeConnection(con, stmt);
        }
              
      
      }
    
    public void delete (int codVenda) {
          
        Connection con = ConectorMySql.getConnection();
        PreparedStatement stmt = null;
        
        
        try {
           stmt = con.prepareStatement("delete from vendaxproduto where codVenda = ?");
           stmt.setInt(1, codVenda);
           
           stmt.executeUpdate();
           
           stmt = null; 
           stmt = con.prepareStatement("delete from venda where idVenda = ?");
           stmt.setInt(1,codVenda);
           
           stmt.executeUpdate();
           
           JOptionPane.showMessageDialog(null," Venda Excluida com Sucesso !");
            
           } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null," Erro ao excluir: "+ ex);
        }finally{
           ConectorMySql.closeConnection(con, stmt);
        }
              
      
      }
    
    public int ultimoId () {
        
        Connection con = ConectorMySql.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
           stmt = con.prepareStatement("select max(idVenda) from venda");
           rs = stmt.executeQuery();
           
           if(rs.next()){
                
                return rs.getInt("max(idVenda)");
                
            }else{
               return 0;
           }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null," Erro ao encontrar Cliente: "+ ex);
        }finally{
           ConectorMySql.closeConnection(con, stmt, rs);
        }
        return 0;
    }
    
    
    public List<Vendas> listaVendas(){
    Connection con = ConectorMySql.getConnection();
    PreparedStatement stmt = null;
    ResultSet rs = null;


    List<Vendas> venda = new ArrayList<>();

      try {
          stmt = con.prepareStatement("select * from venda order by idVenda desc");
          rs = stmt.executeQuery();

          while(rs.next()){
              Vendas ven = new Vendas();
              
              ven.setIdVenda(rs.getInt("idVenda"));
              ven.setDataVenda(rs.getDate("data"));
              ven.setIdCliente(rs.getInt("idCliente"));
              ven.setValorTotal(rs.getFloat("valor"));
              ven.setIdTipoVenda(rs.getInt("tipoVenda"));
              ven.setIdFormaPagto(rs.getInt("formaPagamento"));

              venda.add(ven);

         }

       } catch (SQLException ex) {
          java.util.logging.Logger.getLogger(ProdutoController.class.getName()).log(Level.SEVERE, null, ex);
      }finally{
       ConectorMySql.closeConnection(con, stmt,rs);
    }

      return venda;

  }
    
    public int pesquisaTipoVendaNome (String NomeTipoVenda) {
        
        Connection con = ConectorMySql.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        TipoVenda tipo = new TipoVenda();
        
        try {
           stmt = con.prepareStatement("select id from tipovenda where nome = ?");
           stmt.setString(1, NomeTipoVenda);
           rs = stmt.executeQuery();
           
           if(rs.next()){
                
                return rs.getInt("id");
                
            }else{
               return 0;
           }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null," Erro ao encontrar Tipo da Venda: "+ ex);
        }finally{
           ConectorMySql.closeConnection(con, stmt, rs);
        }
        return 0;
    }
    public List<TipoVenda> readTipoVendas(){
    java.sql.Connection con = ConectorMySql.getConnection();
    PreparedStatement stmt = null;
    ResultSet rs = null;


    List<TipoVenda> tipo = new ArrayList<>();

      try {
          stmt = con.prepareStatement("select * from tipovenda");
          rs = stmt.executeQuery();

          while(rs.next()){
              TipoVenda tipov = new TipoVenda();

              tipov.setIdTipoVenda(rs.getInt("id"));
              tipov.setNomeTipoVenda(rs.getString("nome"));
              
              tipo.add(tipov);

         }
       } catch (SQLException ex) {
          java.util.logging.Logger.getLogger(ProdutoController.class.getName()).log(Level.SEVERE, null, ex);
      }finally{
       ConectorMySql.closeConnection(con, stmt,rs);
    }

      return tipo;

  }
    public Vendas pesquisaVenda (int cod) {
        
        Connection con = ConectorMySql.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Vendas venda = new Vendas();
        
        try {
           stmt = con.prepareStatement("select data,idCliente,valor,tipoVenda,formaPagamento from venda where idVenda = ?");
           stmt.setInt(1, cod);
           rs = stmt.executeQuery();
           
           if(rs.next()){
                
                //SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
                //dados.add(f.format(rs.getDate("data")));
                venda.setDataVenda(rs.getDate("data"));
                venda.setIdCliente(rs.getInt("idCliente"));
                venda.setValorTotal(rs.getDouble("valor"));
                venda.setIdTipoVenda(rs.getInt("tipoVenda"));
                venda.setIdFormaPagto(rs.getInt("formaPagamento"));
                /*int codCliente = Integer.parseInt(rs.getString("idCliente"));
                int codTipoVenda = Integer.parseInt(rs.getString("tipoVenda"));
                int codFormaPagto = Integer.parseInt(rs.getString("formaPagamento"));;*/
                /*stmt = null;
                rs = null;
                stmt = con.prepareStatement("select nome from cliente where id = ?");
                stmt.setInt(1, codCliente);
                rs = stmt.executeQuery();
                rs.next();
                dados.add(rs.getString("nome"));*/
                venda.setNomeCliente(pesquisaCliente(Integer.parseInt(rs.getString("idCliente"))));
                venda.setNomeTipoVenda(pesquisaTipoVenda(Integer.parseInt(rs.getString("tipoVenda"))));
                venda.setNomeFormaPagto(pesquisaFormaPagto(Integer.parseInt(rs.getString("formaPagamento"))));
                /*stmt = null;
                rs = null;
                stmt = con.prepareStatement("select nome from tipovenda where id = ?");
                stmt.setInt(1, codTipoVenda);
                rs = stmt.executeQuery();
                rs.next();
                dados.add(rs.getString("nome"));
                stmt = null;
                rs = null;
                stmt = con.prepareStatement("select nome from formapagto where id = ?");
                stmt.setInt(1, codFormaPagto);
                rs = stmt.executeQuery();
                rs.next();
                dados.add(rs.getString("nome"));*/
                
                return venda;
            }else{
               return null;
           }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null," Erro ao pesquisar: "+ ex);
        }finally{
           ConectorMySql.closeConnection(con, stmt, rs);
        }
        return null;
        
    
    }
    
    public String pesquisaCliente (int cod) {
        
        Connection con = ConectorMySql.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
           stmt = con.prepareStatement("select nome from cliente where id = ?");
           stmt.setInt(1, cod);
           rs = stmt.executeQuery();
           
           if(rs.next()){
                
                return rs.getString("nome");
                
            }else{
               return null;
           }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null," Erro ao encontrar Cliente: "+ ex);
        }finally{
           ConectorMySql.closeConnection(con, stmt, rs);
        }
        return null;
    }
    
        public String pesquisaTipoVenda (int cod) {
        
        Connection con = ConectorMySql.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
           stmt = con.prepareStatement("select nome from tipovenda where id = ?");
           stmt.setInt(1, cod);
           rs = stmt.executeQuery();
           
           if(rs.next()){
                
                return rs.getString("nome");
                
            }else{
               return null;
           }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null," Erro ao encontrar Tipo da Venda: "+ ex);
        }finally{
           ConectorMySql.closeConnection(con, stmt, rs);
        }
        return null;
    }
        
    public String pesquisaFormaPagto (int cod) {
        
        Connection con = ConectorMySql.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
           stmt = con.prepareStatement("select nome from formapagto where id = ?");
           stmt.setInt(1, cod);
           rs = stmt.executeQuery();
           
           if(rs.next()){
                
                return rs.getString("nome");
                
            }else{
               return null;
           }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null," Erro ao encontrar Forma de Pagamento: "+ ex);
        }finally{
           ConectorMySql.closeConnection(con, stmt, rs);
        }
        return null;
    }
    
    public List<ItemVenda> selectItensVenda(int codVenda){
        Connection con = ConectorMySql.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        
        List<ItemVenda> ListaItens = new ArrayList<>();
        
          try {
              stmt = con.prepareStatement("select * from vendaxproduto where codVenda = ?");
              stmt.setInt(1, codVenda);
              rs = stmt.executeQuery();
              
              while(rs.next()){
                  ItemVenda prod = new ItemVenda();
                 
                  prod.setCodProduto(rs.getInt("codProduto"));
                  prod.setNomeProd(rs.getString("nomeProd"));
                  prod.setQuantidade(rs.getInt("quantidade"));
                  prod.setValorUnit(rs.getFloat("valorUnit"));
                  prod.setValorTotal(rs.getFloat("valorTotal"));
                  prod.setIdVendaxproduto(rs.getInt("idVendaxproduto"));
                   
                  ListaItens.add(prod);
                                   
             }
           } catch (SQLException ex) {
              java.util.logging.Logger.getLogger(ProdutoController.class.getName()).log(Level.SEVERE, null, ex);
          }finally{
           ConectorMySql.closeConnection(con, stmt,rs);
        }
         
          return ListaItens;
         
      }
    
    
    public void createItem (ItemVenda p) {
          
        Connection con = ConectorMySql.getConnection();
        PreparedStatement stmt = null;
        
        
        try {
           stmt = con.prepareStatement("insert into vendaxproduto (codProduto,nomeProd,codVenda,quantidade,valorUnit,valorTotal) values( ?, ?, ?, ?, ?, ?)");
           stmt.setInt(1,p.getCodProduto());
           stmt.setString(2,p.getNomeProd());
           stmt.setInt(3,p.getCodVenda());
           stmt.setInt(4, p.getQuantidade());
           stmt.setFloat(5, p.getValorUnit());
           stmt.setFloat(6, p.getValorTotal());
           
           stmt.executeUpdate();
            
           } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null," Erro ao incluir item: "+ ex);
        }finally{
           ConectorMySql.closeConnection(con, stmt);
        }
              
      
      }
    
    public void deleteItem (int id) {
          
        Connection con = ConectorMySql.getConnection();
        PreparedStatement stmt = null;
        
        
        try {
           stmt = con.prepareStatement("delete from vendaxproduto where idVendaxproduto = ?");
           stmt.setInt(1,id);
           
           stmt.executeUpdate();
           
           JOptionPane.showMessageDialog(null," Item Excluído com Sucesso !");
            
           } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null," Erro ao excluir item!"+ ex);
        }finally{
           ConectorMySql.closeConnection(con, stmt);
        }
              
      
      }
    
    public float atualizaTotal (int id) {
        
        Connection con = ConectorMySql.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
           stmt = con.prepareStatement("select valor from venda where idVenda = ?");
           stmt.setInt(1,id);
           rs = stmt.executeQuery();
           
           if(rs.next()){
                
                return rs.getFloat("valor");
                
            }else{
               return 0;
           }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null," Erro ao atualizar Total da Venda: "+ ex);
        }finally{
           ConectorMySql.closeConnection(con, stmt, rs);
        }
        return 0;
    }
    
    
    
      public void retornaDados(){
        
          
      }
}
