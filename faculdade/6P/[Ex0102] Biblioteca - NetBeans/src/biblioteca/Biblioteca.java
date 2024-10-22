import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros;

    public Biblioteca(){
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro Livros){
        livros.addAll(livros);
    }

    public void ListarLivros(){
        for (Livro livro : livros) {
            livro.descricao();
        }
    }

    public Livro BuscarLivroPorTitulo(String Titulo){
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(Titulo)){
                return livro;
            }
        } return null;
    }
}