/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HBFTelas;

import Controller.ProdutoController;
import Model.Produto;
import Model.Categorias;
import java.awt.Dialog;
import java.awt.Window;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.ArrayList;





/**
 *
 * @author Rafael
 */
public class CadastroProduto extends javax.swing.JInternalFrame {
       Produto produto = new Produto();
       Produto produt = null;
      private ArrayList<Produto> produtos =null;
      private Produto prod = new Produto();
 
    
    public CadastroProduto() {
        initComponents();
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        codProduto = new javax.swing.JTextField();
        descProduto = new javax.swing.JTextField();
        pesquisaProduto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        codigoSku = new javax.swing.JTextField();
        precoCompra = new javax.swing.JTextField();
        codFornecedor = new javax.swing.JTextField();
        descFornecedor = new javax.swing.JTextField();
        pesquisarCategoria = new javax.swing.JButton();
        botaoNovo = new javax.swing.JButton();
        botaoeditar = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CodCategoria = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        descCategoria = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de Produtos");
        setEnabled(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Codigo:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 20, 60, 20);

        codProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(codProduto);
        codProduto.setBounds(60, 20, 90, 29);
        getContentPane().add(descProduto);
        descProduto.setBounds(230, 20, 249, 29);

        pesquisaProduto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pesquisaProduto.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rafael\\Desktop\\RAFAEL\\HBF para GitHub\\HBF\\src\\Imagens\\Pesquisar.png")); // NOI18N
        pesquisaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(pesquisaProduto);
        pesquisaProduto.setBounds(480, 20, 40, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Codigo SKU");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(530, 30, 80, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Preço da Compra");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 140, 110, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Codigo Fornecedor");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 80, 130, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Descrição Fornecedor");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(180, 80, 130, 20);

        codigoSku.setEnabled(false);
        getContentPane().add(codigoSku);
        codigoSku.setBounds(610, 20, 80, 30);

        precoCompra.setEnabled(false);
        getContentPane().add(precoCompra);
        precoCompra.setBounds(120, 140, 100, 30);

        codFornecedor.setEnabled(false);
        codFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codFornecedorActionPerformed(evt);
            }
        });
        getContentPane().add(codFornecedor);
        codFornecedor.setBounds(120, 80, 60, 30);

        descFornecedor.setEnabled(false);
        getContentPane().add(descFornecedor);
        descFornecedor.setBounds(310, 80, 330, 30);

        pesquisarCategoria.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rafael\\Desktop\\RAFAEL\\HBF para GitHub\\HBF\\src\\Imagens\\Pesquisar.png")); // NOI18N
        pesquisarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(pesquisarCategoria);
        pesquisarCategoria.setBounds(510, 190, 40, 30);

        botaoNovo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoNovo.setText("Novo");
        botaoNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoActionPerformed(evt);
            }
        });
        getContentPane().add(botaoNovo);
        botaoNovo.setBounds(10, 320, 80, 30);

        botaoeditar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoeditar.setText("Editar");
        botaoeditar.setEnabled(false);
        botaoeditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoeditarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoeditar);
        botaoeditar.setBounds(120, 320, 80, 30);

        botaoSair.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoSair.setText("Sair");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSair);
        botaoSair.setBounds(580, 320, 80, 30);

        botaoExcluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoExcluir.setText("Excluir");
        botaoExcluir.setEnabled(false);
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(botaoExcluir);
        botaoExcluir.setBounds(360, 320, 80, 30);

        botaoSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoSalvar.setText("Salvar");
        botaoSalvar.setEnabled(false);
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSalvar);
        botaoSalvar.setBounds(220, 320, 120, 30);

        botaoCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoCancelar.setText("Cancelar");
        botaoCancelar.setEnabled(false);
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCancelar);
        botaoCancelar.setBounds(450, 320, 120, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Descrição");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(160, 20, 80, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Codigo Categoria");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 200, 110, 15);

        CodCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(CodCategoria);
        CodCategoria.setBounds(110, 190, 60, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Descrição Categoria");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(180, 200, 130, 15);
        getContentPane().add(descCategoria);
        descCategoria.setBounds(310, 190, 200, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Data Cadastro");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(260, 150, 100, 15);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(350, 140, 120, 30);

        jMenu1.setText("Arquivos");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Outros");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setBounds(0, 0, 713, 443);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
       dispose();
        
        
        
    }//GEN-LAST:event_botaoSairActionPerformed

    private void botaoNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoActionPerformed
      codigoSku.setEnabled(true);
      precoCompra.setEnabled(true);
      codFornecedor.setEnabled(true);
      descFornecedor.setEnabled(true);
      descCategoria.setEnabled(true);
      botaoeditar.setEnabled(true);
      
      botaoSalvar.setEnabled(true);      
      botaoCancelar.setEnabled(true);
      
      codProduto.setEnabled(false);
      pesquisaProduto.setEnabled(false);
      botaoNovo.setEnabled(false);
      botaoeditar.setEnabled(false);
      botaoSair.setEnabled(false);
        
        
    }//GEN-LAST:event_botaoNovoActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        ProdutoController contr = new ProdutoController();
        ConsultaProduto con = new ConsultaProduto();
        
        //Produto prod = (Produto)comboxCategoria.getSelectedItem(); // pega o valor da que esta no combobox
        
        produto.setNomeProd(descProduto.getText()); // Pega os valores que estão no campo Descrição
        produto.setCodSKU(Integer.parseInt(codigoSku.getText()));
        produto.setPrecoCompra(Float.parseFloat(precoCompra.getText()));
        produto.setIdFornecedor(Integer.parseInt(codFornecedor.getText()));
        produto.setIdCategoria(Integer.parseInt(descCategoria.getText()));
        
        contr.create(produto);
       
       
        
        
        
      codigoSku.setEnabled(false);
      precoCompra.setEnabled(false);
      codFornecedor.setEnabled(false);
      descProduto.setEnabled(false);     
      botaoeditar.setEnabled(false);
      botaoSalvar.setEnabled(false);      
      botaoCancelar.setEnabled(false);
      
      codProduto.setEnabled(true);
      pesquisaProduto.setEnabled(true);
      botaoNovo.setEnabled(true);
     
      
      codigoSku.setText("");
      precoCompra.setText("");
      codFornecedor.setText("");
      descFornecedor.setText("");
      descProduto.setText("");
        
    }//GEN-LAST:event_botaoSalvarActionPerformed
        private void pesquisaProduto() {
            
        ProdutoController contr = new ProdutoController(); 
        
        produt = contr.pesquisaProduto(String.valueOf(prod.getIdProduto()));
        
        produt.setIdProduto(prod.getIdProduto());
         descProduto.setText(prod.getNomeProd());
    }
    
    
    private void pesquisaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaProdutoActionPerformed
        ConsultaProduto consulta = new ConsultaProduto(prod);
       
       consulta.addWindowListener(new WindowListener() {
           @Override
           public void windowOpened(WindowEvent e) {
           }

           @Override
           public void windowClosing(WindowEvent e) {
           }

           @Override
           public void windowClosed(WindowEvent e) {
               
               prod = consulta.GetProduto();
               
               if(prod.getIdProduto() > 0)
               {
                   codProduto.setText(String.valueOf(prod.getIdProduto()));
                   descProduto.setText(prod.getNomeProd());
                   codigoSku.setText(String.valueOf(prod.getCodSKU()));
                   codFornecedor.setText(String.valueOf(prod.getIdFornecedor()));
                   precoCompra.setText(String.valueOf(prod.getPrecoCompra()));
                   CodCategoria.setText(String.valueOf(prod.getIdCategoria()));
                   
                   
                   pesquisaProduto();
               }
           }

           @Override
           public void windowIconified(WindowEvent e) {
           }

           @Override
           public void windowDeiconified(WindowEvent e) {
           }

           @Override
           public void windowActivated(WindowEvent e) {
           }

           @Override
           public void windowDeactivated(WindowEvent e) {
           }
       });
       
       
       consulta.setVisible(true);
  
         
    }//GEN-LAST:event_pesquisaProdutoActionPerformed

    private void pesquisarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarCategoriaActionPerformed
        CadastroCategorias categorias = new CadastroCategorias();
        categorias.setVisible(true);
    }//GEN-LAST:event_pesquisarCategoriaActionPerformed

    private void botaoeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoeditarActionPerformed
     
        
        
            
       Produto produtos = new Produto();
       ProdutoController contr = new ProdutoController();
      
       // atualizando o banco
       produto.setNomeProd(descProduto.getText()); // atualizando o banco
       produto.setCodSKU(Integer.getInteger(codigoSku.getText()) );
       produto.setIdFornecedor(Integer.getInteger(codFornecedor.getText()));
       produto.setPrecoCompra(Float.valueOf(precoCompra.getText()));
       produto.setIdCategoria(Integer.getInteger(descCategoria.getText()));
       
                     
       
       
       contr.update(produtos);
       
        // limpar Campos apos Inserir
        descProduto.setText("");
        codigoSku.setText(""); 
        precoCompra.setText("");
        codFornecedor.setText("");
        descCategoria.setText("");
        
        codFornecedor.requestFocus();
        
        
       
       
            
        
        
        
        
        
        
    }//GEN-LAST:event_botaoeditarActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
     
      botaoSair.setEnabled(true);
      botaoNovo.setEnabled(true);
        
        
      codigoSku.setText("");
      precoCompra.setText("");
      codFornecedor.setText("");
      descFornecedor.setText("");
      descProduto.setText("");
      
       
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        
       Produto produtos = new Produto();
       ProdutoController contr = new ProdutoController();
      
       // atualizando o banco
       produto.setNomeProd(descProduto.getText()); // atualizando o banco
       produto.setCodSKU(Integer.getInteger(codigoSku.getText()) );
       produto.setIdFornecedor(Integer.getInteger(codFornecedor.getText()));
       produto.setPrecoCompra(Float.valueOf(precoCompra.getText()));
       produto.setIdCategoria(Integer.getInteger(descCategoria.getText()));
       
                     
       
       
       contr.deleteproduto(produtos);
       
        // limpar Campos apos Inserir
        descProduto.setText("");
        codigoSku.setText(""); 
        precoCompra.setText("");
        codFornecedor.setText("");
        descCategoria.setText("");
        
        codFornecedor.requestFocus();
        
        
        
        
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void codProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codProdutoActionPerformed
        if(!(codProduto.getText()).isEmpty()){ //Verifica se o campo está preenchido
        String prod; //Variável que conterá o nome correspodente ao cód
        Produto p = new Produto();
        ProdutoController contr = new ProdutoController();
        
        p.setIdProduto(Integer.parseInt(codProduto.getText())); //Captura o código digitado no campo de código do tipo de venda
        prod = contr.pesquisaProduto(p.getIdProduto()); //Chama o método pesquisaTipoVenda passando como parâmetro o que foi capturado do campo de texto e o método retorna o nome pra variavel "dados"
        if( prod != null){
            descProduto.setText(prod); //Se o retorno da pesquisa for diferente de nulo, seta no campo nome o que foi encontrado no BD
        }else{
            descProduto.setText(""); //Limpa o campo do nome caso esteja preenchido de uma outra consulta
            JOptionPane.showMessageDialog(null,"Produto não encontrado");
            descProduto.requestFocus(); //Volta o foco do teclado pro campo até usuário digitar um código válido ou deixar vazio o campo
        }
        p = null;
        contr = null;
    }
    }//GEN-LAST:event_codProdutoActionPerformed

    private void codFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codFornecedorActionPerformed
        
        
        
    }//GEN-LAST:event_codFornecedorActionPerformed

    private void CodCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodCategoriaActionPerformed
        
        if(!(CodCategoria.getText()).isEmpty()){ //Verifica se o campo está preenchido
        String cat; //Variável que conterá o nome correspodente ao cód
        Categorias c = new Categorias();
        
        ProdutoController contr = new ProdutoController();
        
        c.setIdCategoria(Integer.parseInt(CodCategoria.getText())); //Captura o código digitado no campo de código do tipo de venda
        cat = contr.pesquisaProduto(c.getIdCategoria()); //Chama o método pesquisaTipoVenda passando como parâmetro o que foi capturado do campo de texto e o método retorna o nome pra variavel "dados"
        if( cat != null){
            descCategoria.setText(cat); //Se o retorno da pesquisa for diferente de nulo, seta no campo nome o que foi encontrado no BD
        }else{
            descCategoria.setText(""); //Limpa o campo do nome caso esteja preenchido de uma outra consulta
            JOptionPane.showMessageDialog(null,"Produto não encontrado");
            descCategoria.requestFocus(); //Volta o foco do teclado pro campo até usuário digitar um código válido ou deixar vazio o campo
        }
       c = null;
        contr = null;
    }
        
        
    }//GEN-LAST:event_CodCategoriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CodCategoria;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoNovo;
    private javax.swing.JButton botaoSair;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JButton botaoeditar;
    private javax.swing.JTextField codFornecedor;
    private javax.swing.JTextField codProduto;
    private javax.swing.JTextField codigoSku;
    private javax.swing.JTextField descCategoria;
    private javax.swing.JTextField descFornecedor;
    private javax.swing.JTextField descProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton pesquisaProduto;
    private javax.swing.JButton pesquisarCategoria;
    private javax.swing.JTextField precoCompra;
    // End of variables declaration//GEN-END:variables
}
