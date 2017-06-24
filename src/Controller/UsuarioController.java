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
import java.sql.SQLException;
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
    
    
    
}
