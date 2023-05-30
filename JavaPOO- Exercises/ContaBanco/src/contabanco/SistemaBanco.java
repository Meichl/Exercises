
package contabanco;


public class SistemaBanco {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setDono("M");
        p1.abrirConta("CC");
        p1.setNumConta(1010);
        p1.depositar(400);
        p1.pagarMensal();
        p1.sacar(100);
        p1.estadoAtual();
    }
    
}
