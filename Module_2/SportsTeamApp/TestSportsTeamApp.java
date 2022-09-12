import java.util.Scanner;

/*
    Srilakshmi, K. (2022). Intermediate Java Programming - Test Sports team App.
    Created by Srilakshmi Kota
*/
public class TestSportsTeamApp {

	public static void main(String[] args) {

		System.out.println("  Welcome to the Sports  Team Ap \n\n");
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("  Enter a team name: ");
			String teamName = sc.next();
			Team team1 = new Team(teamName);

			System.out.println("\n  Enter the player names: \n     hint: use commas for multiple players; no spaces>: ");
			String players = sc.next();
			if (players.contains(",")) {
				String[] playerNames = players.split(",");
				for (int i = 0; i < playerNames.length; i++) {
					team1.addPlayer(playerNames[i]);
				}

			} else {
				team1.addPlayer(players);
			}

			System.out.println("\n\n  --Team Summary--");
			System.out.println("  Number of players in team: " + team1.getPlayerCount());
			
			String playerNamesString = "";
			for (String player : team1.getPlayers()) {
				if(player != null) {
					playerNamesString = playerNamesString + player + ",";
				}				
			}

			System.out.println("  Players on team: " + playerNamesString);
			System.out.println("\n\n  Continue? y/n: ");

		} while (sc.next().equalsIgnoreCase("y"));
		
		System.exit(0);

	}
}
