import java.text.SimpleDateFormat;
import java.util.Date;

/*
    Srilakshmi, K. (2022). Intermediate Java Programming - Account class that determines the Account properties and functionalities.
    Created by Srilakshmi Kota
*/
public class Account {

	private double balance = 200.00;

	// Add the amount to balance when deposit performs
	public void deposit(double amt) {
		balance = balance + amt;
	}

	// Decrease the amount to balance when withdraw performs
	public void withdraw(double amt) {
		if (balance >= amt) {
			balance = balance - amt;
		}
	}

	// Displays the menu with account options
	public void displayMenu() {
		System.out.println("  Account Menu \n" + "  Enter <D/d> for deposit \n" + "  Enter <W/w> for withdraw \n"
				+ "  Enter <B/b> for balance \n" + "  \t Enter option>:");

	}
	
	// Returns the current Date with MM-dd-yyyy format
	public String getTransactionDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		Date date = new Date();
		return sdf.format(date);
		
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
