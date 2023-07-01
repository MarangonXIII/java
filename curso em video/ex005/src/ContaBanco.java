public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    //Métodos Personalizados

    public void estadoAtual(){
        System.out.println("-------------------------------");
        System.out.println("Conta: "+this.getNumConta());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Dono: "+this.getDono());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+this.getStatus());
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t=="CC") {
            this.setSaldo(50);
        } else if (t=="CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    public void fecharConta(){
        if(this.getSaldo()>0){
            System.out.println("A conta não pode ser fechada, saldo superior a 0(zero)");
            System.out.println("Retire o dinheiro da conta");
        }else if(this.getSaldo()<0){
            System.out.println("A conta não pode ser fechada, saldo inferior a 0(zero)");
            System.out.println("Pague a divida pendente");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    public void depositar(double v){
        if (this.getStatus()==true) {
            this.setSaldo(this.getSaldo()+v);
            System.out.println("Depósito realizado com sucesso na conta de " + this.getDono());
        }else{
            System.out.println("Conta fechada, não é possível depositar");
        }
    }
    public void sacar(float v){
        if (this.getStatus()) {
            if (this.getSaldo()>=v) {
                this.setSaldo(this.getSaldo()-v);
                System.out.println("Saque realizado com sucesso na conta de " + this.getDono());
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Conta fechada, não é possível sacar");
        }

    }
    public void pagarMensal(){
        int v=0;
        if (this.getTipo()=="CC"){
            v=12;
        }else if(this.getTipo()=="CP"){
            v=20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo()-v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        }else{
            System.out.println("Conta fechada, não é possível pagar mensalidade");
        }
    }

    //Métodos Especiais

    public void ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }
    public void setNumConta(int n){
        this.numConta = n;
    }
    public int getNumConta(){
        return this.numConta;
    }
    public void setTipo(String t){
        this.tipo = t;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setDono(String d){
        this.dono = d;
    }
    public String getDono(){
        return this.dono;
    }
    public void setSaldo(double s){
        this.saldo = s;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void setStatus(boolean s){
        this.status = s;
    }
    public boolean getStatus(){
        return this.status;
    }
}
