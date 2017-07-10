/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HBFTelas;
import Controller.UsuarioController;
import Model.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author User
 */
public class CadastroUsuario extends javax.swing.JInternalFrame {

    ArrayList valores = new ArrayList();//criação da arrayList para salvar os dados na tabela
    UsuarioController ucontroller = new UsuarioController();
    List<Usuario> usuarios = null;
    String NomeTeste = "";
    public void preencheTabela(){//Metodo para preencher a JTable
        
        DefaultTableModel tabela = (DefaultTableModel)tabelaUsuario.getModel();
        tabelaUsuario.setRowSorter(new TableRowSorter(tabela));
        tabela.setNumRows(0);
        usuarios = ucontroller.read("");
        for(int i=0;i<usuarios.size();i++){
            tabela.addRow(new Object[]{usuarios.get(i).getNomeUsuario(), usuarios.get(i).getTipo(), usuarios.get(i).getSenhaUsuario()});
        }    
    }
    /**
     * Creates new form TelaConsultaUsuario
     */
    public CadastroUsuario() {
        initComponents();
        usuarios = ucontroller.read("");
        
        preencheTabela();
        botaoAlterarUsuario.setEnabled(false);
        botaoApagarUsuario.setEnabled(false);
//      DefaultTableModel val = (DefaultTableModel) tabelaUsuario.getModel();//val = valores da tabela
//      for(int i=0;i<usuarios.size();i++){
//        val.addRow(new Object[]{usuarios.get(i).getNomeUsuario(),usuarios.get(i).getTipo(),usuarios.get(i).getSenhaUsuario()});//((String[]) valores.get(valores.size()-1));
//        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoCadastroNome = new javax.swing.JTextField();
        campoSenhaNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botaoInserirUsuario = new javax.swing.JButton();
        botaoApagarUsuario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUsuario = new javax.swing.JTable();
        checkBoxUsuario = new javax.swing.JCheckBox();
        botaoAlterarUsuario = new javax.swing.JButton();
        CancelarCamposUsuario = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Cadastro Usuário");

        campoCadastroNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCadastroNomeActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("Senha:");

        botaoInserirUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/GravarPequeno.png"))); // NOI18N
        botaoInserirUsuario.setText("Inserir");
        botaoInserirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInserirUsuarioActionPerformed(evt);
            }
        });

        botaoApagarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ExcluirPequeno.png"))); // NOI18N
        botaoApagarUsuario.setText("Excluir");
        botaoApagarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoApagarUsuarioActionPerformed(evt);
            }
        });

        tabelaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Tipo"
            }
        ));
        tabelaUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabelaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaUsuario);

        checkBoxUsuario.setText("Administrador");

        botaoAlterarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Editar.png"))); // NOI18N
        botaoAlterarUsuario.setText("Alterar");
        botaoAlterarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarUsuarioActionPerformed(evt);
            }
        });

        CancelarCamposUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/CancelarPequeno.png"))); // NOI18N
        CancelarCamposUsuario.setText("Cancelar");
        CancelarCamposUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarCamposUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoCadastroNome, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkBoxUsuario)
                                    .addComponent(campoSenhaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoInserirUsuario)
                                .addGap(34, 34, 34)
                                .addComponent(botaoAlterarUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addComponent(botaoApagarUsuario)
                                .addGap(36, 36, 36)
                                .addComponent(CancelarCamposUsuario)))))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCadastroNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoSenhaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(checkBoxUsuario)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelarCamposUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoInserirUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoApagarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoAlterarUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoInserirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInserirUsuarioActionPerformed
        String nome = campoCadastroNome.getText().trim();//gravando o que esta no campo para a variavel senha
        String senha = campoSenhaNome.getText().trim();//gravando o que esta no campo para a variavel senha
        String tipo = "";
        
        
        if(nome.isEmpty()){//Verificando se o Campo nome esta com algum valor
            JOptionPane.showMessageDialog(null, "Por favor insira o nome");
            return;
        }
        else if(senha.isEmpty()){//Verificando se o Campo senha esta com algum valor
            JOptionPane.showMessageDialog(null, "Por favor insira a senha");
            return;
        }
        else if(senha.length()<6){//Verificando se a senha tem tamanho maior que 6 dígitos
            JOptionPane.showMessageDialog(null, "Senha muito curta, favor inserir uma senha com no mínimo 6 dígitos!");
            return;
        }
        usuarios = ucontroller.read("");
        for(int i=0;i<usuarios.size();i++){//Verificando se nome so usuário ja existe
            if(nome.equals(usuarios.get(i).getNomeUsuario())){
                JOptionPane.showMessageDialog(null, "Nome de usuário já cadastrado, por favor insira outro nome");
                return;
        }
        }
        Usuario u = new Usuario();
        
        u.setNomeUsuario(nome);//passando para o objeto o nome digitado no campo nome
        u.setSenhaUsuario(senha);//passando para o objeto a senha digitado no campo senha
        if (checkBoxUsuario.isSelected()){//verificando se usuário é administrador ou usuário padrão
              tipo = "Administrador";
            }
        else{
               tipo = "Usuário";
            }
        u.setTipo(tipo);//passando para o objeto o tipo de usuário
        ucontroller.create(u);//colocando o objeto no Bando de dados
        
        preencheTabela();

        campoCadastroNome.setText("");//apagando o campo nome
        campoSenhaNome.setText("");//apagando o campo Senha
        campoCadastroNome.requestFocus();//Voltar o codigo para o campo nome
        checkBoxUsuario.setSelected(false);//Desmarcando o chechBox
        nome="";
        senha="";
          
    }//GEN-LAST:event_botaoInserirUsuarioActionPerformed

    private void campoCadastroNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCadastroNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCadastroNomeActionPerformed

    private void botaoApagarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoApagarUsuarioActionPerformed
        Usuario u = new Usuario();
        u.setNomeUsuario(campoCadastroNome.getText().trim());//Recuperando o nome do usuario que se deseja apagar
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir este usuário ?", title, JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {//Apagando ousuário
            ucontroller.delete(u.getNomeUsuario());
            preencheTabela();
        }
        campoCadastroNome.setText("");//apagando o campo nome
        campoSenhaNome.setText("");//apagando o campo Senha
        campoCadastroNome.requestFocus();//Voltar o codigo para o campo nome
        checkBoxUsuario.setSelected(false);//Desmarcando o chechBox
        botaoInserirUsuario.setEnabled(true);
        botaoApagarUsuario.setEnabled(false);
        botaoAlterarUsuario.setEnabled(false);
    }//GEN-LAST:event_botaoApagarUsuarioActionPerformed

    private void tabelaUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaUsuarioMouseClicked
        String Tipo="";
           Usuario usuario = usuarios.get(tabelaUsuario.getSelectedRow());
           campoCadastroNome.setText(usuario.getNomeUsuario());//Recuperando da arreylist a senha
           campoSenhaNome.setText(usuario.getSenhaUsuario());//Recuperando da arreylist a senha
           Tipo=usuario.getTipo();//Recuperando da arrayList e salvando na variável Tipo 
           if(Tipo.equals("Administrador")){//se o tipo for administrador irá executar o if abaixo
               checkBoxUsuario.setSelected(true);//Fazando com que a check box fique marcada
           }
            else{
                checkBoxUsuario.setSelected(false);
           }
           NomeTeste = usuario.getNomeUsuario();//Nome parametro para alterar
           botaoInserirUsuario.setEnabled(false);
           botaoApagarUsuario.setEnabled(true);
           botaoAlterarUsuario.setEnabled(true);
    }//GEN-LAST:event_tabelaUsuarioMouseClicked

    private void botaoAlterarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarUsuarioActionPerformed
        Usuario u = new Usuario();
        
        int posicao = tabelaUsuario.getSelectedRow();//Buscando o numero da posição da tabela que foi clicado no mouse
        String nome = campoCadastroNome.getText().trim();//gravando o que esta no campo para a variavel senha
        String senha = campoSenhaNome.getText().trim();//gravando o que esta no campo para a variavel senha
        String tipo = "";
        
        
        if(nome.isEmpty()){//Verificando se o Campo nome esta com algum valor
            JOptionPane.showMessageDialog(null, "Por favor insira o nome");
            return;
        }
        else if(senha.isEmpty()){//Verificando se o Campo senha esta com algum valor
            JOptionPane.showMessageDialog(null, "Por favor insira a senha");
            return;
        }
        else if(senha.length()<6){
            JOptionPane.showMessageDialog(null, "Senha muito curta, favor inserir uma senha com no mínimo 6 dígitos!");
            return;
        }
        usuarios = ucontroller.read("");
        for(int i=0;i<usuarios.size();i++){
            if(nome.equals(usuarios.get(i).getNomeUsuario()) && (!NomeTeste.equals(usuarios.get(i).getNomeUsuario()))){
                JOptionPane.showMessageDialog(null, "Nome de usuário já cadastrado, por favor insira outro nome");
                return;
        }
        }
        u.setNomeUsuario(nome);//passando para o objeto o nome digitado no campo nome
        u.setSenhaUsuario(senha);//passando para o objeto a senha digitado no campo senha 
        if (checkBoxUsuario.isSelected()){//verificando se usuário é administrador ou usuário padrão
            tipo = "Administrador";
        }
        else{
            tipo = "Usuário";
        }
        u.setTipo(tipo);
        ucontroller.update(u,NomeTeste);
        preencheTabela();
        campoCadastroNome.setText("");//apagando o campo nome
        campoSenhaNome.setText("");//apagando o campo Senha
        campoCadastroNome.requestFocus();//Voltar o codigo para o campo nome
        checkBoxUsuario.setSelected(false);//Desmarcando o chechBox
        NomeTeste = "";
        botaoInserirUsuario.setEnabled(true);
        botaoApagarUsuario.setEnabled(false);
        botaoAlterarUsuario.setEnabled(false);
    }//GEN-LAST:event_botaoAlterarUsuarioActionPerformed

    private void CancelarCamposUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarCamposUsuarioActionPerformed
        campoCadastroNome.setText("");//apagando o campo nome
        campoSenhaNome.setText("");//apagando o campo Senha
        campoCadastroNome.requestFocus();//Voltar o codigo para o campo nome
        checkBoxUsuario.setSelected(false);//Desmarcando o chechBox
        NomeTeste = "";
        botaoInserirUsuario.setEnabled(true);
        botaoApagarUsuario.setEnabled(false);
        botaoAlterarUsuario.setEnabled(false);
    }//GEN-LAST:event_CancelarCamposUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelarCamposUsuario;
    private javax.swing.JButton botaoAlterarUsuario;
    private javax.swing.JButton botaoApagarUsuario;
    private javax.swing.JButton botaoInserirUsuario;
    private javax.swing.JTextField campoCadastroNome;
    private javax.swing.JTextField campoSenhaNome;
    private javax.swing.JCheckBox checkBoxUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaUsuario;
    // End of variables declaration//GEN-END:variables
}
