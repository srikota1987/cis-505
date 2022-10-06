/*
    Srilakshmi, K. (2022). Intermediate Java Programming - Composer class.
    Created by Srilakshmi Kota
*/
public class Composer {

	private int id;
	private String name = "";
	private String genre = "";

	// Default Constructor
	public Composer() {
	}

	public Composer(int id, String name, String genre) {
		this.id = id;
		this.name = name;
		this.genre = genre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	// Overriding toString() method
	public String toString() {

		StringBuffer sb = new StringBuffer();
		sb.append(System.getProperty("line.separator"));
		sb.append("  Id: " + id);
		sb.append(System.getProperty("line.separator"));
		sb.append("  Name: " + name);
		sb.append(System.getProperty("line.separator"));
		sb.append("  Genre: " + genre);
		return sb.toString();
	}

}
