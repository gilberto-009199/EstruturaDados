package arranjos;

import java.util.Iterator;

public class Arranjo {

	public static final Integer[] LISTA_INICIAL = { 940, 880, 830, 790, 750, 660, 650, 590, 510, 940 };

	// Lista Ordenada
	public Integer[] listOrdenada;

	// Construtor: Função que é chamada na hora de => new Arranjo();
	public Arranjo() {

		// Chama um função para ordenar a Lista inicial e guarda na variavel
		// listOrdenada
		listOrdenada = ordenarLista(LISTA_INICIAL);

	}

	/**
	 * Função que retorna o menor valor do arranjo
	 * 
	 * @return retorna o menor numero dentro da lista
	 */
	public int menor() {

		int menor = listOrdenada[0];

		return menor;
	}

	/**
	 * Função que retorna o maior valor do arranjo
	 * 
	 * @return retorna o maior numero dentro da lista
	 */
	public int maior() {

		int maior = listOrdenada[listOrdenada.length - 1];

		return maior;
	}

	/**
	 * Função que retorna a soma dos valores no aranjo
	 * 
	 * @return retorna a soma dos valores dentro do arranjo
	 */
	public int soma() {

		int soma = 0;

		for (Integer numero : listOrdenada) {
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

		for (Integer numero : listOrdenada) {

			// Incrementa o contador de repetições para cada achado
			if (numeroRepetido == numero)
				repeticoes++;

		}

		return repeticoes;
	}

	public Integer[] ordenarLista(Integer[] lista) {
		Integer[] listaOrdenada = lista.clone();

		// Inicia a ordenação da LISTA_INICIAL
		int auxiliar = 0;
		for (int i = 0; i < listaOrdenada.length; i++) {

			for (int j = 0; j < (listaOrdenada.length - 1); j++) {
				// Verifica se o valor a frente e maior que o do index atual
				if (listaOrdenada[j] > listaOrdenada[j + 1]) {
					auxiliar = listaOrdenada[j];
					// Troca os valores para ordenar
					listaOrdenada[j] = listaOrdenada[j + 1];
					listaOrdenada[j + 1] = auxiliar;

				}
			}

		}

		return listaOrdenada;
	}

	// Construtor para caso o usuario queira adicionar uma nova lista para o arranjo
	// que seja diferente da LISTA_INICIAL
	public Arranjo(Integer[] lista) {

		// Chama um função para ordenar a Lista inicial e guarda na variavel
		// listOrdenada
		listOrdenada = ordenarLista(lista);

	}
}
