package c231016.factory;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import c231016.user.JdbcContextUserDAO;
import c231016.user.UsedSpringUserDAO;
import c231016.user.UserDAO;
import c231017.testUser.TestUserDAO;

// 전체적인 DAO를 관리
public class DAOFactory {
//	private UserDAO USERDAOINSTANCE;
//	private ConnectionMaker CONNECTIONMAKERINSTANCE;
	@Bean // 이것이 bean임을 알려준다 bean은 하나의 오브젝트와도 같아서 이렇듯 bean임을 지정하는 것은 Spring에게 관리를 위임하는 것과 같다.
	public UserDAO userDAO() {
		return new UserDAO(dataSource());
//		if(USERDAOINSTANCE == null)USERDAOINSTANCE = new UserDAO(connectionMaker());
//		return USERDAOINSTANCE;	// Singleton 형식으로 작성할떄
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