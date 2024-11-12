package Controller;

import DAO.LivroDAO;
import Model.Livro;
import javax.swing.*;
import java.util.List;

public class ControllerLivro {

    public void inserirLivro(String titulo, String autor, java.util.Date anoPublicacao, String isbn) {
        Livro livro = new Livro();
        livro.setTitulo(titulo);
        livro.setAutor(autor);

        if (anoPublicacao != null) {
            livro.setAno_publicacao(new java.sql.Date(anoPublicacao.getTime()));
        }

        livro.setIsbn(isbn);

        LivroDAO livroDAO = new LivroDAO();
        boolean sucesso = livroDAO.inserirLivro(livro);

        if (sucesso) {
            JOptionPane.showMessageDialog(null, "Livro inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao inserir livro.");
        }
    }

    public void mostrarLivros() {
        LivroDAO livroDAO = new LivroDAO();
        List<Livro> livros = livroDAO.listarLivros();

        if (livros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum livro cadastrado.");
            return;
        }

        // Configurando os dados para exibir na tabela
        String[] colunas = {"ID", "Título", "Autor", "Ano Publicação", "ISBN"};
        Object[][] dados = new Object[livros.size()][5];

        for (int i = 0; i < livros.size(); i++) {
            Livro livro = livros.get(i);
            dados[i][0] = livro.getId();
            dados[i][1] = livro.getTitulo();
            dados[i][2] = livro.getAutor();
            dados[i][3] = livro.getAno_publicacao();
            dados[i][4] = livro.getIsbn();
        }

        JTable tabelaLivros = new JTable(dados, colunas);
        JScrollPane scrollPane = new JScrollPane(tabelaLivros);
        scrollPane.setPreferredSize(new java.awt.Dimension(500, 200));

        // Exibindo a tabela em um JOptionPane
        JOptionPane.showMessageDialog(null, scrollPane, "Livros Cadastrados", JOptionPane.INFORMATION_MESSAGE);
    }
}
