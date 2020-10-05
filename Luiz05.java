/**
 * O custo de um carro novo ao consumidor é a soma do custo de fábrica, a porcentagem do distribuidor e os
    impostos. O valor pago pela distribuição e dos impostos é calculado com base no custo de fábrica. As
    porcentagens estão apresentadas na tabela abaixo. Faça um programa que receba o custo de fábrica de um
    carro e mostre o custo ao consumidor
    
 * @author Luiz Felipe Alves Maia
 * IFMG - Sabara
 */
package luizlista2;

import java.util.Scanner;


public class Luiz05 {
   public static void main(String[] args){
       Scanner teclado = new Scanner(System.in);
       double custoDeFabrica, impostos, distribuicao, custoDoConsumidor;
       
       System.out.println("Digite o valor de custo de fabrica:");
       custoDeFabrica=teclado.nextDouble();
       
       if(custoDeFabrica <= 28000.00){
           custoDoConsumidor= custoDeFabrica + (custoDeFabrica*0.05) + (custoDeFabrica * 0);
           System.out.println("O valor para o consumidor é de:R$"+custoDoConsumidor);
           
       }else if(28000.01<= custoDeFabrica && custoDeFabrica <= 45000.00 ){
                      custoDoConsumidor= custoDeFabrica + (custoDeFabrica*0.10) + (custoDeFabrica * 0.15);
                      System.out.println("O valor para o consumidor é de:R$"+custoDoConsumidor);
                      
            }else if(custoDeFabrica >45000.01 ){
                             custoDoConsumidor= custoDeFabrica + (custoDeFabrica*0.15) + (custoDeFabrica * 0.20);
                             System.out.println("O valor para o consumidor é de:R$"+custoDoConsumidor);
            }
} 
}
