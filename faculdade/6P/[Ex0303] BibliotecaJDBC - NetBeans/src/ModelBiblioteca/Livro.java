package ModelBiblioteca;

import java.util.Date;

public class Livro {

    private int id;
    private String titulo;
    private String autor;
    private Date ano_publicacao;
    private String isbn;

    public Livro() {
        //Construtor vazio
    }

    public Livro(String titulo, String autor, Date ano_publicacao, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano_publicacao = ano_publicacao;
        this.isbn = isbn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getAno_publicacao() {
        return ano_publicacao;
    }

    public void setAno_publicacao(Date ano_publicacao) {
        this.ano_publicacao = ano_publicacao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}