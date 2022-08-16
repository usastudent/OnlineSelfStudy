package selfSudy;

public class MethodsAndReturningValue {

	public static void main(String[] args) {
		
		int num1= 10;
		int num2 =10;
		
		int answer1;
		int answer2 ;
		boolean answer3;
	
		answer1 = multNumbers(num1);
		System.out.println("when we multiply num1 by 7 we get : "+ answer1);
		answer2 = addNumbers(num1,num2);
		System.out.println("when we add num1 and num2 , we get"+answer2 );
		answer3 =  equlaNumbers(num1, num2);
		System.out.println("num1 and num2 are equall:  "+answer3 );
	}
	public static int multNumbers(int a) {
		return  (a*7);
		
	}
	public static int addNumbers ( int x , int y) {
		int answer = x+y;
		return answer ;  // return (x+y);
		
	}
	
	public static boolean equlaNumbers (int r, int t) {
		if ( r == t) return true;
		else return false;
		

	}

}
