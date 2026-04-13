package principal.lista3;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Desenvolvimento de Sistemas
 * Lista 3. Exercício número 27.
 * 
 *  Em Matemática, o número harmônico designado por H(n) define-se como sendo a soma
 *  da série harmónica: H(n) = 1 + 1/2 + 1/3 + 1/4 + ... + 1/n
 *  Faça um programa que leia um valor n inteiro e positivo e apresente o valor de H(n).
 *   
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Lista03_exercicio27 {
	
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
		System.out.println("Programa que calcula a soma da série harmônica.");
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
		        
			double h = 0.0;
			// Calcula a série harmônica: H(n) = 1 + 1/2 + 1/3 + ... + 1/n
            for (int i = 1; i <= numero; i++) {
                h += 1.0 / i; // Usamos 1.0 para forçar a divisão decimal
            }
            
            NumberFormat formatter = formatoBR(); // Prepara o formato para separação por vírgula:
            
            System.out.printf("O valor de H(" + numero + ") é: " + formatter.format(h));
		}
	}
}
