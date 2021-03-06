/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HBFTelas;

import Controller.ProdutoController;
import Model.Categorias;
import Model.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import HBFTelas.CadastroProduto;

public class ConsultaProduto extends javax.swing.JFrame {
    private Produto produto;
    private Categorias categorias;
    private List<Produto> produtos = new ArrayList<Produto>();
    
    public ConsultaProduto() {
        initComponents();
        
         DefaultTableModel cat = (DefaultTableModel)tabelaconsultaProduto.getModel();
        tabelaconsultaProduto.setRowSorter(new TableRowSorter(cat));
        
        readTabelaProduto();
    }
    
    public ConsultaProduto(Produto produto) {
        this();
        
        this.produto = produto;
    }

   public void readTabelaProduto(){
       DefaultTableModel produto = (DefaultTableModel)tabelaconsultaProduto.getModel();
       
       
      
       ProdutoController contr = new ProdutoController();
       produto.setNumRows(0);
       
       produtos = contr.read();
       
       for(Produto p: produtos){
           produto.addRow(new Object[]{
           p.getIdProduto(),
           p.getNomeProd(),
           p.getCodSKU(),
           p.getPrecoCompra(),
           p.getIdFornecedor(),           
           p.getIdCategoria(),
           p.getQtdmin()
       });
     }
   }
    
  public Produto GetProduto()
    {
        return produto;
    }  
  
  
  
  
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaconsultaProduto = new javax.swing.JTable();
        Selecionar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta Produto");
        getContentPane().setLayout(null);

        tabelaconsultaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descrição", "Codigo SKU", "Preço Compra", "Codigo Fornecedor", "Id Categoria", "Quantidade Minima"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaconsultaProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaconsultaProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaconsultaProduto);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 80, 770, 330);

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

        jMenu1.setText("Arquivos");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Outros");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setBounds(0, 0, 809, 541);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
              dispose();
        
        
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void SelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelecionarActionPerformed
        CadastroProduto cadastro = new CadastroProduto();
        
        if(tabelaconsultaProduto.getSelectedRow() == -1)
            return;
                
        
        produto = produtos.get(tabelaconsultaProduto.getSelectedRow());
        dispose();
        
      
        
        
    }//GEN-LAST:event_SelecionarActionPerformed

    private void tabelaconsultaProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaconsultaProdutoMouseClicked
        if(evt.getClickCount()== 2){
            
            Selecionar.doClick();
            
        }
    }//GEN-LAST:event_tabelaconsultaProdutoMouseClicked

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
            java.util.logging.Logger.getLogger(ConsultaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Selecionar;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaconsultaProduto;
    // End of variables declaration//GEN-END:variables
}
