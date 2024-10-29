package DAOBiblioteca;

import ConexaoBiblioteca.ConexaoBiblioteca;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import ModelBiblioteca.Livro;
import java.sql.Date;

public class LivroDAO {
    private Connection con;
    
    public LivroDAO(){
        this.con = new ConexaoBiblioteca().getConnection();
    }
    
    public List<Livro> listarLivro(){
        try{
            List<Livro> livro = new ArrayList<>();
            String select = "SELECT * FROM Livro";
            PreparedStatement pst = con.prepareStatement(select);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                Livro livros = new Livro();
                livros.setId(rs.getInt("id"));
                livros.setTitulo(rs.getString("titulo"));
                livros.setAutor(rs.getString("autor"));
                livros.setAno_publicacao(rs.getDate("ano_publicacao"));
                livros.setIsbn(rs.getString("isbn"));
                
                livro.add(livros);
                System.out.println("\n\nID: " + livros.getId() +
                                    "\nTitulo: " + livros.getTitulo() + 
                                    "\nAutor: " + livros.getAutor() + 
                                    "\nAno de Publicacao: " + livros.getAno_publicacao() + 
                                    "\nISBN: " + livros.getIsbn());
            }
            rs.close();
            pst.close();
        }
        catch(SQLException e){
            System.out.println("Erro na consulta");
        }
        return null;
    }
    public void cadastrarLivro (Livro livros){
        String insert = "INSERT INTO Livro (titulo, autor, ano_publicacao, isbn)VALUES (?, ?, ?, ?)";
        try{
            PreparedStatement pst = con.prepareStatement(insert);
            pst.setString(1, livros.getTitulo());
            pst.setString(2, livros.getAutor());
            pst.setDate(3, (Date) livros.getAno_publicacao());
            pst.setString(4, livros.getIsbn());
            pst.execute();

        }catch (Exception e){
            System.out.println("Erro ao inserir Livro!");
        }
    }
}