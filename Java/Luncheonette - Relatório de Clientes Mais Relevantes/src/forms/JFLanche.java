package forms;

import bean.Lanche;
import dao.LancheDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JFLanche extends javax.swing.JFrame {

    // declara uma coleção de objetos (vazia) da classe lanche
    ArrayList<Lanche> lanches = new ArrayList<>();

    // determina o modo de operação do formulário
    private int linha = -1;

    public JFLanche() {

        // inicializa os componentes visuais do formulário
        initComponents();

        // centraliza o formulário na tela
        setLocationRelativeTo(null);

        // preenche a tabela
        this.preenchaTabela();
    }

    private void preenchaTabela() {

        // recupera a tabela (objeto)
        DefaultTableModel model = (DefaultTableModel) tblLanche.getModel();

        // limpa a tabela
        model.setRowCount(0);

        // cria um objeto da classe DAO (Data Access Object)
        LancheDAO dao = new LancheDAO();

        // preenche a coleção de objetos de lanches
        this.lanches = dao.liste();

        // percorre todos os objetos da classe lanche
        for (Lanche l : this.lanches) {

            // adiciona uma linha na tabela
            model.addRow(new String[]{
                l.getNome(), Float.toString(l.getPrecoVenda()).replace(".", ",")
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
        txtPrecoVenda = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        btnGravar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLanche = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestão de Lanches");

        jLabel1.setText("Nome");

        jLabel2.setText("Preço venda");

        jLabel3.setText("Descrição");

        txtPrecoVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

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
                "Nome", "Preço venda"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLanche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLancheMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblLanche);
        if (tblLanche.getColumnModel().getColumnCount() > 0) {
            tblLanche.getColumnModel().getColumn(0).setMinWidth(500);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(118, 118, 118))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrecoVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)))
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGravar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGravar)
                    .addComponent(btnRemover)
                    .addComponent(btnLimpar)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed

        // valor da chave primária da tabela lanche
        int id = -1;

        // determina o valor da chave primária por meio do indice da linha
        if (this.linha != -1) {
            id = this.lanches.get( this.linha ).getLancheId();
        }

        // cria um objeto da classe lanche
        Lanche lanche = new Lanche(
            id,
            txtNome.getText(),
            Float.parseFloat( txtPrecoVenda.getText().replace(",", ".") ),
            txtDescricao.getText()
        );

        // cria um objeto da classe dao
        LancheDAO dao = new LancheDAO();

        // registra o lanche no banco de dados e recupera a mensagem
        String msg = dao.grave(lanche);

        // atualiza a tabela de lanches
        this.preenchaTabela();
        
        // limpa o formulário
        this.limpeFormulario();

        // faz o controle dos botões
        this.controleBotoes();

        // exibe a mensagem retornada do banco de dados
        JOptionPane.showMessageDialog(null, msg);
    }//GEN-LAST:event_btnGravarActionPerformed

    private void tblLancheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLancheMouseClicked

        // determina o número da linha clicada
        this.linha = tblLanche.rowAtPoint( evt.getPoint() );

        // preenche o formulário
        txtNome.setText( this.lanches.get( this.linha ).getNome() );
        txtPrecoVenda.setText( 
            Float.toString( this.lanches.get( this.linha ).getPrecoVenda() ).replace(".", ",")
        );
        txtDescricao.setText( this.lanches.get( this.linha ).getDescricao() );

        // habilita os botões remover e limpar
        this.controleBotoes();
    }//GEN-LAST:event_tblLancheMouseClicked

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed

        // confirma junto ao usuário se ele realmente deseja remover o lanche
        if (
            JOptionPane.showConfirmDialog(null, "Deseja realmente remover o registro?",
            "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION 
        ) {
            // solicita uma senha ao usuário
            if ("1234".equals(JOptionPane.showInputDialog("Informe a senha de confirmação"))) {
                // cria um objeto da classe DAO
                LancheDAO dao = new LancheDAO();
                // remove o registro e recupera a mensagem do banco de dados
                String msg = dao.remova( this.lanches.get( this.linha ).getLancheId() );
                // preenche a tabela
                this.preenchaTabela();
                // limpa o formulário
                this.limpeFormulario();
                // desabilita os botões remover e limpar
                this.controleBotoes();
                // exibe a mensagem retornada pela procedure
                JOptionPane.showMessageDialog(null, msg);
            } else {
                JOptionPane.showMessageDialog(null, "Senha incorreta.");
            }
        }

    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        this.limpeFormulario();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        // cria um objeto da classe dao
        LancheDAO dao = new LancheDAO();

        // atribui ao ArrayList de lanches o resultado da busca
        this.lanches = dao.pesquise( txtNome.getText() );

        // recupera o objeto JTable
        DefaultTableModel model = (DefaultTableModel) tblLanche.getModel();

        // limpa a tabela
        model.setRowCount(0);

        // percorre todos os objetos da classe lanche
        for (Lanche l : this.lanches) {

            // adiciona uma linha na tabela
            model.addRow(new String[]{
                l.getNome(), Float.toString(l.getPrecoVenda()).replace(".", ",")
            });
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void limpeFormulario() {
        this.linha = -1;
        txtNome.setText("");
        txtPrecoVenda.setText("");
        txtDescricao.setText("");
    }

    private void controleBotoes() {
        btnRemover.setEnabled(this.linha != -1);
        btnLimpar.setEnabled(this.linha != -1);
    }

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
    private javax.swing.JFormattedTextField txtPrecoVenda;
    // End of variables declaration//GEN-END:variables
}
