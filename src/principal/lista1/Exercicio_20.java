package principal.lista1;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Desenvolvimento de Sistemas
 * Exercício número 20.
 * Leia uma massa em quilogramas e converta para libras.
 * Fórmula: L = K / 0.45
 *
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Exercicio_20 {
	// Esta classe formata o número para que seja exibido separado por vírgula, ao invés de ponto:
	public static NumberFormat formatoBR() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ROOT);
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');
        return new DecimalFormat("###,###,##0.###", symbols);
    }

	// Classe principal:
	public static void main(String[] args) {
	    
		System.out.println("Programa que lê uma massa em quilogramas e converta para libras.");
		  
	    try (Scanner digitacao = new Scanner(System.in)) {
			// Loop com verificação no final:
			boolean verificacao = false; 
			do{
				System.out.print("Digite um valor da massa em quilogramas (Kg): ");
				if(digitacao.hasNextDouble()){ 
					Double numeroReal = digitacao.nextDouble();					
					NumberFormat formatter = formatoBR(); // Prepara o formato para separação por vírgula:
					if(numeroReal < 0) {
						System.out.println("Número não pode ser menor que zero!");
					} else {						
			    		System.out.println("O valor de " + formatter.format(numeroReal) +" Kg equivale a " + formatter.format(numeroReal * 2.20462) + " libras.");
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
