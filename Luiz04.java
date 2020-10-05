/**
 * Refaça o exercício referente à equação do segundo grau do roteiro anterior considerando todas as
    condições possíveis, conforme fluxograma abaixo.
    
 * @author Luiz Felipe Alves Maia
 * IFMG - Sabara
 */
package luizlista2;

import java.util.Scanner;


public class Luiz04 {
     public static void main(String[] args){
        int varA, varB, varC, r; 
        double delta, x1, x2;
        
        
        Scanner teclado= new Scanner(System.in);
        
        System.out.println("Digite o valor da variavel A:");
        varA = teclado.nextInt();
        
        System.out.println("Digite o valor da variavel B:");
        varB = teclado.nextInt();
        
        System.out.println("Digite o valor da variavel C:");
        varC = teclado.nextInt();
      
                if(varA == 0){
                    System.out.println("Quando a é exatamente igual a 0 a equação não é do segundo grau!");
                    if(varB ==0){
                                            System.out.println("Quando B é exatamente igual a 0 a equação não é do primeiro grau!");

                    }else{
                        r = -varC/varB;
                        System.out.println(r);
                    }
                        
                                }else{
                                delta = Math.pow(varB, 2) - 4*(varA * varC);
                                    
                                    if (delta <0){
                                        System.out.println("O valor de delta menor que zero não tem resultado real");
                                            delta = Math.pow(varB, 2) - 4*(varA * varC);

            
            
                                                }else if(delta == 0){ 
            
                                                        x1 =  (-varB + Math.sqrt (delta))  / ( 2*varA ); //equação do x1

                                                        x2 =   (-varB - Math.sqrt (delta)) / ( 2*varA ) ;//equação do x2
                                                        
                                                            System.out.println("Quando o delta é exatamente igual a 0 temos duas raizes extamente iiguais");
                                                            System.out.println("X1:" +x1+ "\n" + "X2:"+x2); 
        
        
                                                                    }else if(delta > 0 ){
                                                                    x1 =  (-varB + Math.sqrt (delta))  / ( 2*varA ); //equação do x1

                                                                    x2 =   (-varB - Math.sqrt (delta)) / ( 2*varA ) ;//equação do x2 
                                                                        
                                                                    
                                                                    System.out.println("Quando o delta é maior que 0 temos duas raizes reais distintas");
                                                                    System.out.println("X1:"+x1+"\n"+ "X2:"+x2); 
                                                                                        }
        
        
        
       
                
                
       }  
       
       
       
       
    }
}
