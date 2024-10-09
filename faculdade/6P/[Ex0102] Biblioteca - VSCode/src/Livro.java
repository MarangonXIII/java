public abstract class Livro {
    protected String Titulo;
    protected String Autor;
    protected int NumeroPaginas;

    public Livro(String Titulo, String Autor, int NumeroPaginas){
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumeroPaginas = NumeroPaginas;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public int getNumeroPaginas() {
        return NumeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        NumeroPaginas = numeroPaginas;
    }

    public abstract void descricao(); 
}
