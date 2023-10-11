package c231011;

public class UserDAOTest {
	public static void main(String[] args) throws Exception {
		
		UserDAO dao = new DAOFactory().userDAO();
		
		UserBean user = new UserBean();
		user.setName("권원준");
		user.setUserId("kwj");
		user.setPassword("qwer");
		dao.add(user); //throws Exception 필요
		
		System.out.println("추가 성공");
		
		UserBean createdUser = dao.get("kwj");
		System.out.println(createdUser.getId());
		System.out.println(createdUser.getName());
		System.out.println(createdUser.getUserId());
		System.out.println(createdUser.getPassword());
	}

}
