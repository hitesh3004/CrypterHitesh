package Sorting_Algorithm;
public class Selection_Sort {
	
	private int[] arr;
	
	public Selection_Sort(int[] ar){
		this.arr = new int[ar.length];
		for(int i = 0;i < arr.length;i++)
			this.arr[i] = ar[i]; 
	}
	
	public void do_selection_sort(){	
		for(int i = 0;i < arr.length;i++){
			for(int j = i + 1;j < arr.length;j++){
				if(arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public void print_array(){
		for(int i = 0;i < arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	
	public static void main(String args[]){
		int[] arr = {5,6,7,1,2,4,3};
		Selection_Sort sorter = new Selection_Sort(arr);
		sorter.do_selection_sort();
		sorter.print_array();
	}
	
}
