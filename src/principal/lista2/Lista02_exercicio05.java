package principal.lista2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Desenvolvimento de Sistemas
 * Lista 02.
 * Exercício número 05
 *   Faça um programa que receba um número inteiro e verifique se este número é par ou ı́mpar.
 *
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Lista02_exercicio05 {

		// Esta classe formata o número para que seja exibido separado por vírgula, ao invés de ponto:
		public static NumberFormat formatoBR() {
	        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ROOT);
	        symbols.setDecimalSeparator(',');
	        symbols.setGroupingSeparator('.');
	        return new DecimalFormat("###,###,##0.###", symbols);
	    }

		public static void main(String[] args) {
			System.out.println("Programa que receba um número inteiro e verifique se este número é par ou ı́mpar.");
			NumberFormat formatter = formatoBR(); // Prepara o formato para separação por vírgula:
			Integer number = 0;
		    try (Scanner digitacao = new Scanner(System.in)) {
				boolean verificacao = false;
				do{
					System.out.print("Digite um número: ");
					if(digitacao.hasNextInt()){ 
						number = digitacao.nextInt();							
						verificacao = true;
				    } else{ 
				    	System.out.println("Por favor, digitar somente números inteiros."); 
				    }
					digitacao.nextLine(); // Limpa o cache do teclado.
	
				//bloco de códigos	
				} while(!verificacao);
			
			    // Verifica se é par ou ímpar:
	

		        if (number == 0) {
		        	System.out.println("\nFormalmente, o zero é par, tanto é que é usado como paridade em sistemas redudantes e de tolerância a falhas, no entanto há contextos práticos em que o zero recebe tratamento especial, principalmente no setor aeroespacial, onde zero não pode ser considerado par, pois geraria uma exceção.");
		        } else if (number % 2 == 0) {
		        	System.out.println("\n\u001B[32mO número " + formatter.format(number) + " é par.");
		        } else {
		        	System.out.println("\n\u001B[32mO número " + formatter.format(number) + " é ímpar.");
		        }
		        System.out.println("Fim.");
		    }
		}
}

