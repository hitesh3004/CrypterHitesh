package My_Implementations;
public class myQueue {
	
	private Node<Integer> head, tail;

	public void Insert(int data){
		Node<Integer> temp =  new Node<Integer>(data);
		if(tail != null){
			tail.next = temp;
		}
		tail = temp;
		if(head == null){
			head = tail;
		}
	}
	
	public int Delete(){
		int temp = head.data;
		head = head.next;
		if(head == null){
			tail = null;
		}
		return temp;
	}
	
	public boolean Peek(int value){
		while(head == tail){
			if(head.data == value){
				return true;
			}
		}
		return false;
	}
	
	public boolean isEmpty(){
		if(head == null)
			return true;
		else
			return false;
	}
	
	void printQueue(){
		while(head != tail){
			System.out.print(head.data);
			head = head.next;
		}
	}	
}