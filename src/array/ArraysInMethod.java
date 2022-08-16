package array;

public class ArraysInMethod {

	public static void main(String[] args) {
		
		// make an array and then change it.
		
		int bucky []={3,4,5,6,7};  // this is the first array
		change(bucky);				// change the array by method outside of the main method
		for (int y : bucky) {		// then we come back to them main and print the new array
			System.out.println(y);
		}

	}
		public static void change(int x[]) {
			
			for(int counter=0; counter<x.length; counter++) {
				x[counter]+=5;
			}
		}
			
			
		}

