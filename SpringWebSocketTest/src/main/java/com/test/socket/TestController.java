package com.test.socket;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	//http://localhost:8090/socket/test
	@GetMapping("/test")
	public String test() {
		
		return "test";
	}
	
}


