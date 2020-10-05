/**
 * Na cidade de Sabará, para transferências de veículos, a SABATRAN cobra uma taxa de 1% para carros
    fabricados antes de 1990 e uma taxa de 1.5% para os fabricados de 1990 em diante. Essa taxa está
    incidindo sobre o valor de tabela do carro. Implemente um algoritmo que lê o ano de fabricação e o preço
    do carro e a seguir calcula e imprime imposto a ser pago.
    
 * @author Luiz Felipe Alves Maia
 * IFMG - Sabara
 */
package luizlista2;

import java.util.Scanner;


public class Luiz09 {
    public static void main(String[] args){
        Scanner teclado =  new Scanner(System.in);
        int anoDeFabricacaoDoVeiculo, valorDoVeiculo;
        double transferencia;
        
        System.out.println("Digite o ano de fabricação do seu veiculo:");
        anoDeFabricacaoDoVeiculo = teclado.nextInt();
        
        System.out.println("Digite o valor de tabela do seu veiculo:");
        valorDoVeiculo=teclado.nextInt();
        
        if( anoDeFabricacaoDoVeiculo < 1990){
            
            transferencia =   (valorDoVeiculo*0.01);
            
            System.out.println("O valor da transferencia para seu veiculo é de:"+transferencia);

        }else if ( anoDeFabricacaoDoVeiculo > 1990){
            
            transferencia =   (valorDoVeiculo*0.15);
            
            System.out.println("O valor da transferencia para seu veiculo é de:"+transferencia);
        }

    }
}
