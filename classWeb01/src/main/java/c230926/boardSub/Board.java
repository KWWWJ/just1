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
import c230926.student.StudentDAO;
import c230926.student.StudentVO;

/**
 * Servlet implementation class Board
 */
@WebServlet("/board")
public class Board extends HttpServlet {
	
       
    /**
	 * 
	 */
	private static final long serialVersionUID = -8095986030857486895L;

	/**
     * @see HttpServlet#HttpServlet()
     */
    public Board() {
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
		html += "글목록";
		html += "</title>";
		html += "<body>";
		html += "<h3>글 목록</h3>";
		html += "<form action='writing' method='post'>";
		html += "<button>글쓰기</button>";
		html += "</form>";
		html += "<ol>";
		for(int i=0; i<list.size(); i++) {
			html += "<li>";
			html += "<a href='content'>";
			html += list.get(i).getTitle() +"/"+ list.get(i).getCreateAt();
			html += "</a>";
			html += "</li>";
		}
		html += "</ol>";
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
