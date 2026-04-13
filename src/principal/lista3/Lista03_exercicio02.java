package principal.lista3;

/**
 * Desenvolvimento de Sistemas
 * Lista 3. Exercício número 02.
 * 
 * Escreva um programa que escreva na tela, de 1 até 100, de 1 em 1, 3 vezes. A primeira vez deve usar a estrutura de repetição f or, a segunda while, e a terceira do while.
 *
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Lista03_exercicio02 {

	// Classe principal:
	public static void main(String[] args) {
	    
		System.out.println("Programa que escreva na tela três vezes usando laços de repetição diferentes.");
		// Loop for de 0 a 100
		System.out.println("Loop for de 1 a 100: ");
        for (int i = 1; i <= 100; i++) {
        	// System.out.print(i + ", "); // Impressão tradicional, sem formatação.
        	System.out.print(String.format("%4d", i) + ",");
        	if((i % 25)  == 0) System.out.println(); // Adiciona uma quebra de linha a cada 25 números. 
        	
        } 
        System.out.println("\nLoop while (enquanto) de 1 a 100: "); // "\n" pula para a linha seguinte.
        int j = 1;
    	while(j <=100) {    		
    		System.out.print(String.format("%4d", j) + ",");   // Mostra o valor de j
    		if((j % 25)  == 0) System.out.println();           // Adiciona uma quebra de linha a cada 25 números.
    		j++; // Inclementa j (J++).
    	}
    	int k = 1;
    	System.out.println("\nLoop com while no final de 1 a 100: "); // "\n" pula para a linha seguinte.
    	do {    		
    		System.out.print(String.format("%4d", k) + ",");   // Mostra o valor de j
    		if((k % 25)  == 0) System.out.println();           // Adiciona uma quebra de linha a cada 25 números.
    		k++; // Inclementa k (k++).
    	} while(k <=100);  // Note que o loop está no final, isto é, o bloco será executado ao menos uma vez.
	}
}
