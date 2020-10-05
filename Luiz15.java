/**
 *Faça um algoritmo que receba duas datas (dia, mês e ano) e determine a maior entre elas. Você deverá
    receber as datas no formato de uma String e fazer as devidas comparações. Pesquisem sobre as classes
    Date e Calendar.
* 
 * @author Luiz Felipe Alves Maia
 * IFMG - Sabara
 */
package luizlista2;
import java.util.Scanner;
import java.util.Calendar;

/**
 *
 * @author Luiz Felipe
 */
public class Luiz15 {
       public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Calendar c = Calendar.getInstance();
        String data;
        String data2;
        
        System.out.println("Digite sua primeira data (DD/MM/AAAA):");
        data=teclado.next();
                
        System.out.println("Digite sua segunda data DD/MM/AAAA):");
        data2=teclado.next();
        if(data.length()>8 && data2.length()>8){
                int ano = Integer.parseInt( data.substring(6,10));
                int mes = Integer.parseInt( data.substring(3, 5));
                int dia = Integer.parseInt( data.substring(0,2));
                
                int ano2 = Integer.parseInt( data2.substring(6,10));
                int mes2 = Integer.parseInt( data2.substring(3, 5));
                int dia2 = Integer.parseInt( data2.substring(0,2));
                if((ano > ano2)){
                    
                             System.out.printf("A data: %02d/%02d/%d é maior que, logo mais recente, que a data %02d/%02d/%d", dia, mes, ano, dia2, mes2, ano2);
                      
                    
                }else if( ano == ano2){
                        if( mes < mes2 ){
                             System.out.printf("A data: %02d/%02d/%d é maior que, logo mais recente, que a data %02d/%02d/%d", dia2, mes2, ano2, dia, mes, ano);
                        }else if(mes == mes2){
                                if(dia < dia2){
                                    System.out.printf("A data: %02d/%02d/%d é maior que, logo mais recente, que a data %02d/%02d/%d", dia2, mes2, ano2, dia, mes, ano);

                                }else if(dia == dia2){
                                    System.out.printf("As datas: %02d/%02d/%d e %02d/%02d/%d são extamente identicas!", dia, mes, ano, dia2, mes2, ano2);

                                }else{
                                    System.out.printf("A data: %02d/%02d/%d é maior que, logo mais recente, que a data %02d/%02d/%d", dia, mes, ano, dia2, mes2, ano2);

                                }
                        }else{
                            System.out.printf("A data: %02d/%02d/%d é maior que, logo mais recente, que a data %02d/%02d/%d", dia, mes, ano, dia2, mes2, ano2);


        
                        }
            }else if(ano < ano2){
                 
                                      System.out.printf("A data: %2d/%2d/%d é maior que, logo mais recente, que a data %2d/%2d/%d", dia2, mes2, ano2, dia, mes, ano);

            }
        }

    }
}