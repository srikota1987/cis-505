
/*
    Srilakshmi, K. (2022). Intermediate Java Programming - Bag class that represents Bowling Bag in a bowling shop.
    Created by Srilakshmi Kota
*/
public class Bag extends Product {

	private String type = "";

	// Default Constructor
	public Bag() {
	}

	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	// Overriding toString() method
	public String toString() {

		StringBuffer sb = new StringBuffer(super.toString());
		sb.append(System.getProperty("line.separator"));
		sb.append("  Type: " + type);
		return sb.toString();

	}

}
