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
		
		System.out.println(lista.toString());
	}

}
