package sample01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// 1. 기존 방식으로 호출

		 // MessageBean bean = new MessageBeanEnImpl(); 
		 // bean.sayHello("jihye");
		 //
		 //System.out.println("------------------");
		 //
		 //bean = new MessageBeanKoImpl(); bean.sayHello("지혜");
		 
		
		//////////////////////////////////////////////////////////
		
		/*
		 * SpringContainer를 이용하여 객체 lifecycle 관리
		 * (xml 문서 필요(@annotation 변경) - Configuration MetaData
		 * 
		 * - SpringContainer의 종류
		 * 1. BeanFactory: 기본 객체의 생성과 소멸 관리
		 * 
		 * 2. ApplicationContext: BeanFactory의 확장개념
		 * 						  다국어 지원, 메세지 처리, ... 등의 부가기능 제공
		 * 
		 * 				특징: 객체를 사전 초기화(미리 생성 - scope="singleton"
		 * 					  scope="prototype"으로 설정하면 지연 초기화
		 * 					  즉, getBean()할때마다 새로운 객체를 생성한다.
		 * */
		ApplicationContext context = new ClassPathXmlApplicationContext("sample01/applicationContext.xml");
		System.out.println("---------");
		
		
//		MessageBean bean = context.getBean("ko", MessageBean.class);
//		bean.sayHello("지혜");
//		
//		System.out.println("------------------------");
//		
//		bean = context.getBean("en", MessageBean.class);
//		bean.sayHello("jihye");

		MessageBean bean1 = context.getBean("ko", MessageBean.class);
		MessageBean bean2 = context.getBean("en", MessageBean.class);
		System.out.println("********************************");
		MessageBean bean3 = context.getBean("en2", MessageBean.class);
		MessageBean bean4 = context.getBean("en2", MessageBean.class);
		
		System.out.println("bean1 = " + bean1);
		System.out.println("bean2 = " + bean2);
		System.out.println("bean3 = " + bean3);
		System.out.println("bean4 = " + bean4);
	}

}
