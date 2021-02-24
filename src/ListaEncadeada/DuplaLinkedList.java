package ListaEncadeada;

/* Lista duplamente encadeada
 *   + remove da ultima mais facil, pois tem um ultimo elemento falso assim como um primeiro elemento tambem falso
 *   + remove do meio mais facil que SimplesLinkedList 
 *   	pois vaid e @> - - - - - <@
 *   	chegando no meio mais rapido já que
 *   	não precisa apssar por toda a lista apra saber o tamanho 
 *   	e definir aonde esta o meio atraves disso 
 * 
 * */

public class DuplaLinkedList<T> {
	
	
	private Node<T> head;
	private Node<T> tail;
	private int tamanho = 0;

	// Em desenvolvimento!
	public DuplaLinkedList() {
		this.head = new Node<T>();
		this.tail = new Node<T>();
		// Encadeando a estrutura
		head.setNext(tail);
		head.setPrev(tail);
		tail.setNext(head);
		tail.setPrev(head);
	}
	
	public int add(T dado) {
		
		
		// Bem mais facil adicioanr um novo elemento!!
		Node<T> nodeTMP = tail.getPrev();

		tail.setPrev(new Node<T>(dado));

		tail.getPrev().setPrev(nodeTMP);

		nodeTMP.setNext(tail.getPrev());
		
		tamanho++;

		return tamanho;
	}
	
	public void addFirst(T dado) {
		
		if(tamanho == 0) {
			add(dado);
			return;
		}
		// Bem mais facil adicioanr um novo elemento!!
		Node<T> nodeTMP = head.getNext();

		head.setNext(new Node<T>(dado));

		head.getNext().setPrev(head);
		
		head.getNext().setNext(nodeTMP);
		
		nodeTMP.setPrev(head.getNext());
		
		tamanho++;
	}

	public boolean remove(int index) {
		
		Node<T> nodeAtual = head.getNext();
		
		
		if(tamanho == 0)return true;
		
		if( index == 0 ) {
			head.setNext(head.getNext().getNext());
			head.getNext().setPrev(head);
		}
		
		// Busca no vetor a ultima instancia de node 
		while(nodeAtual.hasNext() && !nodeAtual.getNext().equals(head) && !nodeAtual.getNext().equals(tail) ){
			
			
			if( index == 1  ) {
				
				nodeAtual.setNext(nodeAtual.getNext()
										   .getNext()//Pega o proximo elementod a lista
									);
				return true;

			} else nodeAtual = nodeAtual.getNext();
			
			index--;
		}
		
		
		return false;
	}
	
	public String toString() {
		
		// Valida se esta zerado a lista
		if(tamanho == 0)return "";
		
		String vetor = "[ "+head.getNext().getDado().toString();
		
		Node nodeAtual = head.getNext();
		
		while(nodeAtual.hasNext() && !nodeAtual.getNext().equals(head) && !nodeAtual.getNext().equals(tail) ){
			
			nodeAtual = nodeAtual.getNext();
			vetor += ", "+nodeAtual.toString();
			
		}
		
		
		return vetor+"]";
	}
	

}
