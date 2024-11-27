package Controller;

import DAO.AlunoDAO;
import Model.Aluno;
import javax.swing.*;
import java.util.List;

public class ControllerAluno {

    public void addAluno(String nome, String email, Integer idade) {
        Aluno aluno = new Aluno();
        aluno.setNome(nome);
        aluno.setEmail(email);
        aluno.setIdade(idade);

        AlunoDAO alunoDAO = new AlunoDAO();
        boolean sucesso = alunoDAO.addAluno(aluno);

        if (sucesso) {
            JOptionPane.showMessageDialog(null, "Aluno adicionado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar aluno.");
        }
    }

    public void mostrarAlunos() {
        AlunoDAO alunoDAO = new AlunoDAO();
        List<Aluno> alunos = alunoDAO.listarAlunos();

        if (alunos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum aluno cadastrado.");
            return;
        }

        // Configurando os dados para exibir na tabela
        String[] colunas = {"ID", "Nome", "Email", "Idade"};
        Object[][] dados = new Object[alunos.size()][4];

        for (int i = 0; i < alunos.size(); i++) {
            Aluno aluno = alunos.get(i);
            dados[i][0] = aluno.getId();
            dados[i][1] = aluno.getNome();
            dados[i][2] = aluno.getEmail();
            dados[i][3] = aluno.getIdade();
        }

        JTable tabelaAlunos = new JTable(dados, colunas);
        JScrollPane scrollPane = new JScrollPane(tabelaAlunos);
        scrollPane.setPreferredSize(new java.awt.Dimension(500, 200));

        // Exibindo a tabela em um JOptionPane
        JOptionPane.showMessageDialog(null, scrollPane, "Alunos Cadastrados", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public Aluno procurarAlunoPorID(int id) throws Exception {
        AlunoDAO alunoDAO = new AlunoDAO();
        return alunoDAO.buscarPorID(id);
    }
}