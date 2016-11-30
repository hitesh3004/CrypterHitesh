import My_Implementations.myTree;
import My_Implementations.myQueue;
import My_Implementations.myStack;
import java.util.*;


public class BinaryTree {
	myTree root;
	
	
	
	public void insert(int data, myTree root){
		if(data >= root.get_data(root)){
			if(root.get_right(root) == null){
				root.right = new myTree(data);
			}
			else{
				insert(data, root.get_right(root));
			}
		}
		else{
			if(root.get_left(root) == null){
				root.left = new myTree(data);
			}
			else{
				insert(data,root.get_left(root));
			}
		}
	}
	
	
	public void printTreeInorder(myTree root){
		if(root != null){
			printTreeInorder(root.get_left(root));
			System.out.print(root.get_data(root)+" ");
			printTreeInorder(root.get_right(root));
		}
	}
	
	
	public void top_view(myTree root)
	{   
	    myTree rootDuplicate = root.get_right(root);
	    myStack left_view = new myStack();
	    
	    while(root != null){
	        left_view.Push(root.get_data(root));
	        root = root.get_left(root);
	    }
	    
	    myQueue right_view = new myQueue();
	    while(rootDuplicate != null){
	        right_view.Insert(rootDuplicate.get_data(root));
	        rootDuplicate = rootDuplicate.get_right(root);
	    }
	    
	    while(left_view.isEmpty() != true){
	        System.out.print(left_view.Pop()+" ");
	    }
	    while(right_view.isEmpty()!= true){
	        System.out.print(right_view.Delete()+" ");
	    } 
	}
	
	
	public void printLevelOrder(myTree root){
		for(int i = 0;i <= max_height(root);i++){
			printGivenLevel(root,i);
			System.out.println();
		}
	}
	
	
	public void printGivenLevel(myTree root,int level){
		if(root == null){
			return;
		}
		if(level == 1){
			System.out.print(root.get_data(root));
		}
		printGivenLevel(root.get_left(root),level-1);
		printGivenLevel(root.get_right(root),level-1);
	}
	
	
	public int min_height(myTree root){
		if(root == null) {
			return 0;
		}
		if(root.get_left(root) == null && root.get_right(root) == null) {
			return 1;
		}
		if(root.get_left(root) == null) {
			return min_height(root.get_right(root)) + 1;
		}
		if(root.get_right(root) == null) {
			return min_height(root.get_left(root)) + 1;
		}
		return Math.min(min_height(root.get_right(root)), 
				min_height(root.get_left(root))) + 1;
	}
	
	
	public int max_height(myTree root){
		if(root == null){
			return 0;
		}
		else{
			int lheight = max_height(root.get_left(root));
			int rheight = max_height(root.get_right(root));
			
			if(lheight > rheight){
				return lheight+1;
			}
			else{
				return rheight+1;
			}
		}
	}
	
	
	public LinkedList<Integer> two_node_path(myTree root,myTree node1,myTree node2){
		myTree lca = lowest_common_ancester(root, node1.data, node2.data);
		LinkedList<Integer> node1_lca = new LinkedList<Integer>();
		LinkedList<Integer> node2_lca = new LinkedList<Integer>();
		node1_lca = node_distance(lca, node1);
		node2_lca = node_distance(lca, node2);
		for(int i = (node2_lca.size())-2; i >= 0;i--){
			node1_lca.add(node2_lca.get(i));
		}
		return node1_lca;
	}
	
	
	public myTree lowest_common_ancester(myTree root, int n1, int n2) 
    {
        if (root == null)
            return null;
  
        // If both n1 and n2 are smaller than root, then LCA lies in left
        if (root.data > n1 && root.data > n2)
            return lowest_common_ancester(root.left, n1, n2);
  
        // If both n1 and n2 are greater than root, then LCA lies in right
        if (root.data < n1 && root.data < n2) 
            return lowest_common_ancester(root.right, n1, n2);
  
        return root;
    }
	
	
	public LinkedList<Integer> node_distance(myTree node1,myTree node2){
		LinkedList<Integer> elements_left = new LinkedList<Integer>();
		LinkedList<Integer> elements_right = new LinkedList<Integer>();
		if(node1 == null){
			LinkedList<Integer> temp= new LinkedList<Integer>();
			return temp;
		}
		if(node1 == node2){
			LinkedList<Integer> elements = new LinkedList<Integer>();
			elements.add(node1.data);
			return elements;
		}
		elements_left = node_distance(node1.left, node2);
		elements_right = node_distance(node1.right, node2);
		
		if(elements_left.isEmpty() && elements_right.isEmpty()){
			LinkedList<Integer> temp= new LinkedList<Integer>();
			return temp;
		}
		if(elements_left.isEmpty()){
			elements_right.add(node1.data);
			return elements_right;
		}
		else{
			elements_left.add(node1.data);
			return elements_left;
		}
	}
	
	
	public static void main(String args[]){
		BinaryTree bt = new BinaryTree();
		bt.root = new myTree(70);
//		for(int i = 0;i < 20;i++){
//			int x = i;
//			bt.insert(x, bt.root);
//		}
		bt.root.left = new myTree(60);
		bt.root.left.left = new myTree(55);
		bt.root.left.left.left = new myTree(52);
		bt.root.left.left.left.left = new myTree(51);
		bt.root.left.left.left.right = new myTree(53);
		bt.root.left.left.right = new myTree(57);
		bt.root.left.left.right.left = new myTree(56); 
		bt.root.left.left.right.right = new myTree(58); 
		bt.root.left.right = new myTree(65); 
		bt.root.left.right.left = new myTree(62); 
		bt.root.left.right.left.left = new myTree(61); 
		bt.root.left.right.left.right = new myTree(63); 
		bt.root.left.right.right = new myTree(67);
		bt.root.left.right.right.left = new myTree(66);
		bt.root.left.right.right.right = new myTree(68);
		
		bt.root.right = new myTree(80);
		bt.root.right.left = new myTree(75);
		bt.root.right.left.left = new myTree(72);
		bt.root.right.left.left.left = new myTree(71);
		bt.root.right.left.left.right = new myTree(73);
		bt.root.right.left.right = new myTree(77);
		bt.root.right.left.right.left = new myTree(76); 
		bt.root.right.left.right.right = new myTree(78); 
		bt.root.right.right = new myTree(85); 
		bt.root.right.right.left = new myTree(82); 
		bt.root.right.right.left.left = new myTree(81); 
		bt.root.right.right.left.right = new myTree(83); 
		bt.root.right.right.right = new myTree(87);
		bt.root.right.right.right.left = new myTree(86);
		bt.root.right.right.right.right = new myTree(88);
		//bt.printTreeInorder(bt.root);
		//System.out.println();
		
		//System.out.println(bt.min_height(bt.root)+","+bt.max_height(bt.root));
		
		//System.out.println((bt.lowest_common_ancester(bt.root, 51, 52)).data);
		LinkedList<Integer> path = bt.two_node_path(bt.root,bt.root.right.left.right, bt.root.right.right.left);
		System.out.println(path.size());
		//System.out.println("***");
		//System.out.println(bt.height(bt.root));
		//System.out.println("***");
		//bt.printLevelOrder(bt.root);
		//bt.top_view(bt.root);
	}
}
