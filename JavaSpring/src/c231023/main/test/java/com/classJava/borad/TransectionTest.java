package c231023.main.test.java.com.classJava.borad;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.springframework.jdbc.datasource.SimpleDriverDataSource;

public class TransectionTest {
	public static void main(String[]args) throws Exception {
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		
		Connection conn = dataSource.getConnection();
		conn.setAutoCommit(false); // 일단 커밋을 막아두고 따로 커릿할 수 있게만든다.
		
		try {
			PreparedStatement pstmt1 = conn.prepareStatement("");
			pstmt1.executeQuery();
			PreparedStatement pstmt2 = conn.prepareStatement("");
			pstmt2.executeQuery();
			conn.commit(); // autoCommit 없으면 필수
		}catch(Exception e) {
			conn.rollback();
			throw e;
		}finally {
			conn.close();
		}
	}
}
