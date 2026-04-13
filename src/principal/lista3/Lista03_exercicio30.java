package principal.lista3;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Desenvolvimento de Sistemas
 * Lista 3. Exercício número 30.
 * 
 *  Faça programas para calcular as seguintes sequências:
 *  1 + 2 + 3 + 4 + 5 + ... + n
 *  1 − 2 + 3 − 4 + 5 + ... + (2n − 1)
 *  1 + 3 + 5 + 7 + ... + (2n − 1)
 *   
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Lista03_exercicio30 {
	
	// Esta método estático formata o número para que seja exibido separado por vírgula, ao invés de ponto:
	public static NumberFormat formatoBR() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ROOT);
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');
        return new DecimalFormat("###,###,##0.######", symbols);
    }

	public static void main(String[] args) {

		boolean verificacao = false;
		int numero = 0;
		System.out.println("Programa que calcula a seguintes sequencias:\n"
				+ "1 + 2 + 3 + 4 + 5 + ... + n\n"
				+ "1 − 2 + 3 − 4 + 5 + ... + (2n − 1)\n"
				+ "1 + 3 + 5 + 7 + ... + (2n − 1)");
	    try (Scanner digitacao = new Scanner(System.in)) {	    	
			do{
				System.out.print("\nAté qual número você deseja que seja calculado? ");
				if(digitacao.hasNextInt()){ 
					numero = digitacao.nextInt();
					if(numero > 0 ) {
						verificacao = true;
					} else {
						System.out.println("O número precisa ser um inteiro positivo."); 
					}
			    } else{ 
			    	System.out.println("Não foi digitado um número válido"); 
			    }
				digitacao.nextLine();
			} while(!verificacao);
			
			double soma1 = .0;
			double soma2 = .0;
			double soma3 = .0;
			String texto1 = "";
			String texto2 = "";
			String texto3 = "";
			// Cálculo 1:
			for (int i = 1; i <= numero; i++) {
	                soma1  += i;
	                texto1 += i + " + ";
	        }
			NumberFormat formatter = formatoBR(); // Prepara o formato para separação por vírgula:
		    System.out.println("\nO resultado da primeira sequência é: " + texto1.substring(0, texto1.length() - 3) + " = " + formatter.format(soma1));
			
			// Cálculo 2
			int limite = 2 * numero - 1;	        

	        for (int i = 1; i <= limite; i++) {
	            if (i % 2 != 0) {
	                soma2 += i; // Ímpar: soma
	                texto2 += " + " + i;
	            } else {
	                soma2 -= i; // Par: subtrai
	                texto2 += " - " + i;
	            }
	        }
	        System.out.println("A soma dos ímpares e subtração dos pares até " + limite + " é: " + texto2 + " = " + formatter.format(soma2));
	        
	        // Cálculo 3:
	        // O laço pula de 2 em 2 para pegar apenas os ímpares
	        for (int i = 1; i <= limite; i += 2) {
	            soma3 += i;
	            texto3 += i + " + ";
	        }

	        System.out.println("A soma dos ímpares até " + limite + " é: " + texto3.substring(0, texto1.length() - 3) + " = " + formatter.format(soma3));

		}
	    
	}
}
