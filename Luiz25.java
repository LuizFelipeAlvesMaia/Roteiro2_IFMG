/**
 *25. Faça um algoritmo que receba de entrada a altura e o sexo de uma pessoa ('M' - Masculino ou 'F' -
    Feminino), construa um algoritmo que calcule o peso ideal da pessoa de acordo com as regras:
    - Homens: (72.7*altura) - 58 - Mulher: (62,1*altura) - 44.7
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
public class Luiz25 {
    public static void main(String[] args){
        Scanner teclado= new Scanner(System.in);
        String sexo;
        double altura;
        double peso;
        System.out.println("Digite sua altura em (m):");
        altura=teclado.nextDouble();
        
        System.out.println("Escolha o seu sexo: \n"
                + "Masculino \n"
                +"Feminino \n"
                +"Prefiro nao dizer \n"
                +"Homem transgênero \n"
                + "Mulher Transgênero \n"
               );
        sexo=teclado.next();
//  Eu tentei usar o toLowerCase porem não funcionou no meu codigo, então tive que testar nos varias formas de se digitar as palavras        
                
        switch(sexo){
            case "Masculino":
            case"masculino":
            case "Homem transgênero":
            case "Homem transgenero":
            case "homem transgenero":
                    double aux = (72.7 * altura);
                    peso = aux - 58;
                                    System.out.println("o seu peso ideal e de: " + peso+"Kg");

                    break;
             case "Mulher Transgênero": 
             case "mulher transgênero": 
             case "Mulher Transgenero": 
             case "mulher transgenero": 
             case "Feminino":
             case "feminino": 

                    double aux2 = (62.1 * altura);
                       peso = aux2 - 44.7;
                                     System.out.println("o seu peso ideal e de: " + peso+"Kg");

                    break;
                    
             default:
                 System.out.println("Tente novamente!");
                    
            
            
        }
        
        
        
    }
}
