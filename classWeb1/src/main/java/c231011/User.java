package c231011;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class User
 */
@WebServlet("/user")
public class User extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public User() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// TODO Auto-generated method stub
		ConnectionMaker maker = new OracleConnectionMaker();
		
		UserDAO dao = new UserDAO(maker);
		
		UserBean user = new UserBean();
		
		user.setName("아무개");
		user.setUserId("5번쨰 시도");
		user.setPassword("성공했나?");
		try {
			dao.add(user);
			System.out.println("insert 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		UserBean createdUser;
		try {
			createdUser = dao.get("5번쨰 시도");
			System.out.println(createdUser.getId());
			System.out.println(createdUser.getName());
			System.out.println(createdUser.getUserId());
			System.out.println(createdUser.getPassword());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
