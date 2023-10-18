package TestBeanJspServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class trancefer
 */
@WebServlet("/trancefer")
public class trancefer extends HttpServlet {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 5440725838500269066L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public trancefer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		
//		String title = "Reading Three Request Parameters";
//		String docType = "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n";
//		
//		out.println(docType + 
//	            "<HTML>\n" +
//	            "<HEAD><TITLE>" + title + "</TITLE></HEAD>\n" +
//	            "<BODY BGCOLOR=\"#FDF5E6\">\n" +  
//	            "<H1 ALIGN=\"CENTER\">" + title + "</H1>\n" + 
//	            "<UL>\n" + 
//	            "<LI><B>param1</B>: " + request.getParameter("param1") + "\n" +
//	            "<LI><B>param2</B>: " + request.getParameter("param2") + "\n" +
//	            "<LI><B>param3</B>: " + request.getParameter("param3") + "\n" +
//	            "</UL>\n" +
//	            "</BODY></HTML>");
	        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");

        String param = request.getParameter("param"); // 받아온 Parameter를 변수 param에 저장한다.
        String name = request.getParameter("temp1");
        
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD><TITLE>FORM</TITLE></HEAD>");
        out.println("<BODY>");
        out.println("Parameter =  " + param);
        out.println("name = " + name);
        out.println("</BODY>");
        out.println("<HTML>");
        out.close();
	}

}
