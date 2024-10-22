import java.util.ArrayList;

public class SistemaDeHerois {
    public static void main(String[] args){
        // Criação dos Objetos
        Heroi batman = new Batman ("Batman", 75);
        Heroi superman = new Superman ("Superman", 93);
        Heroi aquaman = new Aquaman ("Aquaman", 22);
        Heroi flash = new Flash ("Flash", 55);
        Heroi mulhermaravilha = new MulherMaravilha("Mulher Maravilha", 44);

        //Exibindo informações dos poderes
        /*System.out.println(batman.getNome() + " tem nivel de poder igual a: " + batman.getPoder());
        System.out.println(superman.getNome() + " tem nivel de poder igual a: " + superman.getPoder());*/

        //Modificando o poder do Batman
        superman.setPoder(120);
        /*System.out.println(batman.getNome() + " tem nivel de poder igual a: " + batman.getPoder());*/

        //Adicionando os Herois a lista
        ArrayList<Heroi> herois = new ArrayList<>();
        herois.add(batman);
        herois.add(superman);
        herois.add(aquaman);
        herois.add(flash);
        herois.add(mulhermaravilha);

        //Percorrendo a lista e chamando o metodo usarPoder()
        for (Heroi heroi : herois){
            System.out.println(heroi.getNome() + " tem nivel de poder igual a: " + heroi.getPoder());
            heroi.usarPoder();
        }
    }
}
