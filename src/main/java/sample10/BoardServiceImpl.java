package sample10;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component // id=boardServiceImpl
@Service
public class BoardServiceImpl implements BoardService {

	@Resource(name = "boardDAOImpl")
	private BoardDAO boardDao;
	
	@Autowired // 이름과 id가 같아서 resource로 하지 않고, autowired가 가능
	private BoardDAO boardMybatisDao;
	
	@Override
	public void select() {
		System.out.println("BoardServiceImpl의 select 호출됨");
		
		boardDao.select();
		boardMybatisDao.select();
	}

}
