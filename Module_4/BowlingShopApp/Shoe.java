/*
    Srilakshmi, K. (2022). Intermediate Java Programming - Shoe class that represents Bowling Shoe in a bowling shop.
    Created by Srilakshmi Kota
*/

public class Shoe extends Product {
	
	private double size = 0.0;

	// Default Constructor
	public Shoe() {
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}
	
	// Overriding toString() method
		public String toString() {

			StringBuffer sb = new StringBuffer(super.toString());
			sb.append(System.getProperty("line.separator"));
			sb.append("  Size: " + size);
			return sb.toString();

		}

}
