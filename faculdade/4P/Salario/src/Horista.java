public class Horista extends Funcionario{
    private double qtHorasTrab;
    private final double valordahora;

    public Horista(String nome,String cidade,String estado,Departamento departamento,double qtdHorasTrab,double valordahora){
        super(nome,cidade,estado,departamento);
        this.qtHorasTrab = qtHorasTrab;
        this.valordahora = valordahora;
    }
    @Override
    public double calcularSalario(){
        return qtHorasTrab*valordahora;
    }
}
