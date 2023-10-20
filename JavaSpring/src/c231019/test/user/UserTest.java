package c231019.test.user;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import c231019.user.UserBean;
import c231019.user.UserDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"applicationContext.xml"}) // 같은 패키지면 이름만 불러오고 아ㅏ니라면 패키지 명을 앞에 붙여준다
public class UserTest {
	@Autowired UserDAO dao;
	@Autowired UserTestDAO testDao;
	private UserBean user1 = new UserBean();
	@Before 
	public void initialize() {

		try {

			testDao.upgradeDrop();
			testDao.create();
			System.out.println("user 테이블 생성 성공");
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

		user1.setName("권원준");
		user1.setUserId("kwj");
		user1.setPassword("qwer");
		dao.add(user1);

	}
	
//	@After
	public void dropTable() {

		testDao.upgradeDrop();
		System.out.println("user 테이블 삭제 성공");

	}

	@Test
	public void add() {

		UserBean user = new UserBean();
		user.setName("권원우");
		user.setUserId("kww");
		user.setPassword("qwer");
		dao.add(user);
		System.out.println("추가 성공 addAndGet");

	}

	@Test
	public void get() {

		UserBean createdUser = dao.get(user1.getUserId());
		assertThat(createdUser.getName(), is(user1.getName()));
		assertThat(createdUser.getUserId(), is(user1.getUserId()));
		assertThat(createdUser.getPassword(), is(user1.getPassword()));

	}

	@Test
	public void dropAndCreate() {

		UserBean user = new UserBean();
		user.setName("아무개");
		user.setUserId("amg");
		user.setPassword("qwer");
		dao.add(user);
		System.out.println("추가 성공 addAndGet");

		UserBean createdUser = dao.get(user.getUserId());
		assertThat(createdUser.getName(), is(user.getName()));
		assertThat(createdUser.getUserId(), is(user.getUserId()));
		assertThat(createdUser.getPassword(), is(user.getPassword()));

	}
	
	@Test(expected=DuplicateKeyException.class)
	public void duplicate() {
		
		UserBean user2 = new UserBean();
		user2.setName("asdf");
		user2.setUserId("asdf");
		user2.setPassword("adsf");
		dao.add(user2);
		
		UserBean user3 = new UserBean();
		user3.setName("asdf");
		user3.setUserId("asdf");
		user3.setPassword("asdf");
		dao.add(user3);
		
	}

}
