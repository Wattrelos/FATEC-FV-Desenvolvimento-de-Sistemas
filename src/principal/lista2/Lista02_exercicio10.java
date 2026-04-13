package principal.lista2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Desenvolvimento de Sistemas
 * Lista 02.
 * Exercício número 10
 * 		Faça um programa que receba a altura e o sexo de uma pessoa e calcule e mostre seu
 * peso ideal, utilizando as seguintes fórmulas (onde h corresponde à altura):
 * • Homens: (72.7 ∗ h) − 58
 * • Mulheres: (62, 1 ∗ h) − 44, 7
 *
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Lista02_exercicio10 {
	// Declaração única do Scanner para toda a classe
    private static Scanner digitacao = new Scanner(System.in);

	// Esta classe formata o número para que seja exibido separado por vírgula, ao invés de ponto:
	public static NumberFormat formatoBR() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ROOT);
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');
        return new DecimalFormat("###,###,##0.##", symbols);
    }
		
	// Função que lê um número inteiro do teclado. Função estática, não precisa instanciar.
	private static Double leNumeroRealDoTeclado() {
		boolean verificacao = false;
		Double valor = .0;
		do{			
			if(digitacao.hasNextDouble()){  // Verifica se foi digitado um número real.
				valor = digitacao.nextDouble();
				// Verifica regras de negócio:
				// O método Double.compare() é recomendado quando você precisa garantir tratamento correto para NaN (Not-a-Number)
				if(Double.compare(valor, 0.0) < 0) {  
					// Verifica se o valor é razoável.
					System.out.println("\n\033[1m\u001B[35mAltura inválida.");
				}else {
					verificacao = true;
				}
		    } else{ 
		    	System.out.println("Por favor, digitar somente números separados por víngula."); 
		    }
			digitacao.nextLine(); // Limpa o cache do teclado.
		} while(!verificacao);
		return valor;
	}
	private static char leCaracter() {
		char ch = '\0';
		digitacao.useDelimiter(""); //
		while (digitacao.hasNext()) {
		    ch = Character.toUpperCase(digitacao.next().charAt(0));
		    if (ch == 'F' || ch == 'M') {
		    	digitacao.reset(); // O método reset() faz o Scanner voltar a usar espaços e quebras de linha como separadores. Sem isso, o leNumeroRealDoTeclado tentava ler um Double usando um delimitador que "picota" a entrada, resultando na leitura apenas do primeiro dígito antes da pontuação.
		    	return ch;
		    } else {
		        System.out.println("Digite 'F' para feminino ou 'M' para masculino.");
		    }
		    digitacao.nextLine(); // Limpa o cache do teclado.
		}
		return ch;
	}

	public static void main(String[] args) {
		System.out.println("Programa que calcura o  \"peso ideal\" de uma pessoal.");
		NumberFormat formatter = formatoBR(); // Prepara o formato para separação por vírgula:
		
		System.out.print("Qual o sexo da pessoa? M = masculino, F = feminino ");
		char sexo = leCaracter();
		System.out.print("Digite a altura em metros: ");
		Double altura = leNumeroRealDoTeclado();
		System.out.print("Digite o peso em Kilogramas: ");
		Double peso = leNumeroRealDoTeclado();
		
		Double fator;
		if (sexo == 'F') {
			fator = 62.1 * altura - 44.7;
		} else {
			fator = 72.7 * altura - 58;
		}
		
		System.out.println("\nO sexo da pessoa é " + ((sexo == 'M') ? "masculino" : "feminino"));
        System.out.println("A altura é de " + formatter.format(altura) + "m.");
        System.out.println("O peso é de " + formatter.format(peso) + "Kg.");
        System.out.println("O peso ideal seria " + formatter.format(fator) + "Kg.");
        System.out.println("\n\nObservação: Há outros fatores a serem considerados, tais como massa muscular, biotipo. Sem outros fatores, um atleta, por exemplo, serifa facilmente confundido com uma pessoa obesa.");
        
        // Feche o scanner somente no final da aplicação
        digitacao.close(); // Fecha a instância scanner (digitação).
	}
		
}

