package exam05;

import java.util.List;
import java.util.Scanner;

public class BookServiceFind implements BookService {
	Scanner scanner = new Scanner(System.in);

	public void execute(BookList books) {
		System.out.print("제목>>");
		String name = scanner.next();

		List<Book> list1 = books.findName(name);

		for (Book i : list1) {
			System.out.println(i);
		}
	}
}
