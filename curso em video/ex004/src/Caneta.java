public class Caneta {
    private String modelo;
    private double ponta;
    private String cor;
    private boolean tampada;

    public Caneta(String m, String c, double p){ //Este é o método Construtor
        this.tampar();
        this.setPonta(p);
        this.setModelo(m);
        this.setCor(c);
    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public double getPonta(){
        return this.ponta;
    }
    public void setPonta(double p){
        this.ponta = p;
    }
    public String getCor(){
        return this.cor;
    }
    public void setCor(String c){
        this.cor = c;
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }

    public void status(){
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Ponta: " + this.getCor());
        System.out.println("Tampada: " + this.tampada);
    }
}