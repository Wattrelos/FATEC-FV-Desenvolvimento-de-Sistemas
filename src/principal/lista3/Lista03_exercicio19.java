package principal.lista3;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Desenvolvimento de Sistemas
 * Lista 3. Exercício número 19
 * 
 * Escreva um algoritmo que leia um número inteiro entre 100 e 999 e imprima na saı́da
 * cada um dos algarismos que compõem o número
 * 
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Lista03_exercicio19 {

	public static void main(String[] args) {
		
		System.out.println("Programa que lê um número inteiro entre 100 e 999 e mostra cada um dos algarismos que compõem o número.");
		int numeroDigitado = 0;
	    try (Scanner digitacao = new Scanner(System.in)) {	    	
	    	
			boolean verificacao = false;
			do{
				System.out.print("Digite um número inteiro entre 100 e 999: ");
				if(digitacao.hasNextInt()){
					numeroDigitado = digitacao.nextInt();
					if (numeroDigitado >= 100 && numeroDigitado <= 999) {
						verificacao = true;							
					}else {
						System.out.println("O número digitado precisa estar entre 100 e 999");
					}				    	
			    } else{ 
			    	System.out.println("Não foi digitado um número inteiro válido"); 
			    }
				digitacao.nextLine();

			//bloco de códigos	
			} while(!verificacao);							
	    	
		};
	    	
		//NumberFormat formatter = formatoBR(); // Prepara o formato para separação por vírgula:
	    System.out.println("\nO número digitado foi: " + numeroDigitado);
	    /*
	    int contador = 3;
	    for (char algarismo : Integer.toString(numeroDigitado).toCharArray()) {
            System.out.println("O " + contador-- + "º algarismo é: " + algarismo);
        }	    
	    */
	    /*
	    // Alternativa: Substituição usando IntStream
	    String strNum = Integer.toString(numeroDigitado);
	    int n = strNum.length();
	    IntStream.range(0, n)
        .forEach(i -> {
            char algarismo = strNum.charAt(i);
            // contador começa em n e diminui
            System.out.println("O " + (n - i) + "º algarismo é: " + algarismo);
        });
        */
	    
	    String numStr = Integer.toString(numeroDigitado);
	    IntStream.range(0, numStr.length())
	        .forEach(i -> System.out.println("O " + (3 - i) + "º algarismo é: " + numStr.charAt(i)));
	     
	  
	    System.out.println("\nFim!");
	}
}
