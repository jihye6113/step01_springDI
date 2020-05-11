package sample11;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

	@Resource(name = "bookDAOImpl")
	BookDAO bookDAO;
	
	@Autowired
	EmailSender emailSender;
	
	@Autowired
	MessageSender messageSender;
	
	@Override
	public void save(BookDTO bookDTO1, BookDTO bookDTO2) {
		bookDAO.save(emailSender, messageSender, bookDTO1, bookDTO2);
	}

}
