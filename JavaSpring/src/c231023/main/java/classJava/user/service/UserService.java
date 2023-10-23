package c231023.main.java.classJava.user.service;

import c231023.main.java.classJava.user.dao.UserDAO;
import c231023.main.java.classJava.user.domain.User;

public class UserService {
	private UserDAO userDAO;
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	public void add(User user) {
		userDAO.add(user);
	}

}
