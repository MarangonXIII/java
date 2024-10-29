package DAOConnection;

import ConnectionFactory.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import ModelConnection.Pedidos;
import java.sql.Date;

public class PedidosDAO {
    private Connection con;
    
    public PedidosDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public List<Pedidos> listarPedidos(){
        try {
            List<Pedidos> pedidos = new ArrayList<>();
            String select = "SELECT * FROM Pedidos";
            PreparedStatement pst = con.prepareStatement(select);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                Pedidos pedido = new Pedidos();
                pedido.setId(rs.getInt("id"));
                pedido.setClienteId(rs.getInt("cliente_id"));
                pedido.setDataPedido(rs.getDate("data_pedido"));
                pedido.setTotal(rs.getBigDecimal("total"));
                
                pedidos.add(pedido);
                System.out.println("\n\nID: " + pedido.getId() + 
                                   "\nCliente ID: " + pedido.getClienteId() + 
                                   "\nData do Pedido: " + pedido.getDataPedido() + 
                                   "\nTotal: " + pedido.getTotal());
            }
            rs.close();
            pst.close();
        } catch (SQLException e) {
            System.out.println("Erro na consulta de pedidos");
        }
        return null;
    }
    public void cadastrarPedido(Pedidos pedido){
        String insert = "INSERT INTO Pedidos (cliente_id, data_pedido, total) VALUES (?, ?, ?)";
        
        try {
            PreparedStatement pst = con.prepareStatement(insert);
            pst.setInt(1, pedido.getClienteId());
            pst.setDate(2, (Date) pedido.getDataPedido());
            pst.setBigDecimal(3, pedido.getTotal());
            pst.execute();
        } catch (Exception e) {
            System.out.println("Erro ao inserir pedido!");
        }
    }
}