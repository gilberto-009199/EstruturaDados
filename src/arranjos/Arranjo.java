package arranjos;

import java.util.Iterator;

public class Arranjo {

	public static final Integer[] LISTA_INICIAL = { 940, 880, 830, 790, 750, 660, 650, 590, 510, 940 };

	/**
	 * Função que retorna o menor valor do arranjo
	 * 
	 * @return retorna o menor numero dentro da lista
	 */
	public int menor() {

        int menor = LISTA_INICIAL[0];
        
		for (Integer numero : LISTA_INICIAL) {

			// Procura o menor
			if (menor > numero)menor = numero;

		}
		return menor;
	}

	/**
	 * Função que retorna o maior valor do arranjo
	 * 
	 * @return retorna o maior numero dentro da lista
	 */
	public int maior() {

		int maior = LISTA_INICIAL[0];

        for (Integer numero : LISTA_INICIAL) {

			// Procura o menor
			if (maior < numero)maior = numero;

		}

		return maior;
	}

	/**
	 * Função que retorna a soma dos valores no aranjo
	 * 
	 * @return retorna a soma dos valores dentro do arranjo
	 */
	public int soma() {

		int soma = 0;

		for (Integer numero : LISTA_INICIAL) {
			soma = numero + soma;
		}

		return soma;
	}

	/**
	 * Função que retorna o numero de vezes que um numero aparece no arranjo
	 * 
	 * @param Int numeroRepetido numero que será buscado no arranjo
	 * @return retorna o numero de vezes que se repete dentro da lista
	 */
	public int repeticoes(int numeroRepetido) {

		int repeticoes = 0;

		for (Integer numero : LISTA_INICIAL) {

			// Incrementa o contador de repetições para cada achado
			if (numeroRepetido == numero)
				repeticoes++;

		}

		return repeticoes;
	}
}
