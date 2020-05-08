package sample03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public MainApp() {}
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("sample03/springDIConstructor.xml");
		
		BookController controller = context.getBean("controller", BookController.class);
		
		controller.bookInsert();

	}

}
