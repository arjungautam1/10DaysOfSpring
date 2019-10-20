package com.jpa.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jpa.demo.dao.AlienRepo;
import com.jpa.demo.model.Alien;

@Controller
public class HomeController {
	@Autowired
	AlienRepo repo;
	@RequestMapping("/")
	
		public String home()
		{
			return "home.jsp";
		}
	@RequestMapping("/addAlien")
	
	public String addAlien(Alien alien)
	{
		repo.save(alien);
		return "home.jsp";
	}

	

}
