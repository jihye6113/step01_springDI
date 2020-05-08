package sample04;

public class StudentController {
	private StudentService studentService;
	private Student student;
	
	public StudentController() {
		System.out.println("StudentController 생성자 call");
	}
	
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
		System.out.println("setStudentService(StudentService studentService) call = " + studentService);
	}



	public void setStudent(Student student) {
		this.student = student;
		System.out.println("setStudent(Student student) call = " + student);
	}



	public void insert() {
		// 서비스의 insert 호출한다.
		studentService.serviceInsert(student);
	}
}
