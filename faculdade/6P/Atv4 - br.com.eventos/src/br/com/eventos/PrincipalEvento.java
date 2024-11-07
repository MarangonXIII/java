package br.com.eventos;

import DAOEvento.EventoDAO;
import java.sql.SQLException;
import View.jfrLogin;

public class PrincipalEvento {

    public static void main(String[] args)throws SQLException {
        java.awt.EventQueue.invokeLater(() -> {
          new jfrLogin().setVisible(true);
        });
        
        
        //EventoDAO dao = new EventoDAO();
        //dao.listarEvento();
    }
    
}
