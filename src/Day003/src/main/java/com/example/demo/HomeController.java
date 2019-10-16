package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	
	public String home()
	{
		System.out.println("Hello ."); //This will print hello in console 
		return "home.jsp";
	}

}
//That's it ,Thanks for watching .