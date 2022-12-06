package interfaceGrafica;

import bean.Colaborador;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JFColaborador extends javax.swing.JFrame {

    // declara coleção de objetos da classe Colaborador
    ArrayList<Colaborador> colaboradores = new ArrayList<>();

    /* declara linha, para definir modo de operação do formulário e a valor da
     linha selecionada na tabela */
    private int linha = -1;

    public JFColaborador() {
        initComponents();
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
        txtNome = new javax.swing.JTextField();
        txtCPF = new javax.swing.JFormattedTextField();
        txtDataNascimento = new javax.swing.JFormattedTextField();
        txtCTPS = new javax.swing.JFormattedTextField();
        txtFuncao = new javax.swing.JTextField();
        txtHorasDedicacao = new javax.swing.JFormattedTextField();
        btnGravar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnFiltrar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblColaborador = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestão de colaboradores");

        jLabel1.setText("Nome");

        jLabel2.setText("CPF");

        jLabel3.setText("Data Nasc.");

        jLabel4.setText("CTPS");

        jLabel5.setText("Função");

        jLabel6.setText("Horas");

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtCTPS.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        txtHorasDedicacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

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

        tblColaborador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CTPS", "Função", "Horas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblColaborador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblColaboradorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblColaborador);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtCTPS, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtFuncao))
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(164, 164, 164)
                                .addComponent(jLabel5)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtHorasDedicacao)
                                        .addComponent(txtCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGravar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRemover)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFiltrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 24, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCTPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHorasDedicacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGravar)
                    .addComponent(btnRemover)
                    .addComponent(btnFiltrar)
                    .addComponent(btnLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed

        try {

            // recupera as informaçõe do formulário
            String nome = txtNome.getText();
            String cpf = txtCPF.getText();
            // objeto para manipulação de data
            DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            Date dataNascimento = format.parse( txtDataNascimento.getText() );
            int ctps = Integer.parseInt( txtCTPS.getText() );
            String funcao = txtFuncao.getText();
            int horasDedicacao = Integer.parseInt( txtHorasDedicacao.getText() );

            // caso o formulário esteja em modo de inserção
            if ( this.linha == -1) {
                // cria um objeto de Colaborador
                Colaborador c = new Colaborador(
                    nome, cpf, dataNascimento, ctps, funcao, horasDedicacao
                );
                // adiciona o objeto na coleção
                this.colaboradores.add(c);
            } else {
                this.colaboradores.get( this.linha ).setNome(nome);
                this.colaboradores.get( this.linha ).setCpf(cpf);
                this.colaboradores.get( this.linha ).setDataNascimento(dataNascimento);
                this.colaboradores.get( this.linha ).setCtps(ctps);
                this.colaboradores.get( this.linha ).setFuncao(funcao);
                this.colaboradores.get( this.linha ).setHorasDedicacao(horasDedicacao);
            }

            // preenche a tabela
            this.preenchaTabela();

            // limpa o formulário
            this.limpeFormulario();

            // controle de botões
            this.controleBotoes();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao registrar colaborador.");
        }
    }//GEN-LAST:event_btnGravarActionPerformed

    private void tblColaboradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblColaboradorMouseClicked
        // determina o número da linha clicada
        this.linha = tblColaborador.rowAtPoint( evt.getPoint() );

        // determina o input de nome do colaborador
        txtNome.setText(this.colaboradores.get(this.linha).getNome());
        txtCPF.setText(this.colaboradores.get(this.linha).getCpf());

        // objeto para formataçao de data
        DateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        txtDataNascimento.setText(
            data.format( this.colaboradores.get(this.linha).getDataNascimento() )
        );

        txtCTPS.setText(
            Integer.toString(this.colaboradores.get(this.linha).getCtps())
        );
        txtFuncao.setText(this.colaboradores.get(this.linha).getFuncao());
        txtHorasDedicacao.setText(
            Integer.toString(this.colaboradores.get(this.linha).getHorasDedicacao())
        );

        // invoca o método para habilitar o botão remover
        this.controleBotoes();
    }//GEN-LAST:event_tblColaboradorMouseClicked

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        // pergunta ao usuário se ele realmente deseja remover o registro
        if (
            JOptionPane.showConfirmDialog(
                this, "Deseja realmente remover o registro?", "Confirmação",
                JOptionPane.YES_NO_OPTION
            ) == JOptionPane.YES_OPTION
        ) {
            // remove o objeto selecionado da tabela
            this.colaboradores.remove(this.linha);
            // atualiza a tabela
            this.preenchaTabela();
            // limpa o formulário
            this.limpeFormulario();
            // faz o controle de botões
            this.controleBotoes();
            // exibe uma mensagem ao usuário
            JOptionPane.showMessageDialog(this, "Colaborador removido.");
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        // valida se existem itens para serem filtrados
        if (this.colaboradores.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Não há itens para filtrar.");
            return;
        }

        // valida o campo nome para busca
        if (txtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe um nome para filtrar.");
            return;
        }

        // recupera o objeto da tabela
        DefaultTableModel model = (DefaultTableModel) tblColaborador.getModel();

        // limpa a tabela
        model.setRowCount(0);

        // percorre todos os itens do arraylist
        for (int cont = 0; cont < this.colaboradores.size(); cont++) {
            // verifica se o nome do colaborador do objeto atual contém o termo de busca
            if ( this.colaboradores.get(cont).getNome().contains( txtNome.getText() ) ) {
                // adiciona uma linha na tabela
                model.addRow(new String[] {
                    this.colaboradores.get(cont).getNome(),
                    Integer.toString( this.colaboradores.get(cont).getCtps() ),
                    this.colaboradores.get(cont).getFuncao(),
                    Integer.toString( this.colaboradores.get(cont).getHorasDedicacao() )
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
        if (this.linha == -1) {
            btnRemover.setEnabled(false);
        } else {
            btnRemover.setEnabled(true);
        }
    }

    private void limpeFormulario() {
        this.linha = -1;
        txtNome.setText("");
        txtCPF.setText("");
        txtDataNascimento.setText("");
        txtCTPS.setText("");
        txtFuncao.setText("");
        txtHorasDedicacao.setText("");
    }

    private void preenchaTabela() {
        // recupera o objeto da tabela "visual"
        DefaultTableModel model = (DefaultTableModel) tblColaborador.getModel();

        // limpa as linhas da tabela
        model.setRowCount(0);

        // percorre cada objeto do arraylist
        for (int cont = 0; cont < this.colaboradores.size(); cont++) {
            // adiciona uma linha na tabela
            model.addRow(new String[]{
                this.colaboradores.get(cont).getNome(),
                Integer.toString( this.colaboradores.get(cont).getCtps() ),
                this.colaboradores.get(cont).getFuncao(),
                Integer.toString( this.colaboradores.get(cont).getHorasDedicacao() )
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
            java.util.logging.Logger.getLogger(JFColaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFColaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFColaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFColaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFColaborador().setVisible(true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblColaborador;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JFormattedTextField txtCTPS;
    private javax.swing.JFormattedTextField txtDataNascimento;
    private javax.swing.JTextField txtFuncao;
    private javax.swing.JFormattedTextField txtHorasDedicacao;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
