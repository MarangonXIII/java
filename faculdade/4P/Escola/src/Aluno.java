import java.util.ArrayList;

public class Aluno{
    private final String matricula;
    private final String nome;
    private final int periodo;
    private int qtDeFaltas;
    private int mediaAprovacao;
    private final ArrayList<Double> notas;

    public Aluno(String matricula, String nome, int periodo){
      this.matricula = matricula;
        System.out.println("Matricula: "+matricula);
        this.nome = nome;
        System.out.println("Aluno: "+nome);
        this.periodo = periodo;
        System.out.println("Periodo: "+periodo);
        this.mediaAprovacao = 60;
        this.qtDeFaltas = 0;
        this.notas = new ArrayList<>();
    }

    public void addNota(double nota){
        if (nota<=30){
            notas.add(nota);
            System.out.println("Nota "+notas.size()+": "+nota);
        }
    }
    public double getNota(int numProva){
        if(numProva>=1 && numProva<=notas.size()){
            return notas.get(numProva-1);
        }
        return 0;
    }
    public void recebeFalta(){
        this.qtDeFaltas+=2;
    }

    public void imprimeFaltas(){
        System.out.println("Quant. Faltas: "+qtDeFaltas);
    }
    public double calcMedia(){
        if(notas.isEmpty()) {
            System.out.println("Informe mais notas para avaliar o aluno.");
            return 0;
        }
        double soma=0;
        for(double nota:notas){
            soma+=nota;
        }
        double media=soma/notas.size();
        System.out.println("Media: "+media);
        return media;
    }
    public double calcNotaFinal(){
        if(notas.isEmpty()){
            System.out.println("Informe mais notas para avaliar o aluno.");
            return 0;
        }
        double soma=0;
        for(double nota : notas){
            soma+=nota;
        }
        double notaFinal=soma;
        System.out.println("Nota Final: "+notaFinal);
        if(notaFinal<=100){
            return notaFinal;
        }else{
            return -1;
        }
    }
    public boolean eAprovado(){
        if(notas.size()<4){
            System.out.println("Informe mais notas para avaliar o aluno.");
            return false;
        }
        double media=calcMedia();
        if(mediaAprovacao<media && qtDeFaltas<=10){
            System.out.println("Aluno aprovado");
            return true;
        }else{
            System.out.println("Aluno reprovado");
            return false;
        }
    }
    public String getMatricula(){
        return matricula;
    }
    public String getNome(){
        return nome;
    }
    public int getPeriodo(){
        return periodo;
    }
    public void setMediaAprovacao(int mediaAprovacao){
        if (mediaAprovacao>=40 && mediaAprovacao<=80){
            this.mediaAprovacao = mediaAprovacao;
        }
    }
    public int getMediaAprovacao(){
        return mediaAprovacao;
    }
    public int getQtDeNotas(){
        return notas.size();
    }
    public int getQtDeFaltas(){
        return qtDeFaltas;
    }
}
