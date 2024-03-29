package exam05;

import java.util.Scanner;

public class BookApp {
	public static void main(String[] args) {
		BookList books = new BookList();
		books.insert(new Book("1", "자바", "자바를 배우자"));
		books.insert(new Book("2", "JSP", "JSP 기초"));
		books.insert(new Book("3", "JSP응용", "JSP 심화학습"));
		books.insert(new Book("4", "자바웹", "JSP 응용"));
		BookService[] service = { null, new BookServiceInsert(), new BookServiceFind(), 
								new BookServiceFindIsbn(), new BookServiceFindAll() };
		int menu = 0;
		do {
			System.out.println("1.등록   2.내용조회   3.ISBN조회   4.전체조회   0.종료");
			System.out.print("입력>");
			Scanner scanner = new Scanner(System.in);
			menu = scanner.nextInt();
			if (menu == 0)
				break;
			service[menu].execute(books);
		} while (true);
	}
}
