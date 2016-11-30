public class IntersectingLinkedList {
	
	Node head1,head2;
	static class Node{
		int data;
		Node next;
		public Node(int d){
			data = d;
			next = null;
		}
	}
	
	int getCount(Node node){
		Node current  = node;
		int count = 0;
		while(current != null){
			count ++ ;
			current = current.next;
		}
		return count;
	}
	
	int getIntersection(int diff, Node node1, Node node2){
		Node current1 = node1;
		Node current2 = node2;
		
		for(int i = 0;i < diff;i++){
			if(current1 == null)
				return -1;
			current1 = current1.next;
		}
		
		while(current1 != null && current2 != null){
			if(current1.data == current2.data)
				return current1.data;
			current1 = current1.next;
			current2 = current2.next;
		}
		return -1;
	}
	
	int getNode(){
		int diff;
		int count1 =  getCount(head1);
		int count2 = getCount(head2);
		int intersectionPoint;
		
		if(count1 > count2){
			diff = count1 - count2;
			intersectionPoint = getIntersection(diff,head1,head2);
		}
		else{
			diff = count2 - count2;
			intersectionPoint = getIntersection(diff,head2,head1);
		}
		return intersectionPoint;
	}
	
	public static void main(String args[]){
		IntersectingLinkedList list = new IntersectingLinkedList();
		list.head1 = new Node(1);
		list.head1.next = new Node(2);
		list.head1.next.next = new Node(3);
		list.head1.next.next.next = new Node(4);
		list.head1.next.next.next.next = new Node(5);
		
		list.head2 = new Node(3);
		list.head2.next = new Node(4);
		list.head2.next.next = new Node(5);
		
		System.out.println("The point of intersection is : " + list.getNode());
	}

}
