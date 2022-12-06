package interfaceGrafica;

import bean.Disciplina;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JFDisciplina extends javax.swing.JFrame {

    // cria uma coleção de objetos de disciplina
    ArrayList<Disciplina> disciplinas = new ArrayList<>();

    /* cria uma variável global para controlar o modo de operação
     do formulário */
    private int linha = -1;

    public JFDisciplina() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JFormattedTextField();
        txtNome = new javax.swing.JTextField();
        txtCargaHoraria = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtConteudoProgramatico = new javax.swing.JTextArea();
        btnGravar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnFiltrar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDisciplina = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestão de Disciplina");

        jLabel1.setText("Código");

        jLabel2.setText("Nome");

        jLabel3.setText("Carga Horária");

        jLabel4.setText("Conteúdo programático");

        txtConteudoProgramatico.setColumns(20);
        txtConteudoProgramatico.setRows(5);
        jScrollPane1.setViewportView(txtConteudoProgramatico);

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

        tblDisciplina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Carga Horária"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDisciplina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDisciplinaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDisciplina);
        if (tblDisciplina.getColumnModel().getColumnCount() > 0) {
            tblDisciplina.getColumnModel().getColumn(1).setMinWidth(400);
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
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(111, 111, 111)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel3)
                                .addGap(0, 46, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtCargaHoraria))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnGravar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnRemover)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnFiltrar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnLimpar))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGravar)
                    .addComponent(btnRemover)
                    .addComponent(btnFiltrar)
                    .addComponent(btnLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        // captura e tratamento de exceções
        try {

            // recupera informações do formulário
            int codigo = Integer.parseInt(txtCodigo.getText());
            String nome = txtNome.getText();
            int cargaHoraria = Integer.parseInt(txtCargaHoraria.getText());
            String conteudoProgramatico = txtConteudoProgramatico.getText();

            // verifica o modo de operação do formulário
            if ( this.linha == -1 ) {

                // cria um objeto da classe Disciplina
                Disciplina d = new Disciplina(
                    codigo, nome, cargaHoraria, conteudoProgramatico
                );
                // adiciona o objeto à coleção
                this.disciplinas.add(d);
            } else {
                // caso alguma linha da tabela tenha sido clicada
                this.disciplinas.get(this.linha).setCodigo(codigo);
                this.disciplinas.get(this.linha).setNome(nome);
                this.disciplinas.get(this.linha).setCargaHoraria(cargaHoraria);
                this.disciplinas.get(this.linha).setConteudoProgramatico(
                    conteudoProgramatico
                );
            }
            // preenche a tabela
            this.preenchaTabela();
            // limpa o formulário
            this.limpeFormulario();
            
            
        } catch(Exception ex) {
            
        }
    }//GEN-LAST:event_btnGravarActionPerformed

    private void tblDisciplinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDisciplinaMouseClicked
        // determina a linha na qual o usuário clicou
        this.linha = tblDisciplina.rowAtPoint(evt.getPoint());
        // carrega informações do objeto clicado para o formulário
        txtCodigo.setText(
            Integer.toString(
                this.disciplinas.get(this.linha).getCodigo()
            )
        );

        txtNome.setText(this.disciplinas.get(this.linha).getNome());

        txtCargaHoraria.setText(
            Integer.toString(
                this.disciplinas.get(this.linha).getCargaHoraria()
            )
        );

        txtConteudoProgramatico.setText(
            this.disciplinas.get(this.linha).getConteudoProgramatico()
        );

        // efetua o controle do botão remover
        this.controleBotoes();
    }//GEN-LAST:event_tblDisciplinaMouseClicked

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        // pergunta ao usuário se ele realmmente deseja remover o registro
        if (
            JOptionPane.showConfirmDialog(
                this, "Deseja realmente remover o registro?", "Confirmação",
                JOptionPane.YES_NO_OPTION
            ) == JOptionPane.YES_OPTION
        ) {
            // remove um objeto de disciplina da coleção de objetos
            this.disciplinas.remove(this.linha);
            // atualiza a tabela de disciplinas
            this.preenchaTabela();
            // limpa o formulário e retorna para o modo de operação padrão
            this.limpeFormulario();
            // efetua o controle de botões
            this.controleBotoes();
            // exibe uma mensagem ao usuário
            JOptionPane.showMessageDialog(this, "Disciplina removida.");
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        // valida se existem itens para serem filtrados
        if (this.disciplinas.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Não há itens para filtrar.");
            return;
        }

        // valida se existe um termo para a busca
        if (txtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Informe um nome para filtrar.");
            return;
        }

        // recupera o objeto da tabela
        DefaultTableModel model = (DefaultTableModel) tblDisciplina.getModel();

        // limpa a tabela
        model.setRowCount(0);

        // percorre o arraylist de disciplinas
        for ( int cont = 0 ; cont < this.disciplinas.size() ; cont++ ) {
            // verifica se o termo de busca corresponde
            if ( this.disciplinas.get(cont).getNome().contains(txtNome.getText()) ) {
                // adiciona a linha na tabela
                model.addRow(new String[]{
                    Integer.toString(this.disciplinas.get(cont).getCodigo()),
                    this.disciplinas.get(cont).getNome(),
                    Integer.toString(this.disciplinas.get(cont).getCargaHoraria())
                });
            }
        }
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // limpa o formulário
        this.limpeFormulario();
        // preenche a tabela
        this.preenchaTabela();
        // efetua o controle de botões
        this.controleBotoes();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void controleBotoes() {
        // se o formulário estiver em modo de inserção
        if ( this.linha == -1 ) {
            btnRemover.setEnabled(false);
        } else {
            btnRemover.setEnabled(true);
        }
    }

    private void preenchaTabela() {
        // recupera o objeto da tabela
        DefaultTableModel model = (DefaultTableModel) tblDisciplina.getModel();

        // limpa as linhas da tabela
        model.setRowCount(0);

        // percorre cada objeto na coleção de objetos
        for ( int cont = 0; cont < this.disciplinas.size(); cont++ ) {
            // inclui uma linha na tabela
            model.addRow(new String[]{
                Integer.toString(this.disciplinas.get(cont).getCodigo()),
                this.disciplinas.get(cont).getNome(),
                Integer.toString(this.disciplinas.get(cont).getCargaHoraria())
            });
        }
    }

    private void limpeFormulario() {
        // retorna o formulário para o modo de inserção
        this.linha = -1;
        // limpa os campos do formulário
        txtCodigo.setText("");
        txtNome.setText("");
        txtCargaHoraria.setText("");
        txtConteudoProgramatico.setText("");
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
            java.util.logging.Logger.getLogger(JFDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFDisciplina().setVisible(true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDisciplina;
    private javax.swing.JFormattedTextField txtCargaHoraria;
    private javax.swing.JFormattedTextField txtCodigo;
    private javax.swing.JTextArea txtConteudoProgramatico;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
