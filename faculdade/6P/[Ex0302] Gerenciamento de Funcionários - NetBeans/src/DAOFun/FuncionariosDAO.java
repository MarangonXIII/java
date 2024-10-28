package DAOFun;

import ConexaoFun.ConexaoFun;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import ModelFun.Funcionarios;
import java.sql.Date;

public class FuncionariosDAO {
    private Connection con;
    
    public FuncionariosDAO(){
        this.con = new ConexaoFun().getConnection();
    }
    
    public List<Funcionarios> listarFuncionarios(){
        try{
            List<Funcionarios> funcionarios = new ArrayList<>();
            String select = "SELECT * FROM Funcionarios";
            PreparedStatement pst = con.prepareStatement(select);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                Funcionarios funcionario = new Funcionarios();
                funcionario.setId(rs.getInt("id"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setCargo(rs.getString("cargo"));
                funcionario.setDataContratacao(rs.getDate("data_contratacao"));
                funcionario.setSalario(rs.getBigDecimal("salario"));
                
                funcionarios.add(funcionario);
                System.out.println("\n\nNome: " + funcionario.getNome() + "\nCargo: " + funcionario.getCargo() + "\nData da Contratação: " + funcionario.getDataContratacao() + "\nSalário: " + funcionario.getSalario());
            }
            rs.close();
            pst.close();
        }
        catch(SQLException e){
            System.out.println("Erro na consulta");
        }
        return null;
    }
    public void cadastrarFuncionario (Funcionarios funcionario){
        String insert = "INSERT INTO Funcionarios (nome, cargo, data_contratacao, salario)VALUES (?, ?, ?, ?)";
        try{
            PreparedStatement pst = con.prepareStatement(insert);
            pst.setString(1, funcionario.getNome());
            pst.setString(2, funcionario.getCargo());
            pst.setDate(3, (Date) funcionario.getDataContratacao());
            pst.setBigDecimal(4, funcionario.getSalario());
            pst.execute();

        }catch (Exception e){
            System.out.println("Erro ao inserir Funcionário!");
        }
    }
}