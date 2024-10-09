public abstract class  Funcionario {
    private String Nome;
    private String Cidade;
    private String Estado;
    private int QtdHorasTrablhadas;
    private Departamento departamento;

    public Funcionario(String nome,String cidade,String estado,Departamento departamento){
        this.Nome = nome;
        this.Cidade = cidade;
        this.Estado = estado;
        this.departamento = this.departamento;
    }

    public String getNome(){
        return Nome;
    }
    public void setNome(String nome){
        Nome = nome;
    }
    public String getCidade(){
        return Cidade;
    }
    public void setCidade(String cidade){
        Cidade = cidade;
    }
    public String getEstado(){
        return Estado;
    }
    public void setEstado(String estado){
        Estado = estado;
    }
    public int getQtHorasTrablhadas(){
        return QtdHorasTrablhadas;
    }
    public void setQtHorasTrablhadas(int qtdHorasTrablhadas){
        QtdHorasTrablhadas = qtdHorasTrablhadas;
    }
    public abstract double calcularSalario();
    public Departamento getDepartamento(){
        return departamento;
    }
    public void setDepartamento(Departamento departamento){
        this.departamento = departamento;
    }
}
