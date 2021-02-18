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
		
		if(head == null) head = new Node<T>(dado);
		else {
			
			
			Node<T> nodeAtual = head;

			// Busca no vetor a ultima instancia de node 
			while(nodeAtual.hasNext()){
				
				nodeAtual = nodeAtual.getNext();
				
			}
			
			nodeAtual.setNext(new Node<T>(dado));
			
		}
		
		tamanho++;
		
		return tamanho;
	}
	
	public void addFirst(T dado) {
		Node nodeTMP = new Node<T>(dado);
		
		nodeTMP.setNext(head);
		
		tamanho++;
		
		this.head = nodeTMP;
	}
	
	public boolean remove(int index) {
		
		Node<T> nodeAtual = head;
		
		
		if(index == 0) {
			head = head.getNext();
			return true;
		}
		
		// Busca no vetor a ultima instancia de node 
		while(nodeAtual.hasNext()){
			
			
			if(index == 1) {
				
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
		if(head == null)return "";
		
		String vetor = "[ "+head.getDado().toString();
		
		Node nodeAtual = head;
		
		while(nodeAtual.hasNext()){
			
			nodeAtual = nodeAtual.getNext();
			vetor += ", "+nodeAtual.toString();
			
		}
		
		
		return vetor+"]";
	}
	

}
