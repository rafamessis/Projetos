/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HBFTelas;

import Controller.VendasController;
import Model.Produto;
import Model.Vendas;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Hudson
 */
public class ConsultaVenda extends javax.swing.JFrame {
    
    DecimalFormat valorFormatado = new DecimalFormat("0.00");
    VendasController contr = new VendasController();
    private List<Vendas> vendas = new ArrayList<Vendas>();
    private Vendas venda;

    /**
     * Creates new form ConsultaVenda
     */
    public ConsultaVenda() {
        initComponents();
        
        DefaultTableModel ven = (DefaultTableModel)tabelaConsultaVenda.getModel();
        tabelaConsultaVenda.setRowSorter(new TableRowSorter(ven));
        ven.setNumRows(0);
        
        vendas = contr.listaVendas();
        for(Vendas v: vendas){
            ven.addRow(new Object[]{v.getIdVenda(), (v.getDataVenda()).toString(), contr.pesquisaCliente(v.getIdCliente()), valorFormatado.format(v.getValorTotal()), contr.pesquisaTipoVenda(v.getIdTipoVenda()), contr.pesquisaFormaPagto(v.getIdFormaPagto())});
        }
        
    }
    
    public ConsultaVenda(Vendas venda) {
        this();
        
        this.venda = venda;
    }

    public Vendas GetVendas() {
        return venda;
    }  
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaConsultaVenda = new javax.swing.JTable();
        botaoSelecionar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Vendas");

        tabelaConsultaVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód.Venda", "Data", "Cliente", "Valor", "Tipo", "FormaPagto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaConsultaVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaConsultaVendaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaConsultaVenda);

        botaoSelecionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/GravarPequeno.png"))); // NOI18N
        botaoSelecionar.setText("Selecionar");
        botaoSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSelecionarActionPerformed(evt);
            }
        });

        botaoCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/CancelarPequeno.png"))); // NOI18N
        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 955, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                .addContainerGap())
        );

        setBounds(40, 80, 991, 555);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSelecionarActionPerformed
        // TODO add your handling code here:
        
        CadastroVendas cadastro = new CadastroVendas();
        
        if(tabelaConsultaVenda.getSelectedRow() == -1)
            return;
                
        
        venda = vendas.get(tabelaConsultaVenda.getSelectedRow());
        dispose();
        
    }//GEN-LAST:event_botaoSelecionarActionPerformed

    private void tabelaConsultaVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaConsultaVendaMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2)  
        {  
            botaoSelecionar.doClick();
        }
        
        
    }//GEN-LAST:event_tabelaConsultaVendaMouseClicked

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
            java.util.logging.Logger.getLogger(ConsultaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoSelecionar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaConsultaVenda;
    // End of variables declaration//GEN-END:variables
}
