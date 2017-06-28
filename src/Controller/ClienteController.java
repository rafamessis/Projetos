/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Conexao.ConectorMySql;
import Model.Clientes;
import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class ClienteController {
    
    public void create(Clientes c){
    
        Connection con = ConectorMySql.getConnection();
        PreparedStatement stmt = null;
        
        try {
           stmt = con.prepareStatement("insert into cliente (id,nome,cpfcnpj,endereco,telefone,whatsapp,limiteCredito) values( ?, ?, ?, ?, ?, ?, ?)");
           stmt.setString(1,c.getCodigo());
           stmt.setString(2,c.getNome());
           stmt.setString(3,c.getCpf_cnpj());
           stmt.setString(4,c.getEndereco());
           stmt.setString(5,c.getFone());
           stmt.setString(6,c.getWhatsapp());
           stmt.setDouble(7,c.getLimiteCredito());
                      
           stmt.executeUpdate();
           JOptionPane.showMessageDialog(null," Usuário cadastrado !");
            
           } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null," Erro ao inserir: "+ ex);
        }finally{
           ConectorMySql.closeConnection(con, stmt);
        }
        
        public List<Clientes> read(){
        java.sql.Connection con = ConectorMySql.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        
        List<Clientes> clientes = new ArrayList<>();
        
          try {
              stmt = con.prepareStatement("select * from cliente ");
              rs = stmt.executeQuery();
              
              while(rs.next()){
                  Clientes cliente = new Clientes();
                  
                  cliente.setCodigo(rs.getInt("id"));
                  cliente.setNome(rs.getString("nome"));
                  cliente.setFone(rs.getString("telefone"));
                  cliente.setLimiteCredito(rs.getDouble("limiteCredito"));
                  cliente.setCpf_cnpj(rs.getString("cpfcnpj"));
                  cliente.setWhatsapp(rs.getString("whatsapp"));
                  cliente.setEndereco(rs.getString("endereco"));
                  
                  clientes.add(cliente);
                  
             }
             
           } catch (SQLException ex) {
              java.util.logging.Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
          }finally{
           ConectorMySql.closeConnection(con, stmt,rs);
        }
         
          return usuario;
         
      }
              
    }
    
}
