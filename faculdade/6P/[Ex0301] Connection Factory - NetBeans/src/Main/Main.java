package Main;

import DAOConnection.PedidosDAO;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException{
        PedidosDAO dao = new PedidosDAO();
        dao.listarPedidos();
    }
}