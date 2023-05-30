
package computador;

public class Computador {
    String modelo;
    boolean energia;
    String perifericos;
    
    void status(){
        System.out.println("Um computador " + this.modelo);
        System.out.println("Ele esta ligado? " + this.energia);
        System.out.println("Ele tem quais perifericos? " + this.perifericos);
    }
    
    void inicializar(){
        if (this.energia == true){
            System.out.println("Ligando computador");
        } else {
            System.out.println("Computador nao pode ser inicializado");
        }
    }
    
    void desligar(){
        this.energia = false;
    }
    void ligar(){
        this.energia = true;
    }
}
