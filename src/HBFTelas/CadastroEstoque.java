/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HBFTelas;

import Controller.EstoqueController;
import Controller.ProdutoController;
import Model.Estoque;
import Model.Produto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Karina
 */
public class CadastroEstoque extends javax.swing.JInternalFrame {
    Estoque est = null;
    private ArrayList<Produto> produtos =null;

    /**
     * Creates new form CadastroEstoque
     */
    public CadastroEstoque() {
        initComponents();
        ProdutoController prodContr = new ProdutoController();
        
         produtos = prodContr.RetornaTodos();
        
         tipoItem.addItem("Selecionar Produto:");
        for(int i =0; i < produtos.size(); i++)
            tipoItem.addItem(produtos.get(i).getNomeProd());
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tipoItem = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtqtd = new javax.swing.JTextField();
        salvar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();

        setTitle("Cadastro de Estoque");

        jLabel1.setText("Produto:");

        tipoItem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tipoItem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tipoItemItemStateChanged(evt);
            }
        });
        tipoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoItemActionPerformed(evt);
            }
        });

        jLabel2.setText("Quantidade:");

        txtqtd.setToolTipText("quantidadeItem");
        txtqtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtqtdActionPerformed(evt);
            }
        });

        salvar.setText("Salvar");
        salvar.setToolTipText("salvar");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(salvar, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                        .addGap(26, 26, 26)
                        .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tipoItem, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtqtd, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtqtd, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salvar, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        
        EstoqueController contr = new EstoqueController();
        if (tipoItem.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null,"Escolha um produto");
            return;
        }
        
        if (txtqtd.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"A quantidade nao pode ser vazia!");
            return;
        }
        if (Integer.parseInt(txtqtd.getText()) < 0){
            JOptionPane.showMessageDialog(null,"Quantidade cadastrada não pode ser negativa!");
            return;
        }
        est.setQuantidade(Integer.parseInt(txtqtd.getText()));
        contr.Salvar(est);
        txtqtd.setText("");
        tipoItem.setSelectedIndex(0);
    }//GEN-LAST:event_salvarActionPerformed

    private void tipoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoItemActionPerformed
    //ProdutoController produtoController = new ProdutoController();
   // ArrayList produtos; 
    
    }//GEN-LAST:event_tipoItemActionPerformed

    private void tipoItemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tipoItemItemStateChanged
        // TODO add your handling code here:
        EstoqueController contr = new EstoqueController();
        if (tipoItem.getSelectedIndex() == 0){
            txtqtd.setText("");
            return;
        }
        Produto prod = produtos.get(tipoItem.getSelectedIndex()-1);
         
         est = contr.RecuperaEstoqueProduto(prod.getIdProduto());
         est.setProdutoId(prod.getIdProduto());
         txtqtd.setText(Integer.toString(est.getQuantidade()));

    }//GEN-LAST:event_tipoItemItemStateChanged

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
     // tipoItem.setSelectedIndex(1);
      //txtqtd.setText(""); 
      this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void txtqtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtqtdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtqtdActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
       /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    
                   CadastroEstoque cad =  new CadastroEstoque();
                   cad.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                   cad.setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(CadastroEstoque.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(CadastroEstoque.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton salvar;
    private javax.swing.JComboBox<String> tipoItem;
    private javax.swing.JTextField txtqtd;
    // End of variables declaration//GEN-END:variables
}
