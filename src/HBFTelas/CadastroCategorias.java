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

    private Categorias categorias = new Categorias();
    private List<Categorias> categoria = new ArrayList<Categorias>();

    public CadastroCategorias() {
        initComponents();

        DefaultTableModel cat = (DefaultTableModel) TabelaCategoria.getModel();
        TabelaCategoria.setRowSorter(new TableRowSorter(cat));

        readTabelaCategoria();

    }

    public CadastroCategorias(Categorias categoria) {
        this();

        this.categorias = categoria;
    }

    public Categorias GetCategorias() {

        return categorias;
    }

    public void readTabelaCategoria() {
        DefaultTableModel categoria = (DefaultTableModel) TabelaCategoria.getModel();

        ProdutoController contr = new ProdutoController();
        categoria.setNumRows(0);
        for (Categorias c : contr.readCategorias()) {
            categoria.addRow(new Object[]{
                c.getIdCategoria(),
                c.getNomeCat(),
                c.getSetorCat(),});
            this.categoria.add(c);
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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nome");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 80, 38, 15);

        nomeCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeCatActionPerformed(evt);
            }
        });
        getContentPane().add(nomeCat);
        nomeCat.setBounds(50, 80, 269, 28);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Setor");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(350, 80, 39, 14);

        setorCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setorCatActionPerformed(evt);
            }
        });
        getContentPane().add(setorCat);
        setorCat.setBounds(400, 80, 220, 28);

        botaoInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Gravar.png"))); // NOI18N
        botaoInserir.setText("Salvar");
        botaoInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInserirActionPerformed(evt);
            }
        });
        getContentPane().add(botaoInserir);
        botaoInserir.setBounds(170, 20, 120, 31);

        botaoExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Excluir.png"))); // NOI18N
        botaoExcluir.setText("Exluir");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(botaoExcluir);
        botaoExcluir.setBounds(500, 20, 110, 31);

        botaoCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cancelar.png"))); // NOI18N
        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCancelar);
        botaoCancelar.setBounds(330, 20, 120, 31);

        botaoSelecionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/GravarPequeno.png"))); // NOI18N
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
        botaoSelecionar.setBounds(10, 20, 120, 30);

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
        jScrollPane2.setBounds(10, 140, 620, 180);

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

        Categorias categoria = new Categorias();
        ProdutoController contr = new ProdutoController();

        categoria.setNomeCat(nomeCat.getText());
        categoria.setSetorCat(setorCat.getText());

        contr.createCategoria(categoria);

        String nome = nomeCat.getText().trim();
        String setor = setorCat.getText().trim();

        DefaultTableModel dados = (DefaultTableModel) TabelaCategoria.getModel();
        dados.addRow(new String[]{nome, setor});

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

        if (TabelaCategoria.getSelectedRow() != -1) {
            Categorias c = new Categorias();
            ProdutoController contr = new ProdutoController();

            c.setIdCategoria((int) TabelaCategoria.getValueAt(TabelaCategoria.getSelectedRow(), 0));

            contr.deleteCategorias(c);

            readTabelaCategoria();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma categoria para excluir");
        }


    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void botaoSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSelecionarActionPerformed

        if (TabelaCategoria.getSelectedRow() == -1) {
            return;
        }
        
        System.out.println(TabelaCategoria.getRowCount());
        System.out.println(TabelaCategoria.getSelectedRow());
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
        if (TabelaCategoria.getSelectedRow() != -1) {
            nomeCat.setText(TabelaCategoria.getValueAt(TabelaCategoria.getSelectedRow(), 1).toString());
            setorCat.setText(TabelaCategoria.getValueAt(TabelaCategoria.getSelectedRow(), 2).toString());
        }
    }//GEN-LAST:event_TabelaCategoriaMouseClicked

    private void TabelaCategoriaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TabelaCategoriaKeyReleased
        if (TabelaCategoria.getSelectedRow() != -1) {

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
