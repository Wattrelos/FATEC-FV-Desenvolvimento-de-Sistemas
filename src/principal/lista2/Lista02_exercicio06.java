package principal.lista2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Desenvolvimento de Sistemas
 * Lista 02.
 * Exercício número 06
 * Escreva um programa que, dados dois números inteiros, mostre na tela o maior deles,assim como a diferença existente entre ambos.
 *
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Lista02_exercicio06 {
	// Declaração única do Scanner para toda a classe
    private static Scanner digitacao = new Scanner(System.in);

	// Esta classe formata o número para que seja exibido separado por vírgula, ao invés de ponto:
	public static NumberFormat formatoBR() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ROOT);
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');
        return new DecimalFormat("###,###,##0.###", symbols);
    }
		
	// Função que lê um número inteiro do teclado. Função estática, não precisa instanciar.
	private static Integer leNumeroInteiroDoTeclado() {
		boolean verificacao = false;
		do{
			if(digitacao.hasNextInt()){ // Só saiu daqui se digitar um número inteiro! ;D
				return digitacao.nextInt();	
		    } else{ 
		    	System.out.println("Por favor, digitar somente números inteiros."); 
		    }
			digitacao.nextLine(); // Limpa o cache do teclado.
		} while(!verificacao);
		
		return null; // Evitar quebras.
	}

		public static void main(String[] args) {
			System.out.println("Programa que, dados dois números inteiros, mostra na tela o maior deles, e mostra a diferença existente entre ambos");
			NumberFormat formatter = formatoBR(); // Prepara o formato para separação por vírgula:
			
			System.out.print("Digite o primeiro número: ");
			Integer number1 = leNumeroInteiroDoTeclado();
			System.out.print("Digite o segundo número: ");
			Integer number2 = leNumeroInteiroDoTeclado();
		    
			
		    // Verifica se é par ou ímpar:


			System.out.println("\nNúmeros digitados: " + formatter.format(number1) + " e " + formatter.format(number2) + ".");
	        if (number1 == number2) {
	        	System.out.println("\n\u001B[32mO número " + formatter.format(number1) + " e o número " + formatter.format(number2) + " são iguais!");
	        } else if (number1 > number2) {
	        	System.out.println("\n\u001B[32mO número " + formatter.format(number1) + " é o maior. A diferença entre eles é " + formatter.format(number1 - number2));
	        } else {
	        	System.out.println("\n\u001B[32mO número " + formatter.format(number2) + " é o maior. A diferença entre eles é " + formatter.format(number2 - number1));
	        }
	        System.out.println("Fim.");
	        // Feche o scanner apenas no final da aplicação
	        digitacao.close(); // Fecha a instância scanner (digitação).
		}
		
}

