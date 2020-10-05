/**
 *Faça um programa que recebe de entrada o código de um produto e a quantidade comprada do mesmo.
Calcule e mostre:
a) O preço unitário do produto, segundo Tabela I
b) Preço total da nota
c) O valor do desconto, segundo Tabela II, aplicado sobre o valor total da nota
d) Preço final ao consumidor após desconto
e) Não se esqueça de verificar a existência do produto
 * @author Luiz Felipe Alves Maia
 * IFMG - Sabara
 */
package luizlista2;
import java.util.Scanner;
/**
 *
 * @author Luiz Felipe
 */
public class Luiz24 {
    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        int codigoProduto;
        int quantidade;
       int valor;
       double valorDesconto;
       
        System.out.println("Digite o codigo dos produto:");
               codigoProduto=teclado.nextInt();
               
        System.out.println("Digite a quantidade do produto:");
                quantidade=teclado.nextInt();
        
                
    if(codigoProduto > 0){
         if(codigoProduto>=1 && codigoProduto<=10 ){
             valor = quantidade *10;
                        
                        if(valor<=250){
                            valorDesconto = valor *0.95;
                                System.out.println("O valor final é de: " +"R$"+valorDesconto);

                        }else if( valor>250 && valor<=500){
                            valorDesconto = valor *0.90;
                                System.out.println("O valor final é de: " +"R$"+valorDesconto);

                        }else if(valor>500){
                            valorDesconto = valor * 0.85;
                                System.out.println("O valor final é de: " +"R$"+valorDesconto);

                        }
             
         }else if(codigoProduto>=11 && codigoProduto <=20){ 
              valor= quantidade *20;

                       if(valor<=250){
                            valorDesconto = valor *0.95;
                                System.out.println("O valor final é de: " +"R$"+valorDesconto);

                        }else if( valor>250 && valor<=500){
                            valorDesconto = valor *0.90;
                                System.out.println("O valor final é de: " +"R$"+valorDesconto);

                        }else if(valor>500){
                            valorDesconto = valor * 0.85;
                                System.out.println("O valor final é de: " +"R$"+valorDesconto);

                        }
             
         }else if(codigoProduto>=21 && codigoProduto<=30){
              valor = quantidade*30;
                      
                       if(valor<=250){
                            valorDesconto = valor *0.95;
                                System.out.println("O valor final é de: " +"R$"+valorDesconto);

                        }else if( valor>250 && valor<=500){
                            valorDesconto = valor *0.90;
                                System.out.println("O valor final é de: " +"R$"+valorDesconto);

                        }else if(valor>500){
                            valorDesconto = valor * 0.85;
                                System.out.println("O valor final é de: " +"R$"+valorDesconto);

                        }
             
         }else if(codigoProduto>=31 && codigoProduto<=40){
              valor= quantidade *10;
                      
                       if(valor<=250){
                            valorDesconto = valor *0.95;
                                System.out.println("O valor final é de: " +"R$"+valorDesconto);

                        }else if( valor>250 && valor<=500){
                            valorDesconto = valor *0.90;
                                System.out.println("O valor final é de: " +"R$"+valorDesconto);

                        }else if(valor>500){
                            valorDesconto = valor * 0.85;
                                System.out.println("O valor final é de: " +"R$"+valorDesconto);

                        }
         }
         
         
    }else{
        System.out.println("Não foi digitado nenhum codigo, digite um codigo de um produto registrado");
    }
         
             
        
        
        
        
        
    }
}
