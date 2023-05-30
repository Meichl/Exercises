
package computador;


public class Exercicio {


    public static void main(String[] args) {
        Computador dell = new Computador();
        dell.modelo = "Dell";
        dell.perifericos = "Teclado, mouse e monitor";
        dell.status();
        dell.ligar();
        dell.inicializar();
    }
    
}
