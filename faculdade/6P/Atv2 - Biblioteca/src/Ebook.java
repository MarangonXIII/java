public class Ebook extends Livro{
    private double TamanhoArquivo; //Private: sem acesso de fora da classe
    
    public Ebook (String Titulo, String Autor, int AnoPublicacao, double TamanhoArquivo){
        super(Titulo, Autor, AnoPublicacao);
        this.TamanhoArquivo = TamanhoArquivo; //Tamanho em Megabyte
    }
    
    public double getTamanhoArquivo() {
        return TamanhoArquivo;
    }

    public void setTamanhoArquivo(double tamanhoArquivo) {
        TamanhoArquivo = tamanhoArquivo;
    }

    @Override
    /*A notação @override é uma forma de garantir que estamos na verdade sobreescrevendo um metodo*/

    public void descricao() {
        System.out.println("Título: " + Titulo + "Autor: " + Autor + "Publicado em: " + AnoPublicacao + "Tamanho: " + TamanhoArquivo + "Descrição: sua mãe de cueca ");
    }
    
}