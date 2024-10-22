import java.util.Random;

public class Jogo{
    private final Times time1;
    private final Times time2;
    private int golsTime1;
    private int golsTime2;
    private boolean jogoFeito;

    public Jogo(Times time1,Times time2){
        this.time1 = time1;
        this.time2 = time2;
        this.golsTime1 = 0;
        this.golsTime2 = 0;
        this.jogoFeito = false;
    }

    public void simularJogo(){
        Random random = new Random();
        this.golsTime1 = random.nextInt(6);
        this.golsTime2 = random.nextInt(6);
        addEstatisticas();
        resultado();
        this.jogoFeito = true;
    }
    private void addEstatisticas(){
        time1.addGolsMarcados(golsTime1);
        time1.addGolsSofridos(golsTime2);
        time2.addGolsMarcados(golsTime2);
        time2.addGolsSofridos(golsTime1);
    }
    private void resultado(){
        if (golsTime1>golsTime2) {
            time1.addVitoria(golsTime1, golsTime2);
            time2.addDerrota(golsTime2, golsTime1);
        }else if(golsTime2>golsTime1){
            time2.addVitoria(golsTime2, golsTime1);
            time1.addDerrota(golsTime1, golsTime2);
        }else{
            time1.addEmpate();
            time2.addEmpate();
        }
    }

    public Times getTime1(){
        return time1;
    }
    public Times getTime2(){
        return time2;
    }
    public int getGolsTime1(){
        return golsTime1;
    }
    public int getGolsTime2(){
        return golsTime2;
    }
    public boolean isJogoRealizado(){
        return jogoFeito;
    }
    public void imprimirResultado(){
        String resultado = time1.getNome()+" "+golsTime1+" X "+golsTime2+" " + time2.getNome();
        System.out.println(resultado);
    }
}
