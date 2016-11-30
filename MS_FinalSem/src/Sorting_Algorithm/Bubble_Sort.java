package Sorting_Algorithm;

public class Bubble_Sort {
	private int[] arr;
	
	public void do_bubble_sort(){
		for(int i = 0;i < arr.length;i++){
			for(int j = 0;j < arr.length - 1;j++){
				if(arr[j] > arr[j + 1]){
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
	
	public Bubble_Sort(int[] ar){
		this.arr = new int[ar.length];
		for(int i = 0;i < arr.length;i++)
			arr[i] = ar[i];
	}
	
	public void print_array(){
		for(int i = 0;i < arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	
	public static void main(String args[]){
		int[] ar = {5,4,3,5,10,2,1};
		Bubble_Sort sorter = new Bubble_Sort(ar);
		sorter.do_bubble_sort();
		sorter.print_array();
	}
}
