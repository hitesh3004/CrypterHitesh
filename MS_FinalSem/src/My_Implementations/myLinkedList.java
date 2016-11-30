package My_Implementations;
public class myLinkedList {
	
	void addAt(int index, int d, Node<Integer> node){
		for(int i = 1;i < index;i++){
			node = node.next;
		}
		Node<Integer> abc = new Node<Integer>(d);
		abc.next = node.next;
		node.next = abc;	
	}
	
	void removeAt(int index, Node<Integer> node){
		for(int i = 1;i < index;i++){
			node = node.next;
		}
		node.next = node.next.next;
	}
	
	void printLinkedList(Node<Integer> node){
		while(node != null){
			System.out.print(node.data+",");
			node = node.next;
		}
		System.out.println();
	}
	
	boolean isEmpty(Node<Integer> node){
		if(node == null){
			return true;
		}
		else{
			return false;
		}	
	}
	
	boolean contains(Node<Integer> node,int value){
		while(node != null){
			if(node.data == value){
				return true;
			}
			node = node.next;
		}
		return false;
	}
}
