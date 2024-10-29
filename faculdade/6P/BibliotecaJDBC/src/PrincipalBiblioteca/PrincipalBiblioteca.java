package PrincipalBiblioteca;

import DAOBiblioteca.LivroDAO;
import java.sql.SQLException;

public class PrincipalBiblioteca {
    public static void main(String[] args) throws SQLException{
        LivroDAO dao = new LivroDAO();
        dao.listarLivro();
    }
}