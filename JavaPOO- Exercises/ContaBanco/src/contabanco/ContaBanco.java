
package contabanco;


public class ContaBanco {
    private int numConta;
    private String tipo;
    private float saldo;
    private String dono;
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Status: " + this.getStatus() + " True = Aberta e False = Fechada");
    }

    public ContaBanco(){
        this.saldo = 0;
        this.status = false;
    }
    public int getNumConta() {
        return numConta;
    }
    
    public void setNumConta(int numConta){
        this.numConta = numConta;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public float getSaldo(){
        return saldo;
    }
    
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    
    public String getDono(){
        return dono;
    }
    
    public void setDono(String dono){
        this.dono = dono;
    }
    
    public boolean getStatus(){
        return status;
    }
    
    public void setStatus(boolean status){
        this.status = status;
    }
    
    public void abrirConta(String t){
        this.setStatus(true);
        this.setTipo(t);
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP"){
            this.setSaldo(100);
        }
        System.out.println("Conta Aberta com sucesso, " + this.getDono());
    }
    
    public void fecharConta(){
        if (this.getSaldo() < 0) {
            System.out.println("Não foi possivel encerrar a conta, quite seus debitos.");
        } else if (this.getSaldo() > 0){
            System.out.println("Não foi possivel fechar a conta pois possui dinheiro.");
        } else{
            this.setStatus(false);
            System.out.println("Conta Encerrada com sucesso.");
        }
    }
    
    public void depositar(float v){
        if (this.getStatus() == true){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado no valor de: " + v + " na conta de: " + this.getDono());
        } else {
            System.out.println("Não é possivel depositar em uma conta fechada");
        }
    }
    
    public void sacar(float v) {
        if (this.getStatus() == true){
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() -  v);
                System.out.println("Saque realizado da conta de: " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque, " + this.getDono());
            }
        } else {
            System.out.println("Não foi possivel achar a conta, verificar se a mesma está fechada.");
        }
    }
    
    public void pagarMensal(){
        int v = 0;
        if (this.getStatus() == true) {
            if (this.getTipo() == "CP") {
                v = 12;
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Mensalidade paga com sucesso");
            } else if(this.getTipo() == "CC"){
                v = 20;
                this.setSaldo(this.getSaldo() - v);
            }
        } else {
            System.out.println("Conta não existente");
        }
    }
}
