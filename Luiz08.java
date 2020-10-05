/**
 * Uma empresa decide dar um aumento de 30% aos funcionários com salário inferior à R$700,00 e 10% aos
    funcionários com salário superior ou igual à R$700,00. Faça um algoritmo que calcule o reajuste e mostre
    o novo salário.
    
 * @author Luiz Felipe Alves Maia
 * IFMG - Sabara
 */
package luizlista2;

import java.util.Scanner;


public class Luiz08 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
         double salario, salarioNovo;
         
        System.out.println("Digite o valor do salario do funcionario:");
        salario= teclado.nextDouble();
        
        if(salario > 700.00){
            salarioNovo = (salario * 1.30);
             System.out.println("O valor do salarioo novo é de:" +salarioNovo);

        }else {
                        salarioNovo = (salario * 1.10);
                        System.out.println("O valor do salarioo novo é de:" +salarioNovo);

        }
        
    }
}
