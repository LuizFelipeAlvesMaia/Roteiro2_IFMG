/**
 * Elabore um programa que calcule e exiba a tensão S de uma barra cilíndrica de diâmetro D submetida a
uma carga Q. Os valores de D e Q devem ser fornecidos pelo usuário do programa via teclado. Utilize a
fórmula:

onde, n = 2 para D > 100; n = 6 para D < 50 e; n = 4 para outros valores de D.
 * @author Luiz Felipe Alves Maia
 * IFMG - Sabara
 */
package luizlista2;

import java.util.Scanner;

/**
 *
 * @author Luiz Felipe
 */
public class Luiz14 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        double diametro, carga, tensao;
        System.out.println("Digite o valor do Diametro da barra cilindrica: ");
        diametro = teclado.nextDouble();
        
        System.out.println("Digite o valor de carga na barra cilindrica: ");
        carga = teclado.nextDouble();
        
        if(diametro > 100){
            int n = 2;
            double aux1 = ((4 * carga)*n);
                    
           double aux2 = Math.pow(diametro, 2);
           double aux3 = 3.14 * aux2;
           double aux4 = aux1 / aux3;
           
        }if(diametro < 50){
            int n = 6;
            double aux1 = ((4 * carga)*n);
                    
           double aux2 = Math.pow(diametro, 2);
           double aux3 = 3.14 * aux2;
           double aux4 = aux1 / aux3;
        }
    }
}
