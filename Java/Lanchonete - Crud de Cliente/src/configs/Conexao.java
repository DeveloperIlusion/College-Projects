package configs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
   
    public Connection conexao = null;
    
    public Conexao() throws ClassNotFoundException, SQLException {
        
        String url = "jdbc:mysql://localhost:3306/lanchonete?autoReconnect=true&useSSL=false";
        
        String usuario = "root";
        String senha = "";
        
        Class.forName("com.mysql.jdbc.Driver");
        
        this.conexao = DriverManager.getConnection(url, usuario, senha);       
    }
}
