/*
    Srilakshmi, K. (2022). Intermediate Java Programming - Customer class that determines the Customer properties and functionalities.
    Created by Srilakshmi Kota
*/
public class Customer {

	private String name;
	private String address;
	private String city;
	private String zip;

	// Arguments Constructor
	public Customer(String name, String address, String city, String zip) {
		this.name = name;
		this.address = address;
		this.city = city;
		this.zip = zip;
	}

	// Default Constructor
	public Customer() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	// Overriding toString() method
	public String toString() {

		StringBuffer sb = new StringBuffer();
		sb.append("Name: " + name);
		sb.append(System.getProperty("line.separator"));
		sb.append("Address: " + address);
		sb.append(System.getProperty("line.separator"));
		sb.append("City: " + city);
		sb.append(System.getProperty("line.separator"));
		sb.append("Zip: " + zip);

		return sb.toString();

	}
}
