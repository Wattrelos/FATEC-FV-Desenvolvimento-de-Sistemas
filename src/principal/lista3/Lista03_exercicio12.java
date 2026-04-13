package principal.lista3;

import java.util.Scanner;

/**
 * Desenvolvimento de Sistemas
 * Lista 3. Exercício número 12
 * 
 *  Faça um programa que leia um número inteiro positivo N e imprima todos os números naturais de 0 até N em ordem decrescente.
 *
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Lista03_exercicio12 {

	public static void main(String[] args) {
		
		System.out.println("Programa que mostra todos os números naturais, de 0 a N digitado em ordem decrescente.");
		int numeroDigitado = 0;
	    try (Scanner digitacao = new Scanner(System.in)) {	    	
	    	
			boolean verificacao = false;
			do{
				System.out.print("Digite um número inteiro positivo: ");
				if(digitacao.hasNextInt()){
					numeroDigitado = digitacao.nextInt();
					if (numeroDigitado > 0) {
						verificacao = true;							
					}else {
						System.out.println("O número precisa ser um inteiro positivo");
					}				    	
			    } else{ 
			    	System.out.println("Não foi digitado um número inteiro válido"); 
			    }
				digitacao.nextLine();

			//bloco de códigos	
			} while(!verificacao);							
	    	
		};
	    	    
	    //NumberFormat formatter = formatoBR(); // Prepara o formato para separação por vírgula:
	    System.out.println("\nOs números naturais de zero a " + numeroDigitado + " são: ");
	    for (int i = numeroDigitado; i >= 0; i--) {
	    	System.out.print(i + ", ");
	    	if((i % 10) == 0) System.out.println(); // Pula linha a cada 10 números.
	    }
	    System.out.print("\nFim!");
	}
}
