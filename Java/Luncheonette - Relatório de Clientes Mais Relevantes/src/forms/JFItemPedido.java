package forms;

import bean.Cliente;
import bean.ItemPedido;
import bean.Lanche;
import bean.Pedido;
import configs.PedidoTransaction;
import dao.ClienteDAO;
import dao.ItemPedidoDAO;
import dao.LancheDAO;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JFItemPedido extends javax.swing.JFrame {

    public JFPedido pedido = null;
    private int linha = -1;
    public int pedidoId = -1;
    public String status = "A";
    ArrayList<Cliente> clientes = new ArrayList<>();
    ArrayList<Lanche> lanches = new ArrayList<>();
    ArrayList<ItemPedido> itens = new ArrayList<>();

    public JFItemPedido() {
        initComponents();
        setLocationRelativeTo(null);

        this.preenchaComboBox();

        this.preenchaTabela();
        
        this.controleBotoesStatus();
    }

    public void preenchaComboBox() {
        
        ClienteDAO cDao = new ClienteDAO();
        this.clientes = cDao.liste();

        jcbCliente.removeAllItems();
        jcbCliente.addItem("");

        for (Iterator<Cliente> cliente = this.clientes.iterator(); cliente.hasNext();) {
            jcbCliente.addItem(cliente.next().getNome());
        }

        LancheDAO lDao = new LancheDAO();
        this.lanches = lDao.liste();

        jcbLanche.removeAllItems();
        jcbLanche.addItem("");

        for (Iterator<Lanche> lanche = this.lanches.iterator(); lanche.hasNext();) {
            jcbLanche.addItem(lanche.next().getNome());
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcbCliente = new javax.swing.JComboBox<>();
        jcbLanche = new javax.swing.JComboBox<>();
        txtQuantidade = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnGravar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItemPedido = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Cliente");

        jLabel2.setText("Lanche");

        jLabel3.setText("Quantidade");

        btnGravar.setText("Gravar");
        btnGravar.setEnabled(false);
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

        tblItemPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lanche", "Quantidade", "Unit.", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblItemPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblItemPedidoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblItemPedido);
        if (tblItemPedido.getColumnModel().getColumnCount() > 0) {
            tblItemPedido.getColumnModel().getColumn(0).setMinWidth(450);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbLanche, 0, 444, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGravar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemover)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbLanche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGravar)
                    .addComponent(btnRemover))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed

        ItemPedidoDAO dao = new ItemPedidoDAO();

        Pedido pedido = new Pedido(
            this.pedidoId,
            this.clientes.get( jcbCliente.getSelectedIndex()-1 ).getClienteId(),
            this.lanches.get( jcbLanche.getSelectedIndex()-1 ).getLancheId(),
            Integer.parseInt( txtQuantidade.getText() )
        );

        PedidoTransaction transaction = dao.grave(pedido);

        this.pedidoId = transaction.getPedidoId();

        JOptionPane.showMessageDialog(null, transaction.getMsg());

        this.preenchaTabela();
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        
        // confirma junto ao usuário se ele realmente deseja remover o lanche
        if (
            JOptionPane.showConfirmDialog(null, "Deseja realmente remover o registro?",
            "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION 
        ) {
            // cria um objeto da classe DAO
            ItemPedidoDAO dao = new ItemPedidoDAO();
            // remove o registro e recupera a mensagem do banco de dados
            String msg = dao.remova( this.itens.get( this.linha ).getItemPedidoId() );
            // preenche a tabela
            this.preenchaTabela();
            // limpa o formulário
            this.limpeFormulario();
            // desabilita os botões remover e limpar
            this.controleBotoesStatus();
            // exibe a mensagem retornada pela procedure
            JOptionPane.showMessageDialog(null, msg);
        }

    }//GEN-LAST:event_btnRemoverActionPerformed

    private void tblItemPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblItemPedidoMouseClicked
        
        // determina o número da linha clicada
        this.linha = tblItemPedido.rowAtPoint( evt.getPoint() );

        // preenche o formulário
        jcbCliente.setEnabled(false);
        jcbLanche.setSelectedItem(this.itens.get(this.linha).getLanche());
        txtQuantidade.setText(
            Integer.toString(this.itens.get(this.linha).getQuantidade()).replace(".", ",")
        );

        // habilita os botões remover e limpar
        this.controleBotoesStatus();
    }//GEN-LAST:event_tblItemPedidoMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (pedido != null) {
            pedido.preenchaTabela();
            pedido.linha = -1;
        }
    }//GEN-LAST:event_formWindowClosing

    public void controleBotoesStatus() {         
        btnGravar.setEnabled(this.status.equals("A"));
        btnRemover.setEnabled(this.linha != -1 && this.status.equals("A"));
    }
    
    private void limpeFormulario() {
        jcbCliente.setSelectedIndex(0);
        jcbLanche.setSelectedIndex(0);
        txtQuantidade.setText("1");
        this.linha = -1;
    }

    public void preenchaTabela() {

        // recupera a tabela (objeto)
        DefaultTableModel model = (DefaultTableModel) tblItemPedido.getModel();

        // limpa a tabela
        model.setRowCount(0);

        ItemPedidoDAO dao = new ItemPedidoDAO();

        // preenche a coleção de objetos
        if (this.pedidoId != -1){
            this.itens = dao.liste(this.pedidoId);        

        // percorre todos os objetos da classe
        for (ItemPedido i : this.itens) {

            // adiciona uma linha na tabela
            model.addRow(new String[]{
                i.getLanche(),
                Integer.toString(i.getQuantidade()), 
                Float.toString( i.getValorUnitario()), 
                Float.toString(i.getSubtotal())
            });
        }
        }
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
            java.util.logging.Logger.getLogger(JFItemPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFItemPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFItemPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFItemPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFItemPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbCliente;
    private javax.swing.JComboBox<String> jcbLanche;
    private javax.swing.JTable tblItemPedido;
    private javax.swing.JFormattedTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
