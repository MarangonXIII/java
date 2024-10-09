import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class Campeonato{
    private final ArrayList<Times> times = new ArrayList<>();
    private final int[][] pontuacao;

    public Campeonato(int numTimes){
        pontuacao = new int[numTimes][7];
    }

    public boolean cadastrarTime(Times time){
        if(times.size() == pontuacao.length){
            return false;
        }
        times.add(time);
        return true;
    }
    public boolean timeCadastrado(Times time){
        return times.contains(time);
    }
    public ArrayList<Times> getTimes(){
        return times;
    }
    public int[][] getPontuacao(){
        return pontuacao;
    }
    public void registrarJogo(Times time1,Times time2){
        if(time1==time2){
            JOptionPane.showMessageDialog(null,"Impossível jogar sozinho!");
            return;
        }
        if(!time1.getJogosFeitos(time2) || !time2.getJogosFeitos(time1)){
            JOptionPane.showMessageDialog(null,"Os times já jogaram juntos");
            return;
        }

        int indiceTime1 = times.indexOf(time1);
        int indiceTime2 = times.indexOf(time2);
        Random random = new Random();
        int golsTime1 = random.nextInt(6);
        int golsTime2 = random.nextInt(6);
        pontuacao[indiceTime1][0]++;
        pontuacao[indiceTime2][0]++;
        pontuacao[indiceTime1][5]+=golsTime1;
        pontuacao[indiceTime1][6]+=golsTime2;
        pontuacao[indiceTime2][5]+=golsTime2;
        pontuacao[indiceTime2][6]+=golsTime1;
        if(golsTime1>golsTime2){
            pontuacao[indiceTime1][1]++;
            pontuacao[indiceTime1][4]+=3;
            pontuacao[indiceTime2][3]++;
        }else if(golsTime1<golsTime2){
            pontuacao[indiceTime2][1]++;
            pontuacao[indiceTime2][4]+=3;
            pontuacao[indiceTime1][3]++;
        }else{
            pontuacao[indiceTime1][2]++;
            pontuacao[indiceTime1][4]++;
            pontuacao[indiceTime2][2]++;
            pontuacao[indiceTime2][4]++;
        }
        time1.setJogosFeitos(time2);
        time2.setJogosFeitos(time1);
    }
    public ArrayList<Times> getTimesOrdenadosPorPontuacao(){
        ArrayList<Times> timesOrdenados = new ArrayList<>(times);
        timesOrdenados.sort((t1, t2)->{
            int pontosTime1 = pontuacao[times.indexOf(t1)][4];
            int pontosTime2 = pontuacao[times.indexOf(t2)][4];
            if(pontosTime1>pontosTime2){
                return -1;
            }else if(pontosTime1<pontosTime2){
                return 1;
            }else{
                int saldoTime1 = pontuacao[times.indexOf(t1)][5]-pontuacao[times.indexOf(t1)][6];
                int saldoTime2 = pontuacao[times.indexOf(t2)][5]-pontuacao[times.indexOf(t2)][6];
                if(saldoTime1>saldoTime2){
                    return -1;
                } else if (saldoTime1<saldoTime2){
                    return 1;
                }else{
                    return 0;
                }
            }
        });
        return timesOrdenados;
    }
    public Times getTimeNome(String nomeTime){
        for (Times time:times){
            if (time.getNome().equals(nomeTime)){
                return time;
            }
        }
        return null;
    }
}
