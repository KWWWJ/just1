package c231019.user;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class UserDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void add(UserBean user) {
		
		jdbcTemplate.update(
				"insert into users ( name, user_id, password) values ( ?, ?, ?)",
				user.getName(),
				user.getUserId(),
				user.getPassword());
	}
	
	public void delete(UserBean user) {
		jdbcTemplate.update(
				"delete from users where id=?",
				user.getId());
	}
	
	public UserBean get(String userId){
//		jdbcTemplate.queryForInt("select from(*) from users");
		
		return jdbcTemplate.queryForObject(
			"select * from users where user_id=?", 
			new Object[] {userId},
			new RowMapper<UserBean>() {

				@Override //이 메서드는 RowMapper에 마우스를 올리고 add를 누르면 알아서 만들어주는 놈이다.
				public UserBean mapRow(ResultSet rs, int rowNum) throws SQLException {
					// TODO Auto-generated method stub
					UserBean user= new UserBean();
					user.setId(rs.getInt("id"));
					user.setName(rs.getString("name"));
					user.setUserId(rs.getString("user_id"));
					user.setPassword(rs.getString("password"));
							
					return user;
				}
			}
		);
	}
}
