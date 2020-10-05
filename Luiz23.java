/**
 * O número de inscrição no CPF é composto de onze dígitos decimais, sendo os oito primeiros
    aleatoriamente designados no momento da inscrição. Já o nono (antepenúltimo) dígito indica a região fiscal
    responsável pela inscrição (MG é a região 6, portanto em todos CPF’s emitidos em MG o nono digito é 6).
    Por fim, o décimo e o décimo primeiro são dígitos verificadores calculados de acordo com um
    algoritmo definido pela Receita Federal e publicamente conhecido.
    * 
    * Assim, implemente um algoritmo que receba de entrada 11 dígitos de um CPF qualquer (uma única
    variável inteira) e verifique se o valor inserido é ou não um CPF válido. Utilize as referências citadas
    anteriormente para realizar os cálculos para validação.
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
public class Luiz23 {
    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        int num1, num2, num3, num4,num5,num6,num7,num8,num9,num10,num11;
        System.out.println("Digite o seu CPF numero por numero ");
        System.out.println();
        num1 = teclado.nextInt();
        
         System.out.println();
        num2 = teclado.nextInt();
        
         System.out.println();
        num3 = teclado.nextInt();
        
         System.out.println();
        num4 = teclado.nextInt();
        
         System.out.println();
        num5 = teclado.nextInt();
        
         System.out.println();
        num6 = teclado.nextInt();
        
         System.out.println();
        num7 = teclado.nextInt();
        
         System.out.println();
        num8 = teclado.nextInt();
        
         System.out.println();
        num9 = teclado.nextInt();
        
         System.out.println();
        num10 = teclado.nextInt();
        
         System.out.println();
        num11 = teclado.nextInt();
        
        if((num1 == num2) && (num2 ==  num3) && (num3 ==  num4) && (num4 == num5) && (num5 ==  num6) && (num6 ==  num7) && (num7 ==  num8) && (num8 ==  num9) && (num9 ==  num10) && (num10 ==  num11)) {
            
            System.out.println("O valor informado não é verdade");
            
        
        } else {
            int soma = (num1 * 10) + (num2 * 9)+ (num3 * 8)+(num4 * 7)+(num5 * 6)+(num6 * 5)+(num7 * 4)+(num8 * 3)+(num9 * 2);
            
            int resto1 =(soma * 10) %11;
            
            if(resto1 ==10 ){
                resto1 =0;
            }
            
            int soma2 = (num1 *11) + (num2 *10) +( num3 *9) +(num4 *8) +(num5 *7 ) +(num6 *6) + (num7* 5 ) +(num8 * 4) +(num9 * 3) + (num10 *2);
            int resto2 = (soma2 *10) % 11;
            
            if(resto2 == 10){
                resto2 = 0;
                
            }
            if((resto1 == num10) && (num11 == resto2)){
                System.out.println("O CPF digitado é valido!");
        }else{
             System.out.println("O CPF digitado não é valido!");
        }
        } 
        
        
        
        
        
        
        
        
    }
}
        
    
    

    
    