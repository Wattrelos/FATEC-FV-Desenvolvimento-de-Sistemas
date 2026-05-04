package principal.lista2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Desenvolvimento de Sistemas
 * Lista 02.
 * Exercício número 21
 * Escreva o menu de opções abaixo. Leia a opção do usuário e execute a operação escolhida.
 * Escreva uma mensagem de erro se a opção for inválida.
 *
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Lista02_exercicio21{
	// Esta método estático formata o número para que seja exibido separado por vírgula, ao invés de ponto:
	public static NumberFormat formatoBR() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ROOT);
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');
        return new DecimalFormat("###,###,##0.###", symbols);
    }
	public static void main(String[] args) {
		Double numero = .0;
		int opcao = 0;
		Double[] valores = {.0,.0};
		String[] sinal = {" + "," - "," x "," / "};
		
		
		
		try (Scanner digitacao = new Scanner(System.in)) {
			
			System.out.println("Programa que faz operações matemáticas");
			boolean verificado = false;
			do {
				System.out.println("Escolha a opção:");
				System.out.println("1 - Soma de 2 números;");
				System.out.println("2 - Diferença entre 2 números (maior pelo menor);");
				System.out.println("3 - Produto entre 2 números;");
				System.out.println("4 - Divisão entre 2 números (o denominador não pode ser zero).");
				System.out.print("Opção: ");
				if(digitacao.hasNextInt()) {
					opcao = digitacao.nextInt();
					if(opcao >= 1 && opcao <= 4 ) {
						verificado = true;
					} else {
						System.out.println("Opção inválida!");
					}
				}
			} while (!verificado);
			
			
			for (int i = 0; i < 2; i++) {
				verificado = false;
				do {
					System.out.print("Digite o " + (i + 1) + "º valor: ");
					if(digitacao.hasNextDouble()) {
						numero = digitacao.nextDouble();
						if(numero > .0 || numero < Double.MAX_VALUE) {
							valores[i] = numero;
							verificado = true;
						}
					}
				} while (!verificado);
			}

			// Optimizar o código:
			NumberFormat formatter = formatoBR(); // Prepara o formato para separação por vírgula:
			String sufixo = "";
			Double resultado = switch (opcao) {
			    case 1 -> valores[0] + valores[1];
			    case 2 -> {
			        // Lógica para garantir "maior pelo menor" na impressão e no cálculo
			        if (valores[1] > valores[0]) {
			        	double temp = valores[0];
			            valores[0] = valores[1];
			            valores[1] = temp;
			        }
			        sufixo = " (maior pelo menor)";
			        yield valores[0] - valores[1];
			    }
			    case 3 -> valores[0] * valores[1];
			    case 4 -> (valores[1] == 0) ? null : valores[0] / valores[1];
			    default -> null;
			};

		// Impressão unificada
		if (resultado == null) {
		    System.out.println("Operação inválida ou divisão por zero.");
		} else {
		    // Exemplo: 40 - 30 = 10 (maior pelo menor)
		    System.out.printf("O Resultado é: %s %s %s = %s%s%n", 
		        formatter.format(valores[0]), 
		        sinal[opcao-1], 
		        formatter.format(valores[1]), 
		        formatter.format(resultado), 
		        sufixo);
		}
			
			/*
			System.out.print("O resultado da operação é: " + formatter.format(valores[0]) + sinal[opcao-1] 
			+ formatter.format(valores[1]) + " = ");
			
			Double resultado = null;
			if(opcao == 1) resultado = valores[0] + valores[1];
			else if(opcao == 2) {
				System.out.print("(maior pelo menor)");
				if(valores[0] > valores[1]) {
					resultado = valores[0] - valores[1];
				}else {
					resultado = valores[1] - valores[0];
				}
			}else if(opcao == 3) {
				resultado = valores[0] * valores[1];
			}else if(opcao == 4){
				if(valores[1] == 0) {
					System.out.println("Não pode haver difisão por zero");
				}else {
					resultado = valores[0] / valores[1];
				}				
			}
			if (resultado == null) {
				System.out.println("Não há resultado válido");
			} else {
				System.out.println("O resultado é: " + formatter.format(resultado));
			}
			*/
			System.out.print("\n\nFim.");
		}
	}
}
