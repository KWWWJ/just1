package c231012.connection;

import java.sql.Connection;
import java.sql.DriverManager;


// Oracle db와 connection을 생성
public class OracleCM implements ConnectionMaker{ 
	
	@Override
	public Connection makeConnection() throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		
		return DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521/xe",
				"oooonx",
				"qwer"
				);
	}
	
}
