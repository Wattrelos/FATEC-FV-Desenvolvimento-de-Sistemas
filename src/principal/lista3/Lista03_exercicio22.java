package principal.lista3;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 * Desenvolvimento de Sistemas
 * Lista 3. Exercício número 22.
 * 
 *  Escreva um programa completo que permita a qualquer aluno introduzir, pelo teclado,
 *  uma sequência arbitrária de notas (válidas no intervalo de 10 a 20) e que mostre na tela,
 *  como resultado, a correspondente média aritmética. O número de notas com que o aluno
 *  pretenda efetuar o cálculo não será fornecido ao programa, o qual terminará quando for
 *  introduzido um valor que não seja válido como nota de aprovação.
 *
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Lista03_exercicio22 {
	
	// Esta método estático formata o número para que seja exibido separado por vírgula, ao invés de ponto:
	public static NumberFormat formatoBR() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ROOT);
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');
        return new DecimalFormat("00.0", symbols);
    }

	public static void main(String[] args) {

        ArrayList<Double> numerosDigitados = new ArrayList<>(); // Declarar um ArrayList de Inteiros sem tamanho definido
		boolean verificacao = false;
		double limiteMenor = 10.0;
		double limiteMaior = 20.0;
		Double numero = .0;
		Double soma = .0;
		
		System.out.println("Programa que lê uma sequência de notas de 10,0 a 20,0 e calcula a média aritmética");
	    try (Scanner digitacao = new Scanner(System.in)) {
			// Rótulo "principal"
	    	do {
				do{
					System.out.print("Digite uma nota de 10,0 a 20,0. Para encerrar, digite uma nota fora dessa faixa de valores: ");
					if(digitacao.hasNextDouble()){ 
						numero = digitacao.nextDouble();
						if(numero >= limiteMenor && numero <= limiteMaior) {
							numerosDigitados.add(numero);
						}
				    	verificacao = true;
				    } else{ 
				    	System.out.println("Não foi digitado um número válido"); 
				    }
					digitacao.nextLine();	
				//bloco de códigos
				} while(!verificacao);
			} while(numero >= limiteMenor && numero <= limiteMaior); // Só continua no loop se o número digitado estiver na faixa de valores.							
	    	
	    	NumberFormat formatter = formatoBR(); // Prepara o formato para separação por vírgula:
	    	String texto = ""; 	
	        for (Double num : numerosDigitados) {
	            texto += formatter.format(num) + " + ";
	            soma += num;
	        }
	        System.out.print("\nO cálculo da média é: (" + texto.substring(0, texto.length() - 3) + ") / " + numerosDigitados.size());
	        System.out.println(" = " + formatter.format(soma / numerosDigitados.size()) + ".");

		}	    
	    
	}
}
