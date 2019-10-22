package com.jpa.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jpa.demo.dao.CollegeRepo;
import com.jpa.demo.model.College;

@Controller
public class HomeController {
	@Autowired
	CollegeRepo repo;
	
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	
	@RequestMapping("/addCollege")
	public String addCollege(College coll)
	{
		repo.save(coll);
		return "home.jsp";
	}
	
	@RequestMapping("/getCollege")
	public ModelAndView getCollege(@RequestParam int cid)
	{
		ModelAndView mv=new ModelAndView("showCollege.jsp");
		//System.out.println(repo.findByCAddress("Kathmandu"));
		
		System.out.println(repo.findByCname("Kathmandu"));
		System.out.println(repo.findByCidGreaterThan(102));
//		System.out.println(repo.findByCnameSorted("Kathmandu"));
//		
		College college=repo.findById(cid).orElse(new College());
		mv.addObject(college);
		return mv;
		
	}

}
