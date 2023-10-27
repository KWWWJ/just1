package com.main.java.user.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.main.java.user.domain.User;
import com.main.java.user.service.UserService;

@Controller // �˾Ƽ� bean�� �߰���. �����̶� �ϴ����� ���⼭�� ��Ʈ�ѷ��� ����Ѵ�. �߰��� ó���� �� �ִ� ��ɵ�
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/regist", method=RequestMethod.GET) // ���. static 
	public String regist() {
		return "user/regist";
	}
	
	@RequestMapping(value="/regist", method=RequestMethod.POST) // ���. static 
	public String registPost(@RequestParam Map<String, String> map) {
		userService.regist(new User(
				map.get("user-name"),
				map.get("user-id"), 
				map.get("user-pw"))
				);
		return "redirect:/regist";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST) // ���. static 
	public String loginPost(@RequestParam Map<String, String> map, HttpSession session) {
		User user = new User();
		user.setUserId(map.get("user-id"));
		user.setPassword(map.get("user-pw"));
		user = userService.login(user);
		if(user != null)
		session.setAttribute("userName", user.getName()); // �ڹٿ� HTML�� �����ϱ� ���� ī������ ���
		return "redirect:/";
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.POST) // ���. static 
	public String logoutPost(@RequestParam Map<String, String> map, HttpSession session) {
		User user = new User();
		user = userService.logout(user);
		session.setAttribute("userName", user.getName());
		return "redirect:/";
	}
}
