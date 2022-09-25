import java.text.SimpleDateFormat;
import java.util.Date;

/*
    Srilakshmi, K. (2022). Intermediate Java Programming - Product class that represents product in a bowling shop.
    Created by Srilakshmi Kota
*/
public class Product {

	private String code = "";
	private String description = "";
	private double price = 0.00;

	// Default Product
	public Product() {
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	// Overriding toString() method
		public String toString() {

			StringBuffer sb = new StringBuffer();
			sb.append("  Product code: " + code);
			sb.append(System.getProperty("line.separator"));
			sb.append("  Description: " + description);
			sb.append(System.getProperty("line.separator"));
			sb.append("  Price: $%,6.2f ");
			return sb.toString();
		}

}
