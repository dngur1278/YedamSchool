package exam5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookServiceFind implements BookService{

	Scanner scanner = new Scanner(System.in);
	
	public void execute(BookList list) {
		System.out.print("제목>>");
		String name = scanner.next();
		
		List<Book> list1 = list.findName(name);
		
		for(Book i : list1) {
			System.out.println(i);
		}
	}
}
