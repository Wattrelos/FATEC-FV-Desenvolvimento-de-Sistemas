package principal.lista1;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Desenvolvimento de Sistemas
 * Exercício número 34.
 * Leia o raio de um círculo e calcule sua área.
 * Fórmula: A = π × r² (π = 3.141592)
 *
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Exercicio_34 {
	// Esta classe formata o número para que seja exibido separado por vírgula, ao invés de ponto:
	public static NumberFormat formatoBR() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ROOT);
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');
        return new DecimalFormat("###,###,##0.###", symbols);
    }

	// Classe principal:
	public static void main(String[] args) {
	    
		System.out.println("Programa que lê o raio de um círculo e calcule sua área.");
		  
	    try (Scanner digitacao = new Scanner(System.in)) {
			// Loop com verificação no final:
			boolean verificacao = false; 
			do{
				System.out.print("Digite 0 valor do raio do círculo: ");
				if(digitacao.hasNextDouble()){
					Double numeroReal = digitacao.nextDouble();
					NumberFormat formatter = formatoBR(); // Prepara o formato para separação por vírgula:
					if(numeroReal < 0) {
						System.out.println("Número não pode ser menor que zero!");
					} else {
			    		System.out.println("O valor do raio é " + formatter.format(numeroReal) +" e a área é " + formatter.format(numeroReal * numeroReal * 3.141592) + ".");
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