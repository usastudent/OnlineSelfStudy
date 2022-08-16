package array;

public class EnhancedForLoop {

	public static void main(String[] args) {
		
		int bucky [] = {3,4,6,7};
		int sum=0;
		
		 // sum with normal foor Loop
		for(int i =0;i<bucky.length;i++) {
			sum+=bucky[i];
			
		}
		System.out.println(sum);
		
		
		// sum with
		// Enhanced foorLoop
		// type of data  , x : store the values in index
		// type/identifier:name
//		for(int x : bucky) {
//			sum+=x;
//		}
//		System.out.println(sum);
	}

}
