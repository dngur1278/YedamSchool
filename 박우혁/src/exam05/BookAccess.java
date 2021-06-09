package exam05;

import java.util.List;

public abstract class BookAccess {
	// 등록
	public abstract void insert(Book book);
	// 이름으로조회
	public abstract List<Book> findName(String name);
	// ISBN조회
	public abstract Book findIsbn(String isbn);
	// 전체출력
	public abstract List<Book> findAll();
}
