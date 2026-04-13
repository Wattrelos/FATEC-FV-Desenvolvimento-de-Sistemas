package principal.lista3;

/**
 * Desenvolvimento de Sistemas
 * Lista 3. Exercício número 03.
 * 
 *  Faça um algoritmo, utilizando o comando while, que mostra uma contagem regressiva na tela, iniciando em 10 e terminando em 0. Mostrar uma mensagem “FIM!” após a
contagem.
 *
 * @author Josias C Sobrinho
 * @version 1.0
 */

public class Lista03_exercicio03 {

	// Classe principal:
	public static void main(String[] args)  {
	    
		System.out.println("Programa que faz uma contagem regressiva utilizando o loop while.");
		
    	int contador = 10; // Inicializa o contador.

    	do {
    	    
    		// Observação: 420142010052
			
			// 1) O Eclipse interpreta o \r como se fosse um \n. Não há como mudar isso no código; Também a pausa de 1 segundo não é perfeita, variando muito. A única solução é rodar o programa pelo Terminal/CMD do Windows ou Linux
			// 2) No VSCodium (VSCode para Linux), funcionou conforme esperado.
    		System.out.print("\r " + String.format("%4d", contador));   // O caracter de escape \r faz volta ao início, atualizando a linha. String.format %4d força a saída ter 4 caracteres alinhados à direita.
    	    
    	    try {    	        
    	        Thread.sleep(1000); // Pausa a execução por 1000 milissegundos (1 segundo)
    	    } catch (InterruptedException e) {
    	        Thread.currentThread().interrupt(); // Caso a thread seja interrompida, avisamos o sistema
    	        break; // Sai do loop se houver interrupção
    	    }
    	    
    	    contador--;
    	} while (contador >= 0);  // Executa equanto (while) i for maior que zero.
    	System.out.println("\nFim!");
	}
}
