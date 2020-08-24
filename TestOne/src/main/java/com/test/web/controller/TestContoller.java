package com.test.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.web.service.TestService;

@Controller
public class TestContoller {
	
	@Autowired
	private TestService service;
	
	@RequestMapping("/test/test.do")
	public String mypage(Model m) {
		
		List<String> list = service.selectAll();
		
		m.addAttribute("list", list);
		
		return "test";
	}

}
