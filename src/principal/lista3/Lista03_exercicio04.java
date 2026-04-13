package principal.lista3;

/**
 * Desenvolvimento de Sistemas
 * Lista 3. Exercício número 04.
 * 
 *  Escreva um programa que declare um inteiro, inicialize-o com 0, e incremente-o de 1000
 *  em 1000, imprimindo seu valor na tela, até que seu valor seja 100000 (cem mil).
 *
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Lista03_exercicio04 {

	// Classe principal:
	public static void main(String[] args)  {
	    
		System.out.println("Programa que inclemente de 0 (zero) até 100.000, de mil em mil.");
		
    	int contador = 0; // Inicializa o contador.

    	do {
    		System.out.print("\t " + contador);
    		if(contador % 10000 == 0) System.out.println();  // Pula linha a cada dez mil.
    	    contador = contador + 1000;
    	    
    	} while (contador <= 100000);  // Executa equanto (while) i for menor que cem mil.
    	
    	System.out.println("\nFim!");
	}
}
