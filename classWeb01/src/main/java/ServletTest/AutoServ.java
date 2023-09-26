package ServletTest;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
//import javax.servlet.Config;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/auto")
public class AutoServ extends HttpServlet {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1589902927622592786L;

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
		System.out.println("Get받았음 auto");
	}
}
