package sample03;

public class BookDAOImpl implements BookDAO {

	public BookDAOImpl() {}
	
	@Override
	public void insert(BookVO bookVo) {
		System.out.println("BookDAOImpl insert 호출됨!!");
		System.out.println("과목: " + bookVo.getSubject() );
		System.out.println("작성자: " + bookVo.getWriter() );
		System.out.println("가격: " + bookVo.getPrice() );
		System.out.println("날짜: " + bookVo.getDate() );
		
		System.out.println(bookVo); // 이거는 BookVO 클래스의 toString 오버라이딩한 것을 불러오기 위해서 필요한 부분.
	}
}