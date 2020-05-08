package sample02;

public class MemberService {
	
	private MemberDAO memberDao;
	private Member member;
	
	public MemberService() {
		System.out.println("MemberService의 기본 생성자");
	}
	
	public MemberService(MemberDAO dao, Member member) {
		System.out.println("MemberService(MemberDAO dao, Member member) 생성자 call");
		this.memberDao = dao;
		this.member = member;
	}
	
	public void insert() {
		// dao의 insert를 호출한다.
		memberDao.insert(member);
	}
}
