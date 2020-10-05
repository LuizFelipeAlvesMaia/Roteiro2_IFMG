/**
 *16. Faça um programa que receba de entrada a data de votação do ano atual e a data de nascimento de uma
    pessoa. Utilizando as informações pesquisadas na questão anterior, verifique se essa pessoa não pode votar,
    é obrigada a votar ou o voto e facultativo, segundo as regras brasileiras.
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
public class Luiz16 {
    public static void main (String[] args){
        int anoDeEleicao, anoDeNascimento, idade;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o ano de eleicao");
        anoDeEleicao = teclado.nextInt();
        
        System.out.println("Digite o seu ano de nascimento:");
        anoDeNascimento = teclado.nextInt();
        
        idade = anoDeEleicao - anoDeNascimento;
        
        if(anoDeNascimento>=10000 || anoDeEleicao>=10000){
            System.out.println("Data digitada invalida, coloque no padrao coreto(XXXX)");
        }
                else if(idade < 16){
                    System.out.println("Você ainda nâo pode votar!");
                }
                
                else if (idade>=16 && idade<18 && idade>70){
                    System.out.println("Seu voto é facultativo!");
                    
                }
                
                else if ( idade>=18 && idade<70){
                    System.out.println("Seu voto é obrigatorio!");
                }
        
        
    }
}
