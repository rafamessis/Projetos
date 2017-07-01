package HBFTelas;
import Controller.ProdutoController;
import Model.Categorias;
import Model.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class CadastroCategorias extends javax.swing.JFrame {
    
    
    private Categorias categorias;
    private List<Categorias> categoria = new ArrayList<Categorias>();

   
    public CadastroCategorias() {
        initComponents();
        
        DefaultTableModel cat = (DefaultTableModel)TabelaCategoria.getModel();
        TabelaCategoria.setRowSorter(new TableRowSorter(cat));
        
        
        readTabelaCategoria();
        
        
    }
    public CadastroCategorias(Categorias categoria) {
        this();
        
        this.categorias = categoria;
                }
    
    public Categorias GetCategorias(){
      
      return categorias;
  }
    
    public void readTabelaCategoria(){
       DefaultTableModel categoria = (DefaultTableModel)TabelaCategoria.getModel();
       
       
      
       ProdutoController contr = new ProdutoController();
       categoria.setNumRows(0);
       for(Categorias c: contr.readCategorias()){
           categoria.addRow(new Object[]{
           c.getIdCategoria(),
           c.getNomeCat(),
           c.getSetorCat(),
       });
     }
   }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        nomeCat = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        setorCat = new javax.swing.JTextField();
        botaoInserir = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        botaoSelecionar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaCategoria = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Categoria");
        getContentPane().setLayout(null);

        jLabel2.setText("Nome");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 40, 38, 14);

        nomeCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeCatActionPerformed(evt);
            }
        });
        getContentPane().add(nomeCat);
        nomeCat.setBounds(60, 30, 269, 28);

        jLabel3.setText("Setor");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(370, 40, 39, 14);

        setorCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setorCatActionPerformed(evt);
            }
        });
        getContentPane().add(setorCat);
        setorCat.setBounds(407, 30, 220, 28);

        botaoInserir.setText("Inserir");
        botaoInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInserirActionPerformed(evt);
            }
        });
        getContentPane().add(botaoInserir);
        botaoInserir.setBounds(170, 100, 80, 31);

        botaoExcluir.setText("Exluir");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(botaoExcluir);
        botaoExcluir.setBounds(310, 100, 75, 31);

        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCancelar);
        botaoCancelar.setBounds(462, 97, 75, 31);

        botaoSelecionar.setText("Selecionar");
        botaoSelecionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoSelecionarMouseClicked(evt);
            }
        });
        botaoSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSelecionarActionPerformed(evt);
            }
        });
        botaoSelecionar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botaoSelecionarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                botaoSelecionarKeyReleased(evt);
            }
        });
        getContentPane().add(botaoSelecionar);
        botaoSelecionar.setBounds(10, 100, 100, 30);

        TabelaCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Descrição", "Setor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaCategoriaMouseClicked(evt);
            }
        });
        TabelaCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TabelaCategoriaKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(TabelaCategoria);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 146, 620, 180);

        jMenu1.setText("Arquivos");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Outros");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setBounds(0, 0, 656, 386);
    }// </editor-fold>//GEN-END:initComponents

    private void nomeCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeCatActionPerformed

    private void setorCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setorCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_setorCatActionPerformed

    private void botaoInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInserirActionPerformed
       
       Categorias c = new Categorias();
       ProdutoController contr = new ProdutoController();
      
       c.setNomeCat(nomeCat.getText());
       c.setSetorCat(setorCat.getText());
        
       contr.createCategoria(c);
       

          
       String nome = nomeCat.getText().trim();
       String setor = setorCat.getText().trim();
       
       DefaultTableModel dados = (DefaultTableModel)TabelaCategoria.getModel();
       dados.addRow(new String[]{nome,setor});  
       
       // limpar Campos apos Inserir
        nomeCat.setText("");
        setorCat.setText("");
        
        nomeCat.requestFocus();
        
        readTabelaCategoria();
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_botaoInserirActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        
        dispose();
        
        
        
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        
        if (TabelaCategoria.getSelectedRow() != -1){
            Categorias c = new Categorias();
            ProdutoController contr = new ProdutoController();
      
             c.setIdCategoria((int)TabelaCategoria.getValueAt(TabelaCategoria.getSelectedRow(), 0));
       
            contr.deleteCategorias(c);
       
             
        readTabelaCategoria();
            
         }
        else {
            JOptionPane.showMessageDialog(null,"Selecione uma categoria para excluir");
        }
        
        
        
        
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void botaoSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSelecionarActionPerformed
               
        if(TabelaCategoria.getSelectedRow() == -1)
            return;               
        
        categorias = categoria.get(TabelaCategoria.getSelectedRow());
        dispose();
        
        
        
//        if (TabelaCategoria.getSelectedRow() != -1){
//            
//       Categorias c = new Categorias();
//       ProdutoController contr = new ProdutoController();
//      
//       c.setNomeCat(nomeCat.getText());
//       c.setSetorCat(setorCat.getText());
//              
//       c.setIdCategoria((int)TabelaCategoria.getValueAt(TabelaCategoria.getSelectedRow(), 0));
//       
//       contr.updateCategorias(c);
//       
//        // limpar Campos apos Inserir
//        nomeCat.setText("");
//        setorCat.setText("");        
//        nomeCat.requestFocus();
//        
//        readTabelaCategoria();
//       
//       
//            
//        }
//        
        
    }//GEN-LAST:event_botaoSelecionarActionPerformed

    private void botaoSelecionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSelecionarMouseClicked
        
        
        
        
    }//GEN-LAST:event_botaoSelecionarMouseClicked

    private void botaoSelecionarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoSelecionarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoSelecionarKeyPressed

    private void botaoSelecionarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoSelecionarKeyReleased
       
    }//GEN-LAST:event_botaoSelecionarKeyReleased

    private void TabelaCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaCategoriaMouseClicked
        if (TabelaCategoria.getSelectedRow()!= -1){
            nomeCat.setText(TabelaCategoria.getValueAt(TabelaCategoria.getSelectedRow(), 1).toString());
            setorCat.setText(TabelaCategoria.getValueAt(TabelaCategoria.getSelectedRow(), 2).toString());
        }
    }//GEN-LAST:event_TabelaCategoriaMouseClicked

    private void TabelaCategoriaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TabelaCategoriaKeyReleased
        if (TabelaCategoria.getSelectedRow()!= -1){
            
            nomeCat.setText(TabelaCategoria.getValueAt(TabelaCategoria.getSelectedRow(), 1).toString());
            setorCat.setText(TabelaCategoria.getValueAt(TabelaCategoria.getSelectedRow(), 2).toString());
        }
    }//GEN-LAST:event_TabelaCategoriaKeyReleased

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
            java.util.logging.Logger.getLogger(CadastroCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCategorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCategorias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaCategoria;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoInserir;
    private javax.swing.JButton botaoSelecionar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nomeCat;
    private javax.swing.JTextField setorCat;
    // End of variables declaration//GEN-END:variables

    
}
