/**
 *Implemente um programa que receba um número inteiro positivo representando um ano qualquer e
    imprima se o ano é bissexto ou não. Um ano bissexto é definido quando: (ano % 4 = 0 e (ano % 100 != 0
    ou ano % 400 == 0)).
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
public class Luiz21 {
    public static void main(String[] args){
        int ano;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um ano qualquer");
        ano = teclado.nextInt();
        String tamanhoDoNumeroDigitado = Integer.toString(ano);
        
        if(tamanhoDoNumeroDigitado.length() == 4 ){
            ano = Integer.parseInt(tamanhoDoNumeroDigitado);
                if(ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)){
                                System.out.println("O ano " +ano+ " digitado e bissexto");

                 }else{
                                System.out.println("O ano nao e bissexto");

                }
        }else{
            System.out.println("O ano digitado n'ao e compativel");
        }
    }

}