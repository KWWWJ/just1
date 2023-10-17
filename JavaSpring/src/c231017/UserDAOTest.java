package c231017;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;

import java.sql.SQLException;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import c231017.factory.DAOFactory;
import c231017.user.UsedSpringUserDAO;
import c231017.user.UserBean;
import c231017.user.UserInterface;

public class UserDAOTest {

	public static void main(String[] args) throws Exception {
		addAndGetTest();
	}
		
		private static void addAndGetTest() throws Exception{
			
			ApplicationContext context = new AnnotationConfigApplicationContext(DAOFactory.class);
			UsedSpringUserDAO dao = context.getBean("usedSpringUserDAO", UsedSpringUserDAO.class);

			UserBean user = new UserBean();
			user.setName("권원준");
			user.setUserId("snx");
			user.setPassword("qwer");
			dao.add(user);
			System.out.println("추가 성공 addAndGetTest");
			
			UserInterface createdUser = dao.get("snx");
			System.out.println(createdUser.getId());
			if(!createdUser.getName().equals(user.getName())) {
				System.out.println("이름 문제 발생");
			}
			else if(!createdUser.getUserId().equals(user.getUserId())) {
				System.out.println("아이디 문제 발생");
			}
			else if(!createdUser.getPassword().equals(user.getPassword())) {
				System.out.println("비밀번호 문제 발생");
			}
			else {
				System.out.println("조회 성공");
			}
	
			
		}
		
		@Test //얘는 org.junit에서 가져오기
		public void addAndGet() throws SQLException{ // 얘를 테스트 하려면 클라스를 test에 넣어주면된다.
			
			ApplicationContext context = new AnnotationConfigApplicationContext(DAOFactory.class);
			UsedSpringUserDAO dao = context.getBean("usedSpringUserDAO", UsedSpringUserDAO.class);

			UserBean user = new UserBean();
			user.setName("권원준");
			user.setUserId("dnx");
			user.setPassword("qwer");
			dao.add(user);
			System.out.println("추가 성공 addAndGet");
			
			UserInterface createdUser = dao.get("dnx");
			assertThat(createdUser.getName(), not("권원우"));
			assertThat(createdUser.getUserId(), is(user.getUserId()));
			assertThat(createdUser.getPassword(), is(user.getPassword()));
			
		}
	
}
