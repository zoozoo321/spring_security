package com.example.security.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@RequestMapping(value="/loginPage")
	public String loginPage(){
		return "loginPage";
	}
}
