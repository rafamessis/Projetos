package Controller;

import Conexao.ConectorMySql;
import Model.Despesa;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JOptionPane;

    public class DespesaController {
        
        DateFormat dataFormatada = new SimpleDateFormat("yyMMdd");
   
        public void create(Despesa d){
        
            java.sql.Connection con = ConectorMySql.getConnection();
            PreparedStatement stmt = null;
        
            try {
                stmt = con.prepareStatement("INSERT INTO despesa(valor,dataVencimento,descricao,status) VALUES (?,?,?,?) ");
                stmt.setDouble(1,d.getValorDespesa());
                stmt.setString(2,dataFormatada.format(d.getData()));
                //stmt.setString(2,dataFormatada.format(d.getData()));
                stmt.setString(3,d.getDescricao());
                stmt.setString(4,d.getStatus());           
                stmt.executeUpdate();
            
                JOptionPane.showMessageDialog(null," Salvo com sucesso!");       
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null," Erro ao salvar!"+ ex);
            }finally{
                ConectorMySql.closeConnection(con, stmt);
        }
    }
        
        public List<Despesa> read(){
            java.sql.Connection con = ConectorMySql.getConnection();
            PreparedStatement stmt = null;
            ResultSet rs = null;


            List<Despesa> Despesa = new ArrayList<>();

            try {
                stmt = con.prepareStatement("select * from Despesa ");
                rs = stmt.executeQuery();

                while(rs.next()){
                    Despesa d = new Despesa();
                    
                    d.setCodigo(rs.getInt("idDespesa"));
                    d.setValorDespesa(rs.getDouble("valor"));
                    d.setData(rs.getDate("dataVencimento"));
                    d.setDescricao(rs.getString("descricao"));
                    d.setStatus(rs.getString("status"));
                    
                    Despesa.add(d);

         }

       } catch (SQLException ex) {
          java.util.logging.Logger.getLogger(ProdutoController.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        ConectorMySql.closeConnection(con, stmt,rs);
    }

      return Despesa;

  }
        public void update (Despesa d, int codigodespesa) {
          
        Connection con = ConectorMySql.getConnection();
        PreparedStatement stmt = null;
        
        
        try {
           stmt = con.prepareStatement("update despesa set valor = ?, dataVencimento = ?,"
                   + " descricao = ?, status = ? where idDespesa = ?");
           stmt.setDouble(1, d.getValorDespesa());
           stmt.setString(2, dataFormatada.format(d.getData()));
           stmt.setString(3, d.getDescricao());
           stmt.setString(4, d.getStatus());
           stmt.setInt(5, codigodespesa);
           
                
           stmt.executeUpdate();
           JOptionPane.showMessageDialog(null," Despesa Atualizada !");
            
           } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null," Erro ao atualizar: "+ ex);
        }finally{
           ConectorMySql.closeConnection(con, stmt);
        }         
    }
        
        public void delete(String campoCodigo){
        
        Connection con = ConectorMySql.getConnection();
        PreparedStatement stmt = null;
        
        try {
           stmt = con.prepareStatement("delete from despesa where idDespesa = ?");
           stmt.setString(1,campoCodigo);
           
           stmt.executeUpdate();
           
           JOptionPane.showMessageDialog(null," Despesa Excluida com sucesso !");
            
           } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null," Erro ao excluir: "+ ex);
        }finally{
           ConectorMySql.closeConnection(con, stmt);
        }
    }
}        