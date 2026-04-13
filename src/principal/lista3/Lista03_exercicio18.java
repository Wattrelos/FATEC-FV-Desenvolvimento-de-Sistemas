package principal.lista3;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Desenvolvimento de Sistemas
 * Lista 3. Exercício número 18.
 * 
 *  Escreva um algoritmo que leia certa quantidade de números e imprima o maior deles e
 *  quantas vezes o maior número foi lido. A quantidade de números a serem lidos deve ser
 *  fornecida pelo usuário.
 *
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Lista03_exercicio18 {
	
	// Esta classe formata o número para que seja exibido separado por vírgula, ao invés de ponto:
	public static NumberFormat formatoBR() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ROOT);
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');
        return new DecimalFormat("###,###,##0.######", symbols);
    }

	public static void main(String[] args) {
		int quantidadeNumeros = 0;
		
		System.out.println("Programa que mostra o maior valor e quantas ocorrências do maior valor de uma quantidade de números digitados.");
	    try (Scanner digitacao = new Scanner(System.in)) {
	    	
	    	boolean verificacao1 = false;
			do{
				System.out.print("Quantos números você gostaria de digitar? ");
				if(digitacao.hasNextInt()){
					quantidadeNumeros = digitacao.nextInt();
					if(quantidadeNumeros > 0 && quantidadeNumeros < 100) {
						verificacao1 = true;
					}else {
						System.out.println("Uma quantidade razoável é de 1 a 50. Tente novamente"); 
					}				    	
			    } else{ 
			    	System.out.println("Não foi digitado um número válido"); 
			    }
				digitacao.nextLine();
			} while(!verificacao1);
			
			double[] numerosDigitados = new double[quantidadeNumeros]; // Inicializar a matriz para receber os números digitados.
			
			Double maior = Double.MIN_VALUE; // Inicializa com o MENOR valor de Double.
	    	for (int i = 0; i < quantidadeNumeros; i++) {
				boolean verificacao = false;
				do{
					System.out.print("Digite o " + (i + 1 ) + "º número: ");
					if(digitacao.hasNextDouble()){ 
						numerosDigitados[i] = digitacao.nextDouble();
						if(numerosDigitados[i] > maior) {
				    		maior = numerosDigitados[i]; // Como dizia meu saudoso professor Bortot: "Vai para o trono!"
				    	}
				    	verificacao = true;
				    } else{ 
				    	System.out.println("Não foi digitado um número válido"); 
				    }
					digitacao.nextLine();
	
				//bloco de códigos	
				} while(!verificacao);							
	    	}
	    	NumberFormat formatter = formatoBR(); // Prepara o formato para separação por vírgula:
	    	System.out.println("Números armazenados:");
	    	int ocorrenciaNumeroMaior = 0;
	        for (double num : numerosDigitados) {
	        	if(Double.compare(num, maior) == 0) ocorrenciaNumeroMaior++; 
	            System.out.println(formatter.format(num));
	        }
	        System.out.println("O maior número digitado foi: " + formatter.format(maior) + " e foi digitado " + ocorrenciaNumeroMaior + " vez(es).");
		}
	    
	    
	}
}
