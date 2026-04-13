package principal.lista2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Desenvolvimento de Sistemas
 * Lista 02.
 * Exercício número 07
 * Faça um programa que receba dois números e mostre o maior. Se por acaso, os dois números forem iguais, imprima a mensagem Números iguais.
 *
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Lista02_exercicio07 {
	// Declaração única do Scanner para toda a classe
    private static Scanner digitacao = new Scanner(System.in);

	// Esta classe formata o número para que seja exibido separado por vírgula, ao invés de ponto:
	public static NumberFormat formatoBR() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ROOT);
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');
        return new DecimalFormat("###,###,##0.##########", symbols);
    }
		
	// Função que lê um número inteiro do teclado. Função estática, não precisa instanciar.
	private static Double leNumeroRealDoTeclado() {
		boolean verificacao = false;
		do{
			if(digitacao.hasNextDouble()){ // Só saiu daqui se digitar um número inteiro ou reais! ;D
				return digitacao.nextDouble();	
		    } else{ 
		    	System.out.println("Por favor, digitar somente números Reais separados por víngula ou números inteiros."); 
		    }
			digitacao.nextLine(); // Limpa o cache do teclado.
		} while(!verificacao);
		
		return null; // Evitar quebras.
	}

		public static void main(String[] args) {
			System.out.println("Programa que receba dois números e mostra o maior. Se por acaso, os dois números forem iguais, mostra a mensagem: \"Números iguais!\"");
			NumberFormat formatter = formatoBR(); // Prepara o formato para separação por vírgula:
			
			System.out.print("Digite o primeiro número: ");
			Double number1 = leNumeroRealDoTeclado();
			System.out.print("Digite o segundo número: ");
			Double number2 = leNumeroRealDoTeclado();
		    
			
		    // Verifica para ver qual é o maior
			int comparacao = Double.compare(number1, number2); // A maneira mais segura e recomendada para comparar dois números do tipo Double é utilizar o método estático Double.compare(number1, number2).


			System.out.println("\nNúmeros digitados: " + formatter.format(number1) + " e " + formatter.format(number2) + ".");
	        if (comparacao == 0) {
	        	System.out.println("\n\u001B[32mNúmero iguais!" + formatter.format(number1) + " e o número " + formatter.format(number2) + " são iguais!");
	        } else if (comparacao > 0) {
	        	System.out.println("\n\u001B[32mO número " + formatter.format(number1) + " é o maior. A diferença entre eles é " + formatter.format(number1 - number2));
	        } else {
	        	System.out.println("\n\u001B[32mO número " + formatter.format(number2) + " é o maior. A diferença entre eles é " + formatter.format(number2 - number1));
	        }
	        System.out.println("Fim.");
	        // Feche o scanner somente no final da aplicação
	        digitacao.close(); // Fecha a instância scanner (digitação).
		}
		
}

