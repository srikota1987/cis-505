
/*
    Srilakshmi, K. (2022). Intermediate Java Programming - ProductDB class that creates the products.
    Created by Srilakshmi Kota
*/
public class ProductDB {

	public static GenericQueue<Product> getProducts(String code) {

		if ("b".equalsIgnoreCase(code)) {
			GenericQueue<Product> balls = new GenericQueue<Product>();

			Ball ball1 = createBall("B100", "Black Widow 2.0", 144.95, "Black and Red");
			balls.enqueue(ball1);
			Ball ball2 = createBall("B200", "Axiom Pearl", 154.95, "Blue and Red");
			balls.enqueue(ball2);
			Ball ball3 = createBall("B300", "Proton Physix", 174.95, "Pink and Purple");
			balls.enqueue(ball3);
			Ball ball4 = createBall("B400", "Force Unleashed", 139.99, "Red and White");
			balls.enqueue(ball4);
			Ball ball5 = createBall("B500", "Phaze III", 154.99, "Purple and Green");
			balls.enqueue(ball5);

			return balls;
		} else if ("s".equalsIgnoreCase(code)) {
			GenericQueue<Product> shoes = new GenericQueue<Product>();

			Shoe shoe1 = createShoe("S100", "Men's Ram Black", 39.99, 10.5);
			shoes.enqueue(shoe1);
			Shoe shoe2 = createShoe("S200", "Women's Rise Black/Hot Pink", 39.99, 7.0);
			shoes.enqueue(shoe2);
			Shoe shoe3 = createShoe("S300", "Women's Path Lite Seemless Mesh", 54.99, 6.0);
			shoes.enqueue(shoe3);
			Shoe shoe4 = createShoe("S400", "Men's Tribal White", 26.99, 8.5);
			shoes.enqueue(shoe4);
			Shoe shoe5 = createShoe("S500", "Youth Skull Green/Black", 39.99, 3.0);
			shoes.enqueue(shoe5);

			return shoes;
		} else if ("a".equalsIgnoreCase(code)) {
			GenericQueue<Product> bags = new GenericQueue<Product>();

			Bag bag1 = createBag("A100", "Path Pro Deluxe", 34.99, "Single");
			bags.enqueue(bag1);
			Bag bag2 = createBag("A200", "Prime Roller Black/Royal Blue", 54.99, "Double");
			bags.enqueue(bag2);
			Bag bag3 = createBag("A300", "Silver/Royal Blue", 74.99, "Triple");
			bags.enqueue(bag3);

			return bags;
		} else {
			return new GenericQueue<Product>();
		}

	}

	private static Ball createBall(String code, String description, double price, String color) {
		Ball ball = new Ball();
		ball.setCode(code);
		ball.setDescription(description);
		ball.setPrice(price);
		ball.setColor(color);

		return ball;
	}

	private static Shoe createShoe(String code, String description, double price, double size) {
		Shoe shoe = new Shoe();
		shoe.setCode(code);
		shoe.setDescription(description);
		shoe.setPrice(price);
		shoe.setSize(size);

		return shoe;
	}

	private static Bag createBag(String code, String description, double price, String type) {
		Bag bag = new Bag();
		bag.setCode(code);
		bag.setDescription(description);
		bag.setPrice(price);
		bag.setType(type);

		return bag;
	}

}
