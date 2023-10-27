package com.main.java.user.service;

import java.security.MessageDigest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.java.user.dao.UserDAO;
import com.main.java.user.domain.User;

@Service
public class UserService { // 비지니스 로직
	@Autowired
	UserDAO userDAO;
	
	public void regist(User user) {
		System.out.println(cryptoPassword(user.getPassword(), "SHA-512"));
		System.out.println(cryptoPassword(user.getPassword(), "SHA-512").length());
		user.setPassword(cryptoPassword(user.getPassword(), "SHA-256"));
		userDAO.add(user);
		System.out.println(user);
	}
	
	public User login(User user) {
		User tempUser = userDAO.get(user.getUserId());
		if(tempUser != null && tempUser.getPassword().equals(
				cryptoPassword(user.getPassword(), "SHA-256"))
				) {
			return tempUser; // 유저 id를 받도록 하면 한 번 더 get해줘야 받을 수 있다.
		} else return null;
	}
	
	public User logout(User user) {
		user.setName(null);
		user.setPassword(null);
		user.setUserId(null);
		return user;
	}
	
	private String cryptoPassword(String password, String method) {
		try {
			MessageDigest md = MessageDigest.getInstance(method);
			md.update(password.getBytes());
			byte[] sha256Hash = md.digest(); // 아스키 코드로 바뀌어있을 확률이 크다.
			StringBuilder sb = new StringBuilder();
			for(byte b : sha256Hash) {
				sb.append(String.format("%02x", b));
			}
			return sb.toString();
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
