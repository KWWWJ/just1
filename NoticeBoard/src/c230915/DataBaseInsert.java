package c230915;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DataBaseInsert {
	public void insert() {
		Scanner scan = new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe",
					"oooonx",
					"qwer"
					);
			
	//		String id = "1";
	//		String query1 = "update student set student_id='kds' where id= "+id;
	//		Statement stmt1 = con.createStatement();  
	//		ResultSet rs1 = stmt1.executeQuery(query1);
			String insertQuery = "insert into student" 
								+"(id, name, student_id, student_pw, age, git_address)" 
								+"values (?, ?, ?, ?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(insertQuery); //안전성 높음
			System.out.println("id :");
			int inputID = scan.nextInt();
			pstmt.setInt(1, inputID);
			System.out.println("name :");
			String inputName = scan.next();
			pstmt.setString(2, inputName);
			System.out.println("student id :");
			String inputSID = scan.next();
			pstmt.setString(3, inputSID);
			System.out.println("student pw :");
			String inputSPW = scan.next();
			pstmt.setString(4, inputSPW);
			System.out.println("age :");
			int inputAge = scan.nextInt();
			pstmt.setInt(5, inputAge);
			System.out.println("git address :");
			String inputGitAddress = scan.next();
			pstmt.setString(6, inputGitAddress);
			pstmt.executeUpdate();
			
			
			
			
			
			String query = "select * from student order by id";
			Statement stmt = con.createStatement();  //요청애 대한 상태를 피드백한다.(요청을 받았는지, 기다리고있는지 등)
			ResultSet rs = stmt.executeQuery(query); //query를 실행하고 resultSet로 반환하라.(데이터를 stream으로 주고 받는다)
			while(rs.next()) {
				System.out.println(rs.getString("name")+" : "+rs.getInt("age")+" : "+rs.getString("git_address"));
			}
			
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
		
		}
	}
}

