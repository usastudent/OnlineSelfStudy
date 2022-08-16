package selfSudy;

import Package2.groceryStore;

public class classAndObjectPractice {

	public static void main (String[] args) {
		groceryStore  Sacramento = new groceryStore();
		groceryStore  Sanfrancisco = new groceryStore();
		groceryStore  Sandiego  = new groceryStore();
		
		double saleSacramento, saleSanfrancisco, salesSandiego;
		
		
				         
		
		Sacramento.applesSoldYearly= 534;
		Sacramento.appleRetailPrice= 0.99;
		Sacramento.orangeRetailPrice=0.87;
		Sacramento.orangesSoldYearly =429;
		
		Sanfrancisco.applesSoldYearly=765;
		Sanfrancisco.appleRetailPrice= 0.86;
		Sanfrancisco.orangesSoldYearly=842;
		Sanfrancisco.orangeRetailPrice= 0.91;
		
		Sandiego.applesSoldYearly=402 ;
		Sandiego.appleRetailPrice= 0.77;
		Sandiego.orangesSoldYearly= 398;
		Sandiego.orangeRetailPrice= 79;
		
//		Sacramento.salecount();
//		Sanfrancisco.salecount();
//		Sandiego.salecount();
		
		
//		saleSacramento = (Sacramento.applesSoldYearly * Sacramento.appleRetailPrice)+
//				         ( Sacramento.orangesSoldYearly * Sacramento.orangeRetailPrice);
//		
//		saleSanfrancisco = (Sanfrancisco.applesSoldYearly * Sanfrancisco.appleRetailPrice) +
//				           (Sanfrancisco.orangesSoldYearly * Sanfrancisco.orangeRetailPrice);
//		
//		salesSandiego = Sandiego.applesSoldYearly * Sandiego.appleRetailPrice +
//				        Sandiego.orangesSoldYearly * Sandiego.orangeRetailPrice;
		
		System.out.println("Sacramento Store");
		System.out.println("Apple sold :"+ Sacramento.applesSoldYearly);
		System.out.println("Apple retail price :"+ Sacramento.appleRetailPrice);
		System.out.println("\nOranage sold :"+ Sacramento.orangesSoldYearly);
		System.out.println("Oranage retail price :"+ Sacramento.orangeRetailPrice);
		
		System.out.println("sacrmento profit:");
		Sacramento.salecount();
		System.out.println("Sanfrancisco profit:");
		Sanfrancisco.salecount();
		System.out.println("Sandiego profit is");
		Sandiego.salecount();
		
//		System.out.println("Sacramento sale is :" +" "+ saleSacramento+"$");
//		System.out.println("Sanfrancisco sale is :" + " "+ saleSanfrancisco+"$");
//		System.out.println("Sandiego sale is :"+ " "+ salesSandiego+"$");
		
	}
	
}

class groceryStore {
	int applesSoldYearly;
	double appleRetailPrice;
	
	int orangesSoldYearly;
	double orangeRetailPrice;
	
	void salecount () {
		double sales;
		sales = (applesSoldYearly * appleRetailPrice) + 
				(orangesSoldYearly * orangeRetailPrice);
		System.out.println(sales+"$");
	}
}
