public class App {
    public static void main(String[] args){
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(333);
        p1.setDono("Newto");
        p1.abrirConta("CP");

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(666);
        p2.setDono("Mao de pica");
        p2.abrirConta("CC");

        p1.depositar(123456789);
        p2.sacar(50);

        p1.estadoAtual();
        p2.estadoAtual();


    }
}
