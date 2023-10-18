package c231011;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class TomcatOracleConnectionMaker implements ConnectionMaker{
//이렇게끼지 길어지면 보통은 페키지를 나눠놓는다.
	
	@Override
	public Connection makeConnection() throws Exception{
		Context ctx = new InitialContext();
		Context envContext = (Context) ctx.lookup("java:/comp/env");
		DataSource dataFactory = (DataSource) envContext.lookup("jdbc/oracle");
		return dataFactory.getConnection();
	}
}
