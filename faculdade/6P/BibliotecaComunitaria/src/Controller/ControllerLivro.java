package Controller;

import DAO.LivroDAO;
import Model.Livro;
import javax.swing.JOptionPane;
import java.sql.Date;

public class ControllerLivro {

    public void inserirLivro(String titulo, String autor, java.util.Date anoPublicacao, String isbn) {
        // Instanciando um novo objeto Livro e configurando seus atributos
        Livro livro = new Livro();
        livro.setTitulo(titulo);
        livro.setAutor(autor);

        // Convertendo anoPublicacao para java.sql.Date se não for nulo
        if (anoPublicacao != null) {
            livro.setAno_publicacao(new Date(anoPublicacao.getTime()));
        }

        livro.setIsbn(isbn);

        // Criando uma instância de LivroDAO para salvar o livro no banco de dados
        LivroDAO livroDAO = new LivroDAO();
        boolean sucesso = livroDAO.inserirLivro(livro); // Tentativa de inserção

        // Verificação do resultado e exibição de mensagem
        if (sucesso) {
            JOptionPane.showMessageDialog(null, "Livro inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao inserir livro.");
        }
    }
}
