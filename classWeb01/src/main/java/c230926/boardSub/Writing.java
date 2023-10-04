package c230926.boardSub;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import c230926.board.BoardDAO;
import c230926.board.BoardVO;

/**
 * Servlet implementation class Writing
 */
@WebServlet("/writing")
public class Writing extends HttpServlet {

       
    /**
	 * 
	 */
	private static final long serialVersionUID = 7579858135188396275L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public Writing() {
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
		BoardDAO dao = new BoardDAO();
		List<BoardVO> list = dao.getList();
		System.out.println(list.size());
		String html = "<html>";
		html += "<head>";
		html += "<meta charset='UTF-8' />";
		html += "<title>";
		html += "글작성";
		html += "</title>";
		html += "<body>";
		html += "<form action='board' method='post'>";
		html += "<input type='text' name='name' placeholder='Name' />";
		html += "<h3>Title</h3>";
		html += "<textarea row='10' name='title'></textarea>";
		html += "<br>";
		html += "<br>";
		html += "<h3>Contnt</h3>";
		html += "<textarea row='10' name='content'></textarea>";
		html += "<input type='button' id='btnAdd' value='확인'></button>";
		html += "</form>";
		html += "</body>";
		html += "</head>";
		html += "</html>";
		response.setCharacterEncoding("UTF-8");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
	    String title = request.getParameter("title");
	    String content = request.getParameter("content");
	    String context = request.getContextPath();
	    
	    BoardDAO temp = new BoardDAO();
	    
	    temp.setContent(name, title, content);
	    
	    response.sendRedirect(context + "/board");
	    

	}

}