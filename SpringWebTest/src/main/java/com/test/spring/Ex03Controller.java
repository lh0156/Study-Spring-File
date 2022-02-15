package com.test.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//MVC > Controller 역할
@Controller //클라이언트의 요청을 받아 처리할 수 있는 자격을 가진 알바생이 된다.
public class Ex03Controller {

	//클라이언트가 이 컨트롤러에게 요청을 하려면?
	//1. 요청 메소드 > doGet()/doPost()
	//2. 가상 주소 > "/spring/ex03.do"
	
	//클라이언트의 요청을 받아 처리할 수 있는 자격을 가진 알바생의 요청 메소드가 된다.
	@RequestMapping(value="/ex03.do")
	public String call() {
		
		//페이지 처리 > 비즈니스 코드
		
		//뷰 호출 > ViewResolver 사용(JSP 페이지의 경로를 단축)
		///WEB-INF/views/ex03.jsp
		return "ex03"; //RequestDispatcher + forward()		
	}
	
}



















