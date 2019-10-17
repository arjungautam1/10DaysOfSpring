package com.example.demo;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

//for accepting the data from here 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class HomeController {
	@RequestMapping("home")
	public String home(HttpServletRequest req)
	{
		HttpSession session=req.getSession();
		String name=req.getParameter("name");
		System.out.println("Hi it's me :"+name);//this will print in console
		session.setAttribute("name", name);
		return "home.jsp";
	}

}
