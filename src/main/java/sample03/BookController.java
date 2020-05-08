package sample03;

public class BookController {
	private BookVO bookVo;
	private BookDAO bookDao;
	
	public BookController() {}
	
//	public BookController(BookDAO bookDao, BookVO bookVo) {
//		this.bookDao = bookDao;
//		this.bookVo = bookVo;
//	}
	
	public BookController(BookVO bookVo, BookDAO bookDao) {
		this.bookVo = bookVo;
		this.bookDao = bookDao;
		
	}
	
	public void bookInsert() {
		bookDao.insert(bookVo);
	}
}
