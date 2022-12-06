package dao;
import bean.Cliente;
import configs.Conexao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.text.ParseException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClienteDAO {
    
    public ArrayList liste() {
        
        ArrayList<Cliente> clientes = new ArrayList<>();
        
        try{
            Conexao c = new Conexao();
            
            Statement st = c.conexao.createStatement();
            
            ResultSet rs = st.executeQuery("select * from v_cliente");
            
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            
            while (rs.next()) {
                Cliente cliente = new Cliente(
                    rs.getInt(1),   // clienteId
                    rs.getString(2),    // nome
                    rs.getString(3),    // telefone
                    format.parse(rs.getString(4)),  // data de nascimento
                    rs.getInt(5),   // enderecoId
                    rs.getString(6),    // logradouro
                    rs.getString(7),    // bairro
                    rs.getInt(8),   // numero
                    rs.getString(9),    //complemento
                    rs.getString(10)    // referencia
                );
                
                clientes.add(cliente);
            }
            
        } catch (ClassNotFoundException | SQLException | ParseException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        return clientes;
    }
    
    public String grave(Cliente cliente) {
        
        String msg = "";
        
        try {
            
            Conexao c = new Conexao();
            
            String sql = "call p_salve_cliente(?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement st = c.conexao.prepareStatement(sql);
            
            st.setInt(1, cliente.getClienteId());
            st.setString(2, cliente.getNome());
            st.setString(3, cliente.getTelefone());
            st.setDate(4, new java.sql.Date(cliente.getDataNascimento().getTime()) );
            st.setString(5, cliente.getLogradouro());
            st.setString(6, cliente.getBairro());
            st.setInt(7, cliente.getNumero());
            st.setString(8, cliente.getComplemento());
            st.setString(9, cliente.getReferencia());
            
            st.executeUpdate();
            
            ResultSet rs = st.getResultSet();
            rs.next();
            
            msg = rs.getString(3);
            st.close();
        
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        return msg;
        
    }
    
    public String remova( int clienteId ) {
        String msg = "";

        try  {
            Conexao c = new Conexao();

            String sql = "call p_delete_cliente(?)";

            PreparedStatement st = c.conexao.prepareStatement(sql);

            st.setInt(1, clienteId);

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
    
    public ArrayList<Cliente> pesquise( String nome ) {
        ArrayList<Cliente> lanches = new ArrayList<>();

        try {
            Conexao c = new Conexao();

            String sql = "select * from v_cliente where nome like ? order by nome";

            PreparedStatement st = c.conexao.prepareStatement(sql);

            st.setString(1, "%" + nome + "%");

            st.executeQuery();

            ResultSet rs = st.getResultSet();
            
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");

            while (rs.next()) {
                Cliente cliente = new Cliente(
                    rs.getInt(1),   // clienteId
                    rs.getString(2),    // nome
                    rs.getString(3),    // telefone
                    format.parse(rs.getString(4)),  // data de nascimento
                    rs.getInt(5),   // enderecoId
                    rs.getString(6),    // logradouro
                    rs.getString(7),    // bairro
                    rs.getInt(8),   // numero
                    rs.getString(9),    //complemento
                    rs.getString(10)    // referencia
                );

                lanches.add(cliente);
            }
        } catch (ClassNotFoundException | SQLException | ParseException ex) {
            JOptionPane.showMessageDialog(
                null, "Ocorreu uma falha ao listar os registros, entre em contato com o suporte técnico."
            );
        }

        return lanches;
    }
}
