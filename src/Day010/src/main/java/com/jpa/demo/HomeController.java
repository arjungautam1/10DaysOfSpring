package com.jpa.demo;

import java.util.List;
import java.util.Optional;

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
	
	@RequestMapping("/colleges")
	@ResponseBody
	public List<College> getColleges()
	{
		return repo.findAll();
	}
	
	@RequestMapping("/colleges/{cid}")
	@ResponseBody
	public Optional<College> getCollege(@PathVariable("cid") int cid)
	{
		return repo.findById(cid);
	}
		

}
