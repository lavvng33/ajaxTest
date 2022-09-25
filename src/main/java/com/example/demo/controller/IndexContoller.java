package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class IndexContoller {
	
	@RequestMapping("/")
	public ModelAndView main() {
		log.info("========================== MemberController(/) ==================================");
		ModelAndView mv=new ModelAndView("/main");
		return mv;
	}
}
