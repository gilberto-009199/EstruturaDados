package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ListaEncadeada.SimplesLinkedList;

class SimplesLinkedListTest {

	@Test
	void test() {
		SimplesLinkedList<String> lista = new SimplesLinkedList<String>();

		lista.add("Bom dia");
		lista.add("Bom tarde");
		lista.add("Bom noite");

		lista.addFirst("Bom dia2");

		lista.remove(4);

		assertEquals("[ Bom dia2, Bom dia, Bom tarde, Bom noite]", lista.toString(),"Lista Linkada Simples Funcionado!");
	}

}
