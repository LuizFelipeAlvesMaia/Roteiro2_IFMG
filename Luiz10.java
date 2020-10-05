/**
 *Criar um algoritmo que a partir da idade e peso do paciente calcule a dosagem de determinado
    medicamento e imprima a receita informando quantas gotas do medicamento o paciente deve tomar
    por dose. Considere que o medicamento em questão possui 500 mg por ml, e que cada ml corresponde a 20
    gotas.
    - Adultos ou adolescentes desde 12 anos, inclusive, se tiverem peso igual ou acima de 60 quilos devem
    tomar 1000 mg; com peso abaixo de 60 quilos devem tomar 875 mg.
    - Para crianças e adolescentes abaixo de 12 anos a dosagem é calculada pelo peso corpóreo conforme a
    tabela a seguir:
    
 * @author Luiz Felipe Alves Maia
 * IFMG - Sabara
 */
package luizlista2;
import java.util.Scanner;


public class Luiz10 {
    public static void main(String[] args){
      Scanner teclado = new Scanner(System.in);
      
      double peso;
      int idade, gotas, ml;
      
       System.out.println("Digite sua idade:");
       idade= teclado.nextInt();
       
       
       System.out.println("Digite o seu peso:");
       peso = teclado.nextInt();
       
       
       if (idade>=12){ //aqui temos a testagem para adultos e adolescente de apartir de 12 anos 
           if(peso >= 60){
               ml = 1000 / 500; //1000mg / 500mg
               gotas = 20 * ml;
               System.out.println("A sua dosagem é de: 1000mg e "+gotas+" gotas");
               
           }else if ( peso< 60){
               ml = 875 / 500; //1000mg / 500mg
               gotas = 20 * ml;
               System.out.println("A sua dosagem é de: 875mg e "+gotas+" gotas");
           }
       }else if( idade <12){
           if(5<= peso || peso <=9){
               
                ml = 125 / 500; //1000mg / 500mg
               gotas = 20 * ml;
               System.out.println("A sua dosagem é de: 125mg e "+gotas+" gotas");
               
           }if(9.1<= peso || peso <=16){
               
                ml = 875 / 500; //1000mg / 500mg
               gotas = 20 * ml;
               System.out.println("A sua dosagem é de: 250mg e "+gotas+" gotas");
               
           }if(16.1<= peso || peso <=24){
               
                ml = 375 / 500; //1000mg / 500mg
               gotas = 20 * ml;
               System.out.println("A sua dosagem é de: 375mg e "+gotas+" gotas");
               
             
           }if(24.1<= peso || peso <=30){
               
                ml = 500 / 500; //1000mg / 500mg
               gotas = 20 * ml;
               System.out.println("A sua dosagem é de: 500mg e "+gotas+" gotas");
               
               
           }else{
               
                ml = 750 / 500; //1000mg / 500mg
               gotas = 20 * ml;
               System.out.println("A sua dosagem é de: 7500mg e "+gotas+" gotas");
               
           }
       }
       
    }
}
