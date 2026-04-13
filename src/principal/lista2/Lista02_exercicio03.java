package principal.lista2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Desenvolvimento de Sistemas
 * Lista 02.
 * Exercício número 04
 * Leia um numero real. Se o número for positivo imprima a raiz quadrada. Do contrário, imprima o numero ao quadrado.



 *
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Lista02_exercicio03 {

		// Esta classe formata o número para que seja exibido separado por vírgula, ao invés de ponto:
		public static NumberFormat formatoBR() {
	        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ROOT);
	        symbols.setDecimalSeparator(',');
	        symbols.setGroupingSeparator('.');
	        return new DecimalFormat("###,###,##0.#############", symbols);
	    }

		public static void main(String[] args) {
			System.out.println("Programa que calcula a raiz quadrada de um número.");
			NumberFormat formatter = formatoBR(); // Prepara o formato para separação por vírgula:
			Double number = .0;
		    try (Scanner digitacao = new Scanner(System.in)) {
				boolean verificacao = false;
				do{
					System.out.print("Digite um número: ");
					if(digitacao.hasNextDouble()){ 
						number = digitacao.nextDouble();							
						verificacao = true;
				    } else{ 
				    	System.out.println("Por favor, digitar somente números reais."); 
				    }
					digitacao.nextLine(); // Limpa o cache do teclado.
	
				//bloco de códigos	
				} while(!verificacao);
			    
		        if (number < 0) {
		        	System.out.println("\nO número digitado, elevado ao quadrado, é: " + formatter.format(number) + "² = " + formatter.format(Math.pow(number,2)));
		        } else if (number == 0) {
		        	System.out.println("\nZero não é positivo nem negativo. É um número neutro!");
		        } else {
		        	// Aplica Bhaskara:
					System.out.println("Aplicando a Equação quadrática (conhecida como Bhaskara) e só foi fornecido apenas um número de uma icógnita c, onde a=1 e b=0, temos:");
					System.out.println("1x² + 0b - " + formatter.format(number) + " = 0. Simplificando: x² = " + formatter.format(number));
		        	System.out.println("\nExiste duas raize reais: onde \u001B[32m√" + formatter.format(number) + " = " + formatter.format(Math.sqrt(number)) + " e " + formatter.format(-Math.sqrt(number)));
		        }
		        System.out.println("Fim.");
		    }
		}
}

