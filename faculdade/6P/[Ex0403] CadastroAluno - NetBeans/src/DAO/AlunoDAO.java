package DAO;

import Conexao.ConexaoAluno;
import Model.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {
    private Connection con;

    public AlunoDAO() {
        this.con = new ConexaoAluno().conectaBD();
    }

    public boolean addAluno(Aluno aluno) {
        String sql = "INSERT INTO Aluno (nome, email, idade) VALUES (?, ?, ?)";

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getEmail());
            stmt.setInt(3, aluno.getIdade());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao adicionar aluno: " + e.getMessage());
            return false;
        }
    }

    public List<Aluno> listarAlunos() {
        List<Aluno> alunos = new ArrayList<>();
        String sql = "SELECT * FROM Aluno";

        try (PreparedStatement stmt = con.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Aluno aluno = new Aluno();
                aluno.setId(rs.getInt("id"));
                aluno.setNome(rs.getString("nome"));
                aluno.setEmail(rs.getString("email"));
                aluno.setIdade(rs.getInt("idade"));
                alunos.add(aluno);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar alunos: " + e.getMessage());
        }

        return alunos;
    }
    
    public Aluno buscarPorID(int id) throws Exception {
        Connection con = new ConexaoAluno().conectaBD(); // Conexão existente
        String sql = "SELECT * FROM Aluno WHERE id = ?";
        Aluno aluno = null;

        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setInt(1, id); // Substituindo o "?" pelo ID informado
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                // Preenchendo os dados do aluno retornado
                aluno = new Aluno();
                aluno.setId(rs.getInt("id"));
                aluno.setNome(rs.getString("nome"));
                aluno.setEmail(rs.getString("email"));
                aluno.setIdade(rs.getInt("idade"));
            }
        } catch (SQLException e) {
            throw new Exception("Erro ao buscar o aluno por ID: " + e.getMessage());
        }
        return aluno;
    }
}