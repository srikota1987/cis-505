/*
    Srilakshmi, K. (2022). Intermediate Java Programming - Team class that determines the Team properties and functionalities.
    Created by Srilakshmi Kota
*/ 
public class Team {
	
	private String teamName = "";
	private String[] players = new String[20];
	private int playerCount = 0;
	
	// Arguments Constructor with Team name
	public Team(String teamName) {
		this.teamName = teamName;
	}
	
	// Default Constructor
	public Team() {
	}

	public void addPlayer(String player) {
		players[playerCount] = player;
		playerCount++;
	}

	public String getTeamName() {
		return teamName;
	}

	public String[] getPlayers() {
		return players;
	}

	public int getPlayerCount() {
		return playerCount;
	}

}
