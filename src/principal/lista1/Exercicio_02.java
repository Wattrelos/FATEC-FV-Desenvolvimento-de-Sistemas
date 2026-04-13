package principal.lista1;

import java.text.DecimalFormat;

import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
/**
 * Desenvolvimento de Sistemas
 * Exercício número 2.
 * Faça um programa que leia um número real e o imprima.
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Exercicio_02 {
	// Esta classe formata o número para que seja exibido separado por vírgula, ao invés de ponto:
	public static NumberFormat formatoBR() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ROOT);
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');
        return new DecimalFormat("#0.#####", symbols);
    }

	// Classe principal:
	public static void main(String[] args) {	   
		  
	    try (Scanner digitacao = new Scanner(System.in)) {
			// Loop com verificação no final:
			boolean verificacao = false; 
			do{
				System.out.print("Digite um número Real: ");
				if(digitacao.hasNextDouble()){ 
					Double numeroReal = digitacao.nextDouble();					
					NumberFormat formatter = formatoBR(); // Prepara o formato para separação por vírgula:			        
			    	System.out.println("O número digitado foi " + formatter.format(numeroReal));
			    	verificacao = true;
			    	
			    } else{ 
			    	System.out.println("Não foi digitado um número Real!"); 
			    }
				digitacao.nextLine(); // Limpa o boofer do teclado.

			//bloco de códigos

			} while(!verificacao);
		}


	}

}
