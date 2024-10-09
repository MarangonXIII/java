public class Batman extends Heroi{
    public Batman (String nome, int poder){
        super(nome, poder);
    }

    @Override
    /*A notação @override é uma forma de garantir que estamos na verdade sobreescrevendo um metodo*/

    public void usarPoder(){
        System.out.println(nome + " é rico, sabe planar, mestre combate ");
    }
}
