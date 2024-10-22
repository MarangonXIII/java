public class Superman extends Heroi{
    public Superman (String nome, int poder){
        super(nome, poder);
    }

    @Override
    /*A notação @override é uma forma de garantir que estamos na verdade sobreescrevendo um metodo*/

    public void usarPoder(){
        System.out.println(nome + " sabe voar, tem visão a laser, super força, visão de raio x ");
    }
}
