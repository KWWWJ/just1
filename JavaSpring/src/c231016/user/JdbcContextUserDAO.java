package c231016.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

public class JdbcContextUserDAO {

	private DataSource dataSource;
	
	public JdbcContextUserDAO(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void jdbcContextWithStatementStrategy(StatementStrategy stmtStrategy) throws SQLException {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			
			conn = dataSource.getConnection();
			pstmt = stmtStrategy.makePstmt(conn);
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
	
	public void add(UserBean user) throws SQLException{
		jdbcContextWithStatementStrategy(new StatementStrategy() {
			@Override
			public PreparedStatement makePstmt(Connection conn) throws SQLException {
				PreparedStatement pstmt = conn
						.prepareStatement("insert into users ( name, user_id, password) values ( ?, ?, ?)");

				pstmt.setString(1, user.getName());
				pstmt.setString(2, user.getUserId());
				pstmt.setString(3, user.getPassword());
				
				return pstmt;
			}
		});
	}
	
	public void delete(UserBean user) throws SQLException{
		jdbcContextWithStatementStrategy(new StatementStrategy() {
			@Override
			public PreparedStatement makePstmt(Connection conn) throws SQLException {
				PreparedStatement pstmt = conn
						.prepareStatement("delete from users where id=?");

				pstmt.setInt(1, user.getId());
				
				return pstmt;
			}
		});
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

}
