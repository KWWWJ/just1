package c231017.userDAOJUnitTest;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import c231017.user.UserBean;
import c231017.user.UserInterface;
import c231017.factory.DAOFactory;
import c231017.testUser.TestUserDAO;


public class TestUserDAOTest {
	
	private UserInterface user1 = new UserBean();
	private ApplicationContext context = new AnnotationConfigApplicationContext(DAOFactory.class);
	private TestUserDAO dao = context.getBean("testUserDAO", TestUserDAO.class); // 얘 기능 나눠서 그때그떄 생성해도 상관 없다.
																				 // 일할떄는 두가지로 나눠 테스트용과 배포용을 만들어 배포에는 테이블 삭제 및 생성 기능을 제외한다.
	@Before // test하기 전에 실행한다.
	public void initialize() throws SQLException{
		
		dao.create();
		System.out.println("user 테이블 생성 성공");
		
		user1.setName("권원준");
		user1.setUserId("dnx2");
		user1.setPassword("qwer");
		dao.add(user1);
		
	}
	
	@After
	public void dropTable() throws SQLException {

		dao.upgradeDrop();
		System.out.println("user 테이블 삭제 성공");
	
	}
	
	@Test
	public void add() throws SQLException {
		
		UserBean user = new UserBean();
		user.setName("권원준");
		user.setUserId("dnx5");
		user.setPassword("qwer");
		dao.add(user);
		System.out.println("추가 성공 addAndGet");
		
	}
	
	@Test
	public void get() throws SQLException{
		
		UserInterface createdUser = dao.get(user1.getUserId());
		assertThat(createdUser.getName(), is(user1.getName()));
		assertThat(createdUser.getUserId(), is(user1.getUserId()));
		assertThat(createdUser.getPassword(), is(user1.getPassword()));
		
	}
	
	@Test
	public void dropAndCreate() throws SQLException{
		
		UserBean user = new UserBean();
		user.setName("권원준");
		user.setUserId("dnx4");
		user.setPassword("qwer");
		dao.add(user);
		System.out.println("추가 성공 addAndGet");
		
		UserInterface createdUser = dao.get(user.getUserId());
		assertThat(createdUser.getName(), is(user.getName()));
		assertThat(createdUser.getUserId(), is(user.getUserId()));
		assertThat(createdUser.getPassword(), is(user.getPassword()));
	}

}
