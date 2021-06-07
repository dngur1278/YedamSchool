package exam5;

import java.util.ArrayList;
import java.util.List;

public class BookList extends BookAccess{

	List<Book> books;
	
	public BookList() {
		books = new ArrayList<Book>();
	}
	
	public void insert(Book book) {
		books.add(book);
		
	}

	public List<Book> findName(String name) {
		List<Book> name1 = new ArrayList<Book>();
		for (Book b : books) {
			if(b.getName().contains(name)) {
				name1.add(b);
			}
		}
		return name1;
	}
}
