
package HBFTelas;

import Controller.EstoqueController;
import Controller.ProdutoController;
import Model.Estoque;
import Model.Geral;
import Model.Produto;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
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
    private Produto prod = new Produto();

    /**
     * Creates new form CadastroEstoque
     */
    public CadastroEstoque() {
        initComponents();
        ProdutoController prodContr = new ProdutoController();
        if(Geral.UsuarioLogado.getTipo().equals("Usuário"))
        {
            txtqtd.setEditable(false);
            salvar.setEnabled(false);
        }
         produtos = prodContr.RetornaTodos();
        
      /*   tipoItem.addItem("Selecionar Produto:");
        for(int i =0; i < produtos.size(); i++)
            tipoItem.addItem(produtos.get(i).getNomeProd());*/
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtqtd = new javax.swing.JTextField();
        salvar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        botaoPesquisaVenda = new javax.swing.JButton();
        txtCodProd = new javax.swing.JTextField();
        lblProduto = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro de Estoque");

        jLabel1.setText("Produto:");

        jLabel2.setText("Quantidade:");

        txtqtd.setToolTipText("quantidadeItem");
        txtqtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtqtdActionPerformed(evt);
            }
        });

        salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Gravar.png"))); // NOI18N
        salvar.setText("Salvar");
        salvar.setToolTipText("salvar");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cancelar.png"))); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        botaoPesquisaVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/pesquisar.png"))); // NOI18N
        botaoPesquisaVenda.setContentAreaFilled(false);
        botaoPesquisaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisaVendaActionPerformed(evt);
            }
        });

        txtCodProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaoPesquisaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtqtd, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoPesquisaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProduto)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtqtd, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60))
        );

        setBounds(0, 0, 416, 374);
    }// </editor-fold>//GEN-END:initComponents

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        
          EstoqueController contr = new EstoqueController();

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
        txtCodProd.setText("");
         lblProduto.setText("");
        //tipoItem.setSelectedIndex(0);
    }//GEN-LAST:event_salvarActionPerformed

    private void CarregaEstoqueProduto()
    {
        EstoqueController contr = new EstoqueController();
         est = contr.RecuperaEstoqueProduto(prod.getIdProduto());
         est.setProdutoId(prod.getIdProduto());
         txtqtd.setText(Integer.toString(est.getQuantidade()));
    }
    
    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
     // tipoItem.setSelectedIndex(1);
     txtCodProd.setText(""); 
     txtqtd.setText(""); 
      this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void txtqtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtqtdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtqtdActionPerformed

    private void botaoPesquisaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisaVendaActionPerformed
        
           ConsultaProduto consulta = new ConsultaProduto(prod);
           consulta.addWindowListener(new WindowListener() {
           @Override
           public void windowOpened(WindowEvent e) {
           }

           @Override
           public void windowClosing(WindowEvent e) {
           }

           @Override
           public void windowClosed(WindowEvent e) {
               
               prod = consulta.GetProduto();
               
               if(prod.getIdProduto() > 0)
               {
                   txtCodProd.setText(String.valueOf(prod.getIdProduto()));
                   lblProduto.setText(prod.getNomeProd());
                   
                   CarregaEstoqueProduto();
               }
           }

           @Override
           public void windowIconified(WindowEvent e) {
           }

           @Override
           public void windowDeiconified(WindowEvent e) {
           }

           @Override
           public void windowActivated(WindowEvent e) {
           }

           @Override
           public void windowDeactivated(WindowEvent e) {
           }
       });
       
       
       consulta.setVisible(true);
  
       
       
    }//GEN-LAST:event_botaoPesquisaVendaActionPerformed

    private void txtCodProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodProdActionPerformed

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
    private javax.swing.JButton botaoPesquisaVenda;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JButton salvar;
    private javax.swing.JTextField txtCodProd;
    private javax.swing.JTextField txtqtd;
    // End of variables declaration//GEN-END:variables
}
