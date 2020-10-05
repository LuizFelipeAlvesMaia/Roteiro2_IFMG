/**
 * Crie um programa que solicite a entrada de dois números, em seguida imprima na tela o quadrado do
    menor e a raiz quadrada do maior número, caso os números sejam iguais mostre uma mensagem
    informando que os números são iguais. Lembre-se de verificar as condições para um número possuir raiz
    quadrada real.
    
 * @author Luiz Felipe Alves Maia
 * IFMG - Sabara
 */
package luizlista2;

import java.util.Scanner;


public class Luiz03 {
    public static void main(String[] args){
      Scanner teclado = new Scanner(System.in);  
      int num1, num2;
      
      System.out.println("Digite valores para dois numeros!");
            System.out.println("Numero 1:");
            num1=teclado.nextInt();
            System.out.println("Numero 2:");
            num2 = teclado.nextInt();
            
            if (num1 < num2 ){
                            System.out.println(Math.sqrt(num2));
                            System.out.println(Math.pow(num1, 2));

            }else if(num1 > num2){
                            System.out.println(Math.sqrt(num1));
                            System.out.println(Math.pow(num2, 2));
            }else if(num1 == num2){
                System.out.println("Os numeros digitados sâo identicos!");
            }
    }
}
