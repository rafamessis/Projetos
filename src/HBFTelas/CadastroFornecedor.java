package HBFTelas;

import Controller.FornecedorController;
import Model.Fornecedor;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class CadastroFornecedor extends javax.swing.JInternalFrame {
//    int acao;
 //   Fornecedor f= new Fornecedor();
       FornecedorController contr = new FornecedorController();
       private List<Fornecedor> fornecedor = new ArrayList<Fornecedor>();
       private Fornecedor fornecedores = new Fornecedor();
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
    
    public CadastroFornecedor(Fornecedor fornecedor) {
        this();

        this.fornecedores = fornecedor;
    }

    public Fornecedor GetFornecedor() {

        return fornecedores;
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
        botaoInserir = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelafornecedor = new javax.swing.JTable();
        botaocancelar = new javax.swing.JButton();
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
        getContentPane().setLayout(null);

        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });
        getContentPane().add(campoNome);
        campoNome.setBounds(164, 38, 170, 20);
        getContentPane().add(campoCpfcnpj);
        campoCpfcnpj.setBounds(437, 38, 120, 20);
        getContentPane().add(campoFone);
        campoFone.setBounds(437, 69, 120, 20);
        getContentPane().add(campoEndereco);
        campoEndereco.setBounds(164, 100, 170, 20);
        getContentPane().add(campoWhatsapp);
        campoWhatsapp.setBounds(437, 100, 120, 20);
        getContentPane().add(campoSite);
        campoSite.setBounds(437, 131, 120, 20);

        botaoInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Novo.png"))); // NOI18N
        botaoInserir.setText("Inserir");
        botaoInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInserirActionPerformed(evt);
            }
        });
        getContentPane().add(botaoInserir);
        botaoInserir.setBounds(111, 182, 89, 31);

        botaoSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Editar.png"))); // NOI18N
        botaoSalvar.setText("Alterar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSalvar);
        botaoSalvar.setBounds(226, 182, 91, 31);

        botaoExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Excluir.png"))); // NOI18N
        botaoExcluir.setText("Excluir");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(botaoExcluir);
        botaoExcluir.setBounds(340, 182, 89, 31);

        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(129, 41, 31, 14);

        jLabel3.setText("Endereço:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(111, 103, 49, 14);

        jLabel4.setText("Site:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(411, 137, 22, 14);

        jLabel5.setText("Whatsapp:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(380, 103, 53, 14);

        jLabel6.setText("Fone:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(405, 72, 28, 14);

        jLabel7.setText("CPF/CNPJ:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(381, 41, 52, 14);

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

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(111, 250, 452, 216);

        botaocancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cancelar.png"))); // NOI18N
        botaocancelar.setText("Cancelar");
        botaocancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaocancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botaocancelar);
        botaocancelar.setBounds(456, 182, 101, 31);

        campoCodigo.setEnabled(false);
        getContentPane().add(campoCodigo);
        campoCodigo.setBounds(164, 69, 170, 20);

        jLabel2.setText("Código:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(123, 72, 37, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        Fornecedor f = new Fornecedor();        
        f.setCodigo(Integer.parseInt(campoCodigo.getText().trim()));        
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir este Fornecedor ?", title, JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            contr.delete(String.valueOf(f.getCodigo()));
            preencheTabela();
        }
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        Fornecedor f = new Fornecedor();
        
        int posicao = tabelafornecedor.getSelectedRow();//Buscando o numero da posição da tabela que foi clicado no mouse
        String nome = campoNome.getText().trim();//gravando o que esta no campo para a variavel senha
        String endereco = campoEndereco.getText().trim();
        String cpcnpj = campoCpfcnpj.getText().trim();
        String fone =   campoFone.getText();
        String whats = campoWhatsapp.getText().trim();
        String site = campoSite.getText().trim();
        
        if(nome.isEmpty()){//Verificando se o Campo nome esta com algum valor
            JOptionPane.showMessageDialog(null, "Por favor insira o nome:");
            return;
        }
        else if(endereco.isEmpty()){//Verificando se o Campo senha esta com algum valor
            JOptionPane.showMessageDialog(null, "Por favor insira o endereço:");
            return;
        }
        else if(cpcnpj.isEmpty()){//Verificando se o Campo senha esta com algum valor
            JOptionPane.showMessageDialog(null, "Por favor insira o endereço:");
            return;
        }
        else if(fone.isEmpty()){//Verificando se o Campo senha esta com algum valor
            JOptionPane.showMessageDialog(null, "Por favor insira o endereço:");
            return;
        }
        else if(whats.isEmpty()){//Verificando se o Campo senha esta com algum valor
            JOptionPane.showMessageDialog(null, "Por favor insira o endereço:");
            return;
        }
        else if(site.isEmpty()){//Verificando se o Campo senha esta com algum valor
            JOptionPane.showMessageDialog(null, "Por favor insira o endereço:");
            return;
        }
        
        fornecedor = contr.read();
        
        f.setNome(nome);//passando para o objeto o nome digitado no campo nome
        f.setEndereco(endereco);//passando para o objeto o endereço digitado no campo endereço
        f.setCpf_cnpj(cpcnpj);//passando para o objeto o cpfcnpj digitado no campo cpfcnpj
        f.setFone(fone);//passando para o objeto o telefone digitado no campo telefone
        f.setWhatsapp(whats);//passando para o objeto o whatsapp digitado no campo whatsapp
        f.setSite(site);//passando para o objeto o limite de credito digitado no campo limitecredito
        
        contr.update(f,codigo);
        
        preencheTabela();
        
        limpar();
        
        codigo = 0;
        
        /*    Fornecedor f = new Fornecedor(); 
        
        int posicao = tabelafornecedor.getSelectedRow();//Buscando o numero da posição da tabela que foi clicado no mouse
        String nomef = campoNome.getText().trim();
        String enderecof = campoEndereco.getText().trim();
        String telefonef = campoFone.getText().trim();
        String whatsappf = campoWhatsapp.getText().trim();
        String sitef = (campoSite.getText().trim());
        String cpcnpjf = campoCpfcnpj.getText().trim();
        
         
         if (nomef.isEmpty()){
             JOptionPane.showMessageDialog(null, "Por favor insira o nome:");
            return;
         }
         else if
                 (enderecof.isEmpty()){
             JOptionPane.showMessageDialog(null, "Por favor insira o endereço:");
            return;
         }
         else if
                 (cpcnpjf.isEmpty()){
             JOptionPane.showMessageDialog(null, "Por favor insira o CPF / CNPJ:");
            return;
         }
         else if
                 (telefonef.isEmpty()){
             JOptionPane.showMessageDialog(null, "Por favor insira o telefone:");
            return;
         }
         else if
                 (whatsappf.isEmpty()){
             JOptionPane.showMessageDialog(null, "Por favor insira o whatsapp:");
            return;
         }
         else if
                 (sitef.isEmpty()){
             JOptionPane.showMessageDialog(null, "Por favor insira o Site");
             return;
         } 
         
         fornecedor = contr.read("");
        
        f.setNome(nomef); //passando para o objeto o nome digitado no campo nome
        f.setEndereco(enderecof);//passando para o objeto o endereco digitado no campo endereco
        f.setCpf_cnpj(cpcnpjf); //passando para o objeto o cpf/cnpj digitado no campo cpf/cnpj
        f.setFone(telefonef);
        f.setWhatsapp(whatsappf);
        f.setSite(sitef);
        
        
        contr.update(f,codigo);//colocando o objeto no Bando de dados
        
        preencheTabela();
            */
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInserirActionPerformed
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
        preencheTabela();
    }//GEN-LAST:event_botaoInserirActionPerformed

    private void botaocancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaocancelarActionPerformed
        limpar();
    }//GEN-LAST:event_botaocancelarActionPerformed

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
//        campoNome.setEnabled(false);
//        campoEndereco.setEnabled(false);
//        campoCpfcnpj.setEnabled(false);
//        campoFone.setEnabled(false);
  //      campoWhatsapp.setEnabled(false);
 //       campoSite.setEnabled(false);
    
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
