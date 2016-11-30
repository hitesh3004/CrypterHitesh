public class PrioritySort {
	
	public String[] priority(String[] a,String [] b){
		//String[] c= new String[a.length];
		double[] average = new double[a.length];
		for(int i = 0;i < a.length;i++){
			for(int j = 0;j < b.length;j++){
				double avg = 0;
				if(a[i].equals(b[j])){
					avg = (i + j)/2;
					average[i] = avg;
				}
			}
		}
		for(int i = 0;i < a.length;i++){
			for(int j = 1;j < a.length - i;j++){
				if(average[j-1] > average[j]){
					double t = average[j-1];
					average[j-1]=average[j];
					average[j]=t;
					String temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}
	
	public static void main(String args[]){
		PrioritySort sort = new PrioritySort();
		String[] a = {"a","c","e","b","d","f"};
		String[] b = {"f","a","b","d","c","e"};
		String[] c = new String[a.length];
		c = sort.priority(a,b);
		for(int i =0;i<a.length;i++){
			System.out.print(c[i]);
		}
	}
}
