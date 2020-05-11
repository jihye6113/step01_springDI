package sample10;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component // <bean class="BoardDAOImpl">를 대신하는 어노테이션. id="boardDAOImpl" (클래스 이름을 따라오되, 첫 글자는 소문자)
@Repository
public class BoardDAOImpl implements BoardDAO {

	public BoardDAOImpl() {}
	
	@Override
	public void select() {
		System.out.println("BoardDAOImpl의 select() 호출됨");
	}

}
