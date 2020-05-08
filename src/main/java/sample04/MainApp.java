package sample04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("sample04/springDISetter.xml");

		
		System.out.println("---------------------");
		StudentController con = context.getBean("controller", StudentController.class);
		con.insert();
	}

}
