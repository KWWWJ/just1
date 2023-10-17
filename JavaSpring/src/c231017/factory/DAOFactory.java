package c231017.factory;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import c231016.user.JdbcContextUserDAO;
import c231016.user.UsedSpringUserDAO;
import c231016.user.UserDAO;
import c231017.testUser.TestUserDAO;

// 전체적인 DAO를 관리
public class DAOFactory {
	@Bean 
	public UserDAO userDAO() {
		return new UserDAO(dataSource());
	}
	
	@Bean
	public TestUserDAO testUserDAO() {
		return new TestUserDAO(dataSource());
	}
	
	@Bean
	public JdbcContextUserDAO jdbcContextUserDAO() {
		return new JdbcContextUserDAO(dataSource());
	}
	@Bean
	public UsedSpringUserDAO usedSpringUserDAO() {
		return new UsedSpringUserDAO(dataSource());
	}
	
	@Bean
	public DataSource dataSource() {
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		
		dataSource.setDriverClass(oracle.jdbc.OracleDriver.class);
		
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521/xe");
		dataSource.setUsername("oooonx");
		dataSource.setPassword("qwer");
		
		return dataSource;
	}
	
}