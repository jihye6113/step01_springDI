package sample06;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("sample06/springDIList02.xml");
		
		System.out.println("------------------------------");
		
		ListBean listBean = context.getBean("listBean", ListBean.class);
		System.out.println(listBean.getIntList());
		
		System.out.println(listBean.getStrList());
		
		System.out.println(listBean.getCustomerList());
		
	}
}
