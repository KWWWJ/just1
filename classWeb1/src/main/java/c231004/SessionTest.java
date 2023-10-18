package c231004;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionTEst
 */
@WebServlet("/SessionTest")
public class SessionTest extends HttpServlet {
       
    /**
	 * 
	 */
	private static final long serialVersionUID = -606927649300003709L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public SessionTest() {
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
		
		HttpSession session = request.getSession();//cookie와 달리 다른 프로그램에서도 사용하기떄문에 Http객체에 존제한다
		//435084DCC1384EE0F8065166F92E160F / 16진수 32글자 - 암호화 방법중 하나를 사용중인 모습이다.
		
//		session.invalidate(); //Session을 즉시 삭제한다.
		
		response.getWriter().println("ID : " + session.getId() + "<br />");
		response.getWriter().println("만들어진 시간(ms) : " + session.getCreationTime() + "<br />");
		response.getWriter().println("유지시간(s) : " + session.getMaxInactiveInterval() + "<br />");
		response.getWriter().println("마지막 접속시간(ms) : " + session.getLastAccessedTime() + "<br />");
		response.getWriter().println("value : " + session.getAttribute("test-session") + "<br />");
		
		session.setMaxInactiveInterval(10);
		
		session.setAttribute("test-session", "추가");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
