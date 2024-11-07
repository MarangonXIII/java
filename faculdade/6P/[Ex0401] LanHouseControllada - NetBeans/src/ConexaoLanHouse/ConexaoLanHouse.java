package ConexaoLanHouse;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.DriverManager;

public class ConexaoLanHouse {
    public Connection conectaBD(){
        Connection con = null;
        try{
            String url = "jdbc:mysql://localhost:3306/lanhousecontrollada?user=root&password=";
            con = DriverManager.getConnection(url);
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "ConexaoLanHouse" + erro.getMessage());
        }
        return con;
    }
}
