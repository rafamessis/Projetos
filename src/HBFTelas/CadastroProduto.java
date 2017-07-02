/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HBFTelas;

import Controller.ProdutoController;
import Controller.FornecedorController;
import Controller.EstoqueController;
import Model.Produto;
import Model.Categorias;
import Model.Estoque;
import Model.Fornecedor;
import com.oracle.jrockit.jfr.Producer;
import java.awt.Dialog;
import java.awt.Window;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.text.DateFormat;
import java.text.SimpleDateFormat;







public class CadastroProduto extends javax.swing.JInternalFrame {
       Produto produto = new Produto();
       Produto produt = null;       
      private ArrayList<Produto> produtos = null;      
      private Produto prod = new Produto();
      
      Categorias categ = null;
      Categorias categoria = new Categorias();
      private ArrayList<Categorias> categorias = null;
      private Categorias cat = new Categorias();
      private Fornecedor forneced = new Fornecedor();
      private Fornecedor fornec = new Fornecedor(); 
      Fornecedor forn = null;
      
      
      
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
        botaoatt = new javax.swing.JButton();
        pesquisaFornecedor = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        qntdEstoque = new javax.swing.JTextField();
        pesquisaEstoque = new javax.swing.JButton();
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
        jLabel1.setBounds(10, 90, 60, 20);

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
        codProduto.setBounds(60, 90, 90, 29);

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
        descProduto.setBounds(230, 90, 249, 29);

        pesquisaProduto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pesquisaProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Pesquisar.png"))); // NOI18N
        pesquisaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(pesquisaProduto);
        pesquisaProduto.setBounds(480, 90, 40, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Codigo SKU");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(550, 100, 80, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Preço da Compra");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 210, 110, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Codigo Fornecedor");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 150, 130, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Descrição Fornecedor");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(180, 150, 130, 20);

        codigoSku.setEnabled(false);
        getContentPane().add(codigoSku);
        codigoSku.setBounds(640, 90, 80, 30);

        precoCompra.setEnabled(false);
        getContentPane().add(precoCompra);
        precoCompra.setBounds(120, 210, 100, 30);

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
        codFornecedor.setBounds(120, 150, 60, 30);

        descFornecedor.setEditable(false);
        descFornecedor.setEnabled(false);
        getContentPane().add(descFornecedor);
        descFornecedor.setBounds(310, 150, 220, 30);

        pesquisarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Pesquisar.png"))); // NOI18N
        pesquisarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(pesquisarCategoria);
        pesquisarCategoria.setBounds(510, 260, 40, 30);

        botaoNovo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Novo.png"))); // NOI18N
        botaoNovo.setText("Novo");
        botaoNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoActionPerformed(evt);
            }
        });
        getContentPane().add(botaoNovo);
        botaoNovo.setBounds(10, 20, 100, 31);

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
        botaoExcluir.setBounds(350, 20, 110, 30);

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
        botaoSalvar.setBounds(140, 20, 150, 30);

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
        botaoCancelar.setBounds(560, 20, 120, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Descrição");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(160, 90, 80, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Codigo Categoria");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 270, 110, 15);

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
        codCategoria.setBounds(110, 260, 60, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Descrição Categoria");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(180, 270, 130, 15);

        descCategoria.setEnabled(false);
        descCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descCategoriaActionPerformed(evt);
            }
        });
        getContentPane().add(descCategoria);
        descCategoria.setBounds(310, 260, 200, 30);

        botaoatt.setText("ATT");
        botaoatt.setEnabled(false);
        botaoatt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoattActionPerformed(evt);
            }
        });
        getContentPane().add(botaoatt);
        botaoatt.setBounds(10, 360, 90, 30);

        pesquisaFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Pesquisar.png"))); // NOI18N
        pesquisaFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaFornecedorActionPerformed(evt);
            }
        });
        getContentPane().add(pesquisaFornecedor);
        pesquisaFornecedor.setBounds(530, 150, 40, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Quantidade Inicial");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(260, 210, 120, 20);

        qntdEstoque.setEnabled(false);
        qntdEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qntdEstoqueActionPerformed(evt);
            }
        });
        getContentPane().add(qntdEstoque);
        qntdEstoque.setBounds(390, 210, 80, 30);

        pesquisaEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Pesquisar.png"))); // NOI18N
        pesquisaEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaEstoqueActionPerformed(evt);
            }
        });
        getContentPane().add(pesquisaEstoque);
        pesquisaEstoque.setBounds(470, 210, 40, 30);

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

        setBounds(0, 0, 784, 473);
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
      pesquisaProduto.setEnabled(false);
      botaoNovo.setEnabled(false);
      
        
        
    }//GEN-LAST:event_botaoNovoActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
              
                 Produto produto = new Produto();
                ProdutoController contr = new ProdutoController();
                 
                   

                    produto.setNomeProd(descProduto.getText()); // Pega os valores que estão no campo Descrição
                    produto.setCodSKU(Integer.parseInt(codigoSku.getText()));
                    produto.setPrecoCompra(Float.parseFloat(precoCompra.getText()));
                    produto.setIdFornecedor(Integer.parseInt(codFornecedor.getText()));
                    produto.setIdCategoria(Integer.parseInt(codCategoria.getText()));

                    contr.create(produto);
                  
                    Estoque estoque = new Estoque();
                    EstoqueController estq = new EstoqueController();
                    
                    estoque.setQuantidade(Integer.parseInt(qntdEstoque.getText()));
                    estoque.setProdutoId(Integer.parseInt(codProduto.getText()));
                    
                    estq.Salvar(estoque);
                    
                    
                    
            
                  codigoSku.setEnabled(false);
                  precoCompra.setEnabled(false);
                  codFornecedor.setEnabled(false);
                  descProduto.setEnabled(false);     
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
            
            forn = forne.pesquisaFornecedor(fornec.getCodigo());
            
            forn.setCodigo(fornec.getCodigo());
            categ.setNomeCat(fornec.getNome());
        }
        
         private void CarregaEstoqueProduto()
    {
        EstoqueController contr = new EstoqueController();
         est = contr.RecuperaEstoqueProduto(prod.getIdProduto());
         est.setProdutoId(prod.getIdProduto());
         pesquisaEstoque.setText(Integer.toString(est.getQuantidade()));
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
                   
                   pesquisaProduto();
               }
             Categorias categoria = new Categorias();
             ProdutoController contr = new ProdutoController();
             System.out.println(codCategoria.getText());
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
        botaoatt.setEnabled(true);
        descCategoria.setEnabled(true);
                
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
      botaoatt.setEnabled(false);
      botaoSalvar.setEnabled(false);
      botaoExcluir.setEnabled(false);
      botaoCancelar.setEnabled(false);
      pesquisaProduto.setEnabled(true);
      
      descProduto.setEnabled(true);
      codProduto.setEnabled(true);
      codigoSku.setEnabled(false);
      precoCompra.setEnabled(false);
      codFornecedor.setEnabled(false);
      descFornecedor.setEnabled(false);
      codCategoria.setEnabled(false);
      descCategoria.setEnabled(false);
      
        
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
                   
                   
                   
                   
        }    
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void codProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codProdutoActionPerformed
        
        
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

    private void botaoattActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoattActionPerformed
                    if(!(codProduto.getText()).isEmpty()){
                Produto prod;
                Produto produto = new Produto();
                ProdutoController contr = new ProdutoController();
                ConsultaProduto con = new ConsultaProduto();
            
                    produto.setIdProduto(Integer.parseInt(codProduto.getText()));//Captura o codigo digitado no campo.
                    prod = contr.pesquisaProduto(produto.getIdProduto()); // Chama o metodo de pesquisa de produto
            
               if (prod != null){ // se o campo for diferente de nullo 
                        produto.setNomeProd(descProduto.getText()); // Pega os valores que estão no campo Descrição
                        produto.setCodSKU(Integer.parseInt(codigoSku.getText()));
                        produto.setPrecoCompra(Float.parseFloat(precoCompra.getText()));
                        produto.setIdFornecedor(Integer.parseInt(codFornecedor.getText()));
                        produto.setIdCategoria(Integer.parseInt(codCategoria.getText()));

                        contr.update(produto);
                
            }
         }   
    }//GEN-LAST:event_botaoattActionPerformed

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
        
        
        
        
        
      
        
    }//GEN-LAST:event_pesquisaFornecedorActionPerformed

    private void botaosairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaosairActionPerformed
      System.exit(0);
    }//GEN-LAST:event_botaosairActionPerformed

    private void botaosairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaosairMouseClicked
       
    }//GEN-LAST:event_botaosairMouseClicked

    private void qntdEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qntdEstoqueActionPerformed
              EstoqueController contr = new EstoqueController();
              if (qntdEstoque.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"A quantidade nao pode ser vazia!");
            return;
        }
               if (Integer.parseInt(qntdEstoque.getText()) < 0){
            JOptionPane.showMessageDialog(null,"Quantidade cadastrada não pode ser negativa!");
            return;
        }
        est.setQuantidade(Integer.parseInt(qntdEstoque.getText()));
        est.setProdutoId(Integer.parseInt(codProduto.getText()));
        contr.Salvar(est);
        
    }//GEN-LAST:event_qntdEstoqueActionPerformed

    private void descCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descCategoriaActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void pesquisaEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaEstoqueActionPerformed
        CadastroEstoque cadastroestoque = new CadastroEstoque();
        cadastroestoque.setVisible(true);
        
        
    }//GEN-LAST:event_pesquisaEstoqueActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoNovo;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JButton botaoatt;
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
    private javax.swing.JButton pesquisaEstoque;
    private javax.swing.JButton pesquisaFornecedor;
    private javax.swing.JButton pesquisaProduto;
    private javax.swing.JButton pesquisarCategoria;
    private javax.swing.JTextField precoCompra;
    private javax.swing.JTextField qntdEstoque;
    // End of variables declaration//GEN-END:variables
}
