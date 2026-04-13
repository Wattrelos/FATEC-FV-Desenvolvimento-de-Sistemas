package principal.lista3;

/**
 * Desenvolvimento de Sistemas
 * Lista 3. Exercício número 01.
 * 
 * Faça um programa que determine e mostre os cinco primeiros múltiplos de 3, considerando números maiores que 0.
 *
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Lista03_exercicio01 {

	// Classe principal:
	public static void main(String[] args) {
	    
		System.out.println("Programa que mostra os cinco primeiros múltiplos de 3.");
		// Loop para calcular os primeiros 5 múltiplos (1 a 5)
		System.out.print("Os múltimplos de 3 maiores que 0 são: ");
        for (int i = 1; i <= 5; i++) {
            int multiplo = i * 3;
            System.out.print(multiplo + ", ");
        }
	}
}
