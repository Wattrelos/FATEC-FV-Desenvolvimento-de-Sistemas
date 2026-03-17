package principal;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub			   
		  
	    try (Scanner digitacao = new Scanner(System.in)) {
			// Loop com verificação no final:
			boolean verificacao = false; 
			do{
				System.out.print("Digite um número inteiro: ");
				if(digitacao.hasNextInt()){ 
			    	Integer inteiro = digitacao.nextInt();
			    	System.out.println("O número digitado foi " + inteiro);
			    	verificacao = true;
			    	
			    } else{ 
			    	System.out.println("Não foi digitado um número inteiro"); 
			    }
				digitacao.nextLine();

			//bloco de códigos

			} while(!verificacao);
		}


	}

}
