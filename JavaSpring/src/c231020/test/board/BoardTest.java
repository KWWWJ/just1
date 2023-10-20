package c231020.test.board;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import c231019.user.UserBean;
import c231019.user.UserDAO;
import c231020.board.BoardBean;
import c231020.board.BoardDAO;
import c231020.board.BoardService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/c231020/dataSource.xml", "applicationContext.xml"})
public class BoardTest {
	@Autowired
	BoardDAO boardDAO;
	@Autowired
	BoardService boardService;
	@Autowired
	BoardTestDAO boardTestDAO;
	@Autowired
	UserDAO userDAO;
	
	
	@Before
	public void initialize() {
		boardTestDAO.upgradeDrop();
		System.out.println("boards 테이블 삭제");
		boardTestDAO.create();
		BoardBean board = new BoardBean();
		System.out.println("boards 테이블 생성");
		board.setTitle("확인중1");
		board.setUserId(1);
		board.setContent("확인중인 내용1");
		boardDAO.add(board);
		System.out.println("확인중 1");
		board.setTitle("확인중2");
		board.setUserId(1);
		board.setContent("확인중인 내용2");
		boardDAO.add(board);
		System.out.println("확인중 2");
		board.setTitle("확인중3");
		board.setUserId(1);
		board.setContent("확인중인 내용3");
		boardDAO.add(board);
		System.out.println("확인중 3");
	}
	
	@Test
	public void add() {
		BoardBean board = new BoardBean();
		board.setTitle("확인중");
		board.setUserId(1);
		board.setContent("확인중인 내용");
		boardDAO.add(board);
		System.out.println("확인중");
	}
	
	@Test
	public void get() {
		BoardBean board = boardDAO.get(1);
		assertThat(board.getTitle(), is("확인중1"));
		assertThat(board.getUserId(), is(1));
		assertThat(board.getContent(), is("확인중인 내용1"));
		System.out.println("확인중1에 대한 equle확인");
	}
	
	@Test
	public void getAll() {
		BoardBean board = null;
		List<BoardBean> all = boardDAO.getAll();
		for(int i=0; i<all.size(); i++) {
			board = boardDAO.get(i+1);
			assertThat(all.get(i).getTitle(), is(board.getTitle()));
			assertThat(all.get(i).getUserId(), is(board.getUserId()));
			assertThat(all.get(i).getContent(), is(board.getContent()));
			System.out.println((i+1)+"번째 데이터에 대한 equle확인");
		}
	}

	@Test
	public void addInService() {
		UserBean user = userDAO.get(2);
		BoardBean board = new BoardBean();
		board.setTitle("서비스 확인");
		board.setContent("서비스 내용 확인");
		boardService.add(board, user);
		
	}
	
	@Test
	public void getInService() {
		UserBean user = userDAO.get(1);
		BoardBean board = boardService.get(1);
		assertThat(board.getTitle(), is("확인중1"));
		assertThat(board.getUserId(), is(1));
		assertThat(board.getContent(), is("확인중인 내용1"));
		assertThat(board.getUser().getName(), is(user.getName()));
		assertThat(board.getUser().getUserId(), is(user.getUserId()));
		assertThat(board.getUser().getPassword(), is(user.getPassword()));
	}
	
}
