/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Conexao.ConectorMySql;
import Model.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class FornecedorController {
    public void create(Fornecedor f){
        
        java.sql.Connection con = ConectorMySql.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO fornecedor(nome,cnpjcpf,endereco,telefone,site,whatsapp VALUES (?,?,?,?,?,? ");
            stmt.setString(1,f.getNome());
            stmt.setInt(2,f.getCpf_cnpj());
            stmt.setString(3,f.getEndereco());
            stmt.setInt(4,f.getFone());
            stmt.setString(5,f.getSite());
            stmt.setInt(6,f.getWhatsapp()); 
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null," Salvo com sucesso!");       
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null," Erro ao salvar!"+ ex);
        }finally{
            ConectorMySql.closeConnection(con, stmt);
        }
    }
    
}
 