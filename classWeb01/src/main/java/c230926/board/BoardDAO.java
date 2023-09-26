package c230926.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BoardDAO {
	public int id;
	public String name;
	public String title;
	public String content;
	public String createAt;
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
	
	public BoardVO getStudent(String list) {
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
	
	public BoardVO setContent() {
		BoardVO temp = null;
		try {
			connect();
			
			String query = "insert into board" 
					+"(id, name, title, content, create_at)" 
					+"values (?, ?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(query);
//				System.out.println(rs.getInt("id"));
				pstmt.setInt(1, id);
				pstmt.setString(2, name);
				pstmt.setString(3, title);
				pstmt.setString(4, content);

			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return temp;
	}
	
	private void connect() throws Exception{
//		Class.forName("oracle.jdbc.OracleDriver");
//		Connection con = DriverManager.getConnection(
//				"jdbc:oracle:thin:@localhost:1521/xe",
//				"c##oooonx",
//				"qwer"
//				);
		Context ctx = new InitialContext(); //처음만드는 초기화된 콘텍스트
		// initialize
		Context envContext = (Context) ctx.lookup("java:/comp/env");
		DataSource dataFactory = (DataSource) envContext.lookup("jdbc/oracle");
		con = dataFactory.getConnection();
	}
}
