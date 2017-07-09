/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HBFTelas;

import Controller.ProdutoController;
import Controller.FornecedorController;
import Controller.EstoqueController;
import Controller.VendasController;
import Model.Produto;
import Model.Categorias;
import Model.Estoque;
import Model.Fornecedor;
import HBFTelas.CadastroProduto;
import com.oracle.jrockit.jfr.Producer;
import com.sun.java.accessibility.util.AWTEventMonitor;
import java.awt.Dialog;
import java.awt.Window;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;







public class CadastroProduto extends javax.swing.JInternalFrame {
       Produto produto = new Produto();
       Produto produt = null;       
      private ArrayList<Produto> produtos = null;      
      private Produto prod = new Produto();
      
      Categorias categ = null;
      Categorias categoria = new Categorias();
      private ArrayList<Categorias> categorias = null;
      private Categorias cat = new Categorias();
      
      Fornecedor fornc = null;
      Fornecedor forncedor = new Fornecedor();
      private ArrayList<Fornecedor> fornecedores = null;
      private Fornecedor fornec = new Fornecedor(); 
      
      Estoque estoque = new Estoque();
      
      
      
      
      Estoque est = null;
      
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
        botaoExcluir = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        codCategoria = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        descCategoria = new javax.swing.JTextField();
        pesquisaFornecedor = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        qntdEstoque = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        botaosair = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de Produtos");
        setEnabled(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Codigo:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 90, 60, 20);

        codProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                codProdutoFocusLost(evt);
            }
        });
        codProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(codProduto);
        codProduto.setBounds(70, 90, 90, 29);

        descProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                descProdutoFocusLost(evt);
            }
        });
        descProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(descProduto);
        descProduto.setBounds(240, 90, 249, 29);

        pesquisaProduto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pesquisaProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Pesquisar.png"))); // NOI18N
        pesquisaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(pesquisaProduto);
        pesquisaProduto.setBounds(490, 90, 40, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Codigo SKU");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(560, 100, 80, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Preço da Compra");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 210, 110, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Codigo Fornecedor");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 150, 130, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Descrição Fornecedor");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(190, 150, 130, 20);

        codigoSku.setEnabled(false);
        getContentPane().add(codigoSku);
        codigoSku.setBounds(650, 90, 80, 30);

        precoCompra.setEnabled(false);
        precoCompra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                precoCompraFocusLost(evt);
            }
        });
        getContentPane().add(precoCompra);
        precoCompra.setBounds(130, 210, 100, 30);

        codFornecedor.setEnabled(false);
        codFornecedor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                codFornecedorFocusLost(evt);
            }
        });
        codFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codFornecedorActionPerformed(evt);
            }
        });
        getContentPane().add(codFornecedor);
        codFornecedor.setBounds(130, 150, 60, 30);

        descFornecedor.setEditable(false);
        descFornecedor.setEnabled(false);
        getContentPane().add(descFornecedor);
        descFornecedor.setBounds(320, 150, 220, 30);

        pesquisarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Pesquisar.png"))); // NOI18N
        pesquisarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(pesquisarCategoria);
        pesquisarCategoria.setBounds(520, 260, 40, 30);

        botaoNovo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Novo.png"))); // NOI18N
        botaoNovo.setText("Novo");
        botaoNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoActionPerformed(evt);
            }
        });
        getContentPane().add(botaoNovo);
        botaoNovo.setBounds(20, 20, 100, 31);

        botaoExcluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Excluir.png"))); // NOI18N
        botaoExcluir.setText("Excluir");
        botaoExcluir.setEnabled(false);
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(botaoExcluir);
        botaoExcluir.setBounds(360, 20, 110, 30);

        botaoSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Gravar.png"))); // NOI18N
        botaoSalvar.setText("Salvar");
        botaoSalvar.setEnabled(false);
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSalvar);
        botaoSalvar.setBounds(150, 20, 150, 30);

        botaoCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cancelar.png"))); // NOI18N
        botaoCancelar.setText("Cancelar");
        botaoCancelar.setEnabled(false);
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCancelar);
        botaoCancelar.setBounds(570, 20, 120, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Descrição");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(170, 90, 80, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Codigo Categoria");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 270, 110, 15);

        codCategoria.setEnabled(false);
        codCategoria.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                codCategoriaFocusLost(evt);
            }
        });
        codCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(codCategoria);
        codCategoria.setBounds(120, 260, 60, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Descrição Categoria");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(190, 270, 130, 15);

        descCategoria.setEnabled(false);
        descCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(descCategoria);
        descCategoria.setBounds(320, 260, 200, 30);

        pesquisaFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Pesquisar.png"))); // NOI18N
        pesquisaFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaFornecedorActionPerformed(evt);
            }
        });
        getContentPane().add(pesquisaFornecedor);
        pesquisaFornecedor.setBounds(540, 150, 40, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Quantidade Inicial");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(270, 210, 120, 20);

        qntdEstoque.setEnabled(false);
        qntdEstoque.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                qntdEstoqueFocusLost(evt);
            }
        });
        qntdEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qntdEstoqueActionPerformed(evt);
            }
        });
        getContentPane().add(qntdEstoque);
        qntdEstoque.setBounds(390, 210, 80, 30);

        botaosair.setText("Arquivos");
        botaosair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaosairMouseClicked(evt);
            }
        });
        botaosair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaosairActionPerformed(evt);
            }
        });

        jMenuItem3.setText("Relatorio");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        botaosair.add(jMenuItem3);

        jMenuItem2.setText("Imprimir");
        botaosair.add(jMenuItem2);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sair.png"))); // NOI18N
        jMenuItem1.setText("Sair");
        botaosair.add(jMenuItem1);

        jMenuBar1.add(botaosair);

        jMenu2.setText("Outros");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setBounds(0, 0, 814, 473);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoActionPerformed
      
 
        
        
      codigoSku.setEnabled(true);
      precoCompra.setEnabled(true);
      codFornecedor.setEnabled(true);
      descFornecedor.setEnabled(true);
      descCategoria.setEnabled(true);
      codCategoria.setEnabled(true);
      qntdEstoque.setEnabled(true);
      
      botaoSalvar.setEnabled(true);      
      botaoCancelar.setEnabled(true);
      
      codProduto.setEnabled(false);
      pesquisaProduto.setEnabled(true);
      botaoNovo.setEnabled(false);
      
        
        
    }//GEN-LAST:event_botaoNovoActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        if(!(descProduto.getText()).isEmpty()){ //Verifica se o campo está preenchido
	Produto prod;
        Produto produto = new Produto();         
        ProdutoController contr = new ProdutoController();
        
            produto.setNomeProd(descProduto.getText());
            produto.setCodSKU(Integer.parseInt(codigoSku.getText()));
            produto.setIdFornecedor(Integer.parseInt(codFornecedor.getText()));
            produto.setIdCategoria(Integer.parseInt(codCategoria.getText()));
            produto.setPrecoCompra(Float.parseFloat(precoCompra.getText()));
            produto.setQtdin(Integer.parseInt(qntdEstoque.getText()));
            
            
        
        if(!(codProduto.getText()).isEmpty()){ 
            produto.setIdProduto(Integer.parseInt(codProduto.getText()));
            contr.update(produto);
                            
            
            
                            
        }else{

                    contr.create(produto);
           }
                  codProduto.setEnabled(true);
                  pesquisaProduto.setEnabled(true);                  
                  pesquisaFornecedor.setEnabled(true);
                  pesquisarCategoria.setEnabled(true);
                  
                  descCategoria.setEnabled(true);
                  descFornecedor.setEnabled(true);
                  
                  botaoNovo.setEnabled(true);
                  precoCompra.setEnabled(true);
                  qntdEstoque.setEnabled(true);
                  
                  codigoSku.setEnabled(true);
            
        
         }  
    }//GEN-LAST:event_botaoSalvarActionPerformed
        private void pesquisaProduto() {
            
        ProdutoController contr = new ProdutoController(); 
        
        produt = contr.pesquisaProduto(prod.getIdProduto());
        
        produt.setIdProduto(prod.getIdProduto());
         descProduto.setText(prod.getNomeProd());
    }
        
        
        private void pesquisaCategoria(){
            
            ProdutoController contr = new ProdutoController();
            
            categ = contr.pesquisaCategorias(cat.getIdCategoria());
            
            categ.setIdCategoria(cat.getIdCategoria());
            categ.setNomeCat(cat.getNomeCat());         
         }
        
        private void pesquisaFornecedor(){
            
            FornecedorController forne = new FornecedorController();
            
            fornc = forne.pesquisaFornecedor(fornec.getCodigo());
            
            fornc.setCodigo(fornec.getCodigo());
            categ.setNomeCat(fornec.getNome());
        }
        
         private void CarregaEstoqueProduto()
    {
        EstoqueController contr = new EstoqueController();
         est = contr.RecuperaEstoqueProduto(prod.getIdProduto());
         est.setProdutoId(prod.getIdProduto());
         
    }
        
        
       
    
    
    private void pesquisaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaProdutoActionPerformed
        ConsultaProduto consultaproduto = new ConsultaProduto(prod);
       
       consultaproduto.addWindowListener(new WindowListener() {
           @Override
           public void windowOpened(WindowEvent e) {
           }

           @Override
           public void windowClosing(WindowEvent e) {
           }

           @Override
           public void windowClosed(WindowEvent e) {
               
               prod = consultaproduto.GetProduto();
               
               
               if(prod.getIdProduto() > 0){
                   codProduto.setText(String.valueOf(prod.getIdProduto()));
                   descProduto.setText(prod.getNomeProd());
                   codigoSku.setText(String.valueOf(prod.getCodSKU()));
                   codFornecedor.setText(String.valueOf(prod.getIdFornecedor()));
                   precoCompra.setText(String.valueOf(prod.getPrecoCompra()));
                   codCategoria.setText(String.valueOf(prod.getIdCategoria()));
                   descCategoria.setText(cat.getNomeCat());
                   descProduto.setText(title);
                   qntdEstoque.setText(String.valueOf(prod.getQtdmin()));
                   
                   pesquisaProduto();
               }
             Categorias categoria = new Categorias();
             ProdutoController contr = new ProdutoController();
             categoria.setIdCategoria(Integer.parseInt(codCategoria.getText())); //Captura o código digitado no campo de código do tipo de venda
                cat = contr.pesquisaCategorias(categoria.getIdCategoria()); //Chama o método pesquisaTipoVenda passando como parâmetro o que foi capturado do campo de texto e o método retorna o nome pra variavel "dados"
                if( cat != null){
            descCategoria.setText(cat.getNomeCat()); //Se o retorno da pesquisa for diferente de nulo, seta no campo nome o que foi encontrado no BD
        }else{
            descCategoria.setText(""); //Limpa o campo do nome caso esteja preenchido de uma outra consulta
            JOptionPane.showMessageDialog(null,"Produto não encontrado");
            descCategoria.requestFocus(); //Volta o foco do teclado pro campo até usuário digitar um código válido ou deixar vazio o campo
        }
            FornecedorController forn = new FornecedorController();
            Fornecedor fornecedor = new Fornecedor();
            fornecedor.setCodigo(Integer.parseInt(codFornecedor.getText()));
            fornec = forn.pesquisaFornecedor(fornecedor.getCodigo());
            
            if(fornec != null){
                descFornecedor.setText(fornec.getNome());
            }else{
                descFornecedor.setText("");
                JOptionPane.showMessageDialog(null,"Produto não encontrado");
                descFornecedor.requestFocus();
            }        
            
            fornecedor = null;
            categoria = null;
            contr = null;
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
       consultaproduto.setVisible(true);
       
        
        botaoNovo.setEnabled(true);
        codigoSku.setEnabled(true);
        precoCompra.setEnabled(true);
        codCategoria.setEnabled(true);
        botaoSalvar.setEnabled(true);
        botaoExcluir.setEnabled(true);
        botaoCancelar.setEnabled(true);
        codFornecedor.setEnabled(true);        
        descCategoria.setEnabled(true);
        qntdEstoque.setEnabled(true);
                
        botaoNovo.setEnabled(false);
        
        
      codProduto.setText("");
      descProduto.setText("");
      codigoSku.setText("");
      precoCompra.setText("");
      codFornecedor.setText("");
      descFornecedor.setText("");
      descProduto.setText("");
      codCategoria.setText("");
      descCategoria.setText("");
        
        
         
    }//GEN-LAST:event_pesquisaProdutoActionPerformed

    private void pesquisarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarCategoriaActionPerformed
     CadastroCategorias consultacategoria = new CadastroCategorias();

       
       consultacategoria.addWindowListener(new WindowListener() {
           @Override
           public void windowOpened(WindowEvent e) {
               
               
           }

           @Override
           public void windowClosing(WindowEvent e) {
           }

           @Override
           public void windowClosed(WindowEvent e) {
               
               
               cat = consultacategoria.GetCategorias();
               
               if(cat != null && cat.getIdCategoria()> 0) {
                   
                   codCategoria.setText(String.valueOf(cat.getIdCategoria()));
                   descCategoria.setText(cat.getNomeCat());
                   
                   
                   
                   pesquisaCategoria();
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
       
       
       consultacategoria.setVisible(true);
       
        
        botaoNovo.setEnabled(true);
        codigoSku.setEnabled(true);
        precoCompra.setEnabled(true);
        codCategoria.setEnabled(true);        
        botaoSalvar.setEnabled(true);
        botaoExcluir.setEnabled(true);
        botaoCancelar.setEnabled(true);
        codFornecedor.setEnabled(true);
        
                
        botaoNovo.setEnabled(false);
        



        
        
    }//GEN-LAST:event_pesquisarCategoriaActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
     
      
      botaoNovo.setEnabled(true);
      botaoSalvar.setEnabled(false);
      botaoExcluir.setEnabled(false);
      botaoCancelar.setEnabled(false);
      pesquisaProduto.setEnabled(true);
      qntdEstoque.setEnabled(false);
      
      descProduto.setEnabled(true);
      codProduto.setEnabled(true);
      codigoSku.setEnabled(false);
      precoCompra.setEnabled(false);
      codFornecedor.setEnabled(false);
      descFornecedor.setEnabled(false);
      codCategoria.setEnabled(false);
      descCategoria.setEnabled(false);
      
      qntdEstoque.setText("");  
      codProduto.setText("");
      codigoSku.setText("");
      precoCompra.setText("");
      codFornecedor.setText("");
      descFornecedor.setText("");
      descProduto.setText("");
      codCategoria.setText("");
      descCategoria.setText("");
      
       
    }//GEN-LAST:event_botaoCancelarActionPerformed

       
    
    
    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
       ProdutoController produto = new ProdutoController();
        if(prod.getIdProduto() > 0){
                   codProduto.setText(String.valueOf(prod.getIdProduto()));
                   descProduto.setText(prod.getNomeProd());
                   codigoSku.setText(String.valueOf(prod.getCodSKU()));
                   codFornecedor.setText(String.valueOf(prod.getIdFornecedor()));
                   precoCompra.setText(String.valueOf(prod.getPrecoCompra()));
                   codCategoria.setText(String.valueOf(prod.getIdCategoria()));
                   
                   
                   produto.deleteproduto(prod);
                   
                   codigoSku.setText("");
                   precoCompra.setText("");
                   codFornecedor.setText("");
                   descFornecedor.setText("");
                   descProduto.setText("");
                   codProduto.setText("");
                   codCategoria.setText("");
                   descCategoria.setText("");
                   qntdEstoque.setText("");
                   
                   
                   
                   
        }    
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void codProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codProdutoActionPerformed
        
        
        if(!(codProduto.getText()).isEmpty()){ //Verifica se o campo está preenchido
        Produto prod; //Variável que conterá o nome correspodente ao cód
        Produto p = new Produto();
        ProdutoController contr = new ProdutoController();
        
        p.setIdProduto(Integer.parseInt(codProduto.getText())); //Captura o código digitado no campo de código do tipo de venda
        prod = contr.pesquisaProduto(p.getIdProduto()); //Chama o método pesquisa produto passando como parâmetro o que foi capturado do campo de texto e o método retorna o nome pra variavel "dados"
        if( prod != null){
            descProduto.setText(prod.getNomeProd()); //Se o retorno da pesquisa for diferente de nulo, seta no campo nome o que foi encontrado no BD
            codProduto.setText(String.valueOf(prod.getIdProduto()));
            codigoSku.setText(String.valueOf(prod.getCodSKU()));
            codFornecedor.setText(String.valueOf(prod.getIdFornecedor()));
            precoCompra.setText(String.valueOf(prod.getPrecoCompra()));
            codCategoria.setText(String.valueOf(prod.getIdCategoria()));
            descCategoria.setText(cat.getNomeCat());
            
            
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
        
        if(!(codFornecedor.getText()).isEmpty()){ //Verifica se o campo está preenchido
            Fornecedor forn; //Variável que conterá o nome correspodente ao cód
        Fornecedor fornecedor = new Fornecedor();        
        FornecedorController forne = new FornecedorController();
        
        fornecedor.setCodigo(Integer.parseInt(codFornecedor.getText())); //Captura o código digitado no campo de código do tipo de venda
        forn = forne.pesquisaFornecedor(fornecedor.getCodigo()); //Chama o método pesquisaTipoVenda passando como parâmetro o que foi capturado do campo de texto e o método retorna o nome pra variavel "dados"
        if( forn != null){
            descFornecedor.setText(forn.getNome()); //Se o retorno da pesquisa for diferente de nulo, seta no campo nome o que foi encontrado no BD
        }else{
            descFornecedor.setText(""); //Limpa o campo do nome caso esteja preenchido de uma outra consulta
            JOptionPane.showMessageDialog(null,"Fornecedor não encontrado");
            descFornecedor.requestFocus(); //Volta o foco do teclado pro campo até usuário digitar um código válido ou deixar vazio o campo
        }
        fornecedor = null;
        forne = null;
    }
        
        
        
    }//GEN-LAST:event_codFornecedorActionPerformed

    private void codCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codCategoriaActionPerformed
        
        if(!(codCategoria.getText()).isEmpty()){ //Verifica se o campo está preenchido
        Categorias cat; //Variável que conterá o nome correspodente ao cód
        Categorias categoria = new Categorias();        
        ProdutoController contr = new ProdutoController();
        
        categoria.setIdCategoria(Integer.parseInt(codCategoria.getText())); //Captura o código digitado no campo de código do tipo de venda
        cat = contr.pesquisaCategorias(categoria.getIdCategoria()); //Chama o método pesquisaTipoVenda passando como parâmetro o que foi capturado do campo de texto e o método retorna o nome pra variavel "dados"
       
        if( cat != null){
            descCategoria.setText(cat.getNomeCat()); //Se o retorno da pesquisa for diferente de nulo, seta no campo nome o que foi encontrado no BD
        }else{
            descCategoria.setText(""); //Limpa o campo do nome caso esteja preenchido de uma outra consulta
            JOptionPane.showMessageDialog(null,"Produto não encontrado");
            descCategoria.requestFocus(); //Volta o foco do teclado pro campo até usuário digitar um código válido ou deixar vazio o campo
        }
        categoria = null;
        contr = null;
    }
        
        
    }//GEN-LAST:event_codCategoriaActionPerformed

    private void codCategoriaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codCategoriaFocusLost
       if(!(codCategoria.getText()).isEmpty()){ //Verifica se o campo está preenchido
        Categorias cat; //Variável que conterá o nome correspodente ao cód
        Categorias categoria = new Categorias();        
        ProdutoController contr = new ProdutoController();
        
        categoria.setIdCategoria(Integer.parseInt(codCategoria.getText())); //Captura o código digitado no campo de código do tipo de venda
        cat = contr.pesquisaCategorias(categoria.getIdCategoria()); //Chama o método pesquisaTipoVenda passando como parâmetro o que foi capturado do campo de texto e o método retorna o nome pra variavel "dados"
        if( cat != null){
            descCategoria.setText(cat.getNomeCat()); //Se o retorno da pesquisa for diferente de nulo, seta no campo nome o que foi encontrado no BD
        }else{
            descCategoria.setText(""); //Limpa o campo do nome caso esteja preenchido de uma outra consulta
            JOptionPane.showMessageDialog(null,"Produto não encontrado");
            descCategoria.requestFocus(); //Volta o foco do teclado pro campo até usuário digitar um código válido ou deixar vazio o campo
        }
        categoria = null;
        contr = null;
    }
        
        
    }//GEN-LAST:event_codCategoriaFocusLost

    private void codFornecedorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codFornecedorFocusLost
        if(!(codFornecedor.getText()).isEmpty()){ //Verifica se o campo está preenchido
            Fornecedor forn; //Variável que conterá o nome correspodente ao cód
        Fornecedor fornecedor = new Fornecedor();        
        FornecedorController forne = new FornecedorController();
        
        fornecedor.setCodigo(Integer.parseInt(codFornecedor.getText())); //Captura o código digitado no campo de código do tipo de venda
        forn = forne.pesquisaFornecedor(fornecedor.getCodigo()); //Chama o método pesquisaTipoVenda passando como parâmetro o que foi capturado do campo de texto e o método retorna o nome pra variavel "dados"
        if( forn != null){
            descFornecedor.setText(forn.getNome()); //Se o retorno da pesquisa for diferente de nulo, seta no campo nome o que foi encontrado no BD
        }else{
            descFornecedor.setText(""); //Limpa o campo do nome caso esteja preenchido de uma outra consulta
            JOptionPane.showMessageDialog(null,"Fornecedor não encontrado");
            descFornecedor.requestFocus(); //Volta o foco do teclado pro campo até usuário digitar um código válido ou deixar vazio o campo
        }
        fornecedor = null;
        forne = null;
    }
        
        
        
    }//GEN-LAST:event_codFornecedorFocusLost

    private void codProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codProdutoFocusLost
        
        
        if(!(codProduto.getText()).isEmpty()){ //Verifica se o campo está preenchido
        Produto prod; //Variável que conterá o nome correspodente ao cód
        Produto p = new Produto();
        ProdutoController contr = new ProdutoController();
        
        p.setIdProduto(Integer.parseInt(codProduto.getText())); //Captura o código digitado no campo de código do tipo de venda
        prod = contr.pesquisaProduto(p.getIdProduto()); //Chama o método pesquisaTipoVenda passando como parâmetro o que foi capturado do campo de texto e o método retorna o nome pra variavel "dados"
        if( prod != null){
            descProduto.setText(prod.getNomeProd()); //Se o retorno da pesquisa for diferente de nulo, seta no campo nome o que foi encontrado no BD
            codProduto.setText(String.valueOf(prod.getIdProduto()));
            codigoSku.setText(String.valueOf(prod.getCodSKU()));
            codFornecedor.setText(String.valueOf(prod.getIdFornecedor()));
            precoCompra.setText(String.valueOf(prod.getPrecoCompra()));
            codCategoria.setText(String.valueOf(prod.getIdCategoria()));
            descCategoria.setText(cat.getNomeCat());
            
            
        }else{
            descProduto.setText(""); //Limpa o campo do nome caso esteja preenchido de uma outra consulta
            JOptionPane.showMessageDialog(null,"Produto não encontrado");
            descProduto.requestFocus(); //Volta o foco do teclado pro campo até usuário digitar um código válido ou deixar vazio o campo
        }
        p = null;
        contr = null;
    
    }                                    
        
        
    }//GEN-LAST:event_codProdutoFocusLost

    private void pesquisaFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaFornecedorActionPerformed
            
         ConsultaFornecedor consultafornecedor = new ConsultaFornecedor();
         
        
       
       consultafornecedor. addWindowListener(new WindowListener() {
           @Override
           public void windowOpened(WindowEvent e) {
               
               
           }

           @Override
           public void windowClosing(WindowEvent e) {
           }

           @Override
           public void windowClosed(WindowEvent e) {
               
               
               fornec = consultafornecedor.GetFornecedor();
               
               if(fornec != null && fornec.getCodigo()> 0) {
                   
                   codFornecedor.setText(String.valueOf(fornec.getCodigo()));
                   descFornecedor.setText(fornec.getNome());
                   
                   
                   pesquisaFornecedor();
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
       
       
       consultafornecedor.setVisible(true);
       
        
        botaoNovo.setEnabled(true);
        codigoSku.setEnabled(true);
        precoCompra.setEnabled(true);
        codCategoria.setEnabled(true);        
        botaoSalvar.setEnabled(true);
        botaoExcluir.setEnabled(true);
        botaoCancelar.setEnabled(true);
        codFornecedor.setEnabled(true);
        
                
        botaoNovo.setEnabled(false);
        
     
    }//GEN-LAST:event_pesquisaFornecedorActionPerformed

    private void botaosairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaosairActionPerformed
      System.exit(0);
    }//GEN-LAST:event_botaosairActionPerformed

    private void botaosairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaosairMouseClicked
       
    }//GEN-LAST:event_botaosairMouseClicked

    private void qntdEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qntdEstoqueActionPerformed
          
        
        
    }//GEN-LAST:event_qntdEstoqueActionPerformed

    private void descCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descCategoriaActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void descProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descProdutoActionPerformed
      
        if(!(descProduto.getText()).isEmpty()){ //Verifica se o campo está preenchido
        Produto prod; //Variável que conterá o nome correspodente ao cód
        Produto p = new Produto();
        ProdutoController contr = new ProdutoController();
        
        p.setNomeProd (descProduto.getText()); //Captura o código digitado no campo de código do tipo de venda
        prod = contr.pesquisaProduto(p.getIdProduto()); //Chama o método pesquisaTipoVenda passando como parâmetro o que foi capturado do campo de texto e o método retorna o nome pra variavel "dados"
        if( prod != null){
            descProduto.setText(prod.getNomeProd()); //Se o retorno da pesquisa for diferente de nulo, seta no campo nome o que foi encontrado no BD
            codProduto.setText(String.valueOf(prod.getIdProduto()));
            codigoSku.setText(String.valueOf(prod.getCodSKU()));
            codFornecedor.setText(String.valueOf(prod.getIdFornecedor()));
            precoCompra.setText(String.valueOf(prod.getPrecoCompra()));
            codCategoria.setText(String.valueOf(prod.getIdCategoria()));
            descCategoria.setText(cat.getNomeCat());
            
        }    
       }
        
    }//GEN-LAST:event_descProdutoActionPerformed

    private void descProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_descProdutoFocusLost
       
       if(!(descProduto.getText()).isEmpty()){ //Verifica se o campo está preenchido
        Produto prod; //Variável que conterá o nome correspodente ao cód
        Produto p = new Produto();
        ProdutoController contr = new ProdutoController();
        
        p.setNomeProd (descProduto.getText()); //Captura o código digitado no campo de código do tipo de venda
        prod = contr.pesquisaProduto(p.getIdProduto()); //Chama o método pesquisaTipoVenda passando como parâmetro o que foi capturado do campo de texto e o método retorna o nome pra variavel "dados"
        if( prod != null){
            descProduto.setText(prod.getNomeProd()); //Se o retorno da pesquisa for diferente de nulo, seta no campo nome o que foi encontrado no BD
            codProduto.setText(String.valueOf(prod.getIdProduto()));
            codigoSku.setText(String.valueOf(prod.getCodSKU()));
            codFornecedor.setText(String.valueOf(prod.getIdFornecedor()));
            precoCompra.setText(String.valueOf(prod.getPrecoCompra()));
            codCategoria.setText(String.valueOf(prod.getIdCategoria()));
            descCategoria.setText(cat.getNomeCat());
            
        }    
       }
         
        
        
    }//GEN-LAST:event_descProdutoFocusLost

    private void precoCompraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_precoCompraFocusLost
        
        
        
        
    }//GEN-LAST:event_precoCompraFocusLost

    private void qntdEstoqueFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_qntdEstoqueFocusLost
        
  
        
        
    }//GEN-LAST:event_qntdEstoqueFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoNovo;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JMenu botaosair;
    private javax.swing.JTextField codCategoria;
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
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JButton pesquisaFornecedor;
    private javax.swing.JButton pesquisaProduto;
    private javax.swing.JButton pesquisarCategoria;
    private javax.swing.JTextField precoCompra;
    private javax.swing.JTextField qntdEstoque;
    // End of variables declaration//GEN-END:variables
}
