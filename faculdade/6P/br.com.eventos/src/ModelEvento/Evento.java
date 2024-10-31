package ModelEvento;

public class Evento {
    
    private int id;
    private String titulo;
    private String descricao;
    private String promotor;
    
    public Evento(){
        //Construtor vazio
    }
    
    public Evento(String titulo, String descricao, String promotor){
        this.titulo = titulo;
        this.descricao = descricao;
        this.promotor = promotor;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPromotor() {
        return promotor;
    }

    public void setPromotor(String promotor) {
        this.promotor = promotor;
    }
}
