import java.util.ArrayList;
import java.util.List;


public class Biblioteca2 {
    private final List<Livro2> livros;
    private final List<Membro2> membros;
    private final List<Emprestimo2> emprestimos;

    public Biblioteca2 (String nome, String endereco){
        this.livros = new ArrayList<>();
        this.membros = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    public void adicionarLivro(Livro2 livro){
        livros.add(livro);
    }
    
    public void removerLivro(String isbn){
        livros.removeIf(livro -> livro.getIsbn().equals(isbn));
    }

    public void listarLivros(){
        for(Livro2 livro : livros){
            System.out.println("Titulo: " + livro.getTitulo() + "Autor: " + livro.getAutor() + "ISBN: " + livro.getIsbn());
        }
    }

    public void cadastrarMembro(Membro2 membro){
        membros.add(membro);
    }

    public void removerMembro(int numeroMembro){
        membros.removeIf(membro -> membro.getNumeroMembro() == numeroMembro);
    }

    public void listarMembros(){
        for(Membro2 membro : membros){
            System.out.println("Nome: " + membro.getNome() + "Email: " + membro.getEmail() + "Numero de Membros: " + membro.getNumeroMembro());
        }
    }

    public void registrarEmprestimos(Emprestimo2 emprestimo){
        emprestimos.add(emprestimo);
        emprestimo.getLivro().setDisponivel(false);
    }

    @SuppressWarnings("unlikely-arg-type")
    public void encerrarEmprestimos(Emprestimo2 emprestimo){
        membros.remove(emprestimo);
        emprestimo.getLivro().setDisponivel(true);
    }

    public void listarEmprestimos(){
        for(Emprestimo2 emprestimo : emprestimos){
            System.out.println("Livro: " + emprestimo.getLivro() + "Membro: " + emprestimo.getMembro());
        }
    }

    public Livro2 BuscarLivroPorTitulo(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'BuscarLivroPorTitulo'");
    }
}