public class App {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        LivroFisico livroFisico = new LivroFisico("Java: Como Programar", "Deitel", 1000, 1.5);
        Ebook ebook = new Ebook("Clean Code", "Robert C. Martin", 464, 2.5);

        biblioteca.adicionarLivro(livroFisico);
        biblioteca.adicionarLivro(ebook);

        System.out.println("Livros na biblioteca:");
        biblioteca.ListarLivros();

        System.out.println("\nBuscando livro por título:");
        Livro livroBuscado = biblioteca.BuscarLivroPorTitulo("Clean Code");
        if (livroBuscado != null) {
            livroBuscado.descricao();
        } else {
            System.out.println("Livro não encontrado.");
        }
    }
}