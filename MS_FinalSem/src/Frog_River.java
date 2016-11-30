
public class Frog_River {
	public int minTime(int X, int N, int A[]){
		
		int steps = X;
		int[] leafPosition = new int[N];
		for(int i = 0; i < A.length; i++){
			if(leafPosition[A[i]] == 0 && A[i] <= X ){
				steps = steps - 1;
			}
			if(steps == 0)
				return i;
		}
		return -1;
	}
	
	public static void main(String Args[]){
		Frog_River frog = new Frog_River();
		int arr[] = {5,3,2,4,6,7,1,8,9,10};
		int time = frog.minTime(5, 10, arr);
		System.out.println(time);
	}

}
