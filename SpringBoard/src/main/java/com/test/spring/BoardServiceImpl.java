package com.test.spring;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDAO dao;
	
	@Override
	public int add(BoardDTO dto, HttpSession session, HttpServletRequest req) {
		
		//아이디 추가
		dto.setId(session.getAttribute("id").toString());
		
		//첨부 파일 처리
		MultipartHttpServletRequest multi = (MultipartHttpServletRequest)req;
		
		MultipartFile file = multi.getFile("attach");
		
		String path = req.getRealPath("/resources/file");
		System.out.println(path);
		
		//System.out.println(file.isEmpty());
		if (!file.isEmpty()) {
			
			String filename = file.getOriginalFilename();
			dto.setOrgfilename(filename);
			
			filename = getFileName(path, filename);
			dto.setFilename(filename);
			
			try {
				File mfile = new File(path + "\\" + filename);
				file.transferTo(mfile);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		return dao.add(dto);
	}
	
	
	private String getFileName(String path, String filename) {
		
		int n = 1;
		int index = filename.lastIndexOf(".");
		String tempName = filename.substring(0, index);
		String tempExt = filename.substring(index);
		
		while (true) {
			
			File file = new File(path + "\\" + filename);
			
			if (file.exists()) {
				filename = tempName + "_" + n + tempExt;
				n++;
			} else {
				return filename;
			}			
		}
		
	}
	
	@Override
	public List<BoardDTO> list() {
		
		List<BoardDTO> list = dao.list();
		
		//첨부파일 유무 처리
		
		return list;
	}

	
}
























