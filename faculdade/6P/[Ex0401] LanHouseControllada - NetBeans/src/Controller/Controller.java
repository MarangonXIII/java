package Controller;

import DAO.UsuarioDAO;
import ModelUsuario.Usuario;
import View.jfrTelaPrincipal;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Controller {

    public Controller(String login, String senha) {
        try{
            Usuario objusuario = new Usuario();
            objusuario.setLogin(login);
            objusuario.setSenha(senha);

            UsuarioDAO objusuariodao = new UsuarioDAO();
            ResultSet rsusuariodao = objusuariodao.autenticacaoUsuario(objusuario);

            if(rsusuariodao.next()){
                //chamar tela que eu quero abrir
                jfrTelaPrincipal objjfrtelaprincipal = new jfrTelaPrincipal();
                objjfrtelaprincipal.setVisible(true);
                
                dispose();
            }else{
                //enviar mensagem dizendo incorreto
                JOptionPane.showMessageDialog(null, "Usuário ou Senha Inválidos");
            }

        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "jfrLogin: " + erro);
        }
    }

    private void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
