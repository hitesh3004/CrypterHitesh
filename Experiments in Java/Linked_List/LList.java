package project1;

public class LList {
	private Nodell head;
	int size;
	
	/* Constructor */
	public LList(){
		head=null;
	}
	
	/*Function to check if Linked List is empty*/
	public boolean isEmpty(){
		return head==null;
	}
	
	/* Function to insert data */
	public void insert(int data){
		head=insert(head,data);
	}
	/* Function to insert data Recursively */
	public Nodell insert(Nodell node, int data ){
		if(node==null)
			node=new Nodell(data);
		else{
			
			node.next=insert(node.next,data);	
			
		}
		return node;
	}
	
	/* Function to get the size of Linked List */
	public int size(){
		return size(head);
	}
	/* Function to count number of Nodes */
	private int size(Nodell h){
		if(h==null)
			return 0;
		else{
			int len=1;
			len+=size(h.getNext());
			return len;
		}
	}

    /* Function to search for an element */
    public boolean search(int val)
    {
        return search(head, val);
    }
    
	/* Function to search for an element */
	private boolean search(Nodell h, int val){
		if(h.getData()==val)
			return true;
		if(h.getNext()!=null)
			if(search(h.getNext(),val))
				return true;
		return false;
	}
	
	/* Function to traverse the Linked List */
	public void traverse(){
		traverse(head);
	}
	private void traverse(Nodell h){
		if(h!=null){
			traverse(h.getNext());
			System.out.print(h.getData()+" ");
		}
	}
	
}

