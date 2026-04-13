package principal.lista3;

/**
 * Desenvolvimento de Sistemas
 * Lista 3. Exercício número 25.
 * 
 * Faça um programa que some todos os números naturais abaixo de 1000 que são múltiplos de 3 ou 5.
 *   
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Lista03_exercicio25 {

	public static void main(String[] args) {
		
		int soma  = 0;
        String textoM3 = "";
        String textoM5 = "";        
		
		System.out.println("Programa que soma todos os números naturais abaixo de 1000 e que são múltiplos de 3 ou 5");
	    	
		
		// É mais eficiente um loop de 3 em 3 e de 5 em 5, ao invés de 1 em 1:
        for (int multiplos3 = 3 ; multiplos3 < 1000; multiplos3 += 3) {
        	soma += multiplos3;
        	textoM3 += String.format("%1$4s",multiplos3) + ",";  // %1$4s : O primeiro argumento, tamanho 4, String (espaço)
        	if (multiplos3 % 30 == 0) textoM3 += "\n"; //Pula linha a cada 10 números
        }
        for (int multiplos5 = 5 ; multiplos5 < 1000; multiplos5 += 5) {
        	textoM5 += String.format("%1$4s",multiplos5) + ",";  // %1$4s : O primeiro argumento, tamanho 4, String (espaço)
        	soma += multiplos5;
        	if (multiplos5 % 50 == 0) textoM5 += "\n"; //Pula linha a cada 10 números
        }
        // Para subtrair a quantidade de números repetidos:
        for (int multiplos15 = 15 ; multiplos15 < 1000; multiplos15 += 15) { 
        	soma -= multiplos15;        	
        }
        
        System.out.println("Os múltiplos de 3 são: \n" + textoM3);
        System.out.println("Os múltiplos de 5 são: \n" + textoM5);
        System.out.println("\nA soma dos números menores que 1000 e que são múltiplos de 3 ou multiplos de 5 é " +  soma);
	}
}
