import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
public class Priority_Queue {
	
	public static void main(String args[]){
		Comparator<String> comparator = new StringLengthComparator();
	    PriorityQueue<String> queue = new PriorityQueue<String>(1, comparator);
	    queue.add("short");
	    queue.add("very long indeed");
	    queue.add("medium");
	    queue.add("s");
	    while (queue.size() != 0){
	    	System.out.println(queue.remove());
	    }
	    
	    Iterator i = queue.iterator();
	    
//	    while(i.hasNext()){
//	    	System.out.println(i.next());
//	    }
	    
	    ArrayList<String> arr = new ArrayList<String>();
	    arr.add("short");
	    arr.add("very long indeed");
	    arr.add("medium");
	    arr.add("s");
	    Collections.sort(arr,new StringLengthComparator());
	    
	    for(String s: arr){
	    	System.out.println(s);
	    }
	}
}
