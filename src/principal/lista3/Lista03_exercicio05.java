package principal.lista3;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Desenvolvimento de Sistemas
 * Lista 3. Exercício número 05.
 * 
 *  Faça um programa que peça ao usuário para digitar 10 valores e some-os.
 *
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Lista03_exercicio05 {
	
	// Esta classe formata o número para que seja exibido separado por vírgula, ao invés de ponto:
	public static NumberFormat formatoBR() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ROOT);
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');
        return new DecimalFormat("###,###,##0.######", symbols);
    }

	public static void main(String[] args) {
		Double arrayDeDouble[] = {.0,.0,.0,.0,.0,.0,.0,.0,.0,.0};
		
		System.out.println("Programa que soma os dez números digitados.");
	    try (Scanner digitacao = new Scanner(System.in)) {
			// Loop com verificação no final:
	    	
	    	for (int i = 0; i < 10; i++) {
				boolean verificacao = false;
				do{
					System.out.print("Digite o " + (i + 1 ) + "º número: ");
					if(digitacao.hasNextDouble()){ 
				    	arrayDeDouble[i] = digitacao.nextDouble();				    	
				    	verificacao = true;				    	
				    } else{ 
				    	System.out.println("Não foi digitado um número válido"); 
				    }
					digitacao.nextLine();
	
				//bloco de códigos	
				} while(!verificacao);							
	    	}
		}
	    Double soma = .0;
	    String texto = "";
	    // Soma os números e apresenta ao usuário:	
	    System.out.print("A soma de ");
	    NumberFormat formatter = formatoBR(); // Prepara o formato para separação por vírgula:	    
	    for(Double numero : arrayDeDouble){
	    	texto += " + " + formatter.format(numero);
	    	soma = soma + numero;
	    }
	    System.out.print(texto.replaceFirst("^[^0-9]+", "") + " = " + formatter.format(soma));
	    
	}
}
