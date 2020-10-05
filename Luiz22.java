/**
 *Faça um algoritmo que receba três números e mostre-os em ordem crescente e decrescente.
 * @author Luiz Felipe Alves Maia
 * IFMG - Sabara
 */
package luizlista2;
import java.util.Scanner;

/**
 *
 * @author Luiz Felipe
 */
public class Luiz22 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("digite o primeiro numero:");
        num1 =  teclado.nextInt();
        
        System.out.println("digite o segundo numero:");
        num2 =  teclado.nextInt();
        
        System.out.println("digite o terceiro numero:");
        num3 =  teclado.nextInt();
        
       if (num1 > num2 && num1 > num3){
           if(num2 > num3){
               System.out.println("a sequencia do maior para o menor é: " +num1+ " > "+num2+ " > " +num3);
              // num1>num2>num3
                       
           }else if(num3>num2){
                 System.out.println("a sequencia do maior para o menor é: " +num1+ " > "+num3+ " > " +num2);

            //  num1 > num3 >num2 
                      
           }
       }else if(num2>num3 &&  num2 > num1){
           if(num1 > num3 ){
                System.out.println("a sequencia do maior para o menor é: " +num2+ " > "+num1+ " > " +num3);

             //  num2 > num1 >num3
           } else if( num3 > num1){
               
                System.out.println("a sequencia do maior para o menor é: " +num2+ " > "+num3+ " > " +num1);

              // num2 > num3 >num1
           }
       }else if(num3> num2 && num3 > num1){
           if(num1> num2){
               
                System.out.println("a sequencia do maior para o menor é: " +num3+ " > "+num1+ " > " +num2);

              // num3>num1>num2
                       
           }else if(num2 >num1){
               
                System.out.println("a sequencia do maior para o menor é: " +num3+ " > "+num2+ " > " +num1);

              // num3 >num2 >num1
           }
       }
    }
    
}
