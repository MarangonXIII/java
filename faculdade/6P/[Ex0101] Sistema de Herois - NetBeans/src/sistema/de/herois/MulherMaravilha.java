public class MulherMaravilha extends Heroi {
    public MulherMaravilha (String nome, int poder){
        super(nome, poder);
    }

    @Override
    /*A notação @override é uma forma de garantir que estamos na verdade sobreescrevendo um metodo*/

    public void usarPoder(){
        System.out.println(nome + " tem chicote ");
    }
}
