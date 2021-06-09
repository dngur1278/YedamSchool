package exam05;

public class BookServiceFindAll implements BookService{

	@Override
	public void execute(BookList books) {
		for (Book b :books.books) {
			System.out.println(b);
		}
	}
	
}
