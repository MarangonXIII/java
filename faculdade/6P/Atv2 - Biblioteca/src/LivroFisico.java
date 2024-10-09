public class LivroFisico extends Livro {
    private double Peso; //Private: sem acesso de fora da classe
    
    public LivroFisico (String Titulo, String Autor, int AnoPublicacao, double Peso){
        super(Titulo, Autor, AnoPublicacao);
        this.Peso = Peso; //peso em gramas
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }

    @Override
    /*A notação @override é uma forma de garantir que estamos na verdade sobreescrevendo um metodo*/

    public void descricao() {
        System.out.println("Título: " + Titulo + "Autor: " + Autor + "Publicado em: " + AnoPublicacao + "Peso: " + Peso + "Descrição: sua mãe de cueca ");
    }

}
