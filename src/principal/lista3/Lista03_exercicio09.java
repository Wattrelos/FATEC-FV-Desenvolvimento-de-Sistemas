package principal.lista3;

import java.util.Scanner;

/**
 * Desenvolvimento de Sistemas
 * Lista 3. Exercício número 09
 * .
 * 
 * Faça um programa que leia um número inteiro N e depois imprima os N primeiros números naturais ı́mpares.
 *
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Lista03_exercicio09 {

	public static void main(String[] args) {
		
		System.out.println("Programa que mostra os N primeiros números naturais.");
		int numeroDigitado = 0;
	    try (Scanner digitacao = new Scanner(System.in)) {	    	
	    	
			boolean verificacao = false;
			do{
				System.out.print("Digite um número inteiro positivo: ");
				if(digitacao.hasNextInt()){
					numeroDigitado = digitacao.nextInt();
					if (numeroDigitado > 0) {
						verificacao = true;							
					}else {
						System.out.println("O número precisa ser um inteiro positivo");
					}				    	
			    } else{ 
			    	System.out.println("Não foi digitado um número inteiro válido"); 
			    }
				digitacao.nextLine();

			//bloco de códigos	
			} while(!verificacao);							
	    	
		};
	    	    
	    //NumberFormat formatter = formatoBR(); // Prepara o formato para separação por vírgula:
	    System.out.println("\nOs " + numeroDigitado + " primeiros números naturais ímpares são: ");
	    for (int j = 1; j <= numeroDigitado;j++) {
	    	System.out.print(j*2-1 + ", ");
	    	if((j % 10) == 0) System.out.println(); // Pula linha a cada 10 números.
	    }
	    System.out.print("\nFim!");
	}
}
