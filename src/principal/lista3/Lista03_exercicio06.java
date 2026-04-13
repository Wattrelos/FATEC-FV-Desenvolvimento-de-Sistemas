package principal.lista3;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Desenvolvimento de Sistemas
 * Lista 3. Exercício número 06.
 * 
 * Faça um programa que leia 10 inteiros e imprima sua média.
 *
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Lista03_exercicio06 {
	
	// Esta classe formata o número para que seja exibido separado por vírgula, ao invés de ponto:
	public static NumberFormat formatoBR() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ROOT);
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');
        return new DecimalFormat("###,###,##0.######", symbols);
    }

	public static void main(String[] args) {
		int arrayDeInt[] = {0,0,0,0,0,0,0,0,0,0};
		
		System.out.println("Programa que mostra a média de dez números digitados.");
	    try (Scanner digitacao = new Scanner(System.in)) {
			// Loop com verificação no final:
	    	
	    	for (int i = 0; i < 10; i++) {
				boolean verificacao = false;
				do{
					System.out.print("Digite o " + (i + 1 ) + "º número inteiro: ");
					if(digitacao.hasNextInt()){ 
				    	arrayDeInt[i] = digitacao.nextInt();				    	
				    	verificacao = true;				    	
				    } else{ 
				    	System.out.println("Não foi digitado um número inteiro válido"); 
				    }
					digitacao.nextLine();
	
				//bloco de códigos	
				} while(!verificacao);							
	    	}
		}
	    int media = 0;
	    String texto = "";
	    // Soma os números e apresenta ao usuário:	
	    System.out.print("A média de {");
	    NumberFormat formatter = formatoBR(); // Prepara o formato para separação por vírgula:	    
	    for(int numero : arrayDeInt){
	    	texto += "; " + formatter.format(numero);
	    	media = media + numero;	    	
	    }
	    System.out.print(texto.replaceFirst("^[^0-9]+", "") + "} = " + formatter.format(media/10));
	    
	}
}
