package principal.lista2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Desenvolvimento de Sistemas
 * Lista 2. Exercício número 14.
 * 
 * A nota final de um estudante é calculada a partir de três notas atribuı́das entre o intervalo
 * de 0 até 10, respectivamente, a um trabalho de laboratório, a uma avaliação semestral
 * e a um exame final. A média das três notas mencionadas anteriormente obedece aos
 * pesos: Trabalho de Laboratório: 2; Avaliação Semestral: 3; Exame Final: 5. De acordo
 * com o resultado, mostre na tela se o aluno está reprovado (média entre 0 e 2,9), de
 * recuperação (entre 3 e 4,9) ou se foi aprovado. Faça todas as verificações necessárias
 *
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Lista02_exercicio14 {
	
	// Esta método estático formata o número para que seja exibido separado por vírgula, ao invés de ponto:
	public static NumberFormat formatoBR() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ROOT);
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');
        return new DecimalFormat("#0.0", symbols);
    }

	public static void main(String[] args) {

		Double arrayDeDouble[] = {.0,.0,.0}; // Declarar um ArrayList unidimensional de Double, com 3 elementos
		String arrayString[] = {"Trabalho de Laboratório: ","Avaliação Semestral: ","Exame Final: "}; // Declarar um ArrayList unidimensional de String, com 3 elementos
		boolean verificacao = false;
		double limiteMenor = 0.0;
		double limiteMaior = 10.0;
		Double numero = .0;
		
		System.out.println("Programa que calcula a média ponderada das notas de 3 provas.");
	    try (Scanner digitacao = new Scanner(System.in)) {
			// Rótulo "principal"
	    	for (int i = 0; i < 3; i++) {
				do{
					System.out.print("Digite a nota de " + arrayString[i]+ "de 0,0 a 10,0: ");
					if(digitacao.hasNextDouble()){ 
						numero = digitacao.nextDouble();
						if(numero >= limiteMenor && numero <= limiteMaior) {
							arrayDeDouble[i] = numero;
							verificacao = true;
						} else {
							System.out.println("O valor da nota deve ser de 0,0 até 10,0: ");
						}
				    } else{ 
				    	System.out.println("Não foi digitado um número válido"); 
				    }
					digitacao.nextLine();
				} while(!verificacao);
				verificacao = false;
			}
	    	
	    	Double media = (arrayDeDouble[0] * 2 + arrayDeDouble[1] * 3 + arrayDeDouble[2] * 5)/10;
	    	NumberFormat formatter = formatoBR(); // Prepara o formato para separação por vírgula:

	        System.out.println("\nAs notas digitadas foram: ");
	        System.out.println(" * " +arrayString[0] + formatter.format(arrayDeDouble[0]) + " (peso 2); ");
	        System.out.println(" * " +arrayString[1] + formatter.format(arrayDeDouble[1]) + " (peso 3); ");
	        System.out.println(" * " +arrayString[2] + formatter.format(arrayDeDouble[2]) + " (peso 5).");
	        System.out.print("A média final foi :  " + formatter.format(media));
	        
	        if(Double.compare(media, 3) < 0) {
	        	System.out.println("\tAluno reprovado!");
	        } else if (Double.compare(media, 5) < 0) {
	        	System.out.println("\tAluno de recuperação!");
	    	} else {
	    		System.out.println("\tAluno aprovado!");
	    	}
		}
	}
}
