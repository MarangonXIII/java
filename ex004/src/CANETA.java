public class CANETA {
    public String modelo;
    private float ponta;

    public String getmodelo(){
        return this.modelo;
    }
    public void setmodelo(String m){
        this.modelo = m;
    }
    public float getponta(){
        return this.ponta;
    }
    public void setponta(float p){
        this.ponta = p;
    }

    public void status(){
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
    }
}