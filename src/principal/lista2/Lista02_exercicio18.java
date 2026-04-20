package principal.lista2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Desenvolvimento de Sistemas
 * Lista 02.
 * Exercício número 18
 * Faça um programa que mostre ao usuário um menu com 4 opções de operações matemáticas
 * (as básicas, por exemplo). O usuário escolhe uma das opções e o seu programa então
 * pede dois valores numéricos e realiza a operação, mostrando o resultado e saindo.
 *
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Lista02_exercicio18{
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
		
		
		
		try (Scanner digitacao = new Scanner(System.in)) {
			
			System.out.println("Programa que faz operações matemáticas");
			boolean verificado = false;
			do {
				System.out.println("1) Soma;");
				System.out.println("2) Subtração;");
				System.out.println("3) Multiplicação;");
				System.out.println("4) Divisão;");
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
			NumberFormat formatter = formatoBR(); // Prepara o formato para separação por vírgula:
			System.out.print("O resultado da operação é: " + formatter.format(valores[0]) + " + " 
			+ formatter.format(valores[1]) + " = ");
			Double resultado = .0;
			switch(opcao){
				case  1: resultado = valores[0] + valores[1]; break;
				case  2: resultado = valores[0] - valores[1]; break;
				case  3: resultado = valores[0] * valores[1]; break;
				case  4: resultado = valores[0] / valores[1]; break;
			}		
			
			System.out.print(formatter.format(resultado) + "\n\nFim.");
		}
	}
}
