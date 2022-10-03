import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/*
    Srilakshmi, K. (2022). Intermediate Java Programming - Test Expense Tracker App.
    Created by Srilakshmi Kota
*/
public class TestExpenseTracker {

	public static void main(String[] args) {

		System.out.println("  Welcome to the Expense Tracker");
		Scanner sc = new Scanner(System.in);
		
		do {
			
			int input = ValidatorIO.getInt(sc, menu());
	
			if(input == 1) {
				displayTransactions();
			} else if(input == 2) {
				String c = "y";
				ArrayList<Transaction> transactions = new ArrayList<>();
				while(c.equalsIgnoreCase("y")) {
					String description = ValidatorIO.getString(sc, "\n  Enter the description: ");
					double amount = ValidatorIO.getDouble(sc, "\n  Enter the amount: ");
					
					Transaction transaction = new Transaction(getTransactionDate(), description, amount);
					transactions.add(transaction);
					
					c = ValidatorIO.getString(sc, "\n  Add another transaction? (y/n): ");
					
				}
				try {
					TransactionIO.bulkInsert(transactions);
				} catch(Exception e) {
					System.out.println("\n Exceptions:  " + e.getMessage());
				}
				
			} else if (input == 3) {
			
				try {
					ArrayList<Transaction> transactions = TransactionIO.findAll();
					double monthlyExpense = 0.00;
					for(Transaction tran : transactions) {
						monthlyExpense += tran.getAmount();
					}
					System.out.printf("\n  Your total monthly expense is $%,6.2f" + "\n\n", monthlyExpense);
				} catch (IOException e) {
					System.out.println("\n Exceptions:  " + e.getMessage());
				}
				
			} else {
				System.out.println("\n  Error: Invalid Option");
			}
			
			System.out.println("\n\n  Continue? y/n: ");

		} while (sc.next().equalsIgnoreCase("y"));
			
			
		System.exit(0);
	
	} 
	
	public static String menu() {
		StringBuffer menu = new StringBuffer();
		menu.append("\n\n  MENU OPTIONS \n");
		menu.append("     1. View Transactions \n");
		menu.append("     2. Add Transactions \n");
		menu.append("     3. View Expense \n\n");
		menu.append("  Please choose an option: ");
		return menu.toString();
	}
	
	public static void displayTransactions() {
		ArrayList<Transaction> transactions = new ArrayList<>();
		try {
			transactions = TransactionIO.findAll();
		} catch(Exception e) {
			System.out.println("\n Exceptions:  " + e.getMessage());
		}
		
		System.out.println("\n  MONTHLY EXPENSES");
		if(!transactions.isEmpty()) {
			for(Transaction tran: transactions) {
				System.out.printf(tran.toString() + "\n\n", tran.getAmount());
			}
		}
	}
	
	// Returns the current Date with MM-dd-yyyy format
		public static String getTransactionDate() {
			SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
			Date date = new Date();
			return sdf.format(date);
			
		}
}
