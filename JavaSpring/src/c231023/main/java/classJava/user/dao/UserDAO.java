package c231023.main.java.classJava.user.dao;

import c231023.main.java.classJava.user.domain.User;

public interface UserDAO {
	
	public void add(User user);
	
	public User get(int id);
	
	public User get(String userId);
	
	public void deleteAll();

}
