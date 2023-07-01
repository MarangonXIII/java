public class Mensalista extends Funcionario {

    private double salario;

    public Mensalista(String nome,String cidade,String estado,Departamento departamento,double salario){
        super(nome,cidade,estado,departamento);
        this.salario = salario;
    }
    @Override
    public double calcularSalario(){
        return salario;
    }

}
