package interfaceGrafica;
import bean.Automovel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JFAutomovel extends javax.swing.JFrame {
    
    ArrayList<Automovel> automovel = new ArrayList<>();

    private int linha = -1;

    public JFAutomovel() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtPotencia = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        txtTipoCombustivel = new javax.swing.JTextField();
        txtCor = new javax.swing.JTextField();
        btnGravar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnFiltrar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAutomovel = new javax.swing.JTable();
        txtAnoFabricacao = new javax.swing.JFormattedTextField();
        txtCrlv = new javax.swing.JFormattedTextField();
        txtChassi = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Modelo");

        jLabel2.setText("Marca");

        jLabel3.setText("Ano de Fabricação");

        jLabel4.setText("Pôtencia");

        jLabel5.setText("Categoria");

        jLabel6.setText("Chassi");

        jLabel7.setText("Tipo de combustível");

        jLabel8.setText("Cor");

        jLabel9.setText("CRLV");

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

        btnFiltrar.setText("Filtrar");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        tblAutomovel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Modelo", "Marca", "Ano de Fabricação", "Chassi", "Tipo de combustível"
            }
        ));
        tblAutomovel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAutomovelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAutomovel);

        txtAnoFabricacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        txtCrlv.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        txtChassi.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtChassi, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(txtTipoCombustivel))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(0, 27, Short.MAX_VALUE))
                                    .addComponent(txtCor)
                                    .addComponent(txtAnoFabricacao))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(119, 119, 119))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel4)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(txtPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGap(21, 21, 21))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCrlv, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGravar)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemover)
                        .addGap(18, 18, 18)
                        .addComponent(btnFiltrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(87, 87, 87))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(80, 80, 80)))
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2)
                        .addContainerGap(543, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(5, 5, 5))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnoFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipoCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCrlv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtChassi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGravar)
                    .addComponent(btnRemover)
                    .addComponent(btnFiltrar)
                    .addComponent(btnLimpar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
         try {
            int chassi = Integer.parseInt(txtChassi.getText());
            String tipoCombustivel = txtTipoCombustivel.getText();
            String cor = txtCor.getText();
            int crlv = Integer.parseInt(txtCrlv.getText());
            String modelo = txtModelo.getText();
            String marca = txtMarca.getText();
            int anoDeFabricacao = Integer.parseInt(txtAnoFabricacao.getText());
            int potencia = Integer.parseInt(txtPotencia.getText());
            String categoria = txtCategoria.getText();
            

            if (this.linha == -1) {

                Automovel a = new Automovel(chassi, tipoCombustivel, cor, crlv, anoDeFabricacao, modelo, marca, potencia, categoria);
                this.automovel.add(a);
            } else {
                this.automovel.get(this.linha).setModelo(modelo);
                this.automovel.get(this.linha).setMarca(marca);
                this.automovel.get(this.linha).setAnoFabricacao(anoDeFabricacao);
                this.automovel.get(this.linha).setPotencia(potencia);
                this.automovel.get(this.linha).setCategoria(categoria);
                this.automovel.get(this.linha).setChassi(chassi);
                this.automovel.get(this.linha).setTipoCombustivel(tipoCombustivel);
                this.automovel.get(this.linha).setCor(cor);
                this.automovel.get(this.linha).setCrlv(crlv);
            }

            this.preenchaTabela();

            this.limpeFormulario();

            this.controleBotoes();

        } catch (Exception ex) {
            
        }
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
         if (
            JOptionPane.showConfirmDialog(
                this, "Deseja realmente remover o registro?", "Confirmação",
                JOptionPane.YES_NO_OPTION
            ) == JOptionPane.YES_OPTION
        ) {
            this.automovel.remove(this.linha);
            this.preenchaTabela();
            this.limpeFormulario();
            this.controleBotoes();
            JOptionPane.showMessageDialog(this, "Veículo removido.");
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        if (this.automovel.size() == 0) {
            JOptionPane.showMessageDialog(this, "Não há itens para filtrar.");
            return;
        }

        if (txtModelo.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Informe um modelo para filtrar.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblAutomovel.getModel();

        model.setRowCount(0);
        for (int cont = 0; cont < this.automovel.size(); cont++) {
            if (this.automovel.get(cont).getModelo().contains(txtModelo.getText())) {
                model.addRow(new String[]{
                    this.automovel.get(cont).getModelo(),
                    this.automovel.get(cont).getMarca(),
                    Integer.toString(this.automovel.get(cont).getAnoFabricacao()),
                    Integer.toString(this.automovel.get(cont).getChassi()),
                    this.automovel.get(cont).getTipoCombustivel()
                });
            }
        }
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        this.limpeFormulario();
        
        this.preenchaTabela();
        
        this.controleBotoes();
    }//GEN-LAST:event_btnLimparActionPerformed
    private void preenchaTabela() {
        
        DefaultTableModel model = (DefaultTableModel) tblAutomovel.getModel();

        model.setRowCount(0);

        for (int cont = 0; cont < this.automovel.size(); cont++) {
            model.addRow(new String[]{
                this.automovel.get(cont).getModelo(),
                this.automovel.get(cont).getMarca(),
                Integer.toString(this.automovel.get(cont).getAnoFabricacao()),
                Integer.toString(this.automovel.get(cont).getChassi()),
                this.automovel.get(cont).getTipoCombustivel()
            });
        }
    }
    
    private void tblAutomovelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAutomovelMouseClicked

        this.linha = tblAutomovel.rowAtPoint(evt.getPoint());
        
        txtModelo.setText( this.automovel.get(this.linha).getModelo() );
        txtMarca.setText( this.automovel.get(this.linha).getMarca() );
        txtChassi.setText(
            Integer.toString( this.automovel.get(this.linha).getChassi() ) 
        );
        txtAnoFabricacao.setText(
            Integer.toString( this.automovel.get(this.linha).getAnoFabricacao() ) 
        );
        txtTipoCombustivel.setText( this.automovel.get(this.linha).getTipoCombustivel() );

        this.controleBotoes();
    }//GEN-LAST:event_tblAutomovelMouseClicked
    
    private void controleBotoes() {
        if (this.linha == -1) {
            btnRemover.setEnabled(false);
        } else {
            btnRemover.setEnabled(true);
        }
    }
    
    private void limpeFormulario() {
        txtModelo.setText("");
        txtMarca.setText("");
        txtAnoFabricacao.setText("");
        txtPotencia.setText("");
        txtCategoria.setText("");
        txtChassi.setText("");
        txtTipoCombustivel.setText("");
        txtCor.setText("");
        txtCrlv.setText("");
        this.linha = -1;
    }
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
            java.util.logging.Logger.getLogger(JFAutomovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFAutomovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFAutomovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFAutomovel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFAutomovel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAutomovel;
    private javax.swing.JFormattedTextField txtAnoFabricacao;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JFormattedTextField txtChassi;
    private javax.swing.JTextField txtCor;
    private javax.swing.JFormattedTextField txtCrlv;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPotencia;
    private javax.swing.JTextField txtTipoCombustivel;
    // End of variables declaration//GEN-END:variables
}
