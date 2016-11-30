public class MaxProduct {
	
	void maxProd(int[] num , int n){
		int a = num[0];
		int b = num[1];
		
		for(int i = 0;i < n;i++){
			for(int j = i + 1;j < n;j++){
				if(num[i] * num[j] > a * b){
					a = num[i];
					b = num[j];
				}
			}
		}
		System.out.println("Maximum product plan is : " + a + " , " + b);
	}
	
	public static void main(String args[]){
		int[] abc = new int[7];
		for(int i = 0 ;i < abc.length;i++)
			abc[i] = i;
		abc[5] = -6;
		abc[6] = -7;
		MaxProduct max = new MaxProduct();
		max.maxProd(abc,abc.length);
	}
}
