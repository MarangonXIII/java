public abstract class Livro {
    protected String Titulo;
    protected String Autor;
    protected int AnoPublicacao;

    public Livro(String Titulo, String Autor, int AnoPublicacao){
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.AnoPublicacao = AnoPublicacao;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public int getAnoPublicacao() {
        return AnoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        AnoPublicacao = anoPublicacao;
    }

    public abstract void descricao(); 
}
