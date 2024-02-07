package problem1b;

public abstract class LibraryItem {

		String title;
		String author;
		int publicationYear;
		
	
	public LibraryItem(String title, String author, int publicationYear) {
		this.author = author;
		this.publicationYear = publicationYear;
		this.title = title;
	}
	
	public abstract String receive();
}

	
	
	

