package My_Implementations;
public class myTree{
	public myTree left;
	public myTree right;
	public int data;
	
	public myTree(int d){
		data = d;
		left = null;
		right = null;
	}
	
	public myTree get_right(myTree root){
		return root.right;
	}
	
	public myTree get_left(myTree root){
		return root.left;
	}
	
	public int get_data(myTree root){
		return root.data;
	}
}
