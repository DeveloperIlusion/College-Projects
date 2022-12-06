package interfaceGrafica;

import bean.Aluno;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JFAluno extends javax.swing.JFrame {

    // cria uma coleção de objetos de aluno vazia
    ArrayList<Aluno> alunos = new ArrayList<>();

    // variável global de definição do modo de operação do formulário
    private int linha = -1;

    public JFAluno() {
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
        txtMatricula = new javax.swing.JFormattedTextField();
        txtNome = new javax.swing.JTextField();
        txtDataNascimento = new javax.swing.JFormattedTextField();
        txtCPF = new javax.swing.JFormattedTextField();
        txtRG = new javax.swing.JFormattedTextField();
        btnGravar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnFiltrar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAluno = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestão de alunos");

        jLabel1.setText("Matrícula");

        jLabel2.setText("Nome");

        jLabel3.setText("Data de nasc.");

        jLabel4.setText("CPF");

        jLabel5.setText("RG");

        try {
            txtDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

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

        tblAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matrícula", "Nome", "Data de nasc."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAlunoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAluno);
        if (tblAluno.getColumnModel().getColumnCount() > 0) {
            tblAluno.getColumnModel().getColumn(1).setMinWidth(350);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(57, 57, 57)
                                .addComponent(jLabel2)
                                .addGap(228, 228, 228)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(93, 93, 93)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGravar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFiltrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpar))
                    .addComponent(jScrollPane1))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGravar)
                    .addComponent(btnRemover)
                    .addComponent(btnFiltrar)
                    .addComponent(btnLimpar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed

        try {
            // recupera as informações do formulário
            int matricula = Integer.parseInt(txtMatricula.getText());
            String nome = txtNome.getText();
            // cria um objeto para formatação da data
            DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            Date dataNascimento = format.parse( txtDataNascimento.getText() );
            String cpf = txtCPF.getText();
            String rg = txtRG.getText();

            // verifica o modo de operação do formulário
            if (this.linha == -1) {

                // cria um objeto de aluno
                Aluno a = new Aluno(matricula, nome, dataNascimento, cpf, rg);
                // adiciona o objeto à coleção
                this.alunos.add(a);
            } else {
                // acessa o objeto e determina um novo valor para matrícula
                this.alunos.get(this.linha).setMatricula(matricula);
                // acessa o objeto e determina um novo valor para nome
                this.alunos.get(this.linha).setNome(nome);
                // acessa o objeto e determina um novo valor para data de nascimento
                this.alunos.get(this.linha).setDataNascimento(dataNascimento);
                // acessa o objeto e determina um novo valor para CPF
                this.alunos.get(this.linha).setCpf(cpf);
                // acessa o objeto e determina um novo valor para RG
                this.alunos.get(this.linha).setRg(rg);
            }

            // preenche a tabela
            this.preenchaTabela();

            // limpa o formulário
            this.limpeFormulario();

            // efetua o controle de botões
            this.controleBotoes();

        } catch (Exception ex) {
            
        }
        
    }//GEN-LAST:event_btnGravarActionPerformed

    private void tblAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAlunoMouseClicked

        // determina qual linha da tabela foi clicada
        this.linha = tblAluno.rowAtPoint(evt.getPoint());

        // objeto para a formatação de data
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        txtMatricula.setText(
            Integer.toString( this.alunos.get(this.linha).getMatricula() ) 
        );
        
        txtNome.setText( this.alunos.get(this.linha).getNome() );
        
        txtDataNascimento.setText(
            format.format( this.alunos.get(this.linha).getDataNascimento() )
        );

        txtCPF.setText( this.alunos.get(this.linha).getCpf() );
        txtRG.setText( this.alunos.get(this.linha).getRg() );

        // invoca o método que efetua o controle de botões
        this.controleBotoes();
    }//GEN-LAST:event_tblAlunoMouseClicked

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        // pergunta ao usuário se ele realmente deseja remover o objeto
        if (
            JOptionPane.showConfirmDialog(
                this, "Deseja realmente remover o registro?", "Confirmação",
                JOptionPane.YES_NO_OPTION
            ) == JOptionPane.YES_OPTION
        ) {
            // remove um objeto da coleção
            this.alunos.remove(this.linha);
            // atualiza a tabela
            this.preenchaTabela();
            // limpa o formulário
            this.limpeFormulario();
            // efetua o controle de botões
            this.controleBotoes();
            // mostra uma mensagem ao usuário
            JOptionPane.showMessageDialog(this, "Aluno removido.");
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        // valida se existem itens para serem filtrados
        if (this.alunos.size() == 0) {
            JOptionPane.showMessageDialog(this, "Não há itens para filtrar.");
            return;
        }

        // valida o campo nome para busca
        if (txtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Informe um nome para filtrar.");
            return;
        }

        // recupera o objeto da tabela
        DefaultTableModel model = (DefaultTableModel) tblAluno.getModel();

        // limpa a tabela
        model.setRowCount(0);

        // cria um objeto para formatar a data de nascimento
        DateFormat mascara = new SimpleDateFormat("dd/MM/yyyy");

        // percorre a coleção de objetos
        for (int cont = 0; cont < this.alunos.size(); cont++) {
            // verifica se o nome do aluno no objeto atual contém o termo do filtro
            if (this.alunos.get(cont).getNome().contains(txtNome.getText())) {
                // adiciona um item na tabela
                model.addRow(new String[]{
                    Integer.toString(this.alunos.get(cont).getMatricula()),
                    this.alunos.get(cont).getNome(),
                    mascara.format(this.alunos.get(cont).getDataNascimento())
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
        // caso o formulário esteja em modo de inserção
        if (this.linha == -1) {
            btnRemover.setEnabled(false);
        } else {
            btnRemover.setEnabled(true);
        }
    }
    
    private void limpeFormulario() {
        txtMatricula.setText("");
        txtNome.setText("");
        txtDataNascimento.setText("");
        txtCPF.setText("");
        txtRG.setText("");
        this.linha = -1;
    }

    private void preenchaTabela() {

        // recupera o objeto da tabela
        DefaultTableModel model = (DefaultTableModel) tblAluno.getModel();

        // limpa a tabela
        model.setRowCount(0);

        // cria um objeto para formatar a data de nascimento
        DateFormat mascara = new SimpleDateFormat("dd/MM/yyyy");

        // percorre todos os itens da coleção de objetos
        for (int cont = 0; cont < this.alunos.size(); cont++) {
            // incluir uma linha na tabela
            model.addRow(new String[]{
                Integer.toString(this.alunos.get(cont).getMatricula()),
                this.alunos.get(cont).getNome(),
                mascara.format(this.alunos.get(cont).getDataNascimento())
            });
        }
    }
    
    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(JFAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFAluno().setVisible(true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAluno;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JFormattedTextField txtDataNascimento;
    private javax.swing.JFormattedTextField txtMatricula;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtRG;
    // End of variables declaration//GEN-END:variables
}
