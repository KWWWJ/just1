package c231012.connection;

import java.sql.Connection;

// DB connection 생성에 대한 틀이되는 인터페이스
public interface ConnectionMaker {

	public abstract Connection makeConnection() throws Exception;
	
}
