package ConnectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectionFactory {
                                        //endereço do banco e porta / nome do banco
    private static final String URL = "jdbc:mysql://localhost:3306/connectionfactory";
    private static final String USUARIO = "root";
    private static final String SENHA = "";
    
    public Connection getConnection(){
        try{
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro de conexão!!!");
            return null;
        }
    }
}