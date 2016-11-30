import java.util.*;
public class LinkedListOperations {
	
	public static void main(String args[]){
		
		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.add("Hitesh");
		linkedlist.add("Seshank");
		linkedlist.add("Karunesh");
		System.out.println("Initial LinkedList is: " + linkedlist);
		
		linkedlist.add(3,"fineberg");
		System.out.println("Linked List by adding at index : " + linkedlist);
		
		linkedlist.set(3, "Rishabh");
		System.out.println("Linked List by seeting at index : " + linkedlist);
		
		System.out.println("Get first element : " + linkedlist.getFirst() + " & Get Last element : " + linkedlist.getLast());
		
		LinkedList<String> newList = new LinkedList<String>();
		newList.addAll(linkedlist);
		System.out.println("New List : " + newList);
		
		newList.addAll(2,linkedlist);
		System.out.println("New List by adding from given index :  " + newList);
		
		Object clone = linkedlist.clone();
		System.out.println("New cloned object : " + clone);
		
		boolean flag  = linkedlist.contains("Karunesh");
		System.out.println("List contains Karunesh : " + flag);
		
		linkedlist.remove(2);
		System.out.println("On removing 3rd element : " + linkedlist);
	}

}
