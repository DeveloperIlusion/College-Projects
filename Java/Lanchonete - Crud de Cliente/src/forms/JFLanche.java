package forms;

import bean.Lanche;
import dao.LancheDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JFLanche extends javax.swing.JFrame {

    ArrayList<Lanche> lanches = new ArrayList<>();

    int linha = -1;

    public JFLanche() {

        initComponents();

        setLocationRelativeTo(null);

        this.preenchaTabela();

    }

    private void preenchaTabela() {

        DefaultTableModel model = (DefaultTableModel) tblLanche.getModel();

        model.setRowCount(0);

        LancheDAO dao = new LancheDAO();

        this.lanches = dao.liste();

        for (Lanche lanche : this.lanches) {
            model.addRow(new String[]{
                lanche.getNome(), Float.toString(lanche.getValor())
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtValor = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        btnGravar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLanche = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lanche");

        jLabel1.setText("Nome");

        jLabel2.setText("Valor");

        jLabel3.setText("Descrição");

        txtValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        jScrollPane1.setViewportView(txtDescricao);

        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");
        btnRemover.setEnabled(false);
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.setEnabled(false);
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tblLanche.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Valor"
            }
        ));
        tblLanche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLancheMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblLanche);
        if (tblLanche.getColumnModel().getColumnCount() > 0) {
            tblLanche.getColumnModel().getColumn(0).setMinWidth(350);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGravar)
                                .addGap(18, 18, 18)
                                .addComponent(btnRemover)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpar)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGravar)
                    .addComponent(btnRemover)
                    .addComponent(btnLimpar)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed

        int id = -1;

        if (this.linha != -1) {
            id = this.lanches.get(this.linha).getLancheId();
        }

        Lanche lanche = new Lanche(
                id,
                txtNome.getText(),
                Float.parseFloat(txtValor.getText().replace(",", ".")),
                txtDescricao.getText()
        );

        LancheDAO dao = new LancheDAO();

        String msg = dao.grave(lanche);

        this.preenchaTabela();

        this.controleBotoes();

        this.limpeFormulario();

        JOptionPane.showMessageDialog(null, msg);
    }//GEN-LAST:event_btnGravarActionPerformed

    private void limpeFormulario() {
        this.linha = -1;
        txtNome.setText("");
        txtValor.setText("");
        txtDescricao.setText("");
    }

    private void controleBotoes() {
        if (this.linha == -1) {
            btnRemover.setEnabled(false);
            btnLimpar.setEnabled(false);
        } else {
            btnRemover.setEnabled(true);
            btnLimpar.setEnabled(true);
        };
    }

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        if (JOptionPane.showConfirmDialog(
                null, "Deseja realmente remover o registro?", "Confirmação",
                JOptionPane.YES_NO_OPTION
        ) == JOptionPane.YES_OPTION) {
            LancheDAO dao = new LancheDAO();

            String msg = dao.remova(this.lanches.get(this.linha).getLancheId());

            this.preenchaTabela();

            this.limpeFormulario();

            this.controleBotoes();

            JOptionPane.showMessageDialog(null, msg);
        }

    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        
        this.limpeFormulario();
        
        this.controleBotoes();
        
        this.preenchaTabela();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void tblLancheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLancheMouseClicked

        this.linha = tblLanche.rowAtPoint(evt.getPoint());

        txtNome.setText(this.lanches.get(this.linha).getNome());
        txtValor.setText(
                Float.toString(this.lanches.get(this.linha).getValor()).replace(".", ",")
        );
        txtDescricao.setText(this.lanches.get(this.linha).getDescricao());
        this.controleBotoes();
    }//GEN-LAST:event_tblLancheMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        LancheDAO dao = new LancheDAO();
        
        this.lanches = dao.pesquise(txtNome.getText());
        
        DefaultTableModel model = (DefaultTableModel) tblLanche.getModel();
        
        model.setRowCount(0);
        
        for (Lanche lanche : this.lanches){
        
            model.addRow(new String[]{
                lanche.getNome(), Float.toString(lanche.getValor())
            });
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(JFLanche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFLanche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFLanche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFLanche.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFLanche().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblLanche;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
