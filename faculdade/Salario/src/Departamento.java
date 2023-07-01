import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String descricao;
    private double valorHoraTrabalhada;
    private List<Funcionario> funcionarios;

    public Departamento(String descricao,double valorHoraTrabalhada){
        this.descricao = descricao;
        this.valorHoraTrabalhada = valorHoraTrabalhada;
        this.funcionarios = new ArrayList<>();
    }

    public String getDescricao(){
        return descricao;
    }
    public double getValorHoraTrabalhada(){
        return valorHoraTrabalhada;
    }
    public List<Funcionario> getFuncionarios(){
        return funcionarios;
    }
    public void adicionarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }
    public double getTotalSalario(){
        double totalSalarios=0;
        for (Funcionario funcionario:funcionarios){
            totalSalarios+=funcionario.calcularSalario();
        }
        return totalSalarios;
    }
    public void salariofuncionario(){
        for (int i=0;i<funcionarios.size();i++){
            JOptionPane.showMessageDialog(null,"Funcionario:"+funcionarios.get(i).getNome()+"Salario:"+funcionarios.get(i).calcularSalario());
        }
    }
}