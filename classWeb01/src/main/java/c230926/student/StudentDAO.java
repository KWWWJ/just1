package c230926.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDAO {
	private Connection con;
	public int id;
	public String name;
	public String studentId;
	public String studentPw;
	public int age;
	public String gitAddress;
	
	public List<StudentVO> getList() {
		List<StudentVO> list = new ArrayList<>();
		
		try {
			connect();
			
			String query = "select * from student order by id";
			PreparedStatement stmt = con.prepareStatement(query);  //요청애 대한 상태를 피드백한다.(요청을 받았는지, 기다리고있는지 등)
			ResultSet rs = stmt.executeQuery(query); //query를 실행하고 resultSet로 반환하라.(데이터를 stream으로 주고 받는다)
			while(rs.next()) {
				StudentVO temp = new StudentVO(rs.getInt("id"),
						rs.getString("name"),
						rs.getString("student_id"),
						rs.getString("student_pw"),
						rs.getInt("age"),
						rs.getString("git_address")
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
	
	public StudentVO getStudent(String studentId) {
		StudentVO temp = null;
		try {
			connect();
			
			String query = "select * from student where student_id=?";
			PreparedStatement pstmt = con.prepareStatement(query);  //요청애 대한 상태를 피드백한다.(요청을 받았는지, 기다리고있는지 등)
			pstmt.setString(1, studentId);
			ResultSet rs = pstmt.executeQuery(); //query를 실행하고 resultSet로 반환하라.(데이터를 stream으로 주고 받는다)
			if(rs.next()) {
//				System.out.println(rs.getInt("id"));
				temp = new StudentVO(
						rs.getInt("id"),
						rs.getString("name"),
						rs.getString("student_id"),
						rs.getString("student_pw"),
						rs.getInt("age"),
						rs.getString("git_address")
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
	
	public void insert() {
		System.out.println("student tble insert.");
		try {
			connect();
			
			String query = "insert into student" 
					+"(id, name, student_id, student_pw, age, git_address)" 
					+"values (?, ?, ?, ?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(query); //안전성 높음
			
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, studentId);
			pstmt.setString(4, studentPw);
			pstmt.setInt(5, age);
			pstmt.setString(6, gitAddress);
			pstmt.executeUpdate();
			
			pstmt.close();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
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

	public StudentVO getStudent(int parseInt) {
		
		return null;
	}
}
