package problem1b;
import java.util.*;


public class Test {

	public static void main(String[] args) {
		Vector<LibraryItem> item = new Vector<>();
		
		item.add(new Book("The Catcher in the Rye", "J. D. Salinger", 1951, 250));
		item.add(new Book("Theatre", "Somerset Maugham", 1937, 431));
		
		
		for (LibraryItem Book : item ) {
			System.out.println(Book.receive());
		}

	}

}
