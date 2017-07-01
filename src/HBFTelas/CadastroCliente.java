/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HBFTelas;

import Controller.ClienteController;
import Controller.UsuarioController;
import Model.Cliente;
import Model.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author andre
 */
public class CadastroCliente extends javax.swing.JInternalFrame {
    
    ArrayList valores = new ArrayList();//criação da arrayList para salvar os dados na tabela
    //int posicao=0;//Criei a posição para reconhecer qual posição da tabela foi selecionada
    ClienteController ccontroller = new ClienteController();
   
    List<Cliente> clientes = null;
    
    int CodigoTeste = 0;
    
    //ArrayList valores = new ArrayList();//criação da arrayList para salvar os dados na tabela
    //int posicao=0;//Criei a posição para reconhecer qual posição da tabela foi selecionada
    public void preencheTabela(){
        
        DefaultTableModel tabela = (DefaultTableModel)tabelaCliente.getModel();
        tabelaCliente.setRowSorter(new TableRowSorter(tabela));
        tabela.setNumRows(0);
        clientes = ccontroller.read("");
        for(int i=0;i<clientes.size();i++){
            tabela.addRow(new Object[]{clientes.get(i).getNome(),clientes.get(i).getCodigo(),
                clientes.get(i).getCpf_cnpj(),clientes.get(i).getEndereco(),clientes.get(i).getFone(),
                clientes.get(i).getLimiteCredito(), clientes.get(i).getWhatsapp()});
        }    
    }
    /**
     * Creates new form TelaConsultaUsuario
     */

    /**
     * Creates new form CadastroCliente
     */
    public CadastroCliente() {
        initComponents();
        
        clientes = ccontroller.read("");
        
        preencheTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nomecliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cpfcnpj = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        codigocliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        telefonecliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        enderecocliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        limitecredito = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        whatsappcliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCliente = new javax.swing.JTable();
        botaogravar = new javax.swing.JButton();
        botaoalterar = new javax.swing.JButton();
        botaoexcluir = new javax.swing.JButton();
        botaocancelar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Cadastro de Clientes");
        setMaximumSize(new java.awt.Dimension(21474836, 21474836));

        jLabel1.setText("Nome:");

        nomecliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeclienteActionPerformed(evt);
            }
        });

        jLabel2.setText("CPF / CNPJ:");

        cpfcnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfcnpjActionPerformed(evt);
            }
        });

        jLabel3.setText("Código:");

        codigocliente.setEnabled(false);
        codigocliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoclienteActionPerformed(evt);
            }
        });

        jLabel4.setText("Telefone:");

        telefonecliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneclienteActionPerformed(evt);
            }
        });

        jLabel5.setText("Endereço:");

        enderecocliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoclienteActionPerformed(evt);
            }
        });

        jLabel6.setText("Whatsapp:");

        limitecredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limitecreditoActionPerformed(evt);
            }
        });

        jLabel7.setText("Limite de Credito:");

        whatsappcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whatsappclienteActionPerformed(evt);
            }
        });

        tabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Código", "CPF / CNPJ", "Endereço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaCliente);
        if (tabelaCliente.getColumnModel().getColumnCount() > 0) {
            tabelaCliente.getColumnModel().getColumn(0).setResizable(false);
        }

        botaogravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Novo.png"))); // NOI18N
        botaogravar.setText("Incluir");
        botaogravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaogravarActionPerformed(evt);
            }
        });

        botaoalterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Editar.png"))); // NOI18N
        botaoalterar.setText("Alterar");
        botaoalterar.setEnabled(false);
        botaoalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoalterarActionPerformed(evt);
            }
        });

        botaoexcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Excluir.png"))); // NOI18N
        botaoexcluir.setText("Apagar");
        botaoexcluir.setEnabled(false);
        botaoexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoexcluirActionPerformed(evt);
            }
        });

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jLabel3))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(enderecocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(codigocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nomecliente, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaogravar)
                                .addGap(32, 32, 32)
                                .addComponent(botaoalterar)))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(whatsappcliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(telefonecliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cpfcnpj, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botaoexcluir)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botaocancelar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(limitecredito, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(95, 95, 95))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cpfcnpj, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                            .addComponent(jLabel2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomecliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(codigocliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(telefonecliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(whatsappcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(limitecredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(enderecocliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaogravar)
                    .addComponent(botaoexcluir)
                    .addComponent(botaocancelar)
                    .addComponent(botaoalterar))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeclienteActionPerformed

    private void codigoclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoclienteActionPerformed

    private void enderecoclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoclienteActionPerformed

    private void telefoneclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneclienteActionPerformed

    private void limitecreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limitecreditoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_limitecreditoActionPerformed

    private void whatsappclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whatsappclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_whatsappclienteActionPerformed

    private void cpfcnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfcnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfcnpjActionPerformed

    private void botaocancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaocancelarActionPerformed
         nomecliente.setText("");
         enderecocliente.setText("");
         limitecredito.setText("");
         cpfcnpj.setText("");
         whatsappcliente.setText("");
         telefonecliente.setText("");
         codigocliente.setText("");
         
                  
         botaogravar.setEnabled(true);
         botaoalterar.setEnabled(false);
         botaoexcluir.setEnabled(false);
    }//GEN-LAST:event_botaocancelarActionPerformed
        
    private void botaoalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoalterarActionPerformed
         Cliente cliente = new Cliente();
        
        int posicao = tabelaCliente.getSelectedRow();//Buscando o numero da posição da tabela que foi clicado no mouse
        String nome = nomecliente.getText().trim();//gravando o que esta no campo para a variavel senha
        String endereco = enderecocliente.getText().trim();
        String cpcnpj = cpfcnpj.getText().trim();
        String fone =   telefonecliente.getText();
        String whats = whatsappcliente.getText().trim();
        String limite = limitecredito.getText().trim();
        
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
        else if(limite.isEmpty()){//Verificando se o Campo senha esta com algum valor
            JOptionPane.showMessageDialog(null, "Por favor insira o endereço:");
            return;
        }
        
        clientes = ccontroller.read("");
        
        cliente.setNome(nome);//passando para o objeto o nome digitado no campo nome
        cliente.setEndereco(endereco);//passando para o objeto o endereço digitado no campo endereço
        cliente.setCpf_cnpj(cpcnpj);//passando para o objeto o cpfcnpj digitado no campo cpfcnpj
        cliente.setFone(fone);//passando para o objeto o telefone digitado no campo telefone
        cliente.setWhatsapp(whats);//passando para o objeto o whatsapp digitado no campo whatsapp
        cliente.setLimiteCredito(Double.parseDouble(limite));//passando para o objeto o limite de credito digitado no campo limitecredito
        
        ccontroller.update(cliente,CodigoTeste);
        
        preencheTabela();
        
        nomecliente.setText("");
        enderecocliente.setText("");
        cpfcnpj.setText("");
        telefonecliente.setText("");
        whatsappcliente.setText("");
        limitecredito.setText("");
        codigocliente.setText("");
        
        CodigoTeste = 0;
        botaogravar.setEnabled(true);
        botaoexcluir.setEnabled(false);
        botaoalterar.setEnabled(false);
    }//GEN-LAST:event_botaoalterarActionPerformed

    private void botaogravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaogravarActionPerformed
        
        
        
         String nomec = nomecliente.getText().trim();
         String enderecoc = enderecocliente.getText().trim();
         String telefonec = telefonecliente.getText().trim();
         String whatsappc = whatsappcliente.getText().trim();
         String limitecc = (limitecredito.getText().trim());
         String cpcnpjc = cpfcnpj.getText().trim();
         
         if (nomec.isEmpty()){
             JOptionPane.showMessageDialog(null, "Por favor insira o nome:");
            return;
         }
         else if
                 (enderecoc.isEmpty()){
             JOptionPane.showMessageDialog(null, "Por favor insira o endereço:");
            return;
         }
         else if
                 (cpcnpjc.isEmpty()){
             JOptionPane.showMessageDialog(null, "Por favor insira o CPF / CNPJ:");
            return;
         }
         else if
                 (telefonec.isEmpty()){
             JOptionPane.showMessageDialog(null, "Por favor insira o telefone:");
            return;
         }
         else if
                 (whatsappc.isEmpty()){
             JOptionPane.showMessageDialog(null, "Por favor insira o whatsapp:");
            return;
         }
         else if
                 (limitecc.isEmpty()){
             JOptionPane.showMessageDialog(null, "Por favor insira o limite de crédito");
             return;
         } 
         
         Cliente cliente = new Cliente();
        
        cliente.setNome(nomec); //passando para o objeto o nome digitado no campo nome
        cliente.setEndereco(enderecoc);//passando para o objeto o endereco digitado no campo endereco
        cliente.setCpf_cnpj(cpcnpjc); //passando para o objeto o cpf/cnpj digitado no campo cpf/cnpj
        cliente.setFone(telefonec);
        cliente.setWhatsapp(whatsappc);
        cliente.setLimiteCredito(Double.parseDouble(limitecc));
        
        
        ccontroller.create(cliente);//colocando o objeto no Bando de dados
        
        preencheTabela();
//      DefaultTableModel val = (DefaultTableModel) tabelaUsuario.getModel();//val = valores da tabela
//      val.addRow(new Object[]{u.getNomeUsuario(),u.getSenhaUsuario(),u.getTipo()});//((String[]) valores.get(valores.size()-1));
        nomecliente.setText("");
        enderecocliente.setText("");
        cpfcnpj.setText("");
        telefonecliente.setText("");
        whatsappcliente.setText("");
        limitecredito.setText("");
        codigocliente.setText("");
        
        nomec = "";
        enderecoc = "";
        telefonec = "";
        whatsappc = "";
        limitecc = "";
        cpcnpjc = "";
                          
    }//GEN-LAST:event_botaogravarActionPerformed

    private void tabelaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClienteMouseClicked
        String Tipo="";
           Cliente cliente = clientes.get(tabelaCliente.getSelectedRow());
           
           nomecliente.setText(cliente.getNome());
           codigocliente.setText(String.valueOf(cliente.getCodigo()));
           enderecocliente.setText(cliente.getEndereco());
           cpfcnpj.setText(cliente.getCpf_cnpj());
           telefonecliente.setText(cliente.getFone());
           whatsappcliente.setText(cliente.getWhatsapp());
           limitecredito.setText(String.valueOf(cliente.getLimiteCredito()));
           
           
           CodigoTeste = cliente.getCodigo(); //Nome parametro para alterar
           botaogravar.setEnabled(false);
           botaoexcluir.setEnabled(true);
           botaoalterar.setEnabled(true);
    }//GEN-LAST:event_tabelaClienteMouseClicked

    private void botaoexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoexcluirActionPerformed
        Cliente clientes = new Cliente();
        
        clientes.setCodigo(Integer.parseInt(codigocliente.getText().trim()));
        
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir este cliente ?", title, JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            ccontroller.delete(String.valueOf(clientes.getCodigo()));
            preencheTabela();
            //((DefaultTableModel) tabelaUsuario.getModel()).removeRow(tabelaUsuario.getSelectedRow());
        }
        
        nomecliente.setText("");
         enderecocliente.setText("");
         limitecredito.setText("");
         cpfcnpj.setText("");
         whatsappcliente.setText("");
         telefonecliente.setText("");
         codigocliente.setText("");
        
        botaogravar.setEnabled(true);
        botaoexcluir.setEnabled(false);
        botaoalterar.setEnabled(false);
    }//GEN-LAST:event_botaoexcluirActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoalterar;
    private javax.swing.JButton botaocancelar;
    private javax.swing.JButton botaoexcluir;
    private javax.swing.JButton botaogravar;
    private javax.swing.JTextField codigocliente;
    private javax.swing.JTextField cpfcnpj;
    private javax.swing.JTextField enderecocliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField limitecredito;
    private javax.swing.JTextField nomecliente;
    private javax.swing.JTable tabelaCliente;
    private javax.swing.JTextField telefonecliente;
    private javax.swing.JTextField whatsappcliente;
    // End of variables declaration//GEN-END:variables
}
