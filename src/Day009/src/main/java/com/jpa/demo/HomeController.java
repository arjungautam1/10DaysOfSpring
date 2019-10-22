package com.jpa.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
//	@RequestMapping("/colleges")
//	@ResponseBody
//	public String getColleges()
//	{
//		return repo.findAll().toString();
//	}
	
	@RequestMapping("/colleges/{cid}")
	@ResponseBody
	public String getCollege(@PathVariable("cid") int cid)
	{
		return repo.findById(cid).toString();
	}
		

}
