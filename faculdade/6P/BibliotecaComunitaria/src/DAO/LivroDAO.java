package DAO;

import Conexao.ConexaoBiblioteca;
import Model.Livro;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LivroDAO {
    private Connection con;

    public LivroDAO() {
        // Obtendo a conexão com o banco de dados através da classe ConexaoBiblioteca
        this.con = new ConexaoBiblioteca().conectaBD();
    }

    public boolean inserirLivro(Livro livro) {
        String sql = "INSERT INTO livros (titulo, autor, ano_publicacao, isbn) VALUES (?, ?, ?, ?)";

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            // Definindo os parâmetros da consulta
            stmt.setString(1, livro.getTitulo());
            stmt.setString(2, livro.getAutor());

            // Convertendo java.util.Date para java.sql.Date para o banco de dados
            Date anoPublicacaoSql = new Date(livro.getAno_publicacao().getTime());
            stmt.setDate(3, anoPublicacaoSql);

            stmt.setString(4, livro.getIsbn());

            // Executando a consulta de inserção
            stmt.executeUpdate();
            return true; // Retornando sucesso se a inserção ocorrer corretamente
        } catch (SQLException e) {
            System.out.println("Erro ao inserir livro: " + e.getMessage());
            return false; // Retornando falha caso ocorra algum erro
        }
    }
}
