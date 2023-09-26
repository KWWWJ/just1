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
 * Servlet implementation class Content
 */
@WebServlet("/content")
public class Content extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Content() {
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
		html += "내용";
		html += "</title>";
		html += "<body>";

			html += list.get(1).getcontent();

		
		html += "</body>";
		html += "</head>";
		html += "</html>";
		response.setCharacterEncoding("UTF-8");
		response.getWriter().append(html);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
