package c231012.singleton;

import c231012.user.UserBean;
import c231012.connection.ConnectionMaker;
import c231012.connection.OracleCM;

public class Test {
	public static void main(String[] args) {
		ConnectionMaker maker = new OracleCM();
		SingletonDAO dao = SingletonDAO.getInstance(null);
		SingletonDAO dao1 = SingletonDAO.getInstance(null);
		SingletonDAO dao2 = SingletonDAO.getInstance(null);
		System.out.println(dao);
		System.out.println(dao1);
		System.out.println(dao2);
//		UserBean user = new UserBean();
		
	}

}
