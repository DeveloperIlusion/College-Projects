package dao;

import bean.ItemPedido;
import bean.Lanche;
import bean.Pedido;
import configs.Conexao;
import configs.PedidoTransaction;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ItemPedidoDAO {

    public ArrayList liste(int pedidoId) {

        ArrayList<ItemPedido> itens = new ArrayList<>();

        try {
            Conexao c = new Conexao();

            String sql = "select * from v_item_pedido where pedido_id = ?";

            PreparedStatement st = c.conexao.prepareStatement(sql);

            st.setInt(1, pedidoId);

            st.executeQuery();

            ResultSet rs = st.getResultSet();

            while (rs.next()) {
                ItemPedido item = new ItemPedido(
                    rs.getInt(1),
                    rs.getInt(2),
                    rs.getString(3),
                    rs.getInt(4),
                    rs.getFloat(5),
                    rs.getFloat(6)
                );

                itens.add(item);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(
                null, "Ocorreu uma falha ao listar os registros, entre em contato com o suporte técnico."
            );
        }

        return itens;
    }

    public PedidoTransaction grave( Pedido pedido ) {

        PedidoTransaction transaction = new PedidoTransaction();

        try {

            Conexao c = new Conexao();

            String sql = "call p_salve_pedido(?, ?, ?, ?)";

            PreparedStatement st = c.conexao.prepareStatement(sql);

            st.setInt(1, pedido.getPedidoId());
            st.setInt(2, pedido.getClienteId());
            st.setInt(3, pedido.getLancheId());
            st.setInt(4, pedido.getQuantidade());

            st.executeUpdate();
            System.out.println(st.toString());

            ResultSet rs = st.getResultSet();
            rs.next();

            transaction.setPedidoId(rs.getInt(1));
            transaction.setMsg(rs.getString(3));

            st.close();
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(
                null, "Ocorreu um erro ao gravar o registro, entre em contato com o suporte técnico."
            );
        }

        return transaction;
    }

    public String remova ( int itemPedidoId ) {

        String msg = "";

        try  {
            Conexao c = new Conexao();

            String sql = "call p_delete_item_pedido(?)";

            PreparedStatement st = c.conexao.prepareStatement(sql);

            st.setInt(1, itemPedidoId);

            st.executeUpdate();

            ResultSet rs = st.getResultSet();
            rs.next();

            msg = rs.getString(3);

            st.close();
            
        } catch ( ClassNotFoundException | SQLException ex ) {
            JOptionPane.showMessageDialog(
                null, "Ocorreu um erro ao remover o registro, entre em contato com o suporte técnico."
            );
        }

        return msg;
    }
}