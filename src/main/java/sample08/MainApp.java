package sample08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public MainApp() {
		System.out.println("MainApp 기본 생성자");
	}
	
	public static void main(String[] args) {
		//기존방법
//		BookDTO bookDTO1 = new BookDTO();
//	    BookDTO bookDTO2 = new BookDTO();
//	    
//	    DbUtil dbUtil = new DbUtil();
//	    BookDAO bookDao = new BookDAOImpl(dbUtil);
//	    BookService service = new BookServiceImpl(bookDao);
//	    
//	    BookServiceImpl serviceImp = (BookServiceImpl)service ; 
//	    serviceImp.setEmailSender(new EmailSender());
//	    serviceImp.setMessageSender(new MessageSender());
//	
//	    BookController controller = 
//				new BookController(bookDTO1, bookDTO2, service);
//	    
//	    controller.invoker();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("sample08/springDIAutowire.xml");
		
		BookController bookController = context.getBean("controller", BookController.class);
		
		bookController.invoker();
	}
}
