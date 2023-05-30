
package exercicios05;

public class Exercicios05 {

    public static void main(String[] args) {
        ContaCorrente p1 = new ContaCorrente();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        p1.depositar(100);
        p1.sacar(40);
        
        ContaCorrente p2 = new ContaCorrente();
        p2.setNumConta(2222);
        p2.setDono("Creuza");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(200);
        
        p1.sacar(110);
        p1.fecharConta();
        p1.pagarMensal();
        
        p1.estadoAtual();
        System.out.println("----------------------");
        p2.estadoAtual();
    }
    
}
