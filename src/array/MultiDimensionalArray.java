package array;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		int firstArray[][]=  { {8,9,10,11},{12,13,14,15}};
		int secondArray[][]= { {60,34,56,3},{45},{44,56}};
		
		System.out.println("this is the firs array");
		display(firstArray);
		
		System.out.println("this is the second array");
		display(secondArray);

	}
	 public static void display (int x[][]) {
		 for(int row =0; row<x.length;row++) {
			 for(int col=0; col<x[row].length;col++) {
				 System.out.print(x[row][col]+"\t");
			 }
			 System.out.println();
		 }
	 }
}
