package principal.lista2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Desenvolvimento de Sistemas
 * Lista 02.
 * Exercício número 12
 * Ler um número inteiro. Se o número lido for negativo, escreva a mensagem “Número
inválido”. Se o número for positivo, calcular o logaritmo deste numero.
 *
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Lista02_exercicio12 {
			// Esta classe formata o número para que seja exibido separado por vírgula, ao invés de ponto:
			public static NumberFormat formatoBR() {
		        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ROOT);
		        symbols.setDecimalSeparator(',');
		        symbols.setGroupingSeparator('.');
		        return new DecimalFormat("###,###,##0.###", symbols);
		    }

		public static void main(String[] args) {
			System.out.println("Programa que receba um número inteiro e calcular o logaritmo deste numero.");
			
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
				System.out.print("O logaritmo de " + numero + " na base é: " + formatter.format(Math.log10(numero)));
		      
		        System.out.println("\nFim do programa.");
		    }
		}
}

