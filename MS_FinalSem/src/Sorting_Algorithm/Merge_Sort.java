package Sorting_Algorithm;

public class Merge_Sort {
	int[] arr ;
	int[] temparr;
	int len;
	
	public void sort(int[] arr_ip){
		this.arr = arr_ip;
		this.len = arr_ip.length;
		this.temparr = new int[len];
		do_Merge_Sort(0, len - 1);
	}
	
	public void do_Merge_Sort(int lowerIndex,int higherIndex){
		if(lowerIndex < higherIndex){
			int midIndex = lowerIndex + (higherIndex - lowerIndex)/2;
			do_Merge_Sort(lowerIndex, midIndex);
			do_Merge_Sort(midIndex +1, higherIndex);
			do_Merge(lowerIndex, midIndex, higherIndex);
		}
	}
		
	
	public void do_Merge(int lower,int mid,int higher){
		for(int i = lower;i <= higher;i++){
			temparr[i] = arr[i];
		}
		int i,j,k;
		i = lower;
		j = mid + 1;
		k = lower;
		while (i <= mid && j <= higher) {
			if (temparr[i] <= temparr[j]) {
				arr[k] = temparr[i];
				i++;
			}
			else {
				arr[k] = temparr[j];
				j++;
			}
			k++;
		}
		while (i <= mid) {
			arr[k] = temparr[i];
			k++;
			i++;
		}
	}
	
	public static void main(String args[]){
		Merge_Sort sorter = new Merge_Sort();
		int[] arr_ip = {2,1,4,3,5,17,6};
		sorter.sort(arr_ip);
		for(int i = 0;i < arr_ip.length;i++)
			System.out.print(arr_ip[i]);
	}
}
