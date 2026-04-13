package principal.lista2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Desenvolvimento de Sistemas
 * Lista 02.
 * Exercício número 08
 * Faça um programa que leia 2 notas de um aluno, verifique se as notas são válidas e
 * exiba na tela a média destas notas. Uma nota válida deve ser, obrigatoriamente, um
 * valor entre 0.0 e 10.0, onde caso a nota não possua um valor válido, este fato deve ser
 * informado ao usuário e o programa termina.
 *
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Lista02_exercicio08 {
	// Declaração única do Scanner para toda a classe
    private static Scanner digitacao = new Scanner(System.in);

	// Esta classe formata o número para que seja exibido separado por vírgula, ao invés de ponto:
	public static NumberFormat formatoBR() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ROOT);
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');
        return new DecimalFormat("#0.#", symbols);
    }
		
	// Função que lê um número inteiro do teclado. Função estática, não precisa instanciar.
	private static Double leNumeroRealDoTeclado() {
		boolean verificacao = false;
		Double nota = .0;
		do{
			if(digitacao.hasNextDouble()){  // Verifica se foi digitado um número real.
				nota = digitacao.nextDouble();
				verificacao = true;
		    } else{ 
		    	System.out.println("Por favor, digitar somente números separados por víngula."); 
		    }
			
			digitacao.nextLine(); // Limpa o cache do teclado.
		} while(!verificacao);
		// Verifica regras de negócio:
		// O método Double.compare() é recomendado quando você precisa garantir tratamento correto para NaN (Not-a-Number)
		if(Double.compare(nota, 0.0) < 0 || Double.compare(nota, 10.0) > 0) {  
			// É exigência do enuciado encerrar o programa. É possível tratar esse dado.
			System.out.println("\n\033[1m  \u001B[35mO valor da nota digitada é inválido. O programa foi encerrado.");
			System.exit(0);			
		}
		
		return nota; // Evitar quebras.
	}

	public static void main(String[] args) {
		System.out.println("Programa que leia 2 notas de um aluno, verifique se as notas são válidas e\n"
				+ " * exiba na tela a média destas notas. Uma nota válida deve ser, obrigatoriamente, um\n"
				+ " * valor entre 0.0 e 10.0, onde caso a nota não possua um valor válido, este fato deve ser\n"
				+ " * informado ao usuário e o programa termina.!\"");
		NumberFormat formatter = formatoBR(); // Prepara o formato para separação por vírgula:
		
		System.out.print("Digite a primeira nota: ");
		Double nota1 = leNumeroRealDoTeclado();
		System.out.print("Digite a segunda nota: ");
		Double nota2 = leNumeroRealDoTeclado();
	    
		
	    
		


		System.out.println("\nAs notas do aluno são: " + formatter.format(nota1) + " e " + formatter.format(nota2) + " e a média é: "
				+ formatter.format((nota1 + nota2)/2) + ".");        
        
        System.out.println("Fim.");
        // Feche o scanner somente no final da aplicação
        digitacao.close(); // Fecha a instância scanner (digitação).
	}
		
}

