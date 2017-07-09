package HBFTelas;

import Controller.DespesaController;
import Model.Despesa;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class CadastroDespesa extends javax.swing.JInternalFrame {
    private Despesa despesad = new Despesa();
    private List<Despesa> despesa = new ArrayList<Despesa>();
    DespesaController contr = new DespesaController();
    int codigo=0;
    SimpleDateFormat dataFormatadaExibir = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat dataFormatadaSalvar = new SimpleDateFormat("yyMMdd");
    Date data = new Date(System.currentTimeMillis());

    public CadastroDespesa() {
        initComponents();
                initComponents();
        DefaultTableModel tabela = (DefaultTableModel)tabelaDespesa.getModel();
        tabelaDespesa.setRowSorter(new TableRowSorter(tabela));
        
        preencheTabela();
    }
    public Despesa GetDespesa() {
        return despesad;
    }
     public CadastroDespesa(Despesa despesa){
         this();
         
         this.despesad = despesa;
     }
     public void preencheTabela(){
        DefaultTableModel tabela = (DefaultTableModel)tabelaDespesa.getModel();       
        
        tabela.setNumRows(0);
        despesa = contr.read();
        for(int i=0;i<despesa.size();i++){
            tabela.addRow(new Object[]{ despesa.get(i).getDescricao()
                    ,despesa.get(i).getValorDespesa(),despesa.get(i).getData(),despesa.get(i).getStatus()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        DescricaoDespesa = new javax.swing.JTextField();
        ValorDespesa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDespesa = new javax.swing.JTable();
        IncluirDespesa = new javax.swing.JButton();
        AlterarDespesa = new javax.swing.JButton();
        ExcluirDespesa = new javax.swing.JButton();
        CancelarDespesa = new javax.swing.JButton();
        campoCodigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        StatusDespesa = new javax.swing.JTextField();
        VencimentoDespesa2 = new org.jdesktop.swingx.JXDatePicker();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Cadastro Despesa");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        DescricaoDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescricaoDespesaActionPerformed(evt);
            }
        });

        ValorDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorDespesaActionPerformed(evt);
            }
        });

        jLabel1.setText("Descrição:");

        jLabel2.setText("Vencimento:");

        jLabel3.setText("Valor");

        jLabel4.setText("Status:");

        tabelaDespesa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descrição", "Valor", "Vencimento", "Status"
            }
        ));
        tabelaDespesa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaDespesaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaDespesa);

        IncluirDespesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Novo.png"))); // NOI18N
        IncluirDespesa.setText("Incluir");
        IncluirDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IncluirDespesaActionPerformed(evt);
            }
        });

        AlterarDespesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Editar.png"))); // NOI18N
        AlterarDespesa.setText("Alterar");
        AlterarDespesa.setEnabled(false);
        AlterarDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarDespesaActionPerformed(evt);
            }
        });

        ExcluirDespesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Excluir.png"))); // NOI18N
        ExcluirDespesa.setText("Excluir");
        ExcluirDespesa.setEnabled(false);
        ExcluirDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirDespesaActionPerformed(evt);
            }
        });

        CancelarDespesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cancelar.png"))); // NOI18N
        CancelarDespesa.setText("Cancelar");
        CancelarDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarDespesaActionPerformed(evt);
            }
        });

        campoCodigo.setEnabled(false);

        jLabel5.setText("Codigo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(IncluirDespesa)
                                .addGap(32, 32, 32)
                                .addComponent(AlterarDespesa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ExcluirDespesa)
                                .addGap(10, 10, 10))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(DescricaoDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(campoCodigo)
                                            .addComponent(ValorDespesa, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(CancelarDespesa))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(VencimentoDespesa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(StatusDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(62, 62, 62))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DescricaoDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(VencimentoDespesa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ValorDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(StatusDespesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IncluirDespesa)
                    .addComponent(AlterarDespesa)
                    .addComponent(ExcluirDespesa)
                    .addComponent(CancelarDespesa))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void IncluirDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IncluirDespesaActionPerformed
        Despesa d= new Despesa();
        DespesaController contr = new DespesaController();
        
        /*String descricao = .trim();//gravando o que esta no campo para a variavel senha
        String valor = .trim();
        d.setData();
        String status = .trim();*/

 //       SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");   
//        Date data_desejada = new SimpleDateFormat("dd/MM/yyyy").parse(VencimentoDespesa.getText());  
//        String data= formato.format(data_desejada);
        //Date date = dataFormatada.parse(VencimentoDespesa.getText());
        //SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        //java.sql.Date datav = new java.sql.Date(format.parse(data).getTime());
        //SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
       // Date vencimento= formato.parse("q");

        if(DescricaoDespesa.getText().isEmpty()){//Verificando se o Campo esta com algum valor
            JOptionPane.showMessageDialog(null, "Por favor insira o Descrição:");
            return;
        }
        else if(ValorDespesa.getText().isEmpty()){//Verificando se o Campo esta com algum valor
            JOptionPane.showMessageDialog(null, "Por favor insira o Valor:");
            return;
        }
        else if(VencimentoDespesa2.getDate() == null){//Verificando se o Campo esta com algum valor
            JOptionPane.showMessageDialog(null, "Por favor insira o Vencimento:");
            return;
        }
        else if(StatusDespesa.getText().isEmpty()){//Verificando se o Campo esta com algum valor
            JOptionPane.showMessageDialog(null, "Por favor insira o Status:");
            return;
        } 
        //despesa = contr.read();
        
        d.setValorDespesa(Double.parseDouble(ValorDespesa.getText()));//passando para o objeto o valor digitado no campo 
        d.setData(VencimentoDespesa2.getDate());
        d.setDescricao(DescricaoDespesa.getText());//passando para o objeto o valor digitado no campo 
        d.setStatus(StatusDespesa.getText());

        
        //d.setData(VencimentoDespesa.getData());
            contr.create(d);

        limpar();
        preencheTabela();
        ExcluirDespesa.setEnabled(false);
        AlterarDespesa.setEnabled(false);
        IncluirDespesa.setEnabled(true);
    }//GEN-LAST:event_IncluirDespesaActionPerformed

    private void AlterarDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarDespesaActionPerformed
        Despesa d = new Despesa();
        
        int posicao = tabelaDespesa.getSelectedRow();//Buscando o numero da posição da tabela que foi clicado no mouse
        /*String descricao = DescricaoDespesa.getText().trim();//gravando o que esta no campo para a variavel senha
        String valor = ValorDespesa.getText().trim();
        String data = VencimentoDespesa.getText().trim();
        String status = StatusDespesa.getText().trim();*/
        
        if(DescricaoDespesa.getText().isEmpty()){//Verificando se o Campo esta com algum valor
            JOptionPane.showMessageDialog(null, "Por favor insira o Descrição:");
            return;
        }
        else if(ValorDespesa.getText().isEmpty()){//Verificando se o Campo esta com algum valor
            JOptionPane.showMessageDialog(null, "Por favor insira o Valor:");
            return;
        }
        else if(VencimentoDespesa2.getDate() == null){//Verificando se o Campo esta com algum valor
            JOptionPane.showMessageDialog(null, "Por favor insira o vencimento:");
            return;
        }
        else if(StatusDespesa.getText().isEmpty()){//Verificando se o Campo esta com algum valor
            JOptionPane.showMessageDialog(null, "Por favor insira o Status:");
            return;
        }  
        //despesa = contr.read();
        
        d.setDescricao(DescricaoDespesa.getText());//passando para o objeto o valor digitado no campo 
        d.setValorDespesa(Double.parseDouble(ValorDespesa.getText()));//passando para o objeto o valor digitado no campo 
        d.setData(VencimentoDespesa2.getDate());
        //d.setData(fdata(data));//passando para o objeto o valor digitado no campo 
        d.setStatus(StatusDespesa.getText());
        
       
        contr.update(d,codigo);
        
        preencheTabela();    
        limpar();
        campoCodigo.setText("");             
        codigo = 0;
        
        ExcluirDespesa.setEnabled(false);
        AlterarDespesa.setEnabled(false);
        IncluirDespesa.setEnabled(true);
    }//GEN-LAST:event_AlterarDespesaActionPerformed

    private void CancelarDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarDespesaActionPerformed
    limpar();
        
        campoCodigo.setText("");
        
        ExcluirDespesa.setEnabled(false);
        AlterarDespesa.setEnabled(false);
        IncluirDespesa.setEnabled(true);
    }//GEN-LAST:event_CancelarDespesaActionPerformed

    private void ExcluirDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirDespesaActionPerformed
        Despesa d = new Despesa();        
        d.setCodigo(Integer.parseInt(campoCodigo.getText().trim()));        
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir esta Despesa ?", title, JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            contr.delete(String.valueOf(d.getCodigo()));
            preencheTabela();
        }
        limpar();
        ExcluirDespesa.setEnabled(false);
        AlterarDespesa.setEnabled(false);
        IncluirDespesa.setEnabled(true);
    }//GEN-LAST:event_ExcluirDespesaActionPerformed

    private void ValorDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorDespesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValorDespesaActionPerformed

    private void DescricaoDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescricaoDespesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DescricaoDespesaActionPerformed

    private void tabelaDespesaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaDespesaMouseClicked
        String Tipo="";
        
           Despesa despesas = despesa.get(tabelaDespesa.getSelectedRow());
           ValorDespesa.setText(String.valueOf(despesas.getValorDespesa()));//Recuperando da arreylist 
           campoCodigo.setText(String.valueOf(despesas.getCodigo()));
           VencimentoDespesa2.setDate(despesas.getData());//Recuperando da arreylist 
           DescricaoDespesa.setText(despesas.getDescricao());
           StatusDespesa.setText(despesas.getStatus());
           codigo =despesas.getCodigo();//Nome parametro para alterar
           
           IncluirDespesa.setEnabled(false);
           ExcluirDespesa.setEnabled(true);
           AlterarDespesa.setEnabled(true);
    }//GEN-LAST:event_tabelaDespesaMouseClicked
        public void limpar(){
            DescricaoDespesa.setText("");
            ValorDespesa.setText("");
            //VencimentoDespesa2.setText("");
            StatusDespesa.setText("");
    }
        public static Date formataData(String data) throws Exception { 
            DateFormat dataformatada = new SimpleDateFormat("ddMMyy");
            Date date = (java.util.Date)dataformatada.parse(data);
        return date;
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlterarDespesa;
    private javax.swing.JButton CancelarDespesa;
    private javax.swing.JTextField DescricaoDespesa;
    private javax.swing.JButton ExcluirDespesa;
    private javax.swing.JButton IncluirDespesa;
    private javax.swing.JTextField StatusDespesa;
    private javax.swing.JTextField ValorDespesa;
    private org.jdesktop.swingx.JXDatePicker VencimentoDespesa2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField campoCodigo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaDespesa;
    // End of variables declaration//GEN-END:variables
}
