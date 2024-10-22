import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class Software {
    private final List<Departamento> departamentos;

    public Software(){
        this.departamentos = new ArrayList<>();
    }
    public void cadastrarDepartamento(String descricao,double valorHoraTrabalhada){
        Departamento departamento = new Departamento(descricao,valorHoraTrabalhada);
        departamentos.add(departamento);
    }

    public void cadastrarFuncionario(String nome,String cidade,String estado,int tipoFuncionario,String descricaoDepartamento,double salario,double qtHorasTrabalhadas,double valorVendas,double percentualComissao,double valordahora){
        Departamento departamento = buscarDepartamento(descricaoDepartamento);
        if(departamento!=null){
            Funcionario funcionario;
            switch(tipoFuncionario){
                case 1 -> funcionario = new Mensalista(nome,cidade,estado,departamento,salario);
                case 2 -> funcionario = new Horista(nome,cidade,estado,departamento,qtHorasTrabalhadas,valordahora );
                case 3 -> funcionario = new Comissionado(nome,cidade,estado,departamento,valorVendas,percentualComissao);
                default -> {
                    JOptionPane.showMessageDialog(null,"Tipo de funcionário inválido.");
                    return;
                }
            }
            departamento.adicionarFuncionario(funcionario);
        }else{
            JOptionPane.showMessageDialog(null,"Departamento não encontrado.");
        }
    }
    public void salariosDepartamento(String descricaoDepartamento){
        Departamento departamento = buscarDepartamento(descricaoDepartamento);
        if(departamento!=null){
            JOptionPane.showMessageDialog(null,"Salários dos funcionários do departamento "+descricaoDepartamento+":");
            for(Funcionario funcionario:departamento.getFuncionarios()){
                JOptionPane.showMessageDialog(null,funcionario.getNome()+": "+funcionario.calcularSalario());
            }
            JOptionPane.showMessageDialog(null,"Total de salários do departamento: "+departamento.getTotalSalario());
        }else{
            JOptionPane.showMessageDialog(null,"Departamento não encontrado.");
        }
    }
    public void salariosDepartamentos(){
        double totalGeralSalarios=0;
        for(Departamento departamento:departamentos){
            JOptionPane.showMessageDialog(null,"Departamento: "+departamento.getDescricao());
            for(Funcionario funcionario:departamento.getFuncionarios()){
                JOptionPane.showMessageDialog(null,funcionario.getNome()+": "+funcionario.calcularSalario());
            }
            double totalSalariosDepartamento = departamento.getTotalSalario();
            JOptionPane.showMessageDialog(null,"Total de salários do departamento: "+totalSalariosDepartamento);
            totalGeralSalarios+=totalSalariosDepartamento;
            System.out.println();
        }
        JOptionPane.showMessageDialog(null,"Total geral de salários: "+totalGeralSalarios);
    }
    private Departamento buscarDepartamento(String descricaoDepartamento){
        for(Departamento departamento:departamentos){
            if(departamento.getDescricao().equalsIgnoreCase(descricaoDepartamento)){
                return departamento;
            }
        }
        return null;
    }
}
