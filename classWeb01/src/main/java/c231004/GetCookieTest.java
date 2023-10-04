package c231004;

import java.io.IOException;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetCookieTest
 */
@WebServlet("/GetCookieTest")
public class GetCookieTest extends HttpServlet {
       
    /**
	 * 
	 */
	private static final long serialVersionUID = 8425285778516486100L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public GetCookieTest() {
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
		Cookie[] cookies = request.getCookies(); //cookie는 배열로 쌓이게된다.
		for(int i=0; i<cookies.length; i++) {
			if(cookies[i].getName().equals("test-cookie")) { //만약 쿠키가 없는 상태에서 들어가면 터진다.
				cookies[i].setMaxAge(-1);
				response.getWriter().print(URLDecoder.decode(cookies[i].getValue(), "utf-8"));
				response.addCookie(cookies[i]); //maxAge를 session으로 변경
			}
			
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
