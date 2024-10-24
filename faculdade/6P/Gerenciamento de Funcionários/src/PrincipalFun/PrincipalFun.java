package PrincipalFun;

import ModelFun.Funcionarios;
import DAOFun.FuncionariosDAO;
import java.sql.SQLException;

public class PrincipalFun {
    public static void main(String[] args) throws SQLException{
        FuncionariosDAO dao = new FuncionariosDAO();
        
        /*Funcionarios funcionario = new Funcionarios();
        funcionario.setNome("Matheus11");
        funcionario.setCargo("mgmatheusmg@gmail.mg");
        funcionario.setDataContratacao("matheus.teste");
        funcionario.setSalario("matheus123");
        dao.cadastrarFuncionario(funcionario);
        System.out.println("Usuário cadastrado com sucesso");*/
        
        dao.listarFuncionarios();
    }
}