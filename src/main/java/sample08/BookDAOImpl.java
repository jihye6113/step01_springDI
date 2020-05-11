package sample08;

// xml에서 생성 <bean class="" autowire="constructor"/>
public class BookDAOImpl implements BookDAO {

	DbUtil dbUtil;
	
	public BookDAOImpl() {
		System.out.println("BookDAOImpl 기본 생성자");
	}

	
	public BookDAOImpl(DbUtil dbUtil) {
		super();
		this.dbUtil = dbUtil;
	}

	@Override
	public void save(EmailSender emailSender, MessageSender messageSender, BookDTO bookDTO1, BookDTO bookDTO2) {
		System.out.println("emailSender: " + emailSender);
		System.out.println("messageSender: " + messageSender);
		System.out.println("book1: " + bookDTO1);
		System.out.println("book2: " + bookDTO2);
		System.out.println("dbUtil: " + dbUtil);
	}

}
