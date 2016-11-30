public class FindElementLinkedList {
	Node head1;
	static class Node{
		int data;
		Node next;
		
		public Node(int d){
			data = d;
			next = null;
		}
	}
	
	public void printLinkedList(Node obj){
		while(obj != null){
		System.out.print(obj.data);
		obj = obj.next;
		}
	}
	
	public static void main(String args[]){
		FindElementLinkedList list = new FindElementLinkedList();
		list.head1 = new Node(1);
		list.head1.next = new Node(2);
		list.head1.next.next = new Node(3);
		list.head1.next.next.next = new Node(4);
		list.head1.next.next.next.next = new Node(6);
		list.head1.next.next.next.next.next = new Node(7);
		list.printLinkedList(list.head1);

	}
}
