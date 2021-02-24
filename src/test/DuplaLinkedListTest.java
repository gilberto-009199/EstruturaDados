package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ListaEncadeada.DuplaLinkedList;
import ListaEncadeada.SimplesLinkedList;

class DuplaLinkedListTest {

	@Test
	void test() {
		
		DuplaLinkedList<String> lista = new DuplaLinkedList<String>();
		
		lista.add("Bom dia");
		lista.add("Bom tarde");
		lista.add("Bom noite");
		
		lista.addFirst("Bom dia2");
		lista.addFirst("Bom dia3");
		
		lista.add("Bom noite2");
		
		System.out.println(lista.toString());
		
		lista.remove(0);
		lista.remove(3);
		
		assertEquals("[ Bom dia2, Bom dia, Bom tarde, Bom noite2]",lista.toString(),"Lista Duplamente Linkada  Funcionado!");
		
		

	}

}
