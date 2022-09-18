import java.util.Scanner;

/*
    Srilakshmi, K. (2022). Intermediate Java Programming - Test Customer Account App.
    Created by Srilakshmi Kota
*/
public class TestCustomerAccountApp {

	public static void main(String[] args) {

		System.out.println("  Welcome to the Customer Account App \n\n");
		System.out.println("  Enter a Customer ID: \n\t" + "ex: 1007, 1008, 1009>:");
		Scanner sc = new Scanner(System.in);
		
		Integer customerId = Integer.valueOf(sc.next());
		Customer customer = CustomerDB.getCustomer(customerId);
		Account account = new Account();

		do {
			
			System.out.println(" \n\n");
			account.displayMenu();
			
			//perform the action on the account based on user selection
			String action = sc.next();
			if("B".equalsIgnoreCase(action)) {
				System.out.println("\n  Account balance: $"+ account.getBalance());
			} else if ("D".equalsIgnoreCase(action)) {
				System.out.println("\n  Enter deposit amount: ");
				Double amt = Double.valueOf(sc.next());
				account.deposit(amt);
			} else if ("W".equalsIgnoreCase(action)) {
				System.out.println("\n  Enter withdraw amount: ");
				Double amt = Double.valueOf(sc.next());
				account.withdraw(amt);
			} else {
				System.out.println("\n  Error: Invalid Option");
			}
			
			System.out.println("\n\n  Continue? y/n: ");

		} while (sc.next().equalsIgnoreCase("y"));
		
		System.out.println("\n\n\n  --Customer Details--\n");
		System.out.println(customer.toString());
		System.out.printf("\n Balance as of %s is $%,6.2f", account.getTransactionDate(), account.getBalance());

	}
}
