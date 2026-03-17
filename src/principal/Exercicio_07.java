package principal;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_07 {
	// Esta classe formata o número para que seja exibido separado por vírgula, ao invés de ponto:
	public static NumberFormat formatoBR() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ROOT);
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');
        return new DecimalFormat("#0.0", symbols);
    }

	// Classe principal:
	public static void main(String[] args) {
		System.out.println("Programa que converte a temperatura de graus Fahrenheit para graus Celsius");
		  
	    try (Scanner digitacao = new Scanner(System.in)) {
			// Loop com verificação no final:
			boolean verificacao = false; 
			do{
				System.out.print("Digite a temperatura em graus Fahrenheit: ");
				if(digitacao.hasNextDouble()){ 
					Double numeroReal = digitacao.nextDouble();					
					NumberFormat formatter = formatoBR(); // Prepara o formato para separação por vírgula:
					if(numeroReal < -459.67) {
						System.out.println("Não existe temperatura abaixo de zero absoluto!");
					} else {
			    		System.out.println("Temperatura " + formatter.format(numeroReal) +"\u00B0F equivale a " + formatter.format(5.0 * (numeroReal - 32.0) / 9.0) + "\u00B0C");
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
