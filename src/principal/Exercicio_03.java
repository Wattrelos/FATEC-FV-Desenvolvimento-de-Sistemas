package principal;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arrayDeInteiros[] = {0,0,0};		  
	    try (Scanner digitacao = new Scanner(System.in)) {
			// Loop com verificação no final:
	    	
	    	for (int i = 0; i < 3; i++) {
				boolean verificacao = false;
				do{
					System.out.print("Digite o " + (i + 1 ) + "º número inteiro: ");
					if(digitacao.hasNextInt()){ 
				    	arrayDeInteiros[i] = digitacao.nextInt();				    	
				    	verificacao = true;
				    	
				    } else{ 
				    	System.out.println("Não foi digitado um número inteiro"); 
				    }
					digitacao.nextLine();
	
				//bloco de códigos	
				} while(!verificacao);
							
	    	}
		}
	    // Soma os números e apresenta ao usuário:	
	    System.out.println("A soma de " + arrayDeInteiros[0] + " + " + arrayDeInteiros[1] + " + " + arrayDeInteiros[2] + " é: " + (arrayDeInteiros[0] + arrayDeInteiros[1] + arrayDeInteiros[2]));
	}
}
