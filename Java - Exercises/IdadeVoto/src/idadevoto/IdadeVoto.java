/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package idadevoto;

import java.util.Scanner;

/**
 *
 * @author Michel
 */
public class IdadeVoto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        System.out.print("Digite o ano que nasceu: ");
        int ano = t.nextInt();
        int idade = 2022 - ano;
        if (idade < 16){
            System.out.println("Nao vota");
        } else {
            if ((idade >= 16 && idade < 18) || (idade > 70)){
                System.out.println("Voto Opcional");
            } else {
                System.out.println("Voto Obrigatorio");
            }
        } System.out.println("Voce tem " + idade + " anos");
    } 
    
}
