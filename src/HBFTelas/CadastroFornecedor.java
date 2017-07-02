package HBFTelas;

import Controller.FornecedorController;
import Model.Fornecedor;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class CadastroFornecedor extends javax.swing.JInternalFrame {
    
    FornecedorController contr = new FornecedorController();
        List<Fornecedor> fornecedor = null;
        int codigo=0;
        
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
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        campoNome = new javax.swing.JTextField();
        campoCpfcnpj = new javax.swing.JTextField();
        campoFone = new javax.swing.JTextField();
        campoEndereco = new javax.swing.JTextField();
        campoWhatsapp = new javax.swing.JTextField();
        campoSite = new javax.swing.JTextField();
        botaoInserirFornecedor = new javax.swing.JButton();
        botaoAlterarFornecedor = new javax.swing.JButton();
        botaoExcluirFornecedor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelafornecedor = new javax.swing.JTable();
        botaocancelarFornecedor = new javax.swing.JButton();
        campoCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

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

        botaoInserirFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Novo.png"))); // NOI18N
        botaoInserirFornecedor.setText("Inserir");
        botaoInserirFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInserirFornecedorActionPerformed(evt);
            }
        });

        botaoAlterarFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Editar.png"))); // NOI18N
        botaoAlterarFornecedor.setText("Alterar");
        botaoAlterarFornecedor.setEnabled(false);
        botaoAlterarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarFornecedorActionPerformed(evt);
            }
        });

        botaoExcluirFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Excluir.png"))); // NOI18N
        botaoExcluirFornecedor.setText("Excluir");
        botaoExcluirFornecedor.setEnabled(false);
        botaoExcluirFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirFornecedorActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

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

        botaocancelarFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cancelar.png"))); // NOI18N
        botaocancelarFornecedor.setText("Cancelar");
        botaocancelarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaocancelarFornecedorActionPerformed(evt);
            }
        });

        campoCodigo.setEnabled(false);

        jLabel2.setText("Código:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 96, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoInserirFornecedor)
                                .addGap(26, 26, 26)
                                .addComponent(botaoAlterarFornecedor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoExcluirFornecedor)
                                .addGap(27, 27, 27)
                                .addComponent(botaocancelarFornecedor))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(campoCodigo)
                                            .addComponent(campoEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                            .addComponent(campoNome, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addComponent(jLabel6))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(jLabel7))
                                            .addComponent(jLabel5)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel4)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoCpfcnpj)
                                    .addComponent(campoFone, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(campoSite, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(campoWhatsapp))))
                        .addGap(102, 102, 102))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoCpfcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoWhatsapp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campoSite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoExcluirFornecedor)
                    .addComponent(botaoAlterarFornecedor)
                    .addComponent(botaoInserirFornecedor)
                    .addComponent(botaocancelarFornecedor))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed

    }//GEN-LAST:event_campoNomeActionPerformed

    private void botaoExcluirFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirFornecedorActionPerformed
        
        Fornecedor f = new Fornecedor();        
        f.setCodigo(Integer.parseInt(campoCodigo.getText().trim()));        
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir este Fornecedor ?", title, JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                contr.delete(String.valueOf(f.getCodigo()));
                preencheTabela();
            }
        limpar ();
        botaoInserirFornecedor.setEnabled(true);
        botaoExcluirFornecedor.setEnabled(false);
        botaoAlterarFornecedor.setEnabled(false);
    }//GEN-LAST:event_botaoExcluirFornecedorActionPerformed

    private void botaoAlterarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarFornecedorActionPerformed
        
        Fornecedor f = new Fornecedor();
        
        int posicao = tabelafornecedor.getSelectedRow();//Buscando o numero da posição da tabela que foi clicado no mouse
        String nome = campoNome.getText().trim(); //gravando o que esta no campo para a variavel 
        String endereco = campoEndereco.getText().trim(); //gravando o que esta no campo para a variavel
        String cpcnpj = campoCpfcnpj.getText().trim(); //gravando o que esta no campo para a variavel
        String fone =   campoFone.getText(); //gravando o que esta no campo para a variavel
        String whats = campoWhatsapp.getText().trim(); //gravando o que esta no campo para a variavel
        String site = campoSite.getText().trim(); //gravando o que esta no campo para a variavel
        
        if(nome.isEmpty()){//Verificando se o Campo esta com algum valor
            JOptionPane.showMessageDialog(null, "Por favor insira o nome:");
            return;
        }
        else if(endereco.isEmpty()){//Verificando se o Campo esta com algum valor
            JOptionPane.showMessageDialog(null, "Por favor insira o endereço:");
            return;
        }
        else if(cpcnpj.isEmpty()){//Verificando se o Campo esta com algum valor
            JOptionPane.showMessageDialog(null, "Por favor insira o CPF/CNPJ:");
            return;
        }
        else if(fone.isEmpty()){//Verificando se o Campo esta com algum valor
            JOptionPane.showMessageDialog(null, "Por favor insira o Telefone:");
            return;
        }
        else if(whats.isEmpty()){//Verificando se o Campo esta com algum valor
            JOptionPane.showMessageDialog(null, "Por favor insira o Whatsapp:");
            return;
        }
        else if(site.isEmpty()){//Verificando se o Campo esta com algum valor
            JOptionPane.showMessageDialog(null, "Por favor insira o Site:");
            return;
        }
        
        fornecedor = contr.read();
        
        f.setNome(nome); //passando para o objeto o nome digitado no campo nome
        f.setEndereco(endereco); //passando para o objeto o endereço digitado no campo endereço
        f.setCpf_cnpj(cpcnpj); //passando para o objeto o cpfcnpj digitado no campo cpfcnpj
        f.setFone(fone); //passando para o objeto o telefone digitado no campo telefone
        f.setWhatsapp(whats); //passando para o objeto o whatsapp digitado no campo whatsapp
        f.setSite(site); //passando para o objeto o site digitado no campo site
        
        contr.update(f,codigo); 
        preencheTabela();
        limpar();
        codigo = 0;
        botaoInserirFornecedor.setEnabled(true);
        botaoExcluirFornecedor.setEnabled(false);
        botaoAlterarFornecedor.setEnabled(false);
    }//GEN-LAST:event_botaoAlterarFornecedorActionPerformed

    private void botaoInserirFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInserirFornecedorActionPerformed
        
        String nome = campoNome.getText().trim(); //gravando o que esta no campo para a variavel 
        String endereco = campoEndereco.getText().trim(); //gravando o que esta no campo para a variavel
        String cpcnpj = campoCpfcnpj.getText().trim(); //gravando o que esta no campo para a variavel
        String fone =   campoFone.getText(); //gravando o que esta no campo para a variavel
        String whats = campoWhatsapp.getText().trim(); //gravando o que esta no campo para a variavel
        String site = campoSite.getText().trim(); //gravando o que esta no campo para a variavel
        
        if(nome.isEmpty()){//Verificando se o Campo esta com algum valor
            JOptionPane.showMessageDialog(null, "Por favor insira o nome:");
            return;
        }
        else if(endereco.isEmpty()){//Verificando se o Campo esta com algum valor
            JOptionPane.showMessageDialog(null, "Por favor insira o endereço:");
            return;
        }
        else if(cpcnpj.isEmpty()){//Verificando se o Campo esta com algum valor
            JOptionPane.showMessageDialog(null, "Por favor insira o CPF/CNPJ:");
            return;
        }
        else if(fone.isEmpty()){//Verificando se o Campo esta com algum valor
            JOptionPane.showMessageDialog(null, "Por favor insira o Telefone:");
            return;
        }
        else if(whats.isEmpty()){//Verificando se o Campo esta com algum valor
            JOptionPane.showMessageDialog(null, "Por favor insira o Whatsapp:");
            return;
        }
        else if(site.isEmpty()){//Verificando se o Campo esta com algum valor
            JOptionPane.showMessageDialog(null, "Por favor insira o Site:");
            return;
        }
        
        Fornecedor f= new Fornecedor();
        FornecedorController contr = new FornecedorController();
 
        f.setNome(campoNome.getText());
        f.setCpf_cnpj(campoCpfcnpj.getText());
        f.setEndereco(campoEndereco.getText());
        f.setFone(campoFone.getText());
        f.setWhatsapp(campoWhatsapp.getText());
        f.setSite(campoSite.getText());

        contr.create(f);
        limpar();
        preencheTabela();
        botaoInserirFornecedor.setEnabled(true);
        botaoExcluirFornecedor.setEnabled(false);
        botaoAlterarFornecedor.setEnabled(false);
    }//GEN-LAST:event_botaoInserirFornecedorActionPerformed

    private void botaocancelarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaocancelarFornecedorActionPerformed
        botaoInserirFornecedor.setEnabled(true);
        botaoExcluirFornecedor.setEnabled(false);
        botaoAlterarFornecedor.setEnabled(false);
        limpar();
        

    }//GEN-LAST:event_botaocancelarFornecedorActionPerformed

    private void tabelafornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelafornecedorMouseClicked
        String Tipo="";
               
        Fornecedor fornecedores = fornecedor.get(tabelafornecedor.getSelectedRow());
            campoNome.setText(fornecedores.getNome());//Recuperando da arreylist 
            campoCodigo.setText(String.valueOf(fornecedores.getCodigo()));
            campoCpfcnpj.setText(fornecedores.getCpf_cnpj());//Recuperando da arreylist 
            campoEndereco.setText(fornecedores.getEndereco());
            campoFone.setText(fornecedores.getFone());
            campoWhatsapp.setText(fornecedores.getWhatsapp());
            campoSite.setText(fornecedores.getSite());
            codigo =fornecedores.getCodigo();//Nome parametro para alterar
            
            botaoInserirFornecedor.setEnabled(false);
            botaoExcluirFornecedor.setEnabled(true);
            botaoAlterarFornecedor.setEnabled(true);
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
        campoCodigo.setText("");
        campoNome.setText("");
        campoEndereco.setText("");
        campoCpfcnpj.setText("");
        campoFone.setText("");
        campoWhatsapp.setText("");
        campoSite.setText("");
        }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAlterarFornecedor;
    private javax.swing.JButton botaoExcluirFornecedor;
    private javax.swing.JButton botaoInserirFornecedor;
    private javax.swing.JButton botaocancelarFornecedor;
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
