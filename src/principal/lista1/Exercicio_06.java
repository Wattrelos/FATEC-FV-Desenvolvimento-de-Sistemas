package principal.lista1;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Desenvolvimento de Sistemas
 * Exercício número 6.
 * Leia uma temperatura em graus Celsius e apresente-a convertida em graus Fahrenheit.
 * Fórmula: F = C × (9.0/5.0) + 32.0
 * 
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Exercicio_06 {
	// Esta classe formata o número para que seja exibido separado por vírgula, ao invés de ponto:
	public static NumberFormat formatoBR() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ROOT);
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');
        return new DecimalFormat("###,###,##0.###", symbols);
    }

	// Classe principal:
	public static void main(String[] args) {
		System.out.println("Programa que converte a temperatura de graus Celsius para Fahrenheit");
		  
	    try (Scanner digitacao = new Scanner(System.in)) {
			// Loop com verificação no final:
			boolean verificacao = false; 
			do{
				System.out.print("Digite a temperatura em graus Celsius: ");
				if(digitacao.hasNextDouble()){ 
					Double numeroReal = digitacao.nextDouble();					
					NumberFormat formatter = formatoBR(); // Prepara o formato para separação por vírgula:
					if(numeroReal < -273.15) {
						System.out.println("Não existe temperatura abaixo de zero absoluto!");
					} else if (numeroReal > 10000000000000L) {
						System.out.println("A temperatura (energia cinética média e velocidade da molécula) não pode ultrapassar a velocidade da luz!");
					} else {
			    		System.out.println("Temperatura " + formatter.format(numeroReal) +"\u00B0C equivale a " + formatter.format(numeroReal * (9.0/5.0) + 32.0) + "\u00B0F");
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
