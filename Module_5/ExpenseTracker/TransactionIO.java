import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/*
    Srilakshmi, K. (2022). Intermediate Java Programming - TransactionIO class.
    Created by Srilakshmi Kota
*/
public class TransactionIO {
	
	private static String FILE_NAME = "expenses.txt";
	private static File file = new File(FILE_NAME);
	
	
	public static void bulkInsert(ArrayList<Transaction> transactions) throws IOException {
		
		PrintWriter output = null;
		
		if(file.exists()) {
			output = new PrintWriter(new FileOutputStream(new File(FILE_NAME), true));
			
		} else {
			output = new PrintWriter(FILE_NAME);
		}
		
		for(Transaction transaction: transactions) {
			output.print(transaction.getDate() + " ");
			output.print(transaction.getDescription() + " ");
			output.println(transaction.getAmount());
		}

		output.close();

	}
	
	public static ArrayList<Transaction> findAll() throws IOException {
		
		ArrayList<Transaction> transactions = new ArrayList<>();
		
		if(file.exists()) {
			Scanner input = new Scanner(file);
			while(input.hasNext()) {
				String tran = input.nextLine();
				String[] strings = tran.split(" ");
				Transaction transaction = new Transaction(strings[0], strings[1], Double.parseDouble(strings[2]));
				transactions.add(transaction);
			}
		}
		return transactions;
	}
	
}