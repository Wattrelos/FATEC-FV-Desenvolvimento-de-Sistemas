package principal.lista2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Desenvolvimento de Sistemas
 * Lista 02.
 * Exercício número 17
 * Faça um programa que calcule e mostre a área de um trapézio. Sabe-se que:
 * A = (basemaior + basemenor) ∗ altura / 2
 *
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Lista02_exercicio17 {
	// Esta método estático formata o número para que seja exibido separado por vírgula, ao invés de ponto:
	public static NumberFormat formatoBR() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ROOT);
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');
        return new DecimalFormat("###,###,##0.###", symbols);
    }
	public static void main(String[] args) {
		Double[] valores = {.0,.0,.0};
		String[] perguntas = {"base maior","base menor", "altura"};
		Double numero = .0;
		
		
		try (Scanner digitacao = new Scanner(System.in)) {
			
			System.out.println("Programa que calcula a área do trapézio");
			for (int i = 0; i < 3; i++) {
				boolean verificado = false;
				do {
					System.out.print("Digite a medida da " + perguntas[i] + ": ");
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
			System.out.println("A área do trapézio é: (" + formatter.format(valores[0]) + " + " 
			+ formatter.format(valores[1]) + ") * " + formatter.format(valores[2]) + " / 2 = "
					+ formatter.format((valores[0]+valores[1]) * valores[2]/2));
		}
	}
}
