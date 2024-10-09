public class Ebook extends Livro{
    private double TamanhoArquivo; //Private: sem acesso de fora da classe
    
    public Ebook (String Titulo, String Autor, int NumeroPaginas, double TamanhoArquivo){
        super(Titulo, Autor, NumeroPaginas);
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
        System.out.println("Título: " + Titulo + "Autor: " + Autor + "Número de páginas: " + NumeroPaginas + "Tamanho: " + TamanhoArquivo + "Descrição: sua mãe de cueca ");
    }
    
}