package principal.lista2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Desenvolvimento de Sistemas
 * Lista 02.
 * Exercício número 11
 * 		Escreva um programa que leia um número inteiro maior do que zero e devolva, na tela, a
 * soma de todos os seus algarismos. Por exemplo, ao número 251 corresponderá o valor
 * 8 (2 + 5 + 1). Se o número lido não for maior do que zero, o programa terminará com a
 * mensagem “Número inválido”.
 *
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Lista02_exercicio11 {

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
				System.out.print("A soma dos dígitos de " + numero );
				int soma = 0;
		        while (numero > 0) { 
		        	// Cálculo destrutivo. Destrói o valor da variável numero.
		            soma += numero % 10; // Pega o último dígito (resto de divisão por 10).
		            numero /= 10;        // Remove o último dígito (divisão por 10).
		        }

		        System.out.println(" é: " + soma);
		      
		        System.out.println("Fim do programa.");
		    }
		}
}

