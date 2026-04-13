package principal.lista1;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Desenvolvimento de Sistemas
 * Exercício número 28.
 * Leia três valores e apresente a soma dos quadrados deles.
 *
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Exercicio_28 {
	// Esta classe formata o número para que seja exibido separado por vírgula, ao invés de ponto:
	public static NumberFormat formatoBR() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ROOT);
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');
        return new DecimalFormat("###,###,##0.###", symbols);
    }

	public static void main(String[] args) {
		System.out.println("Programa que soma o quadrado de 3 números x²+y²+z²");
		Double arrayDeNumerosReais[] = {.0,.0,.0};
		String  arrayDeStrings[] = {"x","y","z"};
		NumberFormat formatter = formatoBR(); // Prepara o formato para separação por vírgula:
	    try (Scanner digitacao = new Scanner(System.in)) {
			// Loop com verificação no final:
	    	
	    	for (int i = 0; i < 3; i++) {
				boolean verificacao = false;
				do{
					System.out.print("Digite o valor de " + arrayDeStrings[i] + ": ");
					if(digitacao.hasNextDouble()){ 
				    	arrayDeNumerosReais[i] = digitacao.nextDouble();				    	
				    	verificacao = true;
				    	
				    } else{ 
				    	System.out.println("Por favor, digitar somente números reais."); 
				    }
					digitacao.nextLine();
	
				//bloco de códigos	
				} while(!verificacao);
							
	    	}
		}
	    // Soma os números e apresenta ao usuário:	
	    System.out.println("O resultado de " + formatter.format(arrayDeNumerosReais[0]) + "² + "
				  							 + formatter.format(arrayDeNumerosReais[1]) + "² + "
				  							 + formatter.format(arrayDeNumerosReais[2]) + "² = " +
		formatter.format(arrayDeNumerosReais[0] * arrayDeNumerosReais[0] + arrayDeNumerosReais[1] * arrayDeNumerosReais[1] + arrayDeNumerosReais[2] * arrayDeNumerosReais[2]));
	}
}
