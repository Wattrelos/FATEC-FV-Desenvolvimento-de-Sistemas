package principal.lista1;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Desenvolvimento de Sistemas
 * Exercício número 13.
 * Leia uma distância em quilômetros e apresente-a convertida em milhas.
 * Fórmula: K = 1.61 × M
 *
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Exercicio_13 {
	// Esta classe formata o número para que seja exibido separado por vírgula, ao invés de ponto:
	public static NumberFormat formatoBR() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ROOT);
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');
        return new DecimalFormat("#0.0", symbols);
    }

	// Classe principal:
	public static void main(String[] args) {
		System.out.println("Programa que converte a distância de quilômetros para milhas");
		  
	    try (Scanner digitacao = new Scanner(System.in)) {
			// Loop com verificação no final:
			boolean verificacao = false; 
			do{
				System.out.print("Digite a distância em milhas: ");
				if(digitacao.hasNextDouble()){ 
					Double numeroReal = digitacao.nextDouble();					
					NumberFormat formatter = formatoBR(); // Prepara o formato para separação por vírgula:
					if(numeroReal < 0) {
						System.out.println("Número não pode ser menor que zero!");
					} else {
			    		System.out.println("A distância de " + formatter.format(numeroReal) +" quilômetros equivale a " + formatter.format(numeroReal / 1.61) + " milhas.");
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
