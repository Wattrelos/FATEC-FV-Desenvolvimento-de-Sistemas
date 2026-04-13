package principal.lista1;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Desenvolvimento de Sistemas
 * Exercício número 14.
 * Leia um ângulo em graus e apresente-o convertido em radianos.
 * Fórmula: R = G × π / 180 (π = 3.14)
 *
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Exercicio_14 {
	// Esta classe formata o número para que seja exibido separado por vírgula, ao invés de ponto:
	public static NumberFormat formatoBR() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ROOT);
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');
        return new DecimalFormat("#0.00000000", symbols);
    }

	// Classe principal:
	public static void main(String[] args) {
		// Obtendo o valor de PI
	    double pi = Math.PI;
	    
		System.out.println("Programa que converte valor de ângulo de graus para radianos.");
		  
	    try (Scanner digitacao = new Scanner(System.in)) {
			// Loop com verificação no final:
			boolean verificacao = false; 
			do{
				System.out.print("Digite o ângulo em graus: ");
				if(digitacao.hasNextDouble()){ 
					Double numeroReal = digitacao.nextDouble();					
					NumberFormat formatter = formatoBR(); // Prepara o formato para separação por vírgula:
					if(numeroReal < 0) {
						System.out.println("Número não pode ser menor que zero!");
					} else {						
			    		System.out.println("O ângulo de " + formatter.format(numeroReal) +" graus equivale a " + formatter.format((numeroReal * pi / 180)) + " radianos.");
			    		verificacao = true;
					}
			    	
			    } else{
			    	System.out.println("Não foi digitado um número válido!"); 
			    }
				digitacao.nextLine(); // Limpa o boofer do teclado.

			//bloco de códigos

			} while(!verificacao);
		}
	}
}
