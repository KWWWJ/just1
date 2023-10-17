package c231013.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import c231012.connection.ConnectionMaker;
//import c231012.factory.DAOFactory;
//import c231012.user.UserDAO;

public class UserDAO {
	// db와 통신하여 user의 데이터를 관리한다.
	private ConnectionMaker maker;
	private DataSource dataSource;
	
	public UserDAO(ConnectionMaker maker) {
		this.maker = maker;
//		ApplicationContext context = new AnnotationConfigApplicationContext(DAOFactory.class);
//		this.maker = context.getBean("connectionMaker", ConnectionMaker.class);
	}
	public UserDAO(DataSource dataSource) {
		this.dataSource = dataSource;
//		ApplicationContext context = new AnnotationConfigApplicationContext(DAOFactory.class);
//		this.maker = context.getBean("connectionMaker", ConnectionMaker.class);
	}
	
	public void add(UserBean user) throws Exception{
//		Connection conn = maker.makeConnection();
		Connection conn = dataSource.getConnection();
		
		String query = "insert into users ( name, user_id, password) values ( ?, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(query);
		pstmt.setString(1, user.getName());
		pstmt.setString(2, user.getUserId());
		pstmt.setString(3, user.getPassword());
		pstmt.executeUpdate();
		
		pstmt.close();
		conn.close();
		
	}
	
	public UserInterface get(String userId) throws Exception{

		Connection conn = dataSource.getConnection();
		
		String query = "select * from users where user_id=?";
		PreparedStatement pstmt = conn.prepareStatement(query);
		
		pstmt.setString(1, userId);
		ResultSet rs = pstmt.executeQuery();
		
		UserInterface user = null;
		
		if(rs.next()) {
			user = new UserBean();
			user.setId(rs.getInt("id"));
			user.setName(rs.getString("name"));
			user.setUserId(rs.getString("user_id"));
			user.setPassword(rs.getString("password"));
		}
		
		pstmt.close();
		conn.close();
		return user;
	}
}
