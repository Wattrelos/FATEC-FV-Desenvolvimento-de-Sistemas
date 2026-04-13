package principal.lista2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Desenvolvimento de Sistemas
 * Lista 02.
 * Exercício número 09
 * 		Leia o salário de um trabalhador e o valor da prestação de um empréstimo. Se a
 * prestação for maior que 20% do salário imprima: Empréstimo não concedido, caso
 * contrário imprima: Empréstimo concedido.
 *
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Lista02_exercicio09 {
	// Declaração única do Scanner para toda a classe
    private static Scanner digitacao = new Scanner(System.in);

	// Esta classe formata o número para que seja exibido separado por vírgula, ao invés de ponto:
	public static NumberFormat formatoBR() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ROOT);
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');
        return new DecimalFormat("###,###,##0.00", symbols);
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
				if(Double.compare(valor, 0.0) < 0 || Double.compare(valor, 10000000.0) > 0) {  
					// Verifica se o valor é razoável.
					System.out.println("\n\033[1m  \u001B[35mFoi digitado não é razoável.");
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

	public static void main(String[] args) {
		System.out.println("Programa que verifica se o salário do trabalhador é compatível com a prestação do empréstimo");
		NumberFormat formatter = formatoBR(); // Prepara o formato para separação por vírgula:
		
		System.out.print("Qual o salário líquido do trabalhador? ");
		Double salario = leNumeroRealDoTeclado();
		System.out.print("Qual o valor da prestação? ");
		Double prestacao = leNumeroRealDoTeclado();
		
		if(Double.compare(prestacao, (salario * 0.2)) > 0) {  
			// É exigência do enuciado encerrar o programa. É possível tratar esse dado.
			System.out.println("\n\033[1m  \u001B[35mO empréstimo não foi aprovado, pois a prestação de R$" + formatter.format(prestacao) 
			+ " compromete 20% da renda que é de R$."+ formatter.format(salario) + ".");
		} else {
			System.out.println("\nO empréstimo foi aprovado.");
		}     
        
        System.out.println("\nFim do programa.");
        // Feche o scanner somente no final da aplicação
        digitacao.close(); // Fecha a instância scanner (digitação).
	}
		
}

