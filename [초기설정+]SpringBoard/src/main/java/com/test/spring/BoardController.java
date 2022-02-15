package com.test.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	//테스트 + 템플릿 + List
	
	@GetMapping("/list")
	public String list() {
		
		return "board.list";
	}
	

}



