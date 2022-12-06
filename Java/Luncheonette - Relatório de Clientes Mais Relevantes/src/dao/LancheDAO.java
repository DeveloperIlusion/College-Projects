package dao;

import bean.Lanche;
import bean.RelatorioLanche;
import configs.Conexao;
import java.util.ArrayList;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class LancheDAO {

    public ArrayList liste() {

        ArrayList<Lanche> lanches = new ArrayList<>();

        try {
            Conexao c = new Conexao();

            Statement st = c.conexao.createStatement();

            ResultSet rs = st.executeQuery(
                "select * from lanche order by nome"
            );

            while (rs.next()) {
                Lanche lanche = new Lanche(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getFloat(3),
                    rs.getString(4)
                );

                lanches.add(lanche);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(
                null, "Ocorreu uma falha ao listar os registros, entre em contato com o suporte técnico."
            );
        }

        return lanches;
    }

    public String grave( Lanche lanche ) {

        String msg = "";

        try {

            Conexao c = new Conexao();

            String sql = "call p_salve_lanche(?, ?, ?, ?)";

            PreparedStatement st = c.conexao.prepareStatement(sql);

            st.setInt(1, lanche.getLancheId());
            st.setString(2, lanche.getNome());
            st.setFloat(3, lanche.getPrecoVenda());
            st.setString(4, lanche.getDescricao());

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

    public String remova ( int lancheId ) {

        String msg = "";

        try  {
            Conexao c = new Conexao();

            String sql = "call p_delete_lanche(?)";

            PreparedStatement st = c.conexao.prepareStatement(sql);

            st.setInt(1, lancheId);

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

    
    public ArrayList pesquise(String nome) {

        ArrayList<Lanche> lanches = new ArrayList<>();

        try {
            Conexao c = new Conexao();

            String sql = "select * from lanche where nome like ? order by nome";

            PreparedStatement st = c.conexao.prepareStatement(sql);

            st.setString(1, "%" + nome + "%");

            st.executeQuery();

            ResultSet rs = st.getResultSet();

            while (rs.next()) {
                Lanche lanche = new Lanche(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getFloat(3),
                    rs.getString(4)
                );

                lanches.add(lanche);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(
                null, "Ocorreu uma falha ao listar os registros, entre em contato com o suporte técnico."
            );
        }

        return lanches;
    }
    
    // lista os dados da view de relatório de lanches
    public ArrayList listeRelatorioLanche() {

        // coleção de objetos vazia
        ArrayList<RelatorioLanche> lanches = new ArrayList<>();

        try {
            Conexao c = new Conexao();

            Statement st = c.conexao.createStatement();

            ResultSet rs = st.executeQuery(
                "select * from v_relatorio_lanche"
            );

            while (rs.next()) {
                // cria um objeto da classe relatório
                RelatorioLanche lanche = new RelatorioLanche(
                    rs.getString(1),
                    rs.getInt(2),
                    rs.getFloat(3),
                    rs.getFloat(4)
                );
                // adiciona o objeto à coleção
                lanches.add(lanche);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao listar os lanches.");
        }

        // retorna a coleção de objetos
        return lanches;
    }
}