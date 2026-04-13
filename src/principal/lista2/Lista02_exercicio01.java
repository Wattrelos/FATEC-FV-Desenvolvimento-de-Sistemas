package principal.lista2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Desenvolvimento de Sistemas
 * Lista 02.
 * Exercício número 01.
 * Faça um programa que receba dois números e mostre qual deles é o maior.
 *
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Lista02_exercicio01 {

		// Esta classe formata o número para que seja exibido separado por vírgula, ao invés de ponto:
		public static NumberFormat formatoBR() {
	        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ROOT);
	        symbols.setDecimalSeparator(',');
	        symbols.setGroupingSeparator('.');
	        return new DecimalFormat("###,###,##0.###", symbols);
	    }

		public static void main(String[] args) {
			System.out.println("Programa que receba dois números e mostra qual deles é o maior");
			Double arrayDeNumerosReais[] = {.0,.0};
			NumberFormat formatter = formatoBR(); // Prepara o formato para separação por vírgula:
		    try (Scanner digitacao = new Scanner(System.in)) {
				// Loop com verificação no final:
		    	
		    	for (int i = 0; i < 2; i++) {
					boolean verificacao = false;
					do{
						System.out.print("Digite o valor de " + (i + 1) + "º número: ");
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
		    System.out.print("Você digitou os números: " + formatter.format(arrayDeNumerosReais[0]) + " e "
					  							 + formatter.format(arrayDeNumerosReais[1]));
		    // Forma 1: Usando if-else
	        if (arrayDeNumerosReais[0] > arrayDeNumerosReais[1]) {
	            System.out.println("\tO maior é: " + formatter.format(arrayDeNumerosReais[0]));
	        } else if (arrayDeNumerosReais[1] > arrayDeNumerosReais[0]) {
	            System.out.println("\tO maior é: " + formatter.format(arrayDeNumerosReais[1]));
	        } else {
	            System.out.println("\tOs números são iguais.");
	        }
		    
		}
}

