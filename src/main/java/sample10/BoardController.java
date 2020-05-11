package sample10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

//@Component("controller") // 생성과 id="controller"로 변경
@Controller("controller")
public class BoardController {
	@Autowired // byType (BoardService 타입은 하나만 있어서 이름이 같지 않아도 무방)
	private BoardService boardService;
	
	@Autowired
	private BoardDTO boardDto;
	
	@Autowired
	private BoardDTO boardDto2;
	
	public BoardController() {}
	
	public void test() {
		System.out.println("BoardController의 test() 호출됨");
		System.out.println("boardDto: " + boardDto);
		System.out.println("boardDto2: " + boardDto2);
		boardService.select();
	}
}
