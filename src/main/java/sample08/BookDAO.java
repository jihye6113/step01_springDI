package sample08;

public interface BookDAO {

	void save(EmailSender emailSender, MessageSender messageSender, BookDTO bookDTO1, BookDTO bookDTO2);
}
