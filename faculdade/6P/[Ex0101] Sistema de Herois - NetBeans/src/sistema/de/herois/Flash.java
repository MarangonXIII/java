public class Flash extends Heroi {
    public Flash (String nome, int poder){
        super(nome, poder);
    }

    @Override
    /*A notação @override é uma forma de garantir que estamos na verdade sobreescrevendo um metodo*/

    public void usarPoder(){
        System.out.println(nome + " tem supervelocidade, pode voltar no tempo, pode desacelerar o tempo ");
    }
}
