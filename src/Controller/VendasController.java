/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Conexao.ConectorMySql;
import Model.Categorias;
import Model.ItemVenda;
import Model.Vendas;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
    

    
    public void create (Vendas v) {
          
        Connection con = ConectorMySql.getConnection();
        PreparedStatement stmt = null;
        
        
        try {
           stmt = con.prepareStatement("insert into venda (data,idCliente,valor,tipoVenda,formaPagamento) values( ?, ?, ?, ?, ?)");
           stmt.setString(1, v.getDataVenda());
           stmt.setInt(2,v.getIdCliente());
           stmt.setDouble(3,v.getValorTotal());
           stmt.setInt(4, v.getIdTipoVenda());
           stmt.setInt(5,v.getIdFormaPagto());
           
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
            stmt = con.prepareStatement("update venda set data = ?, idCliente = ?, valor = ?, tipoVenda = ?, formaPagamento = ? where idVenda = ?");
           stmt.setString(1, v.getDataVenda());
           stmt.setInt(2,v.getIdCliente());
           stmt.setDouble(3,v.getValorTotal());
           stmt.setInt(4, v.getIdTipoVenda());
           stmt.setInt(5,v.getIdFormaPagto());
           stmt.setInt(6,codVenda);
           
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
    
    
    public ArrayList pesquisaVenda (int cod) {
        
        Connection con = ConectorMySql.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ArrayList dados = new ArrayList();
        
        try {
           stmt = con.prepareStatement("select data,idCliente,valor,tipoVenda,formaPagamento from venda where idVenda = ?");
           stmt.setInt(1, cod);
           rs = stmt.executeQuery();
           
           if(rs.next()){
                
                /*SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
                dados.add(f.format(rs.getDate("data")));*/
                dados.add(rs.getDate("data"));
                dados.add(rs.getString("idCliente"));
                dados.add(rs.getDouble("valor"));
                dados.add(rs.getString("tipoVenda"));
                dados.add(rs.getString("formaPagamento"));
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
                dados.add(pesquisaCliente(Integer.parseInt(rs.getString("idCliente"))));
                dados.add(pesquisaTipoVenda(Integer.parseInt(rs.getString("tipoVenda"))));
                dados.add(pesquisaFormaPagto(Integer.parseInt(rs.getString("formaPagamento"))));
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
                
                return dados;
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
    
      public void retornaDados(){
        
          
      }
}