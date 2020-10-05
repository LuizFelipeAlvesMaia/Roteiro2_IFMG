/**
 *O IMC (Índice de Massa Corporal) é um critério da Organização Mundial de Saúde para dar uma indicação
    sobre a condição de peso de uma pessoa adulta. A fórmula é IMC = PESO/(ALTURA2). Elabore um
    algoritmo que leia o peso e a altura de um adulto e mostre sua condição.
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
public class Luiz13 {
    public static void main ( String[] args){
        double imc, peso, altura;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu peso:");
        peso =  teclado.nextDouble();
        System.out.println("Digite sua altura(em metros):");
        altura = teclado.nextDouble();
        
        imc = (peso/(altura*altura));
        if (imc < 18.5){
            System.out.println("Abaixo do peso ");
        }
        
        else if (18.5<=imc && imc<25){
            System.out.println("Peso normal");
        }
        
        else if(25<= imc && imc<30){
            System.out.println("Acima do peso");
        }
        
        else if (imc < 30){
            System.out.println("Obeso");
        }
        
    }
}
