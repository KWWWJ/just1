package c231017.testUser;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import c231017.user.UserBean;
import c231017.user.UserInterface;

public class TestUserDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	public TestUserDAO(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void drop() {
		jdbcTemplate.execute("drop table users");
	}
	
	public void upgradeDrop() {
		jdbcTemplate.execute(
				"BEGIN\r\n"
			 	+"EXECUTE IMMEDIATE 'DROP TABLE users';\r\n"
			 	+"EXCEPTION\r\n"
			 	+"WHEN OTHERS THEN\r\n"
			 	+"IF SQLCODE != -942 THEN\r\n"
			 	+"RAISE;\r\n"
			 	+"END IF;\r\n"
			 	+"END;");
	}
/*
 
 	"BEGIN\r\n"
 	+"EXECUTE IMMEDIATE 'DROP TABLE users';\r\n"
 	+"EXCEPTION\r\n"
 	+"WHEN OTHERS THEN\r\n"
 	+"IF SQLCODE != -942 THEN\r\n"
 	+"RAISE;\r\n"
 	+"END IF;\r\n"
 	+"END;"
 	
 	23c 버전부터는
 	
 	"drop table if exists users"
 	
 */
	
	public void create() {
		jdbcTemplate.execute("create table users (\r\n"
				+" id number generated as identity primary key, \r\n"
				+" name varchar2(20), \r\n"
				+" user_id varchar2(50) not null, \r\n"
				+" password varchar2(64) not null \r\n"
				+" )");
	}
	
	public void add(UserInterface user) throws SQLException{
		
		jdbcTemplate.update(								 
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
