package exam5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookServiceInsert implements BookService {

	Scanner scanner = new Scanner(System.in);
		
	public void execute(BookList list) {
		System.out.print("isbn>>");
		String isbn = scanner.next();
		System.out.print("name>>");
		String name = scanner.next();
		System.out.print("content>>");
		String content = scanner.next();
		
		Book book = new Book(isbn, name, content);
		
		if (book.getIsbn().equals(isbn)) {
			return;
		} else {
			list.insert(book);
		}
	}
}
