package c231016.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

public class UserDAO {
	private DataSource dataSource;
	// ()->{}
	
	public UserDAO(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void add(UserBean user) throws SQLException{
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		//밖으로 빼서 선언
		
		try {
		
			conn = dataSource.getConnection();
			String query = "insert into users ( name, user_id, password) values ( ?, ?, ?)";
			pstmt = conn.prepareStatement(query);
			//값을 내부에서 설정
			
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getUserId());
			pstmt.setString(3, user.getPassword());
			pstmt.executeUpdate();
			
		
		}catch(SQLException e) {
			throw e;
		}finally {
			
			if(pstmt != null) {
				try {
					
					pstmt.close(); //SQL에서 돌리기 떄문에 이또한 오류가 날 수 있다.
					
				}catch(SQLException e) {
					
				}
				
			}
			if(conn != null) {
				try {
					
					conn.close(); // 동일
					
				}catch(SQLException e) {
					
				}
				
			}
			
			
		}
	}
	
	public void delete(UserBean user) throws SQLException{
		
		Connection conn = null;
		PreparedStatement pstmt = null;
				
		try {
			
			conn = dataSource.getConnection();
			String query = "delete from users where id=?";
			pstmt = conn.prepareStatement(query);
			
			pstmt.setInt(1, user.getId());
			pstmt.executeUpdate();
			
		}catch(SQLException e) {
			throw e;
		}finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				}catch(SQLException e) {
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				}catch(SQLException e) {
				}
			}
			
		}
		
		
		
	}
	
	public UserInterface get(String userId) throws SQLException{
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		UserInterface user = null;
		
		try {
			
			conn = dataSource.getConnection();
			String query = "select * from users where user_id=?";
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, userId);
			ResultSet rs = pstmt.executeQuery();
			
			user = null;
			
			if(rs.next()) {
				user = new UserBean();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setUserId(rs.getString("user_id"));
				user.setPassword(rs.getString("password"));
			}
			
			pstmt.close();
			conn.close();
			
		}catch(SQLException e) {
			throw e;
		}finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				}catch(SQLException e) {
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				}catch(SQLException e) {
				}
			}
		}
		
		return user;
	}
	
	private PreparedStatement makepstmt(Connection conn, UserInterface user) throws SQLException {
		String query = "insert into users ( name, user_id, password) values ( ?, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(query);
		//값을 내부에서 설정
		
		pstmt.setString(1, user.getName());
		pstmt.setString(2, user.getUserId());
		pstmt.setString(3, user.getPassword());
		pstmt.executeUpdate();
		
		return pstmt;
		
	}
}
