package ServletTest;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// HttpServlet extends GenericServlet : Http 기능을 가지는 클래스
// GenericServlet implements Servlet, ServletConfig: 공통된 서블릿
// Servlet : 서블릿 기번 매서드를 포함한다.
// ServletConfig : 기본 가능을 포함한다.

public class FitstServ extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2840798449349119083L;

	@Override
	public void init() throws ServletException{
		System.out.println("요청 받아서 컨테이너 세팅");
	}
	
	@Override
	public void destroy() {
		System.out.println("컨테이너 종료시 삭제");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, 
							HttpServletResponse res) 
							throws ServletException, IOException{//request, response
		System.out.println("Get받았음");
	}
}
