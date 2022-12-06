package configs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    // armazena uma conexão ativa com o banco de dados
    public Connection conexao = null;

    // método construtor da classe de conexão
    public Conexao() throws ClassNotFoundException, SQLException {

        // string com informações de conexão com o banco de dados
        String url = "jdbc:mysql://localhost:3306/luncheonette?autoReconnect=true&useSSL=false";

        // determina usuário e senha de acesso ao MySQL
        String usuario = "root";
        String senha = "";

        // encontra e registra o driver de conexão
        Class.forName("com.mysql.jdbc.Driver");

        // atribui a conexão com o banco de dados ao atributo conexao
        this.conexao = DriverManager.getConnection(url, usuario, senha);
    }
}