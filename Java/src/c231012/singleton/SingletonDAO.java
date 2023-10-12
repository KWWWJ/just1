package c231012.singleton;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import c231012.connection.ConnectionMaker;
import c231012.user.UserBean;

public class SingletonDAO {
	// 1. 필드에 변하는 변수를 집어넣을 수 없다.(여기에서 사용자에 의해 변수가 발생하면 오류가 일어난다.)
	// 2. 다른 요청이 한꺼번에 요청될떄, 동시에 처리하지 못한다.
	
	// 메모리를 한 공간만 차지하기 떄문에 관리측면에서 탁월하다
	
	private ConnectionMaker maker;
	
	public static SingletonDAO INSTANCE;
	// 정말로 싱글톤으로 구현할 것이라면 private로 만드는 것이 맞다.
	
	public SingletonDAO(ConnectionMaker maker) {
		this.maker = maker;
	}
	// new를 막기 위해 일부러 private로 만든다. 당장은 아래의 add 등의 메서드가 고장나므로 그러지 않았음
	
	public static SingletonDAO getInstance() {
		return INSTANCE;
	}
	public static SingletonDAO getInstance(ConnectionMaker maker) {
		if(INSTANCE == null)INSTANCE = new SingletonDAO(maker);
		return INSTANCE;
	}
	
	public void add(UserBean user) throws Exception{
		Connection conn = maker.makeConnection();
		
		String query = "insert into users ( name, user_id, password) values ( ?, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(query);
		pstmt.setString(1, user.getName());
		pstmt.setString(2, user.getUserId());
		pstmt.setString(3, user.getPassword());
		pstmt.executeUpdate();
		
		pstmt.close();
		conn.close();
		
	}
	
	public UserBean get(String userId) throws Exception{
		Connection conn = maker.makeConnection();
		
		String query = "select * from users where user_id=?";
		PreparedStatement pstmt = conn.prepareStatement(query);
		
		pstmt.setString(1, userId);
		ResultSet rs = pstmt.executeQuery();
		
		UserBean user = null;
		
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
