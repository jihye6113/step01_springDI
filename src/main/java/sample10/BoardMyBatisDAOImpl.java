package sample10;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//id=boardMyBatisDAOImpl -> 변경 boardMybatisDao
//@Component("boardMybatisDao") // id=boardMybatisDao
@Repository("boardMybatisDao")
public class BoardMyBatisDAOImpl implements BoardDAO {

	public BoardMyBatisDAOImpl() {}
	
	@Override
	public void select() {
		System.out.println("BoardMyBatisDAOImpl의 select() 호출됨");
	}

}
