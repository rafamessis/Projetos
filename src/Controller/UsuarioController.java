/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Conexao.ConectorMySql;
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
 * @author User
 */
public class UsuarioController {
    
    public void create(Usuario u){
    
        Connection con = ConectorMySql.getConnection();
        PreparedStatement stmt = null;
        
        try {
           stmt = con.prepareStatement("insert into funcionario (nomeFunc,senha,tipo) values( ?, ?, ?)");
           stmt.setString(1,u.getNomeUsuario());
           stmt.setString(2,u.getSenhaUsuario());
           stmt.setString(3,u.getTipo());
           
           
           stmt.executeUpdate();
           JOptionPane.showMessageDialog(null," Usuário cadastrado !");
            
           } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null," Erro ao inserir: "+ ex);
        }finally{
           ConectorMySql.closeConnection(con, stmt);
        }
              
    }
    
    public List<Usuario> read(){
        java.sql.Connection con = ConectorMySql.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        
        List<Usuario> usuario = new ArrayList<>();
        
          try {
              stmt = con.prepareStatement("select * from funcionario ");
              rs = stmt.executeQuery();
              
              while(rs.next()){
                  Usuario usua = new Usuario();
                  
                  usua.setNomeUsuario(rs.getString("nomeFunc"));
                  usua.setSenhaUsuario(rs.getString("senha"));
                  usua.setTipo(rs.getString("tipo"));
                  
                  usuario.add(usua);
                  
             }
             
           } catch (SQLException ex) {
              java.util.logging.Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
          }finally{
           ConectorMySql.closeConnection(con, stmt,rs);
        }
         
          return usuario;
         
      }
    public void update (Usuario u, String nomeUsuario) {
          
        Connection con = ConectorMySql.getConnection();
        PreparedStatement stmt = null;
        
        
        try {
           stmt = con.prepareStatement("update funcionario set nomeFunc = ?, senha = ?, tipo = ? where nomeFunc = ?");
           stmt.setString(1,u.getNomeUsuario());
           stmt.setString(2,u.getSenhaUsuario());
           stmt.setString(3,u.getTipo());
           stmt.setString(4,nomeUsuario);
       
           stmt.executeUpdate();
           JOptionPane.showMessageDialog(null," Usuario Atualizado !");
            
           } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null," Erro ao atualizar: "+ ex);
        }finally{
           ConectorMySql.closeConnection(con, stmt);
        }
         
      }
    public void delete(String nomeUsuario){
        
        Connection con = ConectorMySql.getConnection();
        PreparedStatement stmt = null;
        try {
           stmt = con.prepareStatement("delete from funcionario where nomeFunc = ?");
           stmt.setString(1, nomeUsuario);
           
           stmt.executeUpdate();
           
           JOptionPane.showMessageDialog(null," Usuário excluido com sucesso !");
            
           } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null," Erro ao excluir: "+ ex);
        }finally{
           ConectorMySql.closeConnection(con, stmt);
        }
    }
}
