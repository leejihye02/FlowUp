package com.spring.app.board.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.app.board.service.BoardService;


// === 컨트롤러 선언 === //
@Controller
@RequestMapping(value="/board/*")
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	@GetMapping("")
	public ModelAndView board(ModelAndView mav) {
		
		List<Map<String, String>> testList = service.test();
		
		mav.addObject("testList", testList);
		mav.setViewName("mycontent/board/board");
		
		return mav;
	}
	
}
