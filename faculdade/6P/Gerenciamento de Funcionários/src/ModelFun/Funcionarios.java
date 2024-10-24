package ModelFun;

import java.math.BigDecimal;
import java.util.Date;

public class Funcionarios {

    private int id;
    private String nome;
    private String cargo;
    private Date data_contratacao;
    private BigDecimal salario;

    public Funcionarios() {
        //Construtor vazio
    }

    public Funcionarios(String nome, String cargo, Date data_contratacao, BigDecimal salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.data_contratacao = data_contratacao;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getDataContratacao() {
        return data_contratacao;
    }

    public void setDataContratacao(Date data_contratacao) {
        this.data_contratacao = data_contratacao;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }    
}