package principal.lista1;

import java.util.Scanner;

/**
 * Desenvolvimento de Sistemas
 * Exercício número 3.
 * Peça ao usuário para digitar três valores inteiros e imprima a soma deles.
 *
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Exercicio_03 {

	public static void main(String[] args) {
		Integer arrayDeInteiros[] = {0,0,0};		  
	    try (Scanner digitacao = new Scanner(System.in)) {
			// Loop com verificação no final:
	    	
	    	for (int i = 0; i < 3; i++) {
				boolean verificacao = false;
				do{
					System.out.print("Digite o " + (i + 1 ) + "º número inteiro: ");
					if(digitacao.hasNextInt()){ 
				    	arrayDeInteiros[i] = digitacao.nextInt();				    	
				    	verificacao = true;
				    	
				    } else{ 
				    	System.out.println("Não foi digitado um número inteiro válido"); 
				    }
					digitacao.nextLine();
	
				//bloco de códigos	
				} while(!verificacao);
							
	    	}
		}
	    // Soma os números e apresenta ao usuário:	
	    System.out.println("A soma de " + arrayDeInteiros[0] + " + " + arrayDeInteiros[1] + " + " + arrayDeInteiros[2] + " é: " + (arrayDeInteiros[0] + arrayDeInteiros[1] + arrayDeInteiros[2]));
	}
}
