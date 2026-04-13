package principal.lista3;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Desenvolvimento de Sistemas
 * Lista 3. Exercício número 29.
 * 
 * Escreva um programa para calcular o valor da série, para 5 termos.
 * S = 0 + 1/2! + 2/4! + 3/6! + ...
 *   
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Lista03_exercicio29 {
	
	// Esta método estático formata o número para que seja exibido separado por vírgula, ao invés de ponto:
	public static NumberFormat formatoBR() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ROOT);
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');
        return new DecimalFormat("###,###,##0.######", symbols);
    }
	// Método auxiliar para calcular o fatorial
    public static long fatorial(int num) {
        if (num <= 1) return 1;
        long fat = 1;
        for (int i = 2; i <= num; i++) {
            fat *= i;
        }
        return fat;
    }

	public static void main(String[] args) {

		boolean verificacao = false;
		int numero = 0;
		System.out.println("Programa que calcula a seguinte fórmula: S = 0 + 1/2! + 2/4! + 3/6! + ...");
	    try (Scanner digitacao = new Scanner(System.in)) {	    	
			do{
				System.out.print("Quantas séries você quer calcular? ");
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
			
			double soma = .0;
			// Calcula a série: S = 0 + 1/2! + 2/4! + 3/6! + ...
			for (int n = 0; n < numero; n++) {
	            soma += (double) n / fatorial(2 * n);
	        }
            
            NumberFormat formatter = formatoBR(); // Prepara o formato para separação por vírgula:
            
            System.out.println("\nPara " + numero + " séries, o valor de S é: " + formatter.format(soma));
		}
	    
	}
}
