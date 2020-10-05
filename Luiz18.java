/**
   Implemente um programa que receba um número inteiro de 3 dígitos de entrada. Após isso, verifique se o
    mesmo é palíndromo, ou seja, é o mesmo número lido da direita para esquerda ou vice-versa. Ex.: 121,
    353, etc. Não é permitido a utilização de funções prontas do JAVA, tal como o método reverse.
 
 * @author Luiz Felipe Alves Maia
 * IFMG - Sabara
 */
package luizlista2;
import java.util.Scanner;
/**
 *
 * @author Luiz Felipe
 */
public class Luiz18 {
    public static void main(String[] args){
        Scanner teclado = new Scanner (System.in);
        
        int numero;
        System.out.println("Digite um valor de 3 digitos:");
        numero=teclado.nextInt();
        
        String palavra = Integer.toString(numero); //Palavra que você quer testar
	String palavra1 = "";

        if(palavra.length()== 3){ //O if está verificando para a quantidade de numeros digitados são validos
        
	for (int i = 0; i < palavra.length(); i++) { //Eu usei o for para gerar o numero ao contrario para poder ler e comparar ele e saber se realmente será um palindromo
		palavra1 = palavra.charAt(i) + palavra1;
	}
        
	System.out.println(palavra + " x " + palavra1 + " = palavra "// Dentro do system estamos dentro dele compoarando o valor do numero digitado ao contrario com o numero original 
			+ ((palavra.equals(palavra1)) ? "polindroma" : "normal"));
        
        }else{
            System.out.println("O numero digitado é maior do que necessario, informe um novo numero!");
        }
    }
 
    

}  
       
       
       
       
   

