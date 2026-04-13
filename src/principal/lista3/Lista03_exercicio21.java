package principal.lista3;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Desenvolvimento de Sistemas
 * Lista 3. Exercício número 21.
 * 
 *  Faça um programa que receba dois números. Calcule e mostre:
 *  • a soma dos números pares desse intervalo de números, incluindo os números digitados;
 *  • a multiplicação dos números ı́mpares desse intervalo, incluindo os digitados;
 *
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Lista03_exercicio21 {

	public static void main(String[] args) {

		int numerosDigitados[] = {0,0};
		ArrayList<Integer> numerosPares   = new ArrayList<>();
		ArrayList<Integer> numerosImpares = new ArrayList<>();
		boolean verificacao = false;
		
		System.out.println("Programa que lê dois números inteiros, calcula o intervalo incluso entre esses dois numeros: Soma os números pares e multiplica os números ímpares.");
	    try (Scanner digitacao = new Scanner(System.in)) {
			// Rótulo "principal"
	    	for (int i = 0; i < 2; i++) {
				do{
					System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
					if(digitacao.hasNextInt()){ 
						numerosDigitados[i] = digitacao.nextInt();
				    	verificacao = true;
				    } else{ 
				    	System.out.println("Não foi digitado um número válido"); 
				    }
					digitacao.nextLine();	
				//bloco de códigos	
				} while(!verificacao);						
	    	}
	    	int maior = 0, menor = 0;
	    	if(numerosDigitados[0] == numerosDigitados[1]) {
	    		System.out.println("Números iguais! Portanto, não há intevalo!");
	    		System.exit(0); // Encerra o programa.
	    	}else if(numerosDigitados[0] > numerosDigitados[1]) {
	    		maior = numerosDigitados[0];
	    		menor = numerosDigitados[1];
	    	}else {
	    		maior = numerosDigitados[1];
	    		menor = numerosDigitados[0];	    		
	    	}
	    	int somaPares = 0;
	    	long multiplicaImpares = 1; // Evita-se estourar o número inteiro.
	    	for (int intervalo = menor; intervalo <= maior; intervalo++) {
	    		if(intervalo % 2 == 0) {
	    			somaPares += intervalo; 
	    			numerosPares.add(intervalo);
	    		} else {
	    			multiplicaImpares *= intervalo;
	    			numerosImpares.add(intervalo);
	    		}
	    		
	    	}
	    	
	        System.out.print("A soma dos numeros pares de " + menor + " até " + maior + " é: " );	        
	        System.out.println(numerosPares.stream()
                    .map(String::valueOf) // Converte Integer para String
                    .collect(Collectors.joining(" + ")) + " = " + somaPares); // Une com vírgula
	        
	        System.out.print("A multiplicação dos numeros impares de " + menor + " até " + maior + " é: " );	        
	        System.out.println(numerosImpares.stream()
                    .map(String::valueOf) // Converte Integer para String
                    .collect(Collectors.joining(" * ")) + " = " + multiplicaImpares); // Une com vírgula	        
	        
		}	    
	    
	}
}
