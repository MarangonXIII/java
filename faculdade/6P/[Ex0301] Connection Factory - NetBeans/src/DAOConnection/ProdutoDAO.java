package DAOConnection;

import ConnectionFactory.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import ModelConnection.Produto;

public class ProdutoDAO {
    private Connection con;
    
    public ProdutoDAO(){
        this.con = new ConnectionFactory().getConnection();
    }
    
    public List<Produto> listarProduto(){
        try{
            List<Produto> produto = new ArrayList<>();
            String select = "SELECT * FROM Produto";
            PreparedStatement pst = con.prepareStatement(select);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                Produto produtos = new Produto();
                produtos.setId(rs.getInt("id"));
                produtos.setNome(rs.getString("nome"));
                produtos.setPreco(rs.getBigDecimal("preco"));
                produtos.setQuantidade(rs.getInt("quantidade"));
                
                produto.add(produtos);
                System.out.println("\n\nNome: " + produtos.getNome() + "\nPreço: " + produtos.getPreco() + "\nQuantidade: " + produtos.getQuantidade());
            }
            rs.close();
            pst.close();
        }
        catch(SQLException e){
            System.out.println("Erro na consulta");
        }
        return null;
    }
    public void cadastrarProduto (Produto produtos){
        String insert = "INSERT INTO Produto (nome, preco, quantidade)VALUES (?, ?, ?)";
        try{
            PreparedStatement pst = con.prepareStatement(insert);
            pst.setString(1, produtos.getNome());
            pst.setBigDecimal(2, produtos.getPreco());
            pst.setInt(3, produtos.getQuantidade());
            pst.execute();

        }catch (Exception e){
            System.out.println("Erro ao inserir Produto!");
        }
    }
}