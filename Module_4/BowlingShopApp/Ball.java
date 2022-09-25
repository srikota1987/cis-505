
/*
    Srilakshmi, K. (2022). Intermediate Java Programming - Bag class that represents Bowling Bag in a bowling shop.
    Created by Srilakshmi Kota
*/
public class Ball extends Product {

	private String color = "";

	// Default Product
	public Ball() {
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// Overriding toString() method
	public String toString() {

		StringBuffer sb = new StringBuffer(super.toString());
		sb.append(System.getProperty("line.separator"));
		sb.append("  Color: " + color);
		return sb.toString();

	}

}
