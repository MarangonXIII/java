public class Membro2 {
    private String nome;
    private String email;
    private int numeroMembro;

    public Membro2 (String nome, String email, int numeroMembro){
        this.nome = nome;
        this.email = email;
        this.numeroMembro = numeroMembro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumeroMembro() {
        return numeroMembro;
    }

    public void setNumeroMembro(int numeroMembro) {
        this.numeroMembro = numeroMembro;
    }
        
}
