package Sorting_Algorithm;

import java.util.Arrays;

public class Heap_Sort {
	private static int N;
	private static int arr[];
	
	public void heap_sort(int a[]){
		arr = a;
		heapify(arr);
		for (int i = N; i > 0; i--)
        {
            swap(0, i);
            N = N-1;
            maxheap(arr, 0);
        }
	}
	
	public void heapify(int a[]){
		N = arr.length-1;
		for(int i = N/2;i >= 0;i--){
			maxheap(arr,i);
		}
	}
	
	public void maxheap(int a[],int i){
		int left = 2*i;
		int right = 2*i + 1;
		int max = i;
		
		if(left <= N && a[left] > a[i]){
			max = left;
		}
		if(right <= N && a[right] > a[max]){
			max = right;
		}
		
		if(max != i){
			swap(i,max);
			maxheap(arr,max);
		}
	}
	
	public void swap(int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void main(String args[]){
		Heap_Sort sorter = new Heap_Sort();
		int num[] = {10,9,8,7,1,5,100,8,2,0};
		System.out.print(Arrays.toString(num));
		sorter.heap_sort(num);
		System.out.println("");
		System.out.print(Arrays.toString(num));
	}

}
