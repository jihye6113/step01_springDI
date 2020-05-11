package sample09;

import javax.annotation.Resource;

public class ResourceBean {

	@Resource(name="empDTO")
	private EmpDTO dto1;
	
	@Resource(name="dto2")
	private EmpDTO dto2;
	
	@Resource(name="service")
	private EmpService service;
	
	@Resource(name="controller")
	private EmpController empController;
	
	public void test() {
		System.out.println("dto1 = " + dto1);
		System.out.println("dto2 = " + dto2);
		System.out.println("service = " + service);
		System.out.println("controller = " + empController);
	}
}
