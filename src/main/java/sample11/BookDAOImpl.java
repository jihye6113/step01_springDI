package sample11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookDAOImpl implements BookDAO {

	@Autowired
	private DbUtil dbutil;
	
	public BookDAOImpl() {}
	
	@Override
	public void save(EmailSender emailSender, MessageSender messageSender, BookDTO bookDTO1, BookDTO bookDTO2) {
		System.out.println("emailSender: " + emailSender);
		System.out.println("messageSender" + messageSender);
		System.out.println("bookDTO1: " + bookDTO1);
		System.out.println("bookDTO2: " + bookDTO2);
	}

}
