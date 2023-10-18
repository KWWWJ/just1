package ServletTest;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Second extends HttpServlet{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -1391251745977488243L;

	@Override
	public void init() throws ServletException{
		
	}
	
	@Override
	public void destroy() {
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, 
							HttpServletResponse res) 
							throws ServletException, IOException{//request, response
		System.out.println("응답성공");
	}
}
