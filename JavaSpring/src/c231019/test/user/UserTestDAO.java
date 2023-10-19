package c231019.test.user;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class UserTestDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource dataSource) {
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

	
	public void create() throws Exception{
		int maxCount = 3;
		while(maxCount-- > 0) { // 예외복구 : 성공할때까지 무한정 시도

			try {
				jdbcTemplate.execute("create table users (\r\n"
						+" id number generated as identity primary key, \r\n"
						+" name varchar2(20), \r\n"
						+" user_id varchar2(50) not null unique, \r\n"
						+" password varchar2(64) not null \r\n"
						+" )");

				return;
			}catch(Exception e){System.out.println(maxCount+"회 남았다.");
//				e.printStackTrace();
			}
		}
		throw new Exception("테이블 생성 실패");
	}
}
	