package problem1b;
 

public class Book extends LibraryItem {
	int pages;
	
	public Book (String title, String author, int  publicationYear, int pages) {
		super(title, author, publicationYear);
		
		this.pages = pages;
		
		
	}
	
	@Override
	public String receive() {
		return "title - " + title + ", author - " + author + ", publication year = " + publicationYear + ", pages = " + pages;
	}
}

