package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dto.MemberDTO;
import com.example.demo.service.MemberService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j    // Simple Logging Facade for Java

public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@ResponseBody
	@RequestMapping("/member/list")
	public Map<String,Object> memberList() {
		log.info("========================== MemberController(/member/list) ==================================");
		List<MemberDTO> list=memberService.findMemberList();
		Map<String,Object> map=new HashMap<>();
		map.put("list", list);
		return map;
	}
	
}
