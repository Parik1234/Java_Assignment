package Lab4.ex2;

public class CD {
	private String artist, CDgenre;
	public CD(int idNum, String title, int numCopies, int runtime, String artist, String CDgenre) {
		super(idNum, title, numCopies, runtime);
		this.artist = artist;
		this.CDgenre = CDgenre;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getCDgenre() {
		return CDgenre;
	}

	public void setCDgenre(String cDgenre) {
		CDgenre = cDgenre;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Artist: " + artist);
		System.out.println("Genre: " + CDgenre);
	}
}
