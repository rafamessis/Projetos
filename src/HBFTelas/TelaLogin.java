/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HBFTelas;

import Controller.UsuarioController;
import Model.Geral;
import Model.Usuario;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class TelaLogin extends javax.swing.JFrame {
    ArrayList valores = new ArrayList();//criação da arrayList para salvar os dados na tabela
    //int posicao=0;//Criei a posição para reconhecer qual posição da tabela foi selecionada
    UsuarioController ucontroller = new UsuarioController();
    List<Usuario> usuarios = null;
    String NomeTeste = "";
    private int tecla; 
    
    
    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        initComponents();
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNomeLogin = new javax.swing.JTextField();
        txtSenhaLogin = new javax.swing.JPasswordField();
        BotaoEntrarLogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("Senha:");

        txtNomeLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeLoginActionPerformed(evt);
            }
        });
        txtNomeLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeLoginKeyPressed(evt);
            }
        });

        txtSenhaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaLoginActionPerformed(evt);
            }
        });
        txtSenhaLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaLoginKeyPressed(evt);
            }
        });

        BotaoEntrarLogin.setText("Entrar");
        BotaoEntrarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEntrarLoginActionPerformed(evt);
            }
        });
        BotaoEntrarLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BotaoEntrarLoginKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNomeLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSenhaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BotaoEntrarLogin)
                        .addGap(133, 133, 133))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenhaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(34, 34, 34)
                .addComponent(BotaoEntrarLogin)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/LogoLogin.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBounds(480, 180, 365, 378);
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoEntrarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEntrarLoginActionPerformed

        usuarios = ucontroller.read(" where nomeFunc = '" + txtNomeLogin.getText().trim()  + "'" );
        String nome = txtNomeLogin.getText().trim();
        String senha = txtSenhaLogin.getText().trim();
             if(usuarios.size() > 0 && nome.equals(usuarios.get(0).getNomeUsuario()) && senha.equals(usuarios.get(0).getSenhaUsuario())){
                
                 Geral.UsuarioLogado = usuarios.get(0);
                 
                 TelaPrincipal tela = new TelaPrincipal();
                tela.setVisible(true);
                dispose();
                return;
          
        }
        JOptionPane.showMessageDialog(null, "Senha ou usuário incorretos!");
      
       
//        if (nome.equals("higor") && senha.equals("123456")){
//            TelaPrincipal tela = new TelaPrincipal();
//            tela.setVisible(true);
//            dispose();
//        }else{
//               JOptionPane.showMessageDialog(null, "Senha ou usuário incorretos!");
//                }
    }//GEN-LAST:event_BotaoEntrarLoginActionPerformed

    private void txtNomeLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeLoginActionPerformed

    private void txtSenhaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaLoginActionPerformed

    private void BotaoEntrarLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BotaoEntrarLoginKeyPressed
        
        tecla = evt.getKeyCode();
        if(tecla==KeyEvent.VK_ENTER) {  
             //executa algo se enter for pressionado. 
            
            usuarios = ucontroller.read(" where nomeFunc = '" + txtNomeLogin.getText().trim()  + "'" );
        String nome = txtNomeLogin.getText().trim();
        String senha = txtSenhaLogin.getText().trim();
             if(usuarios.size() > 0 && nome.equals(usuarios.get(0).getNomeUsuario()) && senha.equals(usuarios.get(0).getSenhaUsuario())){
                
                 Geral.UsuarioLogado = usuarios.get(0);
                 
                 TelaPrincipal tela = new TelaPrincipal();
                tela.setVisible(true);
                dispose();
                return;
          
        }
        JOptionPane.showMessageDialog(null, "Senha ou usuário incorretos!");
            
        /* 
        usuarios = ucontroller.read(" where nomeFunc = '" + txtNomeLogin.getText().trim()  + "'" );
        String nome = txtNomeLogin.getText().trim();
        String senha = txtSenhaLogin.getText().trim();
             if(usuarios.size() > 0 && nome.equals(usuarios.get(0).getNomeUsuario()) && senha.equals(usuarios.get(0).getSenhaUsuario())){
                
                 Geral.UsuarioLogado = usuarios.get(0);
                 
                 TelaPrincipal tela = new TelaPrincipal();
                tela.setVisible(true);
                dispose();
                return;
             }
            */
      }else if(tecla==KeyEvent.VK_ESCAPE) { 
            System.exit(0);
        }
        
    }//GEN-LAST:event_BotaoEntrarLoginKeyPressed

    private void txtSenhaLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaLoginKeyPressed
        
        tecla = evt.getKeyCode();
        if(tecla==KeyEvent.VK_ENTER) {
            
            BotaoEntrarLogin.doClick();
        
        /*usuarios = ucontroller.read(" where nomeFunc = '" + txtNomeLogin.getText().trim()  + "'" );
        String nome = txtNomeLogin.getText().trim();
        String senha = txtSenhaLogin.getText().trim();
             if(usuarios.size() > 0 && nome.equals(usuarios.get(0).getNomeUsuario()) && senha.equals(usuarios.get(0).getSenhaUsuario())){
                
                 Geral.UsuarioLogado = usuarios.get(0);
                 
                 TelaPrincipal tela = new TelaPrincipal();
                tela.setVisible(true);
                dispose();
                return;
             }*/
        }else if(tecla==KeyEvent.VK_ESCAPE) { 
            System.exit(0);
        }
    }//GEN-LAST:event_txtSenhaLoginKeyPressed

    private void txtNomeLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeLoginKeyPressed
        // TODO add your handling code here:
        tecla = evt.getKeyCode();
        if(tecla==KeyEvent.VK_ENTER) {
            txtSenhaLogin.requestFocus();
        }else if(tecla==KeyEvent.VK_ESCAPE) { 
            System.exit(0);
        }
    }//GEN-LAST:event_txtNomeLoginKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formKeyPressed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoEntrarLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNomeLogin;
    private javax.swing.JPasswordField txtSenhaLogin;
    // End of variables declaration//GEN-END:variables
}
