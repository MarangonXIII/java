abstract class Heroi {
    protected String nome;
    protected int poder;

    public Heroi(String nome, int poder){
        this.nome = nome;
        this.poder = poder;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public abstract void usarPoder();

}