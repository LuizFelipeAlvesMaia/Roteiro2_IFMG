/**
 *Crie um algoritmo que receba o valor de x, calcule e imprima o valor de f(x).
    F(X)={SE X<=1, SE 1<X<=2, X^2 SE 2<X<=3, X^3, SE X>3}
    * 
 * @author Luiz Felipe Alves Maia
 * IFMG - Sabara
 */
package luizlista2;
import java.util.Scanner;


public class Luiz11 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int x, FdeX;
        
        System.out.println("Digite um valor para X");
        x=teclado.nextInt();
        
        if(x<=1){
            FdeX= 1;
                        System.out.println("O valor para F(x) é de:"+FdeX);

        } if( 1<x && x<=2 ){
            FdeX = 2;
                        System.out.println("O valor para F(x) é de:"+FdeX);

        }if( 2 < x && x<= 3){
            FdeX = (int) Math.pow(x, 2);
                        System.out.println("O valor para F(x) é de:"+FdeX);
        }if( x<3){
             FdeX = (int) Math.pow(x, 3);
                        System.out.println("O valor para F(x) é de:"+FdeX);
        }
        
         
    }
}
