/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HBFTelas;

import Model.Fornecedor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import Controller.FornecedorController;
import javax.swing.table.TableRowSorter;


public class ConsultaFornecedor extends javax.swing.JFrame {
    private Fornecedor fornecedor;
    private List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
    
    public ConsultaFornecedor() {
        initComponents();
        DefaultTableModel forn = (DefaultTableModel) tabelafornecedor.getModel();
        tabelafornecedor.setRowSorter(new TableRowSorter(forn));
        
        readTableFornecedor();
    }
    
    public ConsultaFornecedor(Fornecedor fornecedor){
        this();
        this.fornecedor = fornecedor;
        
    }
    public void readTableFornecedor(){
        DefaultTableModel fornecedor = (DefaultTableModel)tabelafornecedor.getModel(); 
        
        FornecedorController forn = new FornecedorController();
        fornecedor.setNumRows(0);
        
        
        fornecedores = forn.read();
        
        for(Fornecedor forneced: fornecedores ){
            fornecedor.addRow(new Object[]{
                forneced.getCodigo(),
                forneced.getNome(),
                forneced.getCpf_cnpj(),
                forneced.getEndereco(),
                forneced.getFone(),
                forneced.getSite(),
                forneced.getWhatsapp()
            });
        }
    }
    
    public Fornecedor GetFornecedor(){
       return fornecedor;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Selecionar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelafornecedor = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Fornecedor");
        getContentPane().setLayout(null);

        Selecionar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Selecionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/GravarPequeno.png"))); // NOI18N
        Selecionar.setText("Selecionar");
        Selecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelecionarActionPerformed(evt);
            }
        });
        getContentPane().add(Selecionar);
        Selecionar.setBounds(10, 10, 110, 40);

        botaoCancelar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cancelar.png"))); // NOI18N
        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCancelar);
        botaoCancelar.setBounds(140, 10, 110, 40);

        tabelafornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "CNPJ/CPF", "Telefone", "Site", "Whatsapp"
            }
        ));
        jScrollPane1.setViewportView(tabelafornecedor);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 100, 690, 270);

        setBounds(0, 0, 730, 428);
    }// </editor-fold>//GEN-END:initComponents

    private void SelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelecionarActionPerformed
       CadastroFornecedor cadastrofornecedor = new CadastroFornecedor();
        
        if(tabelafornecedor.getSelectedRow() == -1)
            return;
                
        
        fornecedor = fornecedores.get(tabelafornecedor.getSelectedRow());
        dispose();
        

    }//GEN-LAST:event_SelecionarActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        dispose();

    }//GEN-LAST:event_botaoCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsultaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Selecionar;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelafornecedor;
    // End of variables declaration//GEN-END:variables
}
