package principal.lista3;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 * Desenvolvimento de Sistemas
 * Lista 3. Exercício número 20.
 * 
 *  Ler uma sequência de números inteiros e determinar se eles são pares ou não. Deverá
 *  ser informado o número de dados lidos e número de valores pares. O processo termina
 *  quando for digitado o número 1000.
 *
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Lista03_exercicio20 {
	/*
	// Esta método estático formata o número para que seja exibido separado por vírgula, ao invés de ponto:
	public static NumberFormat formatoBR() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ROOT);
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');
        return new DecimalFormat("###,###,##0.######", symbols);
    }
    */

	public static void main(String[] args) {

        ArrayList<Integer> numerosDigitados = new ArrayList<>(); // Declarar um ArrayList de Inteiros sem tamanho definido
        ArrayList<Integer> numerosPares = new ArrayList<>();
		boolean verificacao = false;
		int contador = 0;
		
		System.out.println("Programa que lê uma sequência de números inteiros e verifica se são pares e informa quantos números pares foram lidos.");
	    try (Scanner digitacao = new Scanner(System.in)) {
			// Rótulo "principal"
	        principal:
	    	do {
				do{
					System.out.print("Digite um número inteiro. Para encerrar, digite o número 1000: ");
					if(digitacao.hasNextInt()){ 
						int numero = digitacao.nextInt();						
						if(numero == 1000) {
							break principal; // Sair do loop 'principal'				    		
				    	}
						numerosDigitados.add(numero);
				    	verificacao = true;
				    } else{ 
				    	System.out.println("Não foi digitado um número válido"); 
				    }
					digitacao.nextLine();	
				//bloco de códigos	
				} while(contador++ < 100); // Estabelescer um limite de números digitados.							
	    	} while(!verificacao);
	    	// NumberFormat formatter = formatoBR(); // Prepara o formato para separação por vírgula:
	    	String texto = "";	    	
	        for (Integer num : numerosDigitados) {
	            texto += num + ", ";
	            if ((num % 2) == 0) {
	            	numerosPares.add(num);
	            }
	        }
	        System.out.print("Números armazenados são: " + texto.substring(0, texto.length() - 2) + ".");
	        System.out.println("\nForam lidos " + numerosDigitados.size() + " números.");
	        System.out.print("Desses números, " + numerosPares.size() + " são pares: ");
	        texto = "";
	        for (Integer numeroPar : numerosPares) {
	        	texto += numeroPar + ", ";
	        }
	        System.out.print(texto.substring(0, texto.length() - 2) + ".");
		}	    
	    
	}
}
