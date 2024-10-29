package DAOConnection;

import ConnectionFactory.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import ModelConnection.Cliente;

public class ClienteDAO {
    private  Connection con;
    
    public ClienteDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public List<Cliente> listarCliente(){
        try{
            List<Cliente> cliente = new ArrayList<>();
            String select = "SELECT * FROM Cliente";
            PreparedStatement pst = con.prepareStatement(select);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                Cliente clientes = new Cliente();
                clientes.setId(rs.getInt("id"));
                clientes.setNome(rs.getString("nome"));
                clientes.setEmail(rs.getString("email"));
                clientes.setTelefone(rs.getString("telefone"));
                
                cliente.add(clientes);
                System.out.println("\n\nNome: " + clientes.getNome() + "\nEmail: " + clientes.getEmail() + "\nTelefone: " + clientes.getTelefone());
            }
            rs.close();
            pst.close();
        }
        catch(SQLException e){
            System.out.println("Erro na consulta");
        }
        return null;
    }
    public void cadastrarClientes (Cliente clientes){
        String insert = "INSERT INTO Cliente (nome, email, telefone)VALUES (?, ?, ?)";
        try{
            PreparedStatement pst = con.prepareStatement(insert);
            pst.setString(1, clientes.getNome());
            pst.setString(2, clientes.getEmail());
            pst.setString(3, clientes.getTelefone());
            pst.execute();

        }catch (Exception e){
            System.out.println("Erro ao inserir Cliente!");
        }
    }
}