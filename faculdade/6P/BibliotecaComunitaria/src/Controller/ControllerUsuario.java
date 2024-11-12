package Controller;

import DAO.UsuarioDAO;
import Model.Usuario;
import View.jfrTelaPrincipal;
import javax.swing.JFrame;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControllerUsuario {
    // Método de autenticação que recebe o login, senha e a janela de origem
    public void autenticarUsuario(String login, String senha, JFrame fechajanela) {
        try{
            Usuario objusuario = new Usuario();
            objusuario.setLogin(login);
            objusuario.setSenha(senha);

            UsuarioDAO objusuariodao = new UsuarioDAO();
            ResultSet rsusuariodao = objusuariodao.autenticacaoUsuario(objusuario);

            if(rsusuariodao.next()){
                // Abre a tela principal se a autenticação for bem-sucedida
                jfrTelaPrincipal objjfrtelaprincipal = new jfrTelaPrincipal();
                objjfrtelaprincipal.setVisible(true);
                // Fecha a janela de login
                fechajanela.dispose();
            }else{
                // Exibe mensagem de erro
                JOptionPane.showMessageDialog(null, "Usuário ou Senha Inválidos");
            }
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "jfrLogin: " + erro);
        }
    }
}
