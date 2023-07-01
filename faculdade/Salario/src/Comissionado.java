public class Comissionado extends Funcionario {

    private double valorVendas;
    private double percentualComissao;
    public Comissionado(String nome,String cidade,String estado,Departamento departamento,double valorVendas,double percentualComissao){
        super(nome,cidade,estado,departamento);
        this.valorVendas = valorVendas;
        this.percentualComissao = percentualComissao;
    }
    @Override
    public double calcularSalario(){
        return valorVendas*percentualComissao;
    }

}
