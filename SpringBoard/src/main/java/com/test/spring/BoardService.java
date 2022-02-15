package com.test.spring;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public interface BoardService {

	int add(BoardDTO dto, HttpSession session, HttpServletRequest req);

	List<BoardDTO> list();

}
