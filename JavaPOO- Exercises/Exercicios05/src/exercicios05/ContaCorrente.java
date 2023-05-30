package exercicios05;

public class ContaCorrente {
    public int numConta;
    protected String tipo;
    private float saldo;
    private String dono;
    private boolean status;
    
    public void estadoAtual() {
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public ContaCorrente() {
        this.saldo = 0;
        this.status = false;
    }
    

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }
    
    public boolean getStatus(){
        return status;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }
    // cc 50 cp 150 e mensalidade 12 e 20
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta.");
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada, há dinheiro");
        } else if (this.getSaldo() < 0){
            System.out.println("Conta possui débito, não pode fechar.");
        } else {
            this.setStatus(false);
            System.out.println("Conta encerrada.");
        }
    }
    
    public void depositar(float v){
        if (this.getStatus()) {
            //this.saldo = this.saldo + v;
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta: " + this.getDono());
        } else {
            System.out.println("Impossivel realizar em uma conta fechada");
        }
    }
    
    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta " + this.getDono());
            } else {
                System.out.println("Saldo Insuficiente");
            }
        } else {
            System.out.println("Impossivel sacar em conta fechada");
        }
    }
    
    public void pagarMensal() {
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP"){
            v = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga por " + this.getDono());
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }
}
