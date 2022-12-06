package interfaceGrafica;
import bean.VeiculoEletrico;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JFVeiculoEletrico extends javax.swing.JFrame {
    
    ArrayList<VeiculoEletrico> veiculoEletrico = new ArrayList<>();

    private int linha = -1;

    public JFVeiculoEletrico() {
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
        txtEquipamentoSegurancaObrigatorio = new javax.swing.JTextField();
        txtTempoAbastecimento = new javax.swing.JTextField();
        btnGravar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnFiltrar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVeiculoEletrico = new javax.swing.JTable();
        txtAnoFabricacao = new javax.swing.JFormattedTextField();
        txtAutonomiaKM = new javax.swing.JFormattedTextField();
        txtDurabilidadeBateria = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Modelo");

        jLabel2.setText("Marca");

        jLabel3.setText("Ano de Fabricação");

        jLabel4.setText("Pôtencia");

        jLabel5.setText("Categoria");

        jLabel6.setText("Durabilidade da bateria");

        jLabel7.setText("Equipamento de Segurança Obrigatório");

        jLabel8.setText("Tempo de abastecimento");

        jLabel9.setText("Autonomia em KM/h");

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

        tblVeiculoEletrico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Modelo", "Marca", "Ano de Fabricação", "Tempo de abastecimento", "Autonomia em KM/h"
            }
        ));
        tblVeiculoEletrico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVeiculoEletricoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblVeiculoEletrico);

        txtAnoFabricacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        txtAutonomiaKM.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        txtDurabilidadeBateria.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(txtDurabilidadeBateria, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(txtEquipamentoSegurancaObrigatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTempoAbastecimento, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(txtAutonomiaKM, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnGravar)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnRemover)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnFiltrar)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnLimpar))
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txtAnoFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtCategoria)))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
                    .addComponent(txtEquipamentoSegurancaObrigatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTempoAbastecimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAutonomiaKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDurabilidadeBateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            int durabilidadeBateria = Integer.parseInt(txtDurabilidadeBateria.getText());
            String equipamentoSegurancaObrigatorio = txtEquipamentoSegurancaObrigatorio.getText();
            int tempoAbastecimento = Integer.parseInt(txtTempoAbastecimento.getText());
            int autonomiaKM = Integer.parseInt(txtAutonomiaKM.getText());
            String modelo = txtModelo.getText();
            String marca = txtMarca.getText();
            int anoDeFabricacao = Integer.parseInt(txtAnoFabricacao.getText());
            int potencia = Integer.parseInt(txtPotencia.getText());
            String categoria = txtCategoria.getText();
            

            if (this.linha == -1) {

                VeiculoEletrico ve = new VeiculoEletrico (durabilidadeBateria, equipamentoSegurancaObrigatorio, tempoAbastecimento, autonomiaKM, anoDeFabricacao, modelo, marca, potencia, categoria);
                this.veiculoEletrico.add(ve);
            } else {
                this.veiculoEletrico.get(this.linha).setModelo(modelo);
                this.veiculoEletrico.get(this.linha).setMarca(marca);
                this.veiculoEletrico.get(this.linha).setAnoFabricacao(anoDeFabricacao);
                this.veiculoEletrico.get(this.linha).setPotencia(potencia);
                this.veiculoEletrico.get(this.linha).setCategoria(categoria);
                this.veiculoEletrico.get(this.linha).setDurabilidadeBateria(durabilidadeBateria);
                this.veiculoEletrico.get(this.linha).setEquipamentoSegurancaObrigatorio(equipamentoSegurancaObrigatorio);
                this.veiculoEletrico.get(this.linha).setTempoAbastecimento(tempoAbastecimento);
                this.veiculoEletrico.get(this.linha).setAutonomiaKM(autonomiaKM);
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
            this.veiculoEletrico.remove(this.linha);
            this.preenchaTabela();
            this.limpeFormulario();
            this.controleBotoes();
            JOptionPane.showMessageDialog(this, "Veículo removido.");
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        if (this.veiculoEletrico.size() == 0) {
            JOptionPane.showMessageDialog(this, "Não há itens para filtrar.");
            return;
        }

        if (txtModelo.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Informe um modelo para filtrar.");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblVeiculoEletrico.getModel();

        model.setRowCount(0);
        for (int cont = 0; cont < this.veiculoEletrico.size(); cont++) {
            if (this.veiculoEletrico.get(cont).getModelo().contains(txtModelo.getText())) {
                model.addRow(new String[]{
                    this.veiculoEletrico.get(cont).getModelo(),
                    this.veiculoEletrico.get(cont).getMarca(),
                    Integer.toString(this.veiculoEletrico.get(cont).getAnoFabricacao()),
                    Integer.toString(this.veiculoEletrico.get(cont).getTempoAbastecimento()),
                    Integer.toString(this.veiculoEletrico.get(cont).getAutonomiaKM())
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
        
        DefaultTableModel model = (DefaultTableModel) tblVeiculoEletrico.getModel();

        model.setRowCount(0);

        for (int cont = 0; cont < this.veiculoEletrico.size(); cont++) {
            model.addRow(new String[]{
                this.veiculoEletrico.get(cont).getModelo(),
                this.veiculoEletrico.get(cont).getMarca(),
                Integer.toString(this.veiculoEletrico.get(cont).getAnoFabricacao()),
                Integer.toString(this.veiculoEletrico.get(cont).getTempoAbastecimento()),
                Integer.toString(this.veiculoEletrico.get(cont).getAutonomiaKM())
            });
        }
    }
    
    private void tblVeiculoEletricoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVeiculoEletricoMouseClicked

        this.linha = tblVeiculoEletrico.rowAtPoint(evt.getPoint());
        
        txtModelo.setText( this.veiculoEletrico.get(this.linha).getModelo() );
        txtMarca.setText( this.veiculoEletrico.get(this.linha).getMarca() );
        txtAnoFabricacao.setText(
            Integer.toString( this.veiculoEletrico.get(this.linha).getAnoFabricacao() ) 
        );
        txtTempoAbastecimento.setText(
            Integer.toString( this.veiculoEletrico.get(this.linha).getTempoAbastecimento() ) 
        );
        txtAutonomiaKM.setText(
            Integer.toString( this.veiculoEletrico.get(this.linha).getAutonomiaKM() ) 
        );

        this.controleBotoes();
    }//GEN-LAST:event_tblVeiculoEletricoMouseClicked
    
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
        txtDurabilidadeBateria.setText("");
        txtEquipamentoSegurancaObrigatorio.setText("");
        txtTempoAbastecimento.setText("");
        txtAutonomiaKM.setText("");
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
            java.util.logging.Logger.getLogger(JFVeiculoEletrico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFVeiculoEletrico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFVeiculoEletrico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFVeiculoEletrico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFVeiculoEletrico().setVisible(true);
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
    private javax.swing.JTable tblVeiculoEletrico;
    private javax.swing.JFormattedTextField txtAnoFabricacao;
    private javax.swing.JFormattedTextField txtAutonomiaKM;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JFormattedTextField txtDurabilidadeBateria;
    private javax.swing.JTextField txtEquipamentoSegurancaObrigatorio;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPotencia;
    private javax.swing.JTextField txtTempoAbastecimento;
    // End of variables declaration//GEN-END:variables
}
