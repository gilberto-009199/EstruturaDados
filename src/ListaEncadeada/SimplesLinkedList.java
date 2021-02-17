package ListaEncadeada;

/* Lista usada para quando não sabemos o tamanho maximo da lista 
 * 		+ Mais so pode remover o 1° elemento da lista de maneira performatica
 */
public class SimplesLinkedList<T> {
	
	private Node<T> node;
	private int tamanho = 0;
	
	
	
	public int add(T dado) {
		int index = tamanho;
		
		
		if(node == null) node = new Node<T>(dado);
		else {
			
			
			Node<T> nodeAtual = node;

			// Busca no vetor a ultima instancia de node 
			while(nodeAtual.hasNext()){
				
				nodeAtual = nodeAtual.getNext();
				
			}
			
			nodeAtual.setNext(new Node<T>(dado));
			
		}
		
		tamanho++;
		
		return index;
	}
	
	public void addFirst(T dado) {
		Node nodeTMP = new Node<T>(dado);
		
		nodeTMP.setNext(node);
		
		this.node = nodeTMP;
	}
	
	public String toString() {
		// Valida se esta zerado a lista
		if(node == null)return "";
		
		String vetor = "[ "+node.getDado().toString();
		
		Node nodeAtual = node;
		
		while(nodeAtual.hasNext()){
			
			nodeAtual = nodeAtual.getNext();
			vetor += ", "+nodeAtual.toString();
			
		}
		
		
		return vetor+"]";
	}
	

}
