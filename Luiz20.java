/**
 * Elabore um programa que realize o mesmo procedimento do fluxograma abaixo. A função mod utilizada
    no fluxograma representa o resto da divisão interia.
 * @author Luiz Felipe Alves Maia
 * IFMG - Sabara
 */
package luizlista2;
import java.util.Scanner;


public class Luiz20 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int n1, n2;
        System.out.println("Digite o valor para o primeiro numero:");
        n1 = teclado.nextInt();
        
          System.out.println("Digite o valor para o segundo numero:");
        n2 = teclado.nextInt();
        
        if( n1 % n2 == 0 ){
            
                      System.out.println("O valor do número 1 é multiplo do número 2");

        }else {
                      System.out.println("Número 1 não é multiplo do número 2");

        }
    }
    
}
