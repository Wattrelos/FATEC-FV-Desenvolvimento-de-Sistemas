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


public class Lista02_exercicio15 {
    public static void main(String[] args) {
    	int numero = 0;
    	String nomeDia = "";
    	try (Scanner digitacao = new Scanner(System.in)) {
    		System.out.println("Programa que mostra o dia da semana correspondente ao número digitado.");
			boolean verificacao = false;
			do{
				System.out.print("Digite um número: ");
				if(digitacao.hasNextInt()){ 
					numero = digitacao.nextInt();
					if (numero >= 1 && numero <=7) {
						verificacao = true;
					} else {
						System.out.println("Número inválidor. O número deve ser de 1 a 7.");
					}
			    } else{ 
			    	System.out.println("Número inválidor. Por favor, digitar somente número inteiro de 1 a 7."); 
			    }
				digitacao.nextLine(); // Limpa o cache do teclado.

			//bloco de códigos	
			} while(!verificacao);
	
	        // Estrutura switch para definir o dia
	        switch (numero) {
	            case 1: nomeDia = "Domingo"; break;
	            case 2: nomeDia = "Segunda-feira"; break;
	            case 3: nomeDia = "Terça-feira"; break;
	            case 4: nomeDia = "Quarta-feira"; break;
	            case 5: nomeDia = "Quinta-feira"; break;
	            case 6: nomeDia = "Sexta-feira"; break;
	            case 7: nomeDia = "Sábado"; break;
	            default: nomeDia = "Dia inválido! Digite um número de 1 a 7."; break;
	        }
	
	        System.out.println("O nome do dia da semana é " + nomeDia);
    	}
    }
}