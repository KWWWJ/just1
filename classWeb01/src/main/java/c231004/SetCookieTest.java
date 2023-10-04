package c231004;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SetCookieTest
 */
@WebServlet("/SetCookieTest")
public class SetCookieTest extends HttpServlet {

       
    /**
	 * 
	 */
	private static final long serialVersionUID = 2856446200518927756L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public SetCookieTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html;charset=utf-8");
		Cookie cookie = new Cookie("test-cookie", URLEncoder.encode("now testing cookies", "utf-8")); //Cookie에 대한 key와 value삽입
		//                                                   얘 쓰려면 어떤 방식으로 인코딩할 것인지도 정의해줘야함
//		cookie.setMaxAge(10); //Session이 유지되는 기간(10초)
		cookie.setMaxAge(100); //무한유지
		
		HttpSession session = request.getSession();
		
		response.addCookie(cookie);//response에 cookie를 집어넣어야 작동한다.
		response.getWriter().print(session.getAttribute("testing"));
		response.getWriter().println("<br />");
		response.getWriter().print("user id : ");
		response.getWriter().print(request.getAttribute("UserID"));
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
