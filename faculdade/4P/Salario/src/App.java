import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) {

        int vop;
        int funcionario,qthoras;
        double hora,salario,vlrvendas,comissao;
        String departamento,nome,cidade,estado,dptralhando;
        Software software = new Software();

        do{
            vop =Integer.parseInt(JOptionPane.showInputDialog(null,"Selecione uma opção\n1 - Cadastrar o departamento\n2 - Cadastrar o Funcionario\n3 - Listar salários de um determinado departamento \n4 - Total de salários por departamento\n5 - Sair"));
            switch(vop){
                case 1 -> {
                    departamento = JOptionPane.showInputDialog(null,"Insira o nome do departamento: ");
                    hora = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o valor da hora: "));
                    software.cadastrarDepartamento(departamento, hora);
                    JOptionPane.showMessageDialog(null,"Departamento cadastrado!");
                }
                case 2 -> {
                    nome = JOptionPane.showInputDialog(null,"Insira o nome do funcionário: ");
                    cidade = JOptionPane.showInputDialog(null,"Insira o nome da cidade: ");
                    estado = JOptionPane.showInputDialog(null,"Insira o nome do estado: ");
                    dptralhando = JOptionPane.showInputDialog(null,"Insira o nome do departamento: ");
                    funcionario = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o tipo do funcionário\n1-Mensalista\n2-Horista\n3-Comissionado"));
                    switch (funcionario) {
                        case 1 -> {
                            salario = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o salario: "));
                            software.cadastrarFuncionario(nome,cidade,estado,1,dptralhando,salario,0.0,0.0,0.0,0.0);
                        }
                        case 2 -> {
                            qthoras = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira quantas horas o funcionário trabalhou: "));
                            hora = hora = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira quanto vale a hora do funcionário: "));
                            software.cadastrarFuncionario(nome, cidade, estado, 2, dptralhando, 0.0, qthoras, 0.0, 0.0,hora);
                        }
                        default -> {
                            vlrvendas = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o número de vendas: "));
                            comissao = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o valor da comissao: "));
                            software.cadastrarFuncionario(nome,cidade,estado,3,dptralhando,0.0,0.0,vlrvendas,comissao,0.0);
                        }
                    }
                }

                case 3 -> {
                    String departamentobusca=JOptionPane.showInputDialog(null, "Insira o departamento para busca: ");
                    software.salariosDepartamento(departamentobusca);
                }
                case 4 -> software.salariosDepartamentos();
                case 5 -> JOptionPane.showMessageDialog(null, "Você saiu do programa");
                default -> JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        }while(vop!=5);
    }
}