package dao;

import bean.ItemPedido;
import bean.Pedido;
import configs.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PedidoDAO {

    
    public ArrayList liste() {

        ArrayList<Pedido> pedidos = new ArrayList<>();

        try {
            Conexao c = new Conexao();

            String sql = "select * from v_pedido";

            PreparedStatement st = c.conexao.prepareStatement(sql);

            st.executeQuery();

            ResultSet rs = st.getResultSet();

            while (rs.next()) {
                Pedido pedido = new Pedido(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getFloat(3),
                    rs.getString(4)
                );

                pedidos.add(pedido);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(
                null, "Ocorreu uma falha ao listar os registros, entre em contato com o suporte técnico."
            );
        }

        return pedidos;
    }
    
    public String finalizar( Pedido pedido ) {

        String msg = "";

        try {

            Conexao c = new Conexao();

            String sql = "call p_quite_pedido(?, ?)";

            PreparedStatement st = c.conexao.prepareStatement(sql);

            st.setInt(1, pedido.getPedidoId());
            st.setString(2, "F");            

            st.executeUpdate();

            ResultSet rs = st.getResultSet();
            rs.next();

            msg = rs.getString(3);

            st.close();
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(
                null, "Ocorreu um erro ao gravar o registro, entre em contato com o suporte técnico."
            );
        }

        return msg;
    }
}
