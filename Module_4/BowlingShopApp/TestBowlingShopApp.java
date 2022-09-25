import java.util.Scanner;

/*
    Srilakshmi, K. (2022). Intermediate Java Programming - Test Bowling Shop App.
    Created by Srilakshmi Kota
*/
public class TestBowlingShopApp {

	public static void main(String[] args) {

		System.out.println("  Welcome to the Bowling Shop");
		Scanner sc = new Scanner(System.in);
		String option = null;
		
		do {
			
			displayMenu();
			
			//perform the action based on user selection
			option =  sc.next();
			GenericQueue<Product> products = ProductDB.getProducts(option);
			
			if(!"x".equalsIgnoreCase(option)) {
				System.out.println("\n  --Product Listing--");
			}
			
			while (products.size() > 0) {
				Product product = products.dequeue();
				System.out.printf(product.toString() + "\n\n", product.getPrice());
			}
							
		} while (!option.equalsIgnoreCase("x"));
		
		System.exit(0);
	
	} 
	
	public static void displayMenu() {
		System.out.println("\n\n  MENU OPTIONS \n");
		System.out.println("     1. <b> Bowling Balls \n");
		System.out.println("     2. <a> Bowling Bags \n");
		System.out.println("     3. <s> Bowling Shoes \n");
		System.out.println("     4. <x> To exit \n\n");
		System.out.printf("  Please choose an option: ");
	}
}
