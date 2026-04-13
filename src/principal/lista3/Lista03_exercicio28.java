package principal.lista3;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Desenvolvimento de Sistemas
 * Lista 3. Exercício número 28.
 * 
 *   Faça um programa que leia um valor N inteiro e positivo, calcule o mostre o valor E,
 *   conforme a fórmula a seguir: E = 1 + 1/1! + 1/2! + 1/3! + ... + 1/N !
 *   
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Lista03_exercicio28 {
	
	// Esta método estático formata o número para que seja exibido separado por vírgula, ao invés de ponto:
	public static NumberFormat formatoBR() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ROOT);
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');
        return new DecimalFormat("###,###,##0.######", symbols);
    }

	public static void main(String[] args) {

		boolean verificacao = false;
		int numero = 0;
		System.out.println("Programa que calcula o valor de E conforne a fórmula: E = 1 + 1/1! + 1/2! + 1/3! + ... + 1/N !.");
	    try (Scanner digitacao = new Scanner(System.in)) {	    	
			do{
				System.out.print("Digite um número inteiro positivo: ");
				if(digitacao.hasNextInt()){ 
					numero = digitacao.nextInt();
					if(numero > 0 ) {
						verificacao = true;
					} else {
						System.out.println("O número precisa ser um inteiro positivo."); 
					}
			    } else{ 
			    	System.out.println("Não foi digitado um número válido"); 
			    }
				digitacao.nextLine();	
			//bloco de códigos
			} while(!verificacao);			
		        
			double e = 1.0;
			double fatorial = 1.0;
			// Calcula a série: E = 1 + 1/1! + 1/2! + 1/3! + ... + 1/N !
            for (int i = 1; i <= numero; i++) {
            	fatorial *= i; // Calcula i! com base no fatorial anterior
                e += 1.0 / fatorial; // Usamos 1.0 para forçar a divisão decimal
            }
            
            NumberFormat formatter = formatoBR(); // Prepara o formato para separação por vírgula:
            
            System.out.printf("\nPara N = " + numero + ", o valor de E é: " + formatter.format(e));
		}
	}
}
