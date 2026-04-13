package principal.lista1;

import java.util.Scanner;

/**
 * Desenvolvimento de Sistemas
 * Exercício número 1.
 * Faça um programa que leia um número inteiro e o imprima.
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Exercicio_01 {

	public static void main(String[] args) {	   
		// O scanner será fechado automaticamente ao sair do bloco try
	    try (Scanner digitacao = new Scanner(System.in)) {
			// Loop com verificação no final:
			boolean verificacao = false; 
			do{
				System.out.print("Digite um número inteiro: ");
				if(digitacao.hasNextInt()){ 
			    	Integer inteiro = digitacao.nextInt();
			    	System.out.println("O número digitado foi " + inteiro);
			    	verificacao = true;
			    	
			    } else{ 
			    	System.out.println("Não foi digitado um número inteiro"); 
			    }
				digitacao.nextLine();

			//bloco de códigos

			} while(!verificacao);
		}
	    // scanner.close() não é necessário aqui

	}

}
