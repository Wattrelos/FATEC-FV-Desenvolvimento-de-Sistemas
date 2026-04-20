package principal.lista2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Desenvolvimento de Sistemas
 * Lista 2. Exercício número 19.
 * 
 *   Faça um programa para verificar se um determinado número inteiro e divisı́vel por 3 ou 5,
 *   mas não simultaneamente pelos dois.
 *   
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Lista02_exercicio19 {
			// Esta classe formata o número para que seja exibido separado por vírgula, ao invés de ponto:
			public static NumberFormat formatoBR() {
		        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ROOT);
		        symbols.setDecimalSeparator(',');
		        symbols.setGroupingSeparator('.');
		        return new DecimalFormat("###,###,##0.###", symbols);
		    }

		public static void main(String[] args) {
			System.out.println("Programa que verifica se um número é divisível por 3 ou 5 exclusivamente.");
			
			Integer numero = 0;
		    try (Scanner digitacao = new Scanner(System.in)) {
				boolean verificacao = false;
				do{
					System.out.print("Digite um número: ");
					if(digitacao.hasNextInt()){ 
						numero = digitacao.nextInt();
						if (numero > 0) {
							verificacao = true;
						} else {
							System.out.println("Número inválidor. O número deve ser positivo.");
						}
				    } else{ 
				    	System.out.println("Número inválidor. Por favor, digitar somente número inteiro."); 
				    }
					digitacao.nextLine(); // Limpa o cache do teclado.
	
				//bloco de códigos	
				} while(!verificacao);
				
				NumberFormat formatter = formatoBR(); // Prepara o formato para separação por vírgula:
				boolean divisivel3 = false;
				boolean divisivel5 = false;
				if (numero % 3 == 0) {
					divisivel3 = true;
				}
				if (numero % 5 == 0) {
					divisivel5 = true;
				}
				
				if (divisivel3 && divisivel5) {
		            System.out.println("Condição inválida! O número " + formatter.format(numero) + " é divisível por 3 e por 5.");
		        } else if (divisivel3 && !divisivel5) {
		            System.out.println("Validado! O número " + formatter.format(numero) + " é divisível por 3 porém não é divisível por 5.");
		        } else if (!divisivel3 && divisivel5) {
		        	System.out.println("Validado! O número " + formatter.format(numero) + " não é divisível por 3 porém é divisível por 5.");
		        } else {
		            System.out.println("Condição inválida! O número " + formatter.format(numero) + " não é divisível por 3 e nem por 5.\"");
		        }		      
		        System.out.println("\nFim do programa.");
		    }
		}
}

