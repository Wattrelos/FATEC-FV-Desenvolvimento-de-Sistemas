package principal.lista3;

import java.util.Scanner;

/**
 * Desenvolvimento de Sistemas
 * Lista 3. Exercício número 24.
 * 
 * Escreva um programa que leia um número inteiro e calcule a soma de todos os divisores
 * desse número, com exceção dele próprio. Ex: a soma dos divisores do número 66 é
 * 1 + 2 + 3 + 6 + 11 + 22 + 33 = 78
 *   
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Lista03_exercicio24 {

	public static void main(String[] args) {

		boolean verificacao = false;
		int numero = 0;
		
		System.out.println("Programa que lê um número inteiro positivo e soma todos os seus divisores, exceto ele próprio.");
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
	        
			int somaDivisores = 0;
	        String texto = "";
	        for (int i = numero - 1; i > 0; i--) {
	        	if(numero % i == 0) {
	        		texto += i + " + ";
	        		somaDivisores += i;
	        	}
	        }
	        System.out.println("\nOs divisores somados de " + numero + " (exceto o próprio " + numero + ") são: " + texto.substring(0, texto.length() - 3) + " = " + somaDivisores);
	        

		}	    
	    
	}
}
