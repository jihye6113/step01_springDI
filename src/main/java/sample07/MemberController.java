package sample07;

public class MemberController {
	private Member member;
	private Member member2;
	
	public MemberController() {
		System.out.println("MemberController의 기본 생성자");
	}
	
	public MemberController(Member member) {
		this.member = member;
		System.out.println("MemberController(Member member) 생성자 호출: member = " + member);
	}
	
	public MemberController(Member member, Member member2) {
		this.member = member;
		this.member2 = member2;
		System.out.println("MemberController(this.member = member, Member member2) 생성자 호출");
		System.out.println("member: " + member);
		System.out.println("member2: " + member2);
	}
	
	public void setMember(Member member) {
		this.member = member;
		System.out.println("setMember(Member member) 호출: member = " + member);
	}
	
	public void setMember2(Member member2) {
		this.member2 = member2;
		System.out.println("setMember2(Member member2) 호출: member2 = " + member2);
	}
}
