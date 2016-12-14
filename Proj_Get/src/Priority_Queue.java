import java.util.PriorityQueue;
import java.util.Comparator;
public class Priority_Queue {
	
	public static void main(String args[]){
		Comparator<String> comparator = new StringLengthComparator();
	    PriorityQueue<String> queue = new PriorityQueue<String>(10, comparator);
	    queue.add("short");
	    queue.add("very long indeed");
	    queue.add("medium");
	    queue.add("s");
	    while (queue.size() != 0){
	    	System.out.println(queue.remove());
	    }
	}
}
