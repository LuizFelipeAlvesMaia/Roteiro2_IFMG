/**
  17. Faça um programa que receba de entrada três valores. Verificar se esses valores podem formar um
    triângulo. Caso não, informar que não forma um triângulo; caso sim, imprima que tipo de triângulo pode
    ser formado (escaleno, isósceles ou equilátero).
    * 
 * @author Luiz Felipe Alves Maia
 * IFMG - Sabara
 */
package luizlista2;
import java.util.Scanner;

/**
 *
 * @author Luiz Felipe
 */
public class Luiz17 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        int a, b ,c;
        
        System.out.println("Digite um valor para o lado A:");
        a=teclado.nextInt();
        
         System.out.println("Digite um valor para o lado B:");
        b=teclado.nextInt();
        
         System.out.println("Digite um valor para o lado C:");
        c=teclado.nextInt();
        
        int aux = b - c;
        int aux2 = a - c;
        int aux3 = a - b;
        
        if(Math.abs(aux)<a && a<(b+c)){
            
            if(Math.abs(aux2)< b && b <(a+c)){
                
                if(Math.abs(aux3) < c && c < (a+b)){
                    System.out.println("Os valores digitados são verdade para a condição de existencia de um triangulo!");
                }else{
                    System.out.println("O triangulo não corresponde a condição de existencia.");
                }
            }else{
                System.out.println("O triangulo não corresponde a condição de existencia.");
            }
            
        }else{
            System.out.println("O triangulo não corresponde a condição de existencia.");
        }
    }
}
