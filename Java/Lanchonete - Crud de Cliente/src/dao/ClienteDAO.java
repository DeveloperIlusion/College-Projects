package dao;

import bean.Cliente;
import configs.Conexao;
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class ClienteDAO {
    
    public ArrayList liste() {

        ArrayList<Cliente> clientes = new ArrayList<>();

        try {

            Conexao c = new Conexao();

            Statement st = c.conexao.createStatement();

            ResultSet rs = st.executeQuery("select * from cliente order by nome");

            while (rs.next()) {
                Cliente cliente = new Cliente(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4)
                );
                clientes.add(cliente);
            }

        } catch ( ClassNotFoundException | SQLException ex ) {
            JOptionPane.showMessageDialog(
                null, "Ocorreu um erro ao listar os clientes, entre em contato com o suporte técnico."
            );
        }

        return clientes;
    }

    public String grave( Cliente cliente ) {

        String msg = "";

        try {
            Conexao c = new Conexao();

            String sql = "call p_salve_cliente(?, ?, ?, ?)";

            PreparedStatement st = c.conexao.prepareStatement(sql);

            st.setInt(1, cliente.getClienteId());
            st.setString(2, cliente.getNome());
            st.setString(3, cliente.getTelefone());
            st.setString(4, cliente.getEmail());
            
            st.executeUpdate();

            ResultSet rs = st.getResultSet();
            rs.next();

            msg = rs.getString(3);
            st.close();
        } catch ( ClassNotFoundException | SQLException ex ) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao gravar o registro de cliente.");
        }

        return msg;
    }

    public String remova( int id ) {

        String msg = "";

        try {

            Conexao c = new Conexao();

            String sql = "call p_delete_cliente(?)";

            PreparedStatement st = c.conexao.prepareStatement(sql);

            st.setInt(1, id);

            st.executeUpdate();

            ResultSet rs = st.getResultSet();
            rs.next();
            msg = rs.getString(3);

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao remover o cliente.");
        }

        return msg;
    }

    public ArrayList<Cliente> pesquise( String nome ) {

        ArrayList<Cliente> clientes = new ArrayList<>();

        try {

            Conexao c = new Conexao();

            String sql = "select * from cliente where nome like ? order by nome";

            PreparedStatement st = c.conexao.prepareStatement(sql);
            st.setString(1, "%" + nome + "%");

            st.executeQuery();

            ResultSet rs = st.getResultSet();

            while ( rs.next() ) {
                Cliente cliente =  new Cliente(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4)
                );
                clientes.add(cliente);
            }

        } catch ( ClassNotFoundException | SQLException ex ) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao pesquisar lanches");
        }

        return clientes;
    }
}
