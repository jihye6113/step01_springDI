package sample08;

public class BookServiceImpl implements BookService {

	private BookDAO bookDAO;
	private MessageSender messageSender;
	private EmailSender emailSender;
	
	public BookServiceImpl() {
		System.out.println("BookServiceImpl 기본 생성자");
	}
	
	public BookServiceImpl(BookDAO bookDAO) {
		this.bookDAO = bookDAO;
		System.out.println("BookServiceImpl(BookDAO bookDAO) 생성자");
	}

	public MessageSender getMessageSender() {
		return messageSender;
	}

	public void setMessageSender(MessageSender messageSender) {
		this.messageSender = messageSender;
	}

	public EmailSender getEmailSender() {
		return emailSender;
	}

	public void setEmailSender(EmailSender emailSender) {
		this.emailSender = emailSender;
	}

	@Override
	public void save(BookDTO bookDTO1, BookDTO bookDTO2) {
		bookDAO.save(emailSender, messageSender, bookDTO1, bookDTO2);

	}

}
