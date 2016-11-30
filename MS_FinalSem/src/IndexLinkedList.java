public class IndexLinkedList {
	Node head1;
	
	static class Node{
		Node next;
		int data;
		
		public Node(int d){
			data = d;
			next = null;
		}
	}
	
	void addAt(int index, int d, Node node){

		for(int i = 1;i < index;i++){
			node = node.next;
		}
		Node abc = new Node(d);
		abc.next = node.next;
		node.next = abc;	
	}
	
	void removeAt(int index, Node node){
		if(index == 0){
			head1 = head1.next;
		}
		else{
			for(int i = 1;i < index;i++){
				node = node.next;
			}
			node.next = node.next.next;
		}
	}
	
	void printLinkedList(Node head){
		while(head != null){
			System.out.print(head.data+",");
			head = head.next;
		}
		System.out.println();
	}
	
	public static void main(String args[]){
		IndexLinkedList list = new IndexLinkedList();
		list.head1 = new Node(1);
		list.head1.next = new Node(2);
		list.head1.next.next = new Node(3);
		list.head1.next.next.next = new Node(4);
		list.head1.next.next.next.next = new Node(6);
		list.head1.next.next.next.next.next = new Node(7);
		list.printLinkedList(list.head1);
		list.addAt(4, 100, list.head1);
		list.printLinkedList(list.head1);
		list.removeAt(0, list.head1);
		list.printLinkedList(list.head1);
	}
}
