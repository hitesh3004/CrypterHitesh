public class Solution {
	public int solution(int[] A) {
        // write your code in Java SE 8
        int midEnd = A.length/2;
        int midStart = A.length/2 -1;
        boolean sorted;
        int answer = 0;
        while(midEnd < A.length){
        	sorted = true;
            for(int i = midStart; i<midEnd;i++)
            {   
                for(int k = 1;k<=midEnd;k++)
                {   
                    if(A[k-1] > A[k]){
                        int temp = A[k-1];
                        A[k-1] = A[k];
                        A[k]=temp;
                    }
                }
            }
            for(int j = 0; j<A.length-1; j++){
                if(A[j] > A[j+1]){
                    sorted = false;
                    break;
                }
            }
            if(sorted == true){
                answer = midEnd - midStart;
                break;
            }
            midStart --;
            midEnd ++;
        }
        return answer;
    }
	
	public static void main(String args[]){
		Solution sol = new Solution();
		int[] A = {1, 2, 6, 5, 5, 8, 9};
		System.out.println("Answer is : "+sol.solution(A));
		
	}
}
