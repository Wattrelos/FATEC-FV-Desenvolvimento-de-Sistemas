package principal.lista1;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Desenvolvimento de Sistemas
 * Exercício número 30.
 * Leia um valor em reais e a cotação do dólar. Imprima o valor em dólares.
 *
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Exercicio_30 {
	// Esta classe formata o número para que seja exibido separado por vírgula, ao invés de ponto:
	public static NumberFormat formatoBR() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ROOT);
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');
        return new DecimalFormat("###,###,##0.00", symbols);
    }

	// Classe principal:
	public static void main(String[] args) {
	    
		System.out.println("Programa que lê um valor em reais (BRL) e converte em dólares norte-americanos (USD).");
		  
	    try (Scanner digitacao = new Scanner(System.in)) {
			// Loop com verificação no final:
			boolean verificacao = false; 
			do{
				System.out.print("Digite um valor em Reais (BRL): ");
				if(digitacao.hasNextDouble()){ 
					Double numeroReal = digitacao.nextDouble();					
					NumberFormat formatter = formatoBR(); // Prepara o formato para separação por vírgula:
						
			    		System.out.println("O valor de R$ " + formatter.format(numeroReal) +" equivale a US$ " + formatter.format(numeroReal * 0.19) + ".");
			    		verificacao = true;
			    } else{
			    	System.out.println("Não foi digitado um número válido!"); 
			    }
				digitacao.nextLine(); // Limpa o boofer do teclado.

			//bloco de códigos

			} while(!verificacao);
		}
	}
}
