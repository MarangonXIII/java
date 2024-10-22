import javax.swing.JOptionPane;

public class App{
    public static void main(String[] args){
        int numTimes=lerQuantidadeTimes();
        Campeonato campeonato=cadastrarTimes(numTimes);

        while(true){
            String vop = exibirMenu();
            switch(vop){
                case "1" -> registrarJogo(campeonato);
                case "2" -> exibirPontuacao(campeonato);
                case "3" -> encerrarPrograma();
                default -> exibirMensagemDeErro("Opção inválida");
            }
        }
    }

    private static int lerQuantidadeTimes(){
        String input = JOptionPane.showInputDialog("Quantos times irao jogar no campeonato: ");
        return Integer.parseInt(input);
    }
    private static Campeonato cadastrarTimes(int numTimes){
        Campeonato campeonato = new Campeonato(numTimes);
        for(int i=0;i<numTimes;i++){
            String nomeTime = JOptionPane.showInputDialog("Nome do time "+(i+1)+": ");
            Times time = new Times(nomeTime);
            campeonato.cadastrarTime(time);
        }
        return campeonato;
    }
    private static String exibirMenu(){
        return JOptionPane.showInputDialog("""
                                           O que deseja:
                                           1 - Registrar um jogo
                                           2 - Exibir a tabela de pontua\u00e7\u00e3o
                                           3 - Sair""");
    }
    private static void registrarJogo(Campeonato campeonato){
        String nomeTime1=JOptionPane.showInputDialog("Nome do time 1: ");
        String nomeTime2=JOptionPane.showInputDialog("Nome do time 2: ");
        Times time1=campeonato.getTimeNome(nomeTime1);
        Times time2=campeonato.getTimeNome(nomeTime2);
        if(time1==null || time2==null){
            exibirMensagemDeErro("Os times não foram encontrados");
        }else{
            campeonato.registrarJogo(time1,time2);
        }
    }
    private static void exibirPontuacao(Campeonato campeonato){
        String tabela = "Posição   Time   Pontos   Jogos   Vitória   Empate   Derrota   Gols Marcados   Gols Sofridos   Saldo de Gols\n";
        tabela+="-------------------------------------------------------------------------------------------------------------------------------------------------\n";
        int[][] pontuacao = campeonato.getPontuacao();
        int posicao=1;

        for(int i=0;i<campeonato.getTimes().size();i++){
            Times time = campeonato.getTimes().get(i);
            tabela+=String.format("%-10s%-18s%-9d%-8d%-4d%-4d%-4d%-5d%-5d%-5d\n",posicao++,time.getNome(),pontuacao[i][4],pontuacao[i][0],pontuacao[i][1],pontuacao[i][2],pontuacao[i][3], pontuacao[i][5],pontuacao[i][6],pontuacao[i][5]-pontuacao[i][6]);
        }
        JOptionPane.showMessageDialog(null,tabela);
    }
    private static void encerrarPrograma(){
        JOptionPane.showMessageDialog(null,"Você saiu do programa");
        System.exit(0);
    }
    private static void exibirMensagemDeErro(String mensagem){
        JOptionPane.showMessageDialog(null,mensagem);
    }
}
