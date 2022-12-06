package forms;

import bean.Cliente;
import dao.ClienteDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JFCliente extends javax.swing.JFrame {
    
    ArrayList<Cliente> clientes = new ArrayList<>();

    int linha = -1;

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

        for (Cliente cliente : this.clientes) {
            model.addRow( new String[]{
                cliente.getNome(),
                cliente.getTelefone(),
                cliente.getEmail()
            });
        }
    }
    
        private void limpeFormulario() {
        this.linha = -1;
        txtNome.setText("");
        txtTelefone.setText("");
        txtEmail.setText("");
    }

    private void controleBotoes() {
        if (this.linha == -1) {
            btnRemover.setEnabled(false);
            btnLimpar.setEnabled(false);
        } else {
            btnRemover.setEnabled(true);
            btnLimpar.setEnabled(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        btnGravar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtTelefone = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tabela de clientes");

        jLabel1.setText("Nome");

        jLabel2.setText("Email");

        jLabel3.setText("Telefone");

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Telefone", "Email"
            }
        ));
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCliente);
        if (tblCliente.getColumnModel().getColumnCount() > 0) {
            tblCliente.getColumnModel().getColumn(0).setMinWidth(300);
            tblCliente.getColumnModel().getColumn(2).setMinWidth(200);
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

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtEmail)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNome)
                        .addGap(18, 18, 18)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(107, 107, 107))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGravar)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemover)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGravar)
                    .addComponent(btnRemover)
                    .addComponent(btnLimpar)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        int id = -1;

        if ( this.linha != -1 ) {
            id = this.clientes.get( this.linha ).getClienteId();
        }

        // cria um objeto da classe Lanche
        Cliente cliente = new Cliente(
            id,
            txtNome.getText(),
            txtTelefone.getText(),
            txtEmail.getText()
        );

        ClienteDAO dao = new ClienteDAO();

        String msg = dao.grave(cliente);

        this.preenchaTabela();

        this.limpeFormulario();

        this.controleBotoes();

        JOptionPane.showMessageDialog(null, msg);
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        if (
            JOptionPane.showConfirmDialog(
                null, "Deseja realmente remover o registro?", "Confirmação", 
                JOptionPane.YES_NO_OPTION
            ) == JOptionPane.YES_OPTION
        ) {
            ClienteDAO dao = new ClienteDAO();

            String msg = dao.remova( this.clientes.get( this.linha ).getClienteId() );

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

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        ClienteDAO dao = new ClienteDAO();

        this.clientes = dao.pesquise( txtNome.getText() );

        DefaultTableModel model = (DefaultTableModel) tblCliente.getModel();

        model.setRowCount(0);

        for (Cliente cliente : this.clientes) {
            model.addRow( new String[]{
                cliente.getNome(), cliente.getTelefone(),cliente.getEmail()
            });
        }
        
        btnLimpar.setEnabled(true);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMouseClicked
         this.linha = tblCliente.rowAtPoint(evt.getPoint());

        txtNome.setText( this.clientes.get( this.linha ).getNome() );
        
        txtTelefone.setText( this.clientes.get( this.linha ).getTelefone() );
        
        txtEmail.setText( this.clientes.get( this.linha ).getEmail() );

        this.controleBotoes();
    }//GEN-LAST:event_tblClienteMouseClicked


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCliente().setVisible(true);
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
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
