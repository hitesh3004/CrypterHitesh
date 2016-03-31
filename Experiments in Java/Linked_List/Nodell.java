package project1;
public class Nodell {
	Nodell next,prev;
	int data;
	
	/* Constructor */
	public Nodell(){
		prev=null;
		next=null;
		data=0;
	}
	
	/* Constructor */
	public Nodell(int d){
		prev=null;
		next=null;
		data=d;
	}
	
	/* Function to set next node */
	public void setNext(Nodell n){
		next=n;
	}
	
	/* Function to set previous Node */
	public void setPrev(Nodell p){
		prev=p;
	}
	
	/* Function to get next Node */
	public Nodell getNext(){
		return next;
	}
	
	/* Function to get Previous Node */
	public Nodell getPrev(){
		return prev;
	}
	
	/* Function to set data to Node */
	public void setData(int d){
		data =d;
	}
	
	/* Function to get data from node */
	public int getData(){
		return data;
	}
}
