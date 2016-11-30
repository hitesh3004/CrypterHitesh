package My_Implementations;

public class myStack {
	private Node<Integer> head;
	
	public void Push(int data){
		Node<Integer> temp = new Node<Integer>(data);
		if(head != null){
			temp.next = head;
		}
		head = temp;
	}
	
	public int Pop(){
		if(head == null){
			return ' ';
		}
		int d = head.data;
		head = head.next;
		return d;
	}
	
	public boolean isEmpty(){
		if(head == null)
			return true;
		else
			return false;
	}
	
	public boolean Peek(int value){
		while(head != null){
			if(head.data == value){
				return true;
			}
			head = head.next;
		}
		return false;
	}
	
	public int getHeadData(){
		return head.data;
	}
}
