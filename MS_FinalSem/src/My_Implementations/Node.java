package My_Implementations;

public class Node<T>{
	Node<T> next;
	T data;
	public Node(T data){
		this.data = data;
		next = null;
	}
}
