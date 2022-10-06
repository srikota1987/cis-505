import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/*
    Srilakshmi, K. (2022). Intermediate Java Programming - Test Composer App.
    Created by Srilakshmi Kota
*/
public class TestComposerApp {

	public static void main(String[] args) {

		System.out.println("  Welcome to the Composer App");
		Scanner sc = new Scanner(System.in);
		MemComposerDao memComposerDao =new MemComposerDao();
		String input = null;

		do {

			System.out.println(menu());
			input = sc.next();

			if ("1".equals(input)) {
				displayComposers(memComposerDao);
			} else if ("2".equals(input)) {
				System.out.println("   Enter an id: ");
				int id = Integer.parseInt(sc.next());
				Composer composer = memComposerDao.findBy(id);
				if(composer != null) {
					System.out.println("\n\n  --DISPLAYING COMPOSER--");
					System.out.println(composer.toString());
				}

			} else if("3".equals(input)) {
				System.out.println("\n\n   Enter an id:");
				int id = Integer.parseInt(sc.next());
				System.out.println("\n\n   Enter a name:");
				String name = sc.next();
				System.out.println("\n\n   Enter a genre:");
				String genre = sc.next();
				Composer composer = new Composer(id, name, genre);
				memComposerDao.insert(composer);			
			} else {
				System.exit(0);
			} 
		
		} while (!input.equals("4"));

		displayComposers(memComposerDao);
		
		System.exit(0);

	}

	public static String menu() {
		StringBuffer menu = new StringBuffer();
		menu.append("\n\n  MENU OPTIONS \n");
		menu.append("     1. View Composers \n");
		menu.append("     2. Find Composer \n");
		menu.append("     3. Add Composer \n");
		menu.append("     4. Exit \n");
		menu.append("   Please choose an option: ");
		return menu.toString();
	}

	public static void displayComposers(MemComposerDao memComposerDao) {
		List<Composer> composers = new ArrayList<>();
		try {
			composers = memComposerDao.findAll();
		} catch (Exception e) {
			System.out.println("\n Exceptions:  " + e.getMessage());
		}

		System.out.println("\n  DISPLAYING COMPOSERS");
		if (!composers.isEmpty()) {
			for (Composer composer : composers) {
				System.out.printf(composer.toString() + "\n\n");
			}
		}
	}

}
