import java.util.Scanner;

/*
    Srilakshmi, K. (2022). Intermediate Java Programming - ValidatorIO class.
    Created by Srilakshmi Kota
*/
public class ValidatorIO {

	public static int getInt(Scanner sc, String prompt) {

		int input = 0;
		boolean isValid = false;

		while (!isValid) {
			System.out.println(prompt);

			if (sc.hasNextInt()) {
				input = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("\n Error! Invalid Integer value.\n");
			}
			sc.nextLine();
		}

		return input;

	}

	public static double getDouble(Scanner sc, String prompt) {

		double input = 0.00;
		boolean isValid = false;

		while (!isValid) {
			System.out.println(prompt);

			if (sc.hasNextDouble()) {
				input = sc.nextDouble();
				isValid = true;
			} else {
				System.out.println("\n Error! Invalid Double value.\n");
			}
			sc.nextLine();
		}

		return input;

	}
	
	public static String getString(Scanner sc, String prompt) {

		System.out.println(prompt);
		String input = sc.next();

		return input;

	}

}
