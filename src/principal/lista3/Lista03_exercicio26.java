package principal.lista3;

import java.util.Scanner;

/**
 * Desenvolvimento de Sistemas
 * Lista 3. Exercício número 25.
 * 
 *  Faca um algoritmo que encontre o primeiro múltiplo de 11, 13 ou 17 após um número dado.
 *   
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Lista03_exercicio26 {

	public static void main(String[] args) {

		boolean verificacao = false;
		int numero = 0;
		String texto = "";
		System.out.println("Programa que encontra o primeiro múltiplo de 11, 13 ou 17 após um número dado.");
	    try (Scanner digitacao = new Scanner(System.in)) {
	    	
			do{
				System.out.print("Digite um número inteiro positivo: ");
				if(digitacao.hasNextInt()){ 
					numero = digitacao.nextInt();
					if(numero > 0 ) {
						verificacao = true;
					} else {
						System.out.println("O número precisa ser um inteiro positivo."); 
					}
			    } else{ 
			    	System.out.println("Não foi digitado um número válido"); 
			    }
				digitacao.nextLine();	
			//bloco de códigos
			} while(!verificacao);
			
	        
	        boolean achou = false;
	        do {
        		if(numero % 11 == 0) {        			
        			texto += "11, ";
        			achou = true;
        		}
        		if(numero % 13 == 0) {
        			achou = true;
        			texto +=  "13, ";
        		}
        		if(numero % 17 == 0) {
        			achou = true;
        			texto += "17, ";
        		}
	        	if (!achou) numero++;
	        } while (!achou);
	        System.out.println("\nO primeiro número encontrado foi " + numero + " e é múltiplo de " + texto.substring(0, texto.length() - 2) + ".");
		}
	}
}
