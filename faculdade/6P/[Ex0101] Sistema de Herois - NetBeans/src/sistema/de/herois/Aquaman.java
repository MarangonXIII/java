public class Aquaman extends Heroi{
    public Aquaman (String nome, int poder){
        super(nome, poder);
    }

    @Override
    /*A notação @override é uma forma de garantir que estamos na verdade sobreescrevendo um metodo*/

    public void usarPoder(){
        System.out.println(nome + " falar com animais, controla os mares e oceanos ");
    }
}
