
/*
    Srilakshmi, K. (2022). Intermediate Java Programming - CustomerDB class that creates the customer.
    Created by Srilakshmi Kota
*/
public class CustomerDB {

	public static Customer getCustomer(Integer id) {

		if (id != null) {
			if ("1007".equals(id.toString())) {
				return new Customer("Alex Jordan", "Grover Ave", "Buffalo Grove", "60089");
			} else if ("1008".equals(id.toString())) {
				return new Customer("Mary Patterson", "1235 Bellevue Ave", "Wheeling", "75153");
			} else if ("1009".equals(id.toString())) {
				return new Customer("Lina Peter", "1236 Baxter Rd", "Austin", "75758");
			} else {
				return new Customer();
			}

		} else {
			return new Customer();
		}

	}

}
