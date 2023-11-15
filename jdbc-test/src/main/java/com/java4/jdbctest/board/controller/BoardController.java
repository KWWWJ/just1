package com.java4.jdbctest.board.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java4.jdbctest.board.domian.Board;
import com.java4.jdbctest.board.service.BoardService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class BoardController {
	@Autowired
	BoardService boardService;
	
	
	@GetMapping("/board")
	public String listPage() {
		return "boards/index";
	}
	
	@ResponseBody
	@PostMapping("/board")
	public String list() {
		List<Board> list = boardService.getAll();
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i=0; i< list.size(); i++) {
			sb.append("{\"id\":" + list.get(i).getId() + ",");
			sb.append("\"user\":\"" + list.get(i).getUser() + "\",");
			sb.append("\"title\":\"" + list.get(i).getTitle() + "\",");
			sb.append("\"content\":\"" + list.get(i).getContent() + "\"}");
			if(i < list.size() - 1) {
				sb.append(",");
			}
		}
		sb.append("]");
		return sb.toString();
	}
	
	@GetMapping("/board/add")
	public String addPage() {
		return "boards/add";
	}
	
	@PostMapping("/board/add")
	public String addPage(@RequestParam Map<String, String> data) {
		
		boardService.add(new Board(data.get("user"), data.get("title"),data.get("content")));
		
		return "redirect:/board";
	}
	
	@GetMapping("/board/content")
	public String contentPage() {
		return "boards/content";
	}
	
	@ResponseBody
	@PostMapping("/board/content")
	public Board contentPage(@RequestParam("id") String id) {
		System.out.println("id post ="+id);
		
		int contentId = Integer.parseInt(id);
		
		System.out.println(contentId);
		
		Board board = boardService.get(contentId);
		
		return board;
	}
	
	
	
}
