package c231023.main.test.java.com.classJava.borad;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import c231023.main.java.classJava.user.dao.UserDAO;
import c231023.main.java.classJava.user.domain.User;
import c231023.main.java.com.classJava.board.dao.BoardDAO;
import c231023.main.java.com.classJava.board.domain.Board;
import c231023.main.java.com.classJava.board.service.BoardSevice;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/c231023/main/dataSource.xml", "applicationContext.xml"})
public class BoradTest {

	@Autowired
	BoardDAO boardDAO;
	@Autowired
	UserDAO userDAO;
	@Autowired
	BoardSevice boardService;
	
	@Before
	public void initialize() {
		boardDAO.deleteAll();
		User user = userDAO.get("kwj");
		boardService.add(new Board(user, "테스트1", "테스트1 내용"));
		boardService.add(new Board(user, "테스트2", "테스트2 내용"));
		boardService.add(new Board(user, "테스트3", "테스트3 내용"));
	}
	
	@Test
	public void getAll() {
		List<Board> list = boardService.getAll();
		User user = userDAO.get("kwj");
		for (int i = 0; i < list.size(); i++) {
			assertThat(list.get(i).getTitle(), is("테스트"+(i+1)));
			assertThat(list.get(i).getContent(), is("테스트"+(i+1)+" 내용"));
			assertThat(list.get(i).getUser().getId(), is(user.getId()));
			assertThat(list.get(i).getUser().getUserId(), is(user.getUserId()));
			assertThat(list.get(i).getUser().getPassword(), is(user.getPassword()));
		}
	}
	
	@Test
	public void updateAll() {
		User user = userDAO.get("kwj");
		try {
			boardService.updateAll(user);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void updateAllNotTS() {
		User user = userDAO.get("kwj");
		try {
			boardService.updateAllNotTS(user);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
