/**
 *Implemente um algoritmo que receba de entrada um valor inteiro com 4 dígitos e verifique se o mesmo
    pertence à família dos binários. Para isto, “desmembre” o número digitado verifique se foram digitados
    somente bits. Caso o número digitado seja binário, seu algoritmo deve o converter para decimal e mostrar o
    rsultado.
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
public class Luiz19 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        int num1;
        
        System.out.println("Digite um numero de 4 digitos:");
        num1 =  teclado.nextInt();
        
        
        String bin = Integer.toString(num1);
        
       if(
          num1 == 0000 ||
          num1 == 0001 ||
          num1 == 0010 ||
          num1 == 0011 ||
          num1 == 0100 ||
          num1 == 0101 ||
          num1 == 0110 ||
          num1 == 0111 ||
          num1 == 1000 ||
          num1 == 1001 ||
          num1 == 1010 ||
          num1 == 1011 ||
          num1 == 1100 ||
          num1 == 1101 ||
          num1 == 1110 ||
          num1 == 1111  
               ) {
          
         System.out.print("O numero que você digitou é da base binaria");
         int num2 = Integer.parseInt(bin, 2);//Nome da variavel e tipo, 2 = binary. Converte o binario para int
           System.out.println(num2);
         
         
       
           
           
       }
            

            
        }
                
        
                

            
    }

