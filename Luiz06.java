/**
 * Faça um programa que simule uma calculadora simples. Para isso, o usuário deverá entrar com dois
    números quaisquer e a operação que deseja realizar: '+' soma; ' - ' subtração; ' * ' multiplicação e ' / '
    divisão. Lembre-se das condições para realizar a divisão. Utilize a estrutura switch/case e apresente um
    menu de opções para o usuário.
    
 * @author Luiz Felipe Alves Maia
 * IFMG - Sabara
 */

package luizlista2;

import java.util.Scanner;


public class Luiz06 {
     public static void main( String [] args){
        Scanner teclado = new Scanner(System.in);
       int n;
       double numero, media=0, soma=0 , m = 0 ;
       
       double soma1, subtracao1=0,multiplicacao1=0, divisao1=0;
       char operacao;
       
       System.out.println(
                                "Menu da calculador \n"  
                +"Digite a operação matemática que deseja realizar: \n"
       +"======================================================================= \n"
                + "soma = a \n"
                + "subtração = b \n"
                + "multiplicação = c \n"
                + "divisão = d \n"
     +"============================================================================= \n" 
       +"Operação: ");
        operacao = teclado.next().charAt(0);
        
        switch(operacao){
            case 'a':
                System.out.println("Digite quantos numeors deseja somar:");
                n = teclado.nextInt();
       
                 for ( int i =1; i<=n;i=i+1){
                    System.out.println("Digite o"+i+" numero:");
                    numero = teclado.nextFloat();
                    soma=numero+soma;       
                }
                     System.out.println(soma);
                break;
                case 'b':
                        System.out.println("Digite quantos numeors deseja subitrair:");
                         n = teclado.nextInt();
       
                        for ( int i =1; i<=n;i=i+1){
                            System.out.println("Digite o"+i+" numero:");
                            numero = teclado.nextFloat();
                             subtracao1=numero-subtracao1;
                        }
                    System.out.println(subtracao1);
                break;
                case 'c':
                    System.out.println("Digite quantos numeors deseja multiplicar:");
                         n = teclado.nextInt();
       
                        for ( int i =1; i<=n;i=i+1){
                            System.out.println("Digite o"+i+" numero:");
                            numero = teclado.nextFloat();
                            multiplicacao1 =numero*multiplicacao1;
                        }   
                     System.out.print(multiplicacao1);
                break;
                
                case 'd':
                     System.out.println("Digite quantos numeors deseja dividir:");
                         n = teclado.nextInt();
       
                        for ( int i =1; i<=n;i=i+1){
                           
                            System.out.println("Digite o"+i+" numero:");
                            numero = teclado.nextFloat();
                             divisao1=numero/divisao1;
                        } 
                        if(divisao1 == 0){
                                                        System.out.println("O denominador digitado não respeita as regras da divisão");

                        }else{
                            System.out.print(divisao1);
                        }
                 
                     
                break;
                
                
                
                
                
                
                
                
                
      
        }
    
    }
}
