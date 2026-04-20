package principal.lista2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Desenvolvimento de Sistemas
 * Lista 2. Exercício número 13.
 * 
 *   Faça um algoritmo que calcule a média ponderada das notas de 3 provas. A primeira e
 *   a segunda prova têm peso 1 e a terceira tem peso 2. Ao final, mostrar a média do aluno
 *   e indicar se o aluno foi aprovado ou reprovado. A nota para aprovação deve ser igual ou
 *   superior a 60 pontos.
 *
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Lista02_exercicio13 {
	
	// Esta método estático formata o número para que seja exibido separado por vírgula, ao invés de ponto:
	public static NumberFormat formatoBR() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ROOT);
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');
        return new DecimalFormat("00.0", symbols);
    }

	public static void main(String[] args) {

		Double arrayDeDouble[] = {.0,.0,.0}; // Declarar um ArrayList unidimensional de Double, com 3 elementos
		boolean verificacao = false;
		double limiteMenor = 0.0;
		double limiteMaior = 100.0;
		Double numero = .0;
		
		System.out.println("Programa que calcula a média ponderada das notas de 3 provas.");
	    try (Scanner digitacao = new Scanner(System.in)) {
			// Rótulo "principal"
	    	for (int i = 0; i < 3; i++) {
				do{
					System.out.print("Digite a " + (i + 1) + "ª nota de 0,0 a 100,0: ");
					if(digitacao.hasNextDouble()){ 
						numero = digitacao.nextDouble();
						if(numero >= limiteMenor && numero <= limiteMaior) {
							arrayDeDouble[i] = numero;
							verificacao = true;
						} else {
							System.out.println("O valor da nota deve ser de 0,0 até 100,0: ");
						}
				    } else{ 
				    	System.out.println("Não foi digitado um número válido"); 
				    }
					digitacao.nextLine();
				} while(!verificacao);
				verificacao = false;
			}							
	    	
	    	NumberFormat formatter = formatoBR(); // Prepara o formato para separação por vírgula:

	        System.out.println("As notas digitadas foram:  " + formatter.format(arrayDeDouble[0]) + " (peso 1), " + formatter.format(arrayDeDouble[1]) + " (peso 1) e " + formatter.format(arrayDeDouble[2]) + " (peso 2).");
	        System.out.println("A média final foi :  " + formatter.format((arrayDeDouble[0] + arrayDeDouble[1] + 2 * arrayDeDouble[2])/4) + ".");

		}
	}
}
