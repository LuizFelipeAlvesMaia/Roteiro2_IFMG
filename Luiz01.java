/**
 *FaçFaça um programa que identifique se um número digitado pelo usuário é positivo, negativo ou zero.
 * @author Luiz Felipe Alves Maia
 * IFMG - Sabara
 */
package luizlista2;

import java.util.Scanner;


public class Luiz01 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.println("Digite um valor qualquer:");
        numero = teclado.nextInt();
        
        if(numero>0){
            System.out.println("O numero,"+numero+", é positivo");
        }else if(numero < 0 ){
            System.out.println("O número,"+numero+",é negativo");
        }else if( numero == 0){
            System.out.println("O numero digitado é igual a zero");
        }
    }
}
