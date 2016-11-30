public class NonDuplicate{
	public static int Single(int arr[]){
		int i,j;
		int[] arr2 = new int[arr.length];
		for(int k = 0;k<arr2.length;k++){
			arr2[k] = 100;
		}
		for(i = 0;i<arr.length;i++){
			for(j = i+1; j <arr.length;j++){
				if(arr[i] == arr[j]){
					arr2[i] = 1;
					arr2[j] = 1;
				}
			}
		}
		
		for(int k = 0;k<arr.length;k++){
			if(arr2[k] != 1)
				return arr[k];
			
		}
		return 0;
	}
	public static void main(String args[]){
		int[] arr1 = {1,2,3,4,5,6,7,2,3,4,5,6,7};
		System.out.println(Single(arr1));
	}
}