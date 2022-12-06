package forms;
import bean.Cliente;
import dao.ClienteDAO;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JFCliente extends javax.swing.JFrame {

    ArrayList<Cliente> clientes = new ArrayList<>();
    
    private int linha = -1;

    public JFCliente() {

        initComponents();

        setLocationRelativeTo(null);

        this.preenchaTabela();
    }

    private void preenchaTabela() {

        DefaultTableModel model = (DefaultTableModel) tblCliente.getModel();

        model.setRowCount(0);

        ClienteDAO dao = new ClienteDAO();

        this.clientes = dao.liste();

        for (Cliente l : this.clientes) {

            model.addRow(new String[]{
                l.getNome(), l.getTelefone(), l.getLogradouro(), l.getBairro(), Integer.toString(l.getNumero())
            });
        }
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
        txtNome = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtDataNascimento = new javax.swing.JFormattedTextField();
        txtLogradouro = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtComplemento = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtReferencia = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        btnGravar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnFiltrar = new javax.swing.JButton();
        txtNumero = new javax.swing.JFormattedTextField();
        bntRelatorioClientesMaisRelevantes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulário de Cliente");

        jLabel1.setText("Nome");

        jLabel2.setText("Telefone");

        jLabel3.setText("Data de Nascimento");

        jLabel4.setText("Logradouro");

        jLabel5.setText("Número");

        jLabel6.setText("Bairro");

        jLabel7.setText("Complemento");

        jLabel8.setText("Referência");

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtReferencia.setColumns(20);
        txtReferencia.setRows(5);
        jScrollPane1.setViewportView(txtReferencia);

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Telefone", "Logradouro", "Bairro", "Número"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCliente);

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

        btnFiltrar.setText("Filtrar");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        bntRelatorioClientesMaisRelevantes.setText("Relatório de clientes mais relevantes");
        bntRelatorioClientesMaisRelevantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntRelatorioClientesMaisRelevantesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGravar, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRemover, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFiltrar, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bntRelatorioClientesMaisRelevantes)
                        .addGap(62, 62, 62))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(568, 568, 568))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNome)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(78, 78, 78)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtTelefone)
                                .addGap(18, 18, 18)
                                .addComponent(txtDataNascimento))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtLogradouro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(29, 29, 29))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(107, 107, 107)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(67, 67, 67)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(62, 62, 62))
                            .addComponent(txtComplemento)))
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGravar)
                    .addComponent(btnRemover)
                    .addComponent(btnLimpar)
                    .addComponent(btnFiltrar)
                    .addComponent(bntRelatorioClientesMaisRelevantes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        try {
            int id = -1;
            
            if (this.linha != -1) {
                id = this.clientes.get( this.linha ).getClienteId();
            }
            
            DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            
            String telefone = txtTelefone.getText()
                .replace("(", "")
                .replace(") ","")
                .replace("-","");
            
            Cliente cliente = new Cliente(
                id,
                txtNome.getText(),
                telefone,
                format.parse(txtDataNascimento.getText()),
                id,
                txtLogradouro.getText(),
                txtBairro.getText(),
                Integer.parseInt(txtNumero.getText()),
                txtComplemento.getText(),
                txtReferencia.getText()
            );
            
            ClienteDAO dao = new ClienteDAO();
            
            String msg = dao.grave(cliente);
            
            this.preenchaTabela();
            
            this.limpeFormulario();
            
            this.controleBotoes();
            
            JOptionPane.showMessageDialog(null, msg);
        } catch (ParseException ex) {
            Logger.getLogger(JFCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        if (
            JOptionPane.showConfirmDialog(null, "Deseja realmente remover o registro?",
            "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION 
        ) {
            if ("1234".equals(JOptionPane.showInputDialog("Informe a senha de confirmação"))) {
                
                ClienteDAO dao = new ClienteDAO();
                
                String msg = dao.remova( this.clientes.get( this.linha ).getClienteId() );

                this.preenchaTabela();

                this.limpeFormulario();

                this.controleBotoes();

                JOptionPane.showMessageDialog(null, msg);
            } else {
                JOptionPane.showMessageDialog(null, "Senha incorreta.");
            }
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        this.limpeFormulario();
        this.controleBotoes();
        this.preenchaTabela();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        
        ClienteDAO dao = new ClienteDAO();
        
        this.clientes = dao.pesquise( txtNome.getText() );
        
        DefaultTableModel model = (DefaultTableModel) tblCliente.getModel();
        
        model.setRowCount(0);
        
        for (Cliente cliente : this.clientes) {
            
            model.addRow( new String[]{
                cliente.getNome(), cliente.getTelefone(),
                cliente.getLogradouro(), cliente.getBairro(), Integer.toString(cliente.getNumero())
            });
        }
        
        btnLimpar.setEnabled(true);
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMouseClicked
        this.linha = tblCliente.rowAtPoint( evt.getPoint() );

        txtNome.setText( this.clientes.get( this.linha ).getNome() );

        txtTelefone.setText( this.clientes.get( this.linha ).getTelefone() );
        
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        txtDataNascimento.setText( format.format(this.clientes.get( this.linha ).getDataNascimento() ));
        
        txtLogradouro.setText( this.clientes.get( this.linha ).getLogradouro() );
        
        txtBairro.setText( this.clientes.get( this.linha ).getBairro() );
        
        txtNumero.setText( Integer.toString(this.clientes.get( this.linha ).getNumero() ));
        
        txtComplemento.setText( this.clientes.get( this.linha ).getComplemento() );
        
        txtReferencia.setText( this.clientes.get( this.linha ).getReferencia() );
        
        this.controleBotoes();
    }//GEN-LAST:event_tblClienteMouseClicked

    private void bntRelatorioClientesMaisRelevantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntRelatorioClientesMaisRelevantesActionPerformed
        JFRelatorioClientes relatorio = new JFRelatorioClientes();
        relatorio.setVisible(true);
    }//GEN-LAST:event_bntRelatorioClientesMaisRelevantesActionPerformed
    
    private void limpeFormulario() {
        this.linha = -1;
        txtNome.setText("");
        txtTelefone.setText("");
        txtDataNascimento.setText("");
        txtLogradouro.setText("");
        txtBairro.setText("");
        txtNumero.setText("");
        txtComplemento.setText("");
        txtReferencia.setText("");
    }

    private void controleBotoes() {
        btnRemover.setEnabled(this.linha != -1);
        btnLimpar.setEnabled(this.linha != -1);
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntRelatorioClientesMaisRelevantes;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JFormattedTextField txtDataNascimento;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtNumero;
    private javax.swing.JTextArea txtReferencia;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
