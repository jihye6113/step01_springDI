package sample09;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EmpController {
	@Autowired // byType --> byName
	@Qualifier("aa")
	private EmpDTO dto;
	
	@Autowired
	private EmpDTO dto2;
	
	@Autowired
	private EmpService service;
	
	public void test() {
		System.out.println("dto: " + dto + " / " + dto.getEmpno());
		System.out.println("dto2: " + dto2 + " / " + dto2.getEmpno());
		
		System.out.println("service: " + service);
	}
}
