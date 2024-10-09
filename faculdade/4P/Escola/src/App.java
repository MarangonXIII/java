public class App{
  public static void main(String[] args){
        
    Aluno aluno1 = new Aluno("Aln-1364","Pele",1);
      aluno1.addNota(18);
      aluno1.addNota(20);
      aluno1.addNota(15);
      aluno1.addNota(1);
      aluno1.recebeFalta();
      aluno1.recebeFalta();
      aluno1.recebeFalta();
      aluno1.imprimeFaltas();
      aluno1.calcNotaFinal();
      aluno1.calcMedia();
      aluno1.eAprovado();

    Aluno aluno2 = new Aluno("Aln-2451","Zidane",5);
      aluno2.addNota(25);
      aluno2.addNota(30);
      aluno2.addNota(27);
      aluno2.recebeFalta();
      aluno2.imprimeFaltas();
      aluno2.calcNotaFinal();
      aluno2.calcMedia();
      aluno2.eAprovado();

    Aluno aluno3 = new Aluno("Aln-1009","Maradona",3);
      aluno3.addNota(20);
      aluno3.addNota(10);
      aluno3.addNota(18);
      aluno3.addNota(15);
      aluno3.addNota(17);
      aluno3.recebeFalta();
      aluno3.recebeFalta();
      aluno3.recebeFalta();
      aluno3.recebeFalta();
      aluno3.recebeFalta();
      aluno3.recebeFalta();
      aluno3.recebeFalta();
      aluno3.recebeFalta();
      aluno3.recebeFalta();
      aluno3.recebeFalta();
      aluno3.recebeFalta();
      aluno3.recebeFalta();
      aluno3.imprimeFaltas();
      aluno3.calcNotaFinal();
      aluno3.calcMedia();
      aluno3.eAprovado();
  }
}
