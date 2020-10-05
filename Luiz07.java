/**
 * Faça um programa que solicite ao usuário que digite um caracter e em seguida imprima se o caracter
    digitado é ou não uma vogal.
    
 * @author Luiz Felipe Alves Maia
 * IFMG - Sabara
 */
package luizlista2;

import java.util.Scanner;

/**
 *
 * @author Luiz Felipe
 */
public class Luiz07 {
    public static void main(String []args){ 
   Scanner teclado = new Scanner(System.in); 

   System.out.println("introduza a letra:"); 
    String N=teclado.next();
   char c=N.charAt(0);
   //N=read.nextLine(); 
   System.out.println(N);
   
    switch(c){ 

   case'a': 
   case'e': 
   case'i': 
   case'o': 
   case'u': 
   case'A': 
   case'E':
   case'I': 
   case'O':
   case'U': 
      System.out.println("A letra ("+c+") é uma vogal"); 
      break; 
     default: 
      System.out.println("A letra ("+c+") é uma consoante"); 
     } 

 } 
}
