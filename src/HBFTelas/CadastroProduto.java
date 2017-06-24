/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HBFTelas;

import Controller.ProdutoController;
import Model.Produto;
import Model.Categorias;
import javax.swing.JOptionPane;




/**
 *
 * @author Rafael
 */
public class CadastroProduto extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastroProduto
     */
    public CadastroProduto() {
        initComponents();
        
        ProdutoController contr = new ProdutoController();
        
        for(Categorias c: contr.readCategorias()){
            comboxCategoria.addItem(c);
        }
        
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
        catalternativa = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        comboxCategoria = new javax.swing.JComboBox<>();
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
        pesquisaProduto.setText("...");
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
        jLabel5.setBounds(230, 80, 130, 20);

        codigoSku.setEnabled(false);
        getContentPane().add(codigoSku);
        codigoSku.setBounds(610, 20, 80, 30);

        precoCompra.setEnabled(false);
        getContentPane().add(precoCompra);
        precoCompra.setBounds(120, 140, 100, 30);

        codFornecedor.setEnabled(false);
        getContentPane().add(codFornecedor);
        codFornecedor.setBounds(120, 80, 100, 30);

        descFornecedor.setEnabled(false);
        getContentPane().add(descFornecedor);
        descFornecedor.setBounds(360, 80, 330, 30);

        pesquisarCategoria.setText("...");
        pesquisarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(pesquisarCategoria);
        pesquisarCategoria.setBounds(470, 140, 30, 20);

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
        getContentPane().add(catalternativa);
        catalternativa.setBounds(500, 250, 190, 20);

        jLabel7.setText("Categoria alternativa");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(540, 220, 160, 14);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Categoria");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(240, 140, 80, 15);

        comboxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(comboxCategoria);
        comboxCategoria.setBounds(310, 140, 160, 20);

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
      comboxCategoria.setEnabled(true);
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
        Produto p = new Produto();
        ProdutoController contr = new ProdutoController();
        ConsultaProduto con = new ConsultaProduto();
        
        //Produto prod = (Produto)comboxCategoria.getSelectedItem(); // pega o valor da que esta no combobox
        
        p.setNomeProd(descProduto.getText()); // Pega os valores que estão no campo Descrição
        p.setCodSKU(Integer.parseInt(codigoSku.getText()));
        p.setPrecoCompra(Float.parseFloat(precoCompra.getText()));
        p.setIdFornecedor(Integer.parseInt(codFornecedor.getText()));
        p.setIdCategoria(Integer.parseInt(catalternativa.getText()));
        
        contr.create(p);
       
       
        
        
        
      codigoSku.setEnabled(false);
      precoCompra.setEnabled(false);
      codFornecedor.setEnabled(false);
      descProduto.setEnabled(false);
      comboxCategoria.setEnabled(false);
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

    private void pesquisaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaProdutoActionPerformed
        ConsultaProduto consulta = new ConsultaProduto();
        consulta.setVisible(true);
    }//GEN-LAST:event_pesquisaProdutoActionPerformed

    private void pesquisarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarCategoriaActionPerformed
        CadastroCategorias categorias = new CadastroCategorias();
        categorias.setVisible(true);
    }//GEN-LAST:event_pesquisarCategoriaActionPerformed

    private void botaoeditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoeditarActionPerformed
         
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
        
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void codProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codProdutoActionPerformed
        if(!(codProduto.getText()).isEmpty()){ //Verifica se o campo está preenchido
        String prod; //Variável que conterá o nome correspodente ao cód
        Produto p = new Produto();
        ProdutoController contr = new ProdutoController();
        
        p.setIdProduto(Integer.parseInt(codProduto.getText())); //Captura o código digitado no campo de código do tipo de venda
        prod = contr.pesquisaProduto(p.getIdProduto()); //Chama o método pesquisaTipoVenda passando como parâmetro o que foi capturado do campo de texto e o método retorna o nome pra variavel "dados"
        if( prod != null){
            codProduto.setText(prod); //Se o retorno da pesquisa for diferente de nulo, seta no campo nome o que foi encontrado no BD
        }else{
            codProduto.setText(""); //Limpa o campo do nome caso esteja preenchido de uma outra consulta
            JOptionPane.showMessageDialog(null,"Produto não encontrado");
            codProduto.requestFocus(); //Volta o foco do teclado pro campo até usuário digitar um código válido ou deixar vazio o campo
        }
        p = null;
        contr = null;
    }
    }//GEN-LAST:event_codProdutoActionPerformed

    private void comboxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxCategoriaActionPerformed
        
    }//GEN-LAST:event_comboxCategoriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoNovo;
    private javax.swing.JButton botaoSair;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JButton botaoeditar;
    private javax.swing.JTextField catalternativa;
    private javax.swing.JTextField codFornecedor;
    private javax.swing.JTextField codProduto;
    private javax.swing.JTextField codigoSku;
    private javax.swing.JComboBox<Object> comboxCategoria;
    private javax.swing.JTextField descFornecedor;
    private javax.swing.JTextField descProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton pesquisaProduto;
    private javax.swing.JButton pesquisarCategoria;
    private javax.swing.JTextField precoCompra;
    // End of variables declaration//GEN-END:variables
}
