package principal.lista3;

/**
 * Desenvolvimento de Sistemas
 * Lista 3. Exercício número 10
 * .
 * 
 * Faça um programa que calcule e mostre a soma dos 50 primeiros números pares.
 *
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Lista03_exercicio10 {

	public static void main(String[] args) {
		
		String texto = "";
		int soma = 0;
		System.out.println("Programa que mostra a soma dos 50 primeiros números pares.");
	    System.out.println("\nA soma dos 50 primeiros números pares são: ");
	    for (int j = 1; j <= 50; j++) {
	    	texto += " + " + j*2;
	    	soma += j*2;
	    	if((j % 20) == 0) texto += "\n"; // Pula linha a cada 10 números pares.
	    }
	    System.out.print(texto.replaceFirst("^[^0-9]+", "") + " = " + soma);	    
	    System.out.print("\nFim!");
	}
}
