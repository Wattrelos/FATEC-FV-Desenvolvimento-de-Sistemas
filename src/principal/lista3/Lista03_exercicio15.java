package principal.lista3;

import java.util.Scanner;

/**
 * Desenvolvimento de Sistemas
 * Lista 3. Exercício número 15
 * 
 *  Faça um programa que leia um número inteiro positivo ı́mpar N e imprima todos os números ı́mpares de 1 até N em ordem crescente.
 *
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Lista03_exercicio15 {

	public static void main(String[] args) {
		
		System.out.println("Programa que lê um número inteiro ímpar positivo e mostras os número pares de 0 a N em ordem crescente.");
		int numeroDigitado = 0;
	    try (Scanner digitacao = new Scanner(System.in)) {	    	
	    	
			boolean verificacao = false;
			do{
				System.out.print("Digite um número ímpar inteiro positivo: ");
				if(digitacao.hasNextInt()){
					numeroDigitado = digitacao.nextInt();
					if (numeroDigitado > 0 && !((numeroDigitado % 2) == 0)) { // Se não é par, é ímpar.
						verificacao = true;							
					}else {
						System.out.println("O número precisa ser ímpar inteiro positivo");
					}				    	
			    } else{ 
			    	System.out.println("Não foi digitado um número inteiro válido"); 
			    }
				digitacao.nextLine();

			//bloco de códigos	
			} while(!verificacao);							
	    	
		};
	    	    
	    //NumberFormat formatter = formatoBR(); // Prepara o formato para separação por vírgula:
	    System.out.println("\nOs números inteiros pares positivos, de zero a " + numeroDigitado + " são: ");
	    for (int i = 1; i <= numeroDigitado; i +=2) {
	    	System.out.print(i + ", ");
	    	if((i % 10) == 0) System.out.println(); // Pula linha a cada 10 números.
	    }
	    System.out.print("\nFim!");
	}
}
