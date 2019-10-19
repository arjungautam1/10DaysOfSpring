package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@ResponseBody
public class HomeController
{
	@RequestMapping("/home")
	public ModelAndView home(@RequestParam("name") String name)
	{
		ModelAndView mv=new ModelAndView();
		//System.out.println(name);
		mv.addObject("name", name);
		mv.setViewName("home.jsp");
		return mv;
	}

}
