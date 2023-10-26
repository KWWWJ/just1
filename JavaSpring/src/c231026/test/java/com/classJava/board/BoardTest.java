package c231026.test.java.com.classJava.board;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import c231024.main.java.com.classJava.board.dao.BoardDAO;
import c231024.main.java.com.classJava.board.domain.Board;
import c231024.main.java.com.classJava.board.service.BoardService;
import c231024.main.java.com.classJava.user.dao.UserDAO;
import c231024.main.java.com.classJava.user.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration // 이래 해두면 이름 맞춰주면 알아서 가져온다. dataSource를 가져오지 못하니 같이 넣어줘야 함.
public class BoardTest {
	@Autowired
	BoardDAO boardDAO; // 항상 같은데이터로 테스트 하기 위해 initialize에서 초기화를 위해 사용하는 것. 서비스 테스트에는 필요가 없다.
	@Autowired
	UserDAO userDAO;
	@Autowired
//	ApplicationContext context;
	BoardService boardService;
	@Before
	public void initialize() throws BeansException, Exception {
//		BoardService boardService = (BoardService) context.getBean("&boardService", ProxyFactoryBean.class).getObject(); // &를 넣으면 xml파일에서 설정한 것을 가져올 수 있다. 뒤엥는 클래스는 타입
		
		boardDAO.deleteAll();
		User user = userDAO.get("kwj");
		boardService.add(new Board(user, "테스트1", "테스트1 내용"));
		boardService.add(new Board(user, "테스트2", "테스트2 내용"));
		boardService.add(new Board(user, "테스트3", "테스트3 내용"));                                                             																							
	}

//	@Test
//	public void test() {
//		boardDAO.get(1);
//	}

	@Test
	public void updateAll() throws BeansException, Exception {
//		BoardService boardService = (BoardService) 
//				context.getBean(
//						"&boardService",
//						ProxyFactoryBean.class)
//				.getObject();	
		User user = userDAO.get("kwj");
//		txBoardService.updateAll(user);
		try {
			boardService.updateAll(user);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
