package DAO;

import Conexao.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Model.Usuario;

public class UsuarioDAO {
    private Connection con;
    
    public UsuarioDAO(){
        this.con = new Conexao().getConnection();
    }
    
    public List<Usuario> listarUsuario(){
        try{
            List<Usuario> usuarios = new ArrayList<>();
            String select = "SELECT * FROM usuario";
            PreparedStatement pst = con.prepareStatement(select);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                Usuario usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha(rs.getString("senha"));
                
                usuarios.add(usuario);
                System.out.println("\n\nNome: " + usuario.getNome() + "\nEmail: " + usuario.getEmail() + "\nLogin: " + usuario.getLogin() + "\nSenha: " + usuario.getSenha());
        }
            rs.close();
            pst.close();
    }
        catch(SQLException e){
            System.out.println("Erro na consulta");
        }
        return null;
    }
    public void cadastrarUsuario (Usuario usuario){
        String insert = "INSERT INTO usuario (nome, email, login, senha)VALUES (?, ?, ?, ?)";
        try{
            PreparedStatement pst = con.prepareStatement(insert);
            pst.setString(1, usuario.getNome());
            pst.setString(2, usuario.getEmail());
            pst.setString(3, usuario.getLogin());
            pst.setString(4, usuario.getSenha());
            pst.execute();

        }catch (Exception e){
            System.out.println("Erro ao inserir Usuário!");
        }
    }
}
