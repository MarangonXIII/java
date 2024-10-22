public class Livro2 {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponivel;

    public Livro2 (String titulo, String autor, String isbn, boolean disponivel){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponivel = true;
    }

    public Livro2(String titulo2, String autor2, int anoPublicacao) {
        //TODO Auto-generated constructor stub
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void descricao() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'descricao'");
    }

}
