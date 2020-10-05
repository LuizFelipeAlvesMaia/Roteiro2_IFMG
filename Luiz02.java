/**
 * Faça um algoritmo que dado um número digitado pelo usuário mostre se o mesmo é par ou ímpar.
 * @author Luiz Felipe Alves Maia
 * IFMG - Sabara
 */
package luizlista2;

import java.util.Scanner;


public class Luiz02 {
     public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
       int numero;
       double aux;
       
       
       System.out.println("Digite um valor númerico positivo e inteiro:");
       numero = teclado.nextInt();
       
       aux = numero %2;
       
       if(aux ==0){
           System.out.println("O numero,"+numero+", é par.");
       }else {
                      System.out.println("O numero,"+numero+", é ímpar.");

       }
    }
}
