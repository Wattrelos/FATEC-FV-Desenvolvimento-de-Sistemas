package principal.lista2;

import java.util.Scanner;

/**
 * Desenvolvimento de Sistemas
 * Lista 02.
 * Exercício número 15
 * Usando switch, escreva um programa que leia um inteiro entre 1 e 7 e imprima o dia
 * da semana correspondente a este numero. Isto é, domingo se 1, segunda-feira se 2, e
 * assim por diante.
 *
 * @author Josias C Sobrinho
 * @version 1.0
 */


public class Lista02_exercicio16 {
    public static void main(String[] args) {
    	int numero = 0;
    	String nomeMes = "";
    	try (Scanner digitacao = new Scanner(System.in)) {
    		System.out.println("Programa que mostra o mês correspondente ao número digitado.");
			boolean verificacao = false;
			do{
				System.out.print("Digite o número do mês: ");
				if(digitacao.hasNextInt()){ 
					numero = digitacao.nextInt();
					if (numero >= 1 && numero <=12) {
						verificacao = true;
					} else {
						System.out.println("Número inválidor. O número deve ser de 1 a 12.");
					}
			    } else{ 
			    	System.out.println("Número inválidor. Por favor, digitar somente número inteiro de 1 a 12."); 
			    }
				digitacao.nextLine(); // Limpa o cache do teclado.

			//bloco de códigos	
			} while(!verificacao);
	
	        // Estrutura switch para definir o dia
	        switch (numero) {
	            case  1: nomeMes = "Janeiro"; break;
	            case  2: nomeMes = "Fevereiro"; break;
	            case  3: nomeMes = "Março"; break;
	            case  4: nomeMes = "Abril"; break;
	            case  5: nomeMes = "Maio"; break;
	            case  6: nomeMes = "Junho"; break;
	            case  7: nomeMes = "Julho"; break;
	            case  8: nomeMes = "Agosto"; break;
	            case  9: nomeMes = "Setembro"; break;
	            case 10: nomeMes = "Outubro"; break;
	            case 11: nomeMes = "Novembro"; break;
	            case 12: nomeMes = "Dezembro"; break;
	            default: nomeMes = "Mês inválido! Digite um número de 1 a 12."; break;
	        }
	
	        System.out.println("O nome do dia da semana é " + nomeMes);
    	}
    }
}