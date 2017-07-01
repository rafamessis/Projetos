package HBFTelas;

import Controller.FornecedorController;
import Model.Fornecedor;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class CadastroFornecedor extends javax.swing.JInternalFrame {
//    int acao;
 //   Fornecedor f= new Fornecedor();
       FornecedorController contr = new FornecedorController();
        List<Fornecedor> fornecedor = null;
        
    public void preencheTabela(){
        
        DefaultTableModel tabela = (DefaultTableModel)tabelafornecedor.getModel();
        tabelafornecedor.setRowSorter(new TableRowSorter(tabela));
        tabela.setNumRows(0);
        fornecedor = contr.read();
        for(int i=0;i<fornecedor.size();i++){
            tabela.addRow(new Object[]{ fornecedor.get(i).getCodigo(),fornecedor.get(i).getNome(),fornecedor.get(i).getCpf_cnpj()});
        }
       }
    public CadastroFornecedor() {
        initComponents();
        preencheTabela();
    }

    private void tabelaUsuarioMouseClicked(java.awt.event.MouseEvent evt) {    
           String Tipo="";
        
           Fornecedor fornecedores = fornecedor.get(tabelafornecedor.getSelectedRow());
           campoNome.setText(fornecedores.getNome());//Recuperando da arreylist 
           campoCpfcnpj.setText(fornecedores.getCpf_cnpj());//Recuperando da arreylist 
           campoEndereco.setText(fornecedores.getEndereco());
           campoFone.setText(fornecedores.getFone());
           //campoWhatsapp.setText(Integer.parseInt(fornecedores.getWhatsapp()));
           //campoWhatsapp.setText(fornecedores.(Integer.parseInt(getWhatsapp())));
           campoSite.setText(fornecedores.getSite());
           
           String NomeTeste = fornecedores.getNome();//Nome parametro para alterar
    
    }   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        campoNome = new javax.swing.JTextField();
        campoCodigo = new javax.swing.JTextField();
        campoCpfcnpj = new javax.swing.JTextField();
        campoFone = new javax.swing.JTextField();
        campoEndereco = new javax.swing.JTextField();
        campoWhatsapp = new javax.swing.JTextField();
        campoSite = new javax.swing.JTextField();
        botaoInserir = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelafornecedor = new javax.swing.JTable();
        botaocancelar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro Fornecedor");

        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });

        campoCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCodigoActionPerformed(evt);
            }
        });

        botaoInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Novo.png"))); // NOI18N
        botaoInserir.setText("Inserir");
        botaoInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInserirActionPerformed(evt);
            }
        });

        botaoSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Editar.png"))); // NOI18N
        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        botaoExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Excluir.png"))); // NOI18N
        botaoExcluir.setText("Excluir");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("Código:");

        jLabel3.setText("Endereço:");

        jLabel4.setText("Site:");

        jLabel5.setText("Whatsapp:");

        jLabel6.setText("Fone:");

        jLabel7.setText("CPF/CNPJ:");

        tabelafornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome:", "CPF/CNPJ"
            }
        ));
        tabelafornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelafornecedorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelafornecedor);

        botaocancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cancelar.png"))); // NOI18N
        botaocancelar.setText("Cancelar");
        botaocancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaocancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoInserir)
                        .addGap(26, 26, 26)
                        .addComponent(botaoSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoExcluir)
                        .addGap(27, 27, 27)
                        .addComponent(botaocancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(campoNome, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(campoCodigo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel7))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoSite)
                            .addComponent(campoCpfcnpj)
                            .addComponent(campoWhatsapp)
                            .addComponent(campoFone, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoCpfcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoWhatsapp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoSite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(campoEndereco))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoExcluir)
                    .addComponent(botaoSalvar)
                    .addComponent(botaoInserir)
                    .addComponent(botaocancelar))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void campoCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCodigoActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
    Fornecedor f= new Fornecedor();
        FornecedorController contr = new FornecedorController();
        f.setNome(campoNome.getText());
        f.setCpf_cnpj(campoCpfcnpj.getText());
        // f.setCodigo(Integer.parseInt(campoCodigo.getText()));
        f.setEndereco(campoEndereco.getText());
        f.setFone(campoFone.getText());
        f.setWhatsapp(campoWhatsapp.getText());
        f.setSite(campoSite.getText());
            contr.create(f);
        // if(!(campoNome.getText()).isEmpty()&& !(campoCodigo.getText()).isEmpty()&& !(campoEndereco.getText()).isEmpty()&& !(campoCpfcnpj.getText()).isEmpty()&& !(campoFone.getText()).isEmpty()&& !(campoWhatsapp.getText()).isEmpty()&& !(campoSite.getText()).isEmpty()){
            //Fornecedor f = new Fornecedor();
           // FornecedorController contr = new FornecedorController();  
           // f.setNome(campoNome.getText());
         //   f.getCpf_cnpj(Integer.parseInt(campoCpfcnpj.getText()));
       // }
        limpar();
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInserirActionPerformed
        novo();
    }//GEN-LAST:event_botaoInserirActionPerformed

    private void botaocancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaocancelarActionPerformed
        limpar();
    }//GEN-LAST:event_botaocancelarActionPerformed

    private void tabelafornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelafornecedorMouseClicked
        String Tipo="";
        
           Fornecedor fornecedores = fornecedor.get(tabelafornecedor.getSelectedRow());
           campoNome.setText(fornecedores.getNome());//Recuperando da arreylist 
           campoCpfcnpj.setText(fornecedores.getCpf_cnpj());//Recuperando da arreylist 
           campoEndereco.setText(fornecedores.getEndereco());
           campoFone.setText(fornecedores.getFone());
           //campoWhatsapp.setText(Integer.parseInt(fornecedores.getWhatsapp()));
           //campoWhatsapp.setText(fornecedores.(Integer.parseInt(getWhatsapp())));
           campoSite.setText(fornecedores.getSite());
           
           String NomeTeste = fornecedores.getNome();//Nome parametro para alterar
    }//GEN-LAST:event_tabelafornecedorMouseClicked
    public void novo(){
        campoNome.setEnabled(true);
        campoEndereco.setEnabled(true);
        campoCpfcnpj.setEnabled(true);
        campoFone.setEnabled(true);
        campoWhatsapp.setEnabled(true);
        campoSite.setEnabled(true);
    }   
        public void limpar(){
        campoNome.setEnabled(false);
        campoEndereco.setEnabled(false);
        campoCpfcnpj.setEnabled(false);
        campoFone.setEnabled(false);
        campoWhatsapp.setEnabled(false);
        campoSite.setEnabled(false);
    
        campoNome.setText("");
        campoEndereco.setText("");
        campoCpfcnpj.setText("");
        campoFone.setText("");
        campoWhatsapp.setText("");
        campoSite.setText("");
        }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoInserir;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JButton botaocancelar;
    private javax.swing.JTextField campoCodigo;
    private javax.swing.JTextField campoCpfcnpj;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JTextField campoFone;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoSite;
    private javax.swing.JTextField campoWhatsapp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabelafornecedor;
    // End of variables declaration//GEN-END:variables
}
