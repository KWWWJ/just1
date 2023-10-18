package c231004;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class FliterTest
 */
@WebFilter("/*")
public class FilterTest extends HttpFilter implements Filter {
       
    /**
	 * 
	 */
	private static final long serialVersionUID = -3992837719049433078L;

	/**
     * @see HttpFilter#HttpFilter()
     */
    public FilterTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		HttpSession session = ((HttpServletRequest)request).getSession(); //매개변수 request가 Http가 아닌 그냥 ServletRequest로 되어있기에 형변환이 필요하다.
		
		session.setAttribute("testing", "If this Fliter has effected on SetCookieTest, you can show this write(한글 테스트)");
		request.setAttribute("UserID", "****");
		response.setContentType("text/html;charset=utf-8"); // 일단 얘는 가능함
		response.getWriter().print(
				"<html>"
				+ "<head>"
				+ "<meta charset='utf-8' />"
				+ "</head>"
				+ "<body>"
				+ "<h1>"); //여기 utf-8은 아직 작동 안함
		chain.doFilter(request, response);
		response.getWriter().print(
				"</h1>"
				+ "</body>"
				+ "</html>");
		
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
