package Principal;

import Model.Usuario;
import DAO.UsuarioDAO;
import java.sql.SQLException;

public class Principal {
    public static void main(String[] args) throws SQLException{
        UsuarioDAO dao = new UsuarioDAO();
        
        Usuario usuario = new Usuario();
        usuario.setNome("Matheus11");
        usuario.setEmail("mgmatheusmg@gmail.mg");
        usuario.setLogin("matheus.teste");
        usuario.setSenha("matheus123");
        dao.cadastrarUsuario(usuario);
        System.out.println("Usuário cadastrado com sucesso");
        
        dao.listarUsuario();
    }
}