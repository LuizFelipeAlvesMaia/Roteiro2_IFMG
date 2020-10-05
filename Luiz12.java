/**
 *Faça um algoritmo que receba a idade de um nadador e mostre a categoria do mesmo. Faça os testes
    necessários em relação a idade inválida.
    *  
 * @author Luiz Felipe Alves Maia
 * IFMG - Sabara
 */
package luizlista2;
import java.util.Scanner;


public class Luiz12 {
    public static void main(String[] args){
      
        String nomeDoNadador;
        int idadeDoNadador;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o nome do nadador:");
        nomeDoNadador = teclado.nextLine();
        
        System.out.println("Digite a idade do nadador");
        idadeDoNadador = teclado.nextInt();
        
        if( 5 <= idadeDoNadador && idadeDoNadador<=7){
             System.out.println(nomeDoNadador+" Categoria: Infatil");
            
        }
        else if(8 <= idadeDoNadador && idadeDoNadador<=10){
            
            System.out.println( nomeDoNadador+" Categoria: Juvenil");
        }
        
        else if(11 <= idadeDoNadador && idadeDoNadador<=15){
            
             System.out.println(nomeDoNadador+" Categoria: Adolescente");    
        }
        
        else if (16 <= idadeDoNadador && idadeDoNadador<=40){
             
             System.out.println(nomeDoNadador+" Categoria: Adulto");
        }
        
        else if (idadeDoNadador > 40){
            
             System.out.println(nomeDoNadador+" Categoria: Senior");
        }
            
            
        
        
    }
    }

