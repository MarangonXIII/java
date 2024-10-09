import java.util.Date;

public class Emprestimo2 {
    private Livro2 livro;
    private Membro2 membro;
    private Date dataEmprestimo;
    private Date dataDevolucao;

    public Emprestimo2 (Livro2 livro, Membro2 membro, Date dataEmprestimo, Date dataDevolucao){
        this.livro = livro;
        this.membro = membro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public Livro2 getLivro() {
        return livro;
    }

    public void setLivro(Livro2 livro) {
        this.livro = livro;
    }

    public Membro2 getMembro() {
        return membro;
    }

    public void setMembro(Membro2 membro) {
        this.membro = membro;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public double calcularMulta(){
        long diff = new Date().getTime() - dataDevolucao.getTime();
        int diasAtraso = (int) (diff / (1000* 60* 60*24));
        return diasAtraso > 0 ? diasAtraso * 2.0 : 0.0;
    }
}