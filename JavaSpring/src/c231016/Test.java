package c231016;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import c231016.factory.DAOFactory;
import c231016.user.UsedSpringUserDAO;
import c231016.user.UserBean;
import c231016.user.UserInterface;

// user의 DAO를 테스트
public class Test {
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new AnnotationConfigApplicationContext(DAOFactory.class);
		UsedSpringUserDAO dao = context.getBean("usedSpringUserDAO", UsedSpringUserDAO.class);

		UserBean user = new UserBean();
		user.setName("권원준");
		user.setUserId("anx");
		user.setPassword("qwer");
		dao.add(user);

		user.setUserId("anx");
		
		UserInterface createdUser = dao.get(user.getUserId());
		System.out.println(createdUser.getId());
		System.out.println(createdUser.getName());
		System.out.println(createdUser.getUserId());
		System.out.println(createdUser.getPassword());
		

		user.setId(createdUser.getId()-1);
		dao.delete(user);
		System.out.println("삭제 성공");
	
		
		


	}

}
