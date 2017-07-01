package Controller;
import Conexao.ConectorMySql;
import Model.Fornecedor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JOptionPane;

    public class FornecedorController {
        public void create(Fornecedor f){
        
            java.sql.Connection con = ConectorMySql.getConnection();
            PreparedStatement stmt = null;
        
            try {
                stmt = con.prepareStatement("INSERT INTO fornecedor(nome,cnpjcpf,endereco,telefone,site,whatsapp) VALUES (?,?,?,?,?,?) ");
                stmt.setString(1,f.getNome());
                stmt.setString(2,f.getCpf_cnpj());
                stmt.setString(3,f.getEndereco());
                stmt.setString(4,f.getFone());
                stmt.setString(5,f.getSite());
                stmt.setString(6,f.getWhatsapp()); 
            
                stmt.executeUpdate();
            
                JOptionPane.showMessageDialog(null," Salvo com sucesso!");       
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null," Erro ao salvar!"+ ex);
            }finally{
                ConectorMySql.closeConnection(con, stmt);
        }
    }
        
        public List<Fornecedor> read(){
            java.sql.Connection con = ConectorMySql.getConnection();
            PreparedStatement stmt = null;
            ResultSet rs = null;


            List<Fornecedor> Fornecedor = new ArrayList<>();

            try {
                stmt = con.prepareStatement("select * from Fornecedor ");
                rs = stmt.executeQuery();

                while(rs.next()){
                    Fornecedor f = new Fornecedor();
                    
                    f.setCodigo(rs.getInt("idFornecedor"));
                    f.setNome(rs.getString("nome"));
                    f.setCpf_cnpj(rs.getString("cnpjcpf"));
                    f.setEndereco(rs.getString("endereco"));
                    f.setFone(rs.getString("telefone"));
                    f.setWhatsapp(rs.getString("whatsapp"));
                    f.setSite(rs.getString("site"));

                    Fornecedor.add(f);

         }

       } catch (SQLException ex) {
          java.util.logging.Logger.getLogger(ProdutoController.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        ConectorMySql.closeConnection(con, stmt,rs);
    }

      return Fornecedor;

  }
        public void update(Fornecedor f) {

            java.sql.Connection con = ConectorMySql.getConnection();
            PreparedStatement stmt = null;

                try {
                    stmt = con.prepareStatement("update produto set nome = ?,CPF/CNPJ = ?,Endereço = ?,"
                    + "Fone = ?,Whatsapp = ?,Site = ? where codigo = ? ");
                        
                        stmt.setString(1,f.getNome());
                        stmt.setString(2,f.getCpf_cnpj());
                        stmt.setString(3,f.getEndereco());
                        stmt.setString(4, f.getFone());
                        stmt.setString(5,f.getWhatsapp());
                        stmt.setString(6,f.getSite());
                        stmt.setInt(7,f.getCodigo());

                        stmt.executeUpdate();
                        JOptionPane.showMessageDialog(null," Atualização realizada com sucesso!");

                    } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null," Erro ao atualizar!"+ ex);
                    }finally{
                    ConectorMySql.closeConnection(con, stmt);
                    }
                
/*        public void delete(Fornecedor f) {

            java.sql.Connection con = ConectorMySql.getConnection();
            PreparedStatement stmt = null;

            try {
                stmt = con.prepareStatement("delete from fornecedor where codigo = ?");
                stmt.setInt(1,f.getCodigo());
                stmt.executeUpdate();

                JOptionPane.showMessageDialog(null," Exclusão realizada com sucesso!");

                } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null," Erro ao excluir!"+ ex);
                }finally{
                ConectorMySql.closeConnection(con, stmt);
                }
        }
*/
  }
/*

  public String pesquisaProduto (int cod) { //Declaração da função recebendo um o idTipoVenda que foi digitado na tela

    Connection con = ConectorMySql.getConnection();
    PreparedStatement stmt = null;
    ResultSet rs = null;

    try {
       stmt = con.prepareStatement("select nomeProd from produto where idProduto = ?");
       stmt.setInt(1, cod); //substitui no SELECT o interrogação pelo código que veio por parametro
       rs = stmt.executeQuery();

       if(rs.next()){

            return rs.getString("nomeProd"); //retorna String com nome caso encontre

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

    }
    */
}
 