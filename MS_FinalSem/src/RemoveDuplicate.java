import java.util.*;

public class RemoveDuplicate {
	Node head1;
	
	static class Node{
		Node next;
		int data;
		public Node(int d){
			data = d;
			next = null;
		}
	}
	
	public Node remove_duplicates(Node head){
		
		HashMap<Integer, Integer> ht = new HashMap<Integer, Integer>();
		if(head==null){
			return null;
		}
		Node current = head.next;
		Node prev = head;
		Node temp;
		ht.put(head.data,1);

		while(current != null){
			int data = current.data;
			if(ht.containsKey(data)){
				prev.next = current.next;
				temp = current;
				current = current.next;
				temp.next = null;
			}
			else{
				ht.put(data, 1);
				prev = current;
				current = current.next;
			}
		}
		return head;
	}
	
	void printLinkedList(Node head){
		while(head != null){
			System.out.print(head.data+",");
			head = head.next;
		}
		System.out.println();
	}
	
	public static void main(String args[]){
		RemoveDuplicate list = new RemoveDuplicate();
		list.head1 = new Node(1);
		list.head1.next = new Node(2);
		list.head1.next.next = new Node(3);
		list.head1.next.next.next = new Node(3);
		list.head1.next.next.next.next = new Node(4);
		list.head1.next.next.next.next.next = new Node(4);
		list.printLinkedList(list.head1);
		list.printLinkedList(list.remove_duplicates(list.head1));
	}
	
}
