class Node{
	Node next;
	int data;
	public Node(int d){
		next = null;
		data = d;
	}
}
public class ReverseLinkedList {
	private Node head;  
	public Node ReversebyIteration(Node currentNode){
		Node nextNode,prevNode;
		prevNode = null;
		
		while(currentNode != null){
			nextNode = currentNode.next;
			currentNode.next = prevNode;
			prevNode = currentNode;
			currentNode = nextNode;
		}
		return prevNode;
	 }
	 public void printList(Node head) {
		 Node temp = head;  
		 while (temp != null) {  
			 System.out.format("%d ", temp.data);  
			 temp = temp.next;  
		 }  
		 System.out.println();  
	 } 
	 
	 public void addToTheLast(Node node) {  
		 if (head == null) {
			 head = node;  
			 } 
		 else {  
			 	Node temp = head;  
			 	while (temp.next != null)  
			 		temp = temp.next;  
			 	temp.next = node;  
		 }  
	 }
	 public static Node reversebyRecursion(Node node) {  
	     if (node == null || node.next == null) {  
	         return node;  
	     }  
	  
	     Node remaining = reversebyRecursion(node.next);  
	     node.next.next = node;  
	     node.next = null;  
	     return remaining;  
	 }  
	 
	 public static void main(String[] args) {  
		  ReverseLinkedList list = new ReverseLinkedList();  
		  // Creating a linked list  
		  Node head=new Node(1);  
		  list.addToTheLast(head);  
		  list.addToTheLast(new Node(2));  
		  list.addToTheLast(new Node(3));  
		  list.addToTheLast(new Node(4));  
		  list.addToTheLast(new Node(5));  
		  
		  list.printList(head);  
		  //Reversing LinkedList  
		  Node reverseHead = reversebyRecursion(head);  
		  System.out.println("After reversing");  
		  list.printList(reverseHead);  	   
		 }  
}
