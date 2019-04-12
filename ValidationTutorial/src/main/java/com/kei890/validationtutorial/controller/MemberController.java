package com.kei890.validationtutorial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kei890.validationtutorial.dto.MemberDto;
import com.kei890.validationtutorial.service.MemberService;

@Controller
public class MemberController {
	
    @Autowired
    MemberService memberService;
    
    @RequestMapping("/update")
    public void memberUpdate(@ModelAttribute MemberDto memberDto) {
     	//회원정보 수정 
        memberService.update(memberDto);   
    }

}
