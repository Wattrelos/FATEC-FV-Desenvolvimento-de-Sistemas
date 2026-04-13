package principal.lista3;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Desenvolvimento de Sistemas
 * Lista 3. Exercício número 07.
 * 
 * Faça um programa que leia 10 inteiros positivos, ignorando não positivos, e imprima sua média.
 *
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Lista03_exercicio07 {
	
	// Esta classe formata o número para que seja exibido separado por vírgula, ao invés de ponto:
	public static NumberFormat formatoBR() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ROOT);
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');
        return new DecimalFormat("###,###,##0.######", symbols);
    }

	public static void main(String[] args) {
		int arrayDeInt[] = {0,0,0,0,0,0,0,0,0,0};
		
		System.out.println("Programa que mostra a média de dez números positivos digitados (ignora os números negativos).");
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
	    int quantosNumerosMedia = 0;
	    String texto = "";
	    String ignorados = "";
	    // Soma os números e apresenta ao usuário:		    
	    NumberFormat formatter = formatoBR(); // Prepara o formato para separação por vírgula:	    
	    for(int numero : arrayDeInt){
	    	if(numero > 0) {
	    		texto += ", " + formatter.format(numero);
		    	media = media + numero;
		    	quantosNumerosMedia++;
	    	}else {
	    		ignorados += "; " + formatter.format(numero);
	    	}
	    	    	
	    }	    
	    System.out.print("\nForam ignorados os números {");
	    // Regex: 
        // ^[^\\d-]+ : Remove caracteres não numéricos ou menos no início
        // |-(?!\\d)  : ou remove sinal de menos que NÃO é seguido por um dígito
	    System.out.print(ignorados.replaceFirst("^[^\\d-]+|-(?!\\d)", "") + "} que não entraram no cálculo.");
	    System.out.print("\nA média de {");
	    // Observação: Para forçar que a divisão de dois números inteiros (int) em Java resulte em um número real (com casas decimais),
	    // você deve converter pelo menos um dos números para double ou float antes da divisão. A forma mais comum é fazer um casting (conversão explícita) no dividendo.
	    System.out.print(texto.replaceFirst("^[^0-9]+", "") + "} = " + formatter.format((double)media/quantosNumerosMedia));
	    
	}
}
