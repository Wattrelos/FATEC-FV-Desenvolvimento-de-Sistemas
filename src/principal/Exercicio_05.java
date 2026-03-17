package principal;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_05 {
	// Esta classe formata o número para que seja exibido separado por vírgula, ao invés de ponto:
	public static NumberFormat formatoBR() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ROOT);
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');
        return new DecimalFormat("#0.000", symbols);
    }

	// Classe principal:
	public static void main(String[] args) {	   
		  
	    try (Scanner digitacao = new Scanner(System.in)) {
			// Loop com verificação no final:
			boolean verificacao = false; 
			do{
				System.out.print("Digite um número Real: ");
				if(digitacao.hasNextDouble()){ 
					Double numeroReal = digitacao.nextDouble();					
					NumberFormat formatter = formatoBR(); // Prepara o formato para separação por vírgula:			        
			    	System.out.println("A quinta parte de " + formatter.format(numeroReal) +" é " + formatter.format(numeroReal / 5));
			    	verificacao = true;
			    	
			    } else{ 
			    	System.out.println("Não foi digitado um número Real!"); 
			    }
				digitacao.nextLine(); // Limpa o boofer do teclado.

			//bloco de códigos

			} while(!verificacao);
		}


	}

}
