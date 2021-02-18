package ListaEncadeada;
//Um pouco de programação generica para dar um toque
public class Node<T> {
	
	private T dado;
	// link para o proximo elemento da lista
	private Node<T> next;
	// link para o elemento anterior da lista
	// Pode estar nullo dependendo da lista!
	private Node<T> prev;
	
	public Node(T dado) {
		this.dado = dado;
	}
	
	public Node() {}
	
	public T getDado() {
		return dado;
	}
	public void setDado(T dado) {
		this.dado = dado;
	}
	
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	public Node<T> getPrev() {
		return prev;
	}
	public void setPrev(Node<T> prev) {
		this.prev = prev;
	}
	/* Verifica se existe uma proximo elemento do node atual */
	public boolean hasNext() {
		return next != null;
	}
	/* Verifica se existe uma proximo elemento do node atual */
	public boolean hasPrev() {
		return prev != null;
	}

	public boolean isExist() {
		return dado != null;
	}
	
	// Preciso de algo que não seja getDado kkk
	public T getValue() {
		return dado;
	}
	public void setValue(T dado) {
		this.dado = dado;
	}
	
	public String toString() {
		return dado.toString();
	}
	
}
