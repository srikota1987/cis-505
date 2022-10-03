
/*
    Srilakshmi, K. (2022). Intermediate Java Programming - Transaction class that represents transaction.
    Created by Srilakshmi Kota
*/
public class Transaction {

	private String date = "09-30-2022";
	private String description = "";
	private double amount = 0.00;

	// Default Constructor
	public Transaction() {
	}
	
	public Transaction(String date, String description, double amount) {
		this.date = date;
		this.description = description;
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	// Overriding toString() method
		public String toString() {

			StringBuffer sb = new StringBuffer();
			sb.append(System.getProperty("line.separator"));
			sb.append("  Date: " + date);
			sb.append(System.getProperty("line.separator"));
			sb.append("  Description: " + description);
			sb.append(System.getProperty("line.separator"));
			sb.append("  Amount: $%,6.2f ");
			return sb.toString();
		}

}
