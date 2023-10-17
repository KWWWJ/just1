package c231012.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import c231012.factory.DAOFactory;

// user의 DAO를 테스트
public class Test {
	public static void main(String[] args) throws Exception {
		
//		UserDAO dao = new DAOFactory().userDAO(); // 기존에 사용한 DAO
		
		ApplicationContext context = new AnnotationConfigApplicationContext(DAOFactory.class);
		// 프레임워크의 context가 따로 존재하므로, 이를 가져와 설정해줘야 사용할 수 있다.
		// 이 과정에서 필요한 것이 factory의 클래스 자체.
		// beanFactory도 이 안에 저장되어있다.
		UserDAO dao = context.getBean("userDAO", UserDAO.class);
		// UserDAO의 userDAO메서드를 가져오는 것을 해당 ccontext로 처리하여 변환.
		// 이 경우 "userBean" 메서드만 가져오면 어떤 Bean중에서 가져와야할지 정확하지 않으므로, 클래스까지 지정해준 것. 
		
//		UserDAO dao1 = context.getBean("userDAO", UserDAO.class);
//		UserDAO dao2 = context.getBean("userDAO", UserDAO.class);
//		System.out.println(dao1); // 이 둘은 같다.
//		System.out.println(dao2);
//		
//		UserDAO dao3 = new DAOFactory().userDAO();
//		UserDAO dao4 = new DAOFactory().userDAO();
//		System.out.println(dao3); //이 둘은 다르다.
//		System.out.println(dao4);
		
		UserBean user = new UserBean();
		user.setName("dao테스트");
		user.setUserId("amg");
		user.setPassword("qwer");
		dao.add(user); //throws Exception 필요
		
		System.out.println("추가 성공");
		
		UserBean createdUser = dao.get("amg");
		System.out.println(createdUser.getId());
		System.out.println(createdUser.getName());
		System.out.println(createdUser.getUserId());
		System.out.println(createdUser.getPassword());
	}

}
