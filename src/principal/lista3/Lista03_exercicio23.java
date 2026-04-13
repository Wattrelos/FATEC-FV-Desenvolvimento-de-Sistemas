package principal.lista3;

import java.util.Scanner;

/**
 * Desenvolvimento de Sistemas
 * Lista 3. Exercício número 23.
 * 
 *   Faca um algoritmo que leia um número positivo e imprima seus divisores.
 *   
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Lista03_exercicio23 {

	public static void main(String[] args) {

		boolean verificacao = false;
		int numero = 0;
		
		System.out.println("Programa que lê um número inteiro positivo e mostra seus divisores.");
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
	        
	        String texto = "";
	        for (int i = numero; i > 0; i--) {
	        	if(numero % i == 0) {
	        		texto += i + ", ";	        		
	        	}
	        }
	        System.out.print("\nOs divisores de " + numero + " são: " + texto.substring(0, texto.length() - 2) + ".");
	        

		}	    
	    
	}
}
