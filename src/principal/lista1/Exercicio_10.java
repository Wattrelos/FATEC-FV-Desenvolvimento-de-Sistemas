package principal.lista1;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Desenvolvimento de Sistemas
 * Exercício número 10.
 * Leia uma velocidade em km/h e apresente-a convertida em m/s. 
 * Fórmula: M = K / 3.6
 * 
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Exercicio_10 {
	// Esta classe estática formata o número para que seja exibido separado por vírgula, ao invés de ponto:
	public static NumberFormat formatoBR() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ROOT);
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');
        return new DecimalFormat("###,###,##0.###", symbols);
    }

	// Classe principal:
	public static void main(String[] args) {
		System.out.println("Programa que converte a velocidade de Km/h para m/s");
		  
	    try (Scanner digitacao = new Scanner(System.in)) {
			// Loop com verificação no final:
			boolean verificacao = false; 
			do{
				System.out.print("Digite a velocidade em Km/h: ");
				if(digitacao.hasNextDouble()){ 
					Double numeroReal = digitacao.nextDouble();					
					NumberFormat formatter = formatoBR(); // Prepara o formato para separação por vírgula:
					if(numeroReal < 0 || numeroReal > 1079252849) {
						System.out.println("Velocidade não pode ser negativa, nem maior que a velocidade da Luz!");
					} else {
			    		System.out.println("A velocidade de " + formatter.format(numeroReal) +" Km/h equivale a " + formatter.format(numeroReal / 3.6) + " m/s.");
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
