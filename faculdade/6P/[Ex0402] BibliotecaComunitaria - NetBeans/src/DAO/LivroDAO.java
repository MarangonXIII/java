package DAO;

import Conexao.ConexaoBiblioteca;
import Model.Livro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LivroDAO {
    private Connection con;

    public LivroDAO() {
        this.con = new ConexaoBiblioteca().conectaBD();
    }

    public boolean inserirLivro(Livro livro) {
        String sql = "INSERT INTO Livro (titulo, autor, ano_publicacao, isbn) VALUES (?, ?, ?, ?)";

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, livro.getTitulo());
            stmt.setString(2, livro.getAutor());
            stmt.setDate(3, new java.sql.Date(livro.getAno_publicacao().getTime()));
            stmt.setString(4, livro.getIsbn());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao inserir livro: " + e.getMessage());
            return false;
        }
    }

    public List<Livro> listarLivros() {
        List<Livro> livros = new ArrayList<>();
        String sql = "SELECT * FROM Livro";

        try (PreparedStatement stmt = con.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Livro livro = new Livro();
                livro.setId(rs.getInt("id"));
                livro.setTitulo(rs.getString("titulo"));
                livro.setAutor(rs.getString("autor"));
                livro.setAno_publicacao(rs.getDate("ano_publicacao"));
                livro.setIsbn(rs.getString("isbn"));
                livros.add(livro);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar livros: " + e.getMessage());
        }

        return livros;
    }
}
