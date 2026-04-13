package principal.lista3;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Desenvolvimento de Sistemas
 * Lista 3. Exercício número 08.
 * 
 * Escreva um programa que leia 10 números e escreva o menor valor lido e o maior valor lido.
 *
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Lista03_exercicio08 {
	
	// Esta classe formata o número para que seja exibido separado por vírgula, ao invés de ponto:
	public static NumberFormat formatoBR() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ROOT);
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');
        return new DecimalFormat("###,###,##0.######", symbols);
    }

	public static void main(String[] args) {
		Double arrayDeDouble[] = {.0,.0,.0,.0,.0,.0,.0,.0,.0,.0};
		
		System.out.println("Programa que mostra o maior e o menor valor de dez números digitados.");
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
	    Double maior = Double.MIN_VALUE; // Obter o MENOR valor de Double.
	    Double menor = Double.MAX_VALUE; // Obter o MAIOR valor de Double.
	    String texto = "";
	    // Soma os números e apresenta ao usuário:		    
	    NumberFormat formatter = formatoBR(); // Prepara o formato para separação por vírgula:	    
	    for(Double numero : arrayDeDouble){
	    	texto += "; " + formatter.format(numero); //Concatena números digitados.
	    	if(numero > maior) {
	    		maior = numero; // Como dizia meu saudoso professor Bortot: "Vai para o trono!"
	    	}
	    	if(numero < menor) {
	    		menor = numero; // Como dizia meu saudoso professor Bortot: "Vai para o trono!"
	    	}
	
	    }	    
	    System.out.print("\nOs números digitados foram: {");
	    // Regex: 
        // ^[^\\d-]+ : Remove caracteres não numéricos ou menos no início
        // |-(?!\\d)  : ou remove sinal de menos que NÃO é seguido por um dígito
	    System.out.println(texto.replaceFirst("^[^\\d-]+|-(?!\\d)", "") + "}.");
	    System.out.println("O maior número digitado foi: " + maior);
	    System.out.println("O menor número digitado foi: " + menor);
	    System.out.println("Fim!");
	    
	}
}
