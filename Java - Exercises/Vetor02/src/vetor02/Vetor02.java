/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor02;

/**
 *
 * @author Michel
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes[] = {"jan", "fev", "march"};
        int tot[] = {31,28,31};
        for (int c = 0; c<mes.length; c++){
            System.out.println("o mes de " + mes[c] +" tem "+ tot[c]+" dias ao todo");
        }
    }
    
}
