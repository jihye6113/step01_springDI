package sample05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public MainApp() {}
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("sample05/springDISetter.xml");
		
		OrderMessageImpl message = context.getBean("orderMessage", OrderMessageImpl.class);
		
		message.getOrder_Message();
	}

}
