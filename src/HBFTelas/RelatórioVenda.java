/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HBFTelas;

import Controller.VendasController;
import Conexao.TestandoRelatorios;
import Model.Vendas;
import Model.Cliente;
import Model.TipoVenda;
import Model.FormaPagto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author andre
 */
public class RelatórioVenda extends javax.swing.JInternalFrame {

    /**
     * Creates new form RelatórioVenda
     */
    public RelatórioVenda() {
        initComponents();
        gerarCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ComboBoxTipoVenda = new javax.swing.JComboBox<>();
        GerarRelatorioVenda = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        CancelarRelatorioVenda = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Relatório de Vendas");

        ComboBoxTipoVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxTipoVendaActionPerformed(evt);
            }
        });

        GerarRelatorioVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/relatório.jpg"))); // NOI18N
        GerarRelatorioVenda.setText("Gerar Relatório");
        GerarRelatorioVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerarRelatorioVendaActionPerformed(evt);
            }
        });

        jLabel1.setText("Tipo de venda:");

        CancelarRelatorioVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sair.png"))); // NOI18N
        CancelarRelatorioVenda.setText("Sair");
        CancelarRelatorioVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarRelatorioVendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(GerarRelatorioVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CancelarRelatorioVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboBoxTipoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ComboBoxTipoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelarRelatorioVenda)
                    .addComponent(GerarRelatorioVenda))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GerarRelatorioVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerarRelatorioVendaActionPerformed
        // TODO add your handling code here:
        TestandoRelatorios teste = new TestandoRelatorios();
        //System.out.println("abrindo.... ");
       try {
           String caminho = "C:\\Users\\Rafael\\Documents\\GitHub\\Projetos\\src\\Relatorio\\";//caminho que está os relatório na maquina
            String arquivo = "RelatorioDeVendas";//nome do arquivo do relatorio
           String tipoVenda = (String)ComboBoxTipoVenda.getSelectedItem();//buscando do comboBox e setando a categoria
           VendasController venda = new VendasController();
           int tipoVendas = venda.pesquisaTipoVendaNome(tipoVenda);
         //  int codigo = pc.pesquisaCategoriasNome(categoria);
           String parametro = "TipoVenda";
           teste.gerarRelatorio(caminho, arquivo, parametro, tipoVendas);

       }catch(SQLException | ClassNotFoundException | JRException e){
          System.out.println(e.getMessage());

        }
    }//GEN-LAST:event_GerarRelatorioVendaActionPerformed

    private void CancelarRelatorioVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarRelatorioVendaActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_CancelarRelatorioVendaActionPerformed

    private void ComboBoxTipoVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxTipoVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxTipoVendaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelarRelatorioVenda;
    private javax.swing.JComboBox<String> ComboBoxTipoVenda;
    private javax.swing.JButton GerarRelatorioVenda;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
public void gerarCombo(){//Método para preencher todas as categorias no combo box
    VendasController venda = new VendasController();
    List<TipoVenda> lista = venda.readTipoVendas();
    lista.forEach((v) -> {
        ComboBoxTipoVenda.addItem(v.getNomeTipoVenda());
        });
}
}
