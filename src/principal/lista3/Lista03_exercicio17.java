package principal.lista3;

import java.util.Scanner;

/**
 * Desenvolvimento de Sistemas
 * Lista 3. Exercício número 17
 * 
 * Faça um programa que leia um número inteiro positivo n e calcule a soma dos n primeiros números naturais.
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Lista03_exercicio17 {

	public static void main(String[] args) {
		
		System.out.println("Programa que lê um número inteiro positivo e mostras a soma dos números naturais.");
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
						System.out.println("O número precisa ser inteiro positivo");
					}				    	
			    } else{ 
			    	System.out.println("Não foi digitado um número inteiro válido"); 
			    }
				digitacao.nextLine();

			//bloco de códigos	
			} while(!verificacao);							
	    	
		};
	    	
		String texto = "";
		int soma = 0;
	    //NumberFormat formatter = formatoBR(); // Prepara o formato para separação por vírgula:
	    System.out.println("\nA soma dos números naturais: ");
	    for (int i = 1; i <= numeroDigitado; i++) {
	    	texto += " + " + i;
	    	if((i % 10) == 0) texto += "\n"; // Pula linha a cada 10 números.
	    	soma += i;	    	
	    }
	    System.out.print(texto.replaceFirst("^[^0-9]+", ""));
	    System.out.println(" = " + soma);
	    System.out.println("\nFim!");
	}
}
