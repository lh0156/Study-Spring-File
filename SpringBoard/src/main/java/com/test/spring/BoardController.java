package com.test.spring;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	//테스트 + 템플릿 + List
	
	@GetMapping("/login")
	public String login(String id, HttpSession session) {
		
		session.setAttribute("id", id);
		
		return "redirect:/list";
	}
	
	@GetMapping("/list")
	public String list(Model model) {
		
		List<BoardDTO> list = service.list();
		
		model.addAttribute("list", list);
		
		return "board.list";
	}
	
	@GetMapping("/add")
	public String add() {
		
		return "board.add";
	}
	
	@PostMapping("/addok")
	public String addok(BoardDTO dto, HttpSession session, HttpServletRequest req) {
		
		//1. 데이터 가져오기
		//2. 업무 위임
		//3. 뷰 호출
								
		int result = service.add(dto, session, req);
		
		if (result == 1) {
			return "redirect:/list";
		} else {
			return "redirect:/add";
		}
		
		
	}
	

}
























































