import java.util.ArrayList;

public class Times{
    private final String nome;
    private int totalJogos;
    private int vitorias;
    private int empates;
    private int derrotas;
    private int pontos;
    private int golsMarcados;
    private int golsSofridos;
    private int saldoGols;
    private final ArrayList<Times> jogosFeitos;

    public Times(String nome){
        this.nome=nome;
        this.totalJogos=0;
        this.vitorias=0;
        this.empates=0;
        this.derrotas=0;
        this.pontos=0;
        this.golsMarcados=0;
        this.golsSofridos=0;
        this.saldoGols=0;
        this.jogosFeitos = new ArrayList<>();
    }

    public boolean isJogosFeitos(Times time){
        return !jogosFeitos.contains(time);
    }
    public void addJogosFeitos(Times time){
        jogosFeitos.add(time);
    }
    public void registrarVitoria(int golsMarcados,int golsSofridos){
        atualizarEstatisticas(golsMarcados,golsSofridos);
        totalJogos++;
        vitorias++;
        pontos+=3;
    }
    public void registrarEmpate(int golsMarcados,int golsSofridos){
        atualizarEstatisticas(golsMarcados,golsSofridos);
        totalJogos++;
        empates++;
        pontos++;
    }
    public void registrarDerrota(int golsMarcados,int golsSofridos){
        atualizarEstatisticas(golsMarcados,golsSofridos);
        totalJogos++;
        derrotas++;
    }
    private void atualizarEstatisticas(int golsMarcados,int golsSofridos){
        this.golsMarcados+=golsMarcados;
        this.golsSofridos+=golsSofridos;
        saldoGols+=golsMarcados-golsSofridos;
    }
    public ArrayList<Object> toArray(){
        ArrayList<Object> dados = new ArrayList<>();
        dados.add(nome);
        dados.add(totalJogos);
        dados.add(vitorias);
        dados.add(empates);
        dados.add(derrotas);
        dados.add(pontos);
        dados.add(golsMarcados);
        dados.add(golsSofridos);
        dados.add(saldoGols);
        return dados;
    }
    @Override
    public String toString(){
        return String.format("%-15s %5d %5d %5d %5d %5d %8d %10d %10d",nome,totalJogos,vitorias,empates,derrotas,pontos,golsMarcados,golsSofridos,saldoGols);
    }
    public void addPartida(Jogo jogo){
        totalJogos++;
        int golsTime1=jogo.getGolsTime1();
        int golsTime2=jogo.getGolsTime2();
        golsMarcados+=(jogo.getTime1().equals(this)?golsTime1:golsTime2);
        golsSofridos+=(jogo.getTime1().equals(this)?golsTime2:golsTime1);
        if(golsTime1>golsTime2){
            vitorias++;
            pontos+=3;
        }else if(golsTime2>golsTime1){
            derrotas++;
        }else{
            empates++;
            pontos++;
        }
    }
    public void imprimirDados(){
        System.out.printf("%-15s \t\t\t\t%4d \t\t\t\t%4d \t\t\t\t%4d \t\t\t\t%4d \t\t\t\t%4d \t\t\t\t%4d \t\t\t\t%4d \t\t\t\t%4d\n",nome,totalJogos,vitorias,empates,derrotas,pontos,golsMarcados,golsSofridos,saldoGols);
    }
    public void addEmpate(){
        totalJogos++;
        empates++;
        pontos++;
    }
    public void addVitoria(int golsVencedor,int golsPerdedor){
        totalJogos++;
        vitorias++;
        pontos+=3;
        golsMarcados+=golsVencedor;
        golsSofridos+=golsPerdedor;
        saldoGols+=(golsVencedor-golsPerdedor);
    }
    public void addGolsMarcados(int golsTime1){
        golsMarcados+=golsTime1;
        saldoGols+=golsTime1;
    }
    public void addGolsSofridos(int golsTime2){
        golsSofridos+=golsTime2;
        saldoGols-=golsTime2;
    }
    public void addDerrota(int golsPerdedor,int golsVencedor){
        totalJogos++;
        derrotas++;
        golsMarcados+=golsPerdedor;
        golsSofridos+=golsVencedor;
        saldoGols+=(golsPerdedor-golsVencedor);
    }
    public boolean getJogosFeitos(Times timetest){
        return !jogosFeitos.contains(timetest);
    }
    public boolean setJogosFeitos(Times timefim){
        jogosFeitos.add(timefim);
        return true;
    }

    public String getNome(){
        return nome;
    }
    public int getTotalJogos(){
        return totalJogos;
    }
    public int getVitorias(){
        return vitorias;
    }
    public int getEmpates(){
        return empates;
    }
    public int getDerrotas(){
        return derrotas;
    }
    public int getPontos(){
        return pontos;
    }
    public int getGolsMarcados(){
        return golsMarcados;
    }
    public int getGolsSofridos(){
        return golsSofridos;
    }
}
