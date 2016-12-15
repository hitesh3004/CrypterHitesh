import java.util.Comparator;
public class StringLengthComparator implements Comparator<String>{
	
    @Override
    public int compare(String x, String y)
    {
        // Assume neither string is null. Real code should
        // probably be more robust
        // You could also just return x.length() - y.length(),
        // which would be more efficient.
        if (x.length() < y.length())
        {
            return -1;
        }
        if (x.length() > y.length())
        {
            return 1;
        }
        return 0;
    }
	
//	public int compare(String x,String y){
//		
//		int countx,county;
//		countx = 0;
//		county = 0;
//		for(int i = 0;i < x.length();i++){
//			if(x.charAt(i) == 's')
//				countx++;
//		}
//		for(int i = 0;i < y.length();i++){
//			if(y.charAt(i) == 's')
//				county++;
//		}
//		
//		if(countx > county)
//			return 1;
//		else if(countx < county)
//			return -1;
//			
//		return 0;
//	}
}
