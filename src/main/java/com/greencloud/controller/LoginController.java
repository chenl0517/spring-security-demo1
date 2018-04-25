package com.greencloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class LoginController {
	
	@RequestMapping("/loginAction")
	public String loginAction(String username,String password){
		System.out.println("username:"+username+"\\"+"password:"+password);
		return "main";
	}

}
