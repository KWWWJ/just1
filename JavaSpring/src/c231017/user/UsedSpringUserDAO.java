package c231017.user;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class UsedSpringUserDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	public UsedSpringUserDAO(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void add(UserInterface user) throws SQLException{ // 페키지 라이브러리에 트렌젝션파일(프레임워크)이 있어야한다.
															 // 트렌젝션 = 일련의 과정에 있어 한번에 처리해야하는 것들.
		jdbcTemplate.update(								 // ex 돈을 아직 받지 못했다면 돈을 보내는 요청도 처리될 수 없다.
				"insert into users ( name, user_id, password) values ( ?, ?, ?)",
				user.getName(),
				user.getUserId(),
				user.getPassword());
	}
	
	public void delete(UserInterface user) throws SQLException{
		jdbcTemplate.update(
				"delete from users where id=?",
				user.getId());
	}
	
	public UserInterface get(String userId) throws SQLException{
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
				});
	}
	
}
