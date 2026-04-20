package principal.lista2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Desenvolvimento de Sistemas
 * Lista 02.
 * Exercício número 20
 * 
 * Dados três valores, A, B, C, verificar se eles podem ser valores dos lados de um triângulo e,
 * se forem, se é um triângulo escaleno, equilátero ou isóscele, considerando os seguintes conceitos:
 * • O comprimento de cada lado de um triângulo é menor do que a soma dos outros dois lados.
 * • Chama-se equilátero o triângulo que tem três lados iguais.
 * • Denominam-se isósceles o triângulo que tem o comprimento de dois lados iguais.
 * • Recebe o nome de escaleno o triângulo que tem os três lados diferentes.
 *
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Lista02_exercicio20 {
	// Esta método estático formata o número para que seja exibido separado por vírgula, ao invés de ponto:
	public static NumberFormat formatoBR() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ROOT);
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');
        return new DecimalFormat("###,###,##0.###", symbols);
    }
	public static void main(String[] args) {
		Double[] valores = {.0,.0,.0};
		String[] perguntas = {"A","B","C"};
		Double numero = .0;
		
		
		try (Scanner digitacao = new Scanner(System.in)) {
			
			System.out.println("Programa que verifica valores de um triângulo");
			for (int i = 0; i < 3; i++) {
				boolean verificado = false;
				do {
					System.out.print("Digite a medida do lado " + perguntas[i] + " do triângulo: ");
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
			System.out.println("Os valores digitados foram: A=" + formatter.format(valores[0]) + ", B=" 
			+ formatter.format(valores[1]) + " e C=" + formatter.format(valores[2]));
			if(Double.compare(valores[0], valores[1]) == 0 && Double.compare(valores[1], valores[2]) == 0) {
				System.out.println("As medidas são de um triângulo equilátero "); 
			}else if((valores[0] + valores[1]) < valores[2] 
					&& (valores[1] + valores[2]) < valores[0] 
					&& (valores[2] + valores[0]) < valores[1]) {
				System.out.println("Não existe triângulo com essas medidas no plano cartesiano.");
			} else if(Double.compare(valores[0], valores[1]) == 0) {
				System.out.println("As medidas são de um triângulo isóceles, onde os lados A e B são iguais");
			} else if(Double.compare(valores[1], valores[2]) == 0) {
				System.out.println("As medidas são de um triângulo isóceles, onde os lados B e C são iguais");
			} else if(Double.compare(valores[2], valores[0]) == 0) {
				System.out.println("As medidas são de um triângulo isóceles, onde os lados A e C são iguais");
			}
		}
	}
}
