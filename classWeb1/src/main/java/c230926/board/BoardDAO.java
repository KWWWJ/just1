package c230926.board;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BoardDAO {
	private Connection con;

	public List<BoardVO> getList() {
		List<BoardVO> list = new ArrayList<>();
		
		try {
			connect();
			
			String query = "select * from board order by id";
			PreparedStatement stmt = con.prepareStatement(query);  //요청애 대한 상태를 피드백한다.(요청을 받았는지, 기다리고있는지 등)
			ResultSet rs = stmt.executeQuery(query); //query를 실행하고 resultSet로 반환하라.(데이터를 stream으로 주고 받는다)
			while(rs.next()) {
				BoardVO temp = new BoardVO(
						rs.getInt("id"),
						rs.getString("name"),
						rs.getString("title"),
						rs.getString("content"),
						rs.getString("create_at")
						);
				list.add(temp);
			}
			rs.close();
			stmt.close();
//			con.close();
		
		} catch (Exception e) {
			
			e.printStackTrace();
		
		}
		
		return list;
	}
	
	public BoardVO getBoard(String list) {
		BoardVO temp = null;
		try {
			connect();
			
			String query = "select * from student where student_id=?";
			PreparedStatement pstmt = con.prepareStatement(query);  //요청애 대한 상태를 피드백한다.(요청을 받았는지, 기다리고있는지 등)
			pstmt.setString(1, list);
			ResultSet rs = pstmt.executeQuery(); //query를 실행하고 resultSet로 반환하라.(데이터를 stream으로 주고 받는다)
			if(rs.next()) {
//				System.out.println(rs.getInt("id"));
				temp = new BoardVO(
						rs.getInt("id"),
						rs.getString("name"),
						rs.getString("title"),
						rs.getString("content"),
						rs.getString("create_at")
				);
			}
			rs.close();
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return temp;
	}
	
	public BoardVO setContent(String name, String title, String content) {
		BoardVO temp = null;
		try {
			connect();
			con = DriverManager.getConnection(name, title, content);
//				pstmt.setString(1, name);
//				pstmt.setString(2, title);
//				pstmt.setString(3, content);
			
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		String query = "insert into board" 
				+"(name, title, content)" 
				+"values (?, ?, ?)";
		PreparedStatement pstmt = null;
		try {
			
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setString(2, title);
			pstmt.setString(3, content);
			int res = pstmt.executeUpdate(query);
			if(res > 0) {
				System.out.println("입력 성공");
			}else {
				System.out.println("입력 실패");
			}
			
		}catch(Exception e) {
				e.printStackTrace();
			}
		
		
		
		return temp;
	}
//	
//	public BoardVO deleteBoard(int id) {
//	    BoardVO temp = null;
//	    try {
//	      connect();
//	      String deleteQuery = "delete from board where id =?";
//	      PreparedStatement pstmt = con.prepareStatement(deleteQuery);
//	      pstmt.setInt(1, id);
//	      pstmt.executeUpdate();
//	      pstmt.close();
//	      con.close();
//	    } catch (Exception e) {
//	      e.printStackTrace();
//	    }
//	    return temp;
//	  }
//	
//	public BoardVO editBoard(int id, String title, String post) {
//	    BoardVO temp = null;
//	    try {
//	      connect();
//	      String updateQuery = "update board set title=? post=? where id = ?";
//	      PreparedStatement pstmt = con.prepareStatement(updateQuery);
//	      pstmt.setString(1, title);
//	      pstmt.setString(2, post);
//	      pstmt.setInt(3, id);
//	      pstmt.executeUpdate();
//	      pstmt.close();
//	      con.close();
//	    } catch (Exception e) {
//	      e.printStackTrace();
//	    }
//	    return temp;
//	  }

	
	private void connect() throws Exception{
		Context ctx = new InitialContext(); //처음만드는 초기화된 콘텍스트
		// initialize
		Context envContext = (Context) ctx.lookup("java:/comp/env");
		DataSource dataFactory = (DataSource) envContext.lookup("jdbc/oracle");
		con = dataFactory.getConnection();
	}
}
