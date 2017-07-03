/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Conexao.ConectorMySql;
import Model.Cliente;
import Model.FormaPagto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

/**
 *
 * @author Hudson
 */
public class FormaPagtoController {
    
    public List<FormaPagto> read(){
            Connection con = ConectorMySql.getConnection();
            PreparedStatement stmt = null;
            ResultSet rs = null;
        
        
            List<FormaPagto> formapagtos = new ArrayList<>();
        
            try {
                stmt = con.prepareStatement("select * from formapagto ");
                rs = stmt.executeQuery();
              
                while(rs.next()){
                    FormaPagto formapagto = new FormaPagto();
                    
                    formapagto.setIdFormaPagto(rs.getInt("id"));
                    formapagto.setNomeFormaPagto(rs.getString("nome"));
                    
                    formapagtos.add(formapagto);
                  
             }
             
           } catch (SQLException ex) {
              java.util.logging.Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
          }finally{
           ConectorMySql.closeConnection(con, stmt,rs);
        }
         
          return formapagtos;
         
      }
    
}
