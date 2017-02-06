package com.projectUser.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.projectUser.Model.Article;
import com.projectUser.Model.Users; 
//import org.springframework.web.servlet.ModelAndView;


@Controller
public class UserController {
	
	@RequestMapping("/UserController")
	public @ResponseBody String getUserDetails()
	{
 		RestTemplate restTemplate = new RestTemplate();
		String url = "https://jsonplaceholder.typicode.com/users";
		Users[] user = restTemplate.getForObject(url, Users[].class);
 		String out ="<table class='table table-bordered'><tr><th>ID</th><th>Name</th><th>Email</th></tr>";
		for(Users userRecord:user)
		{
			
			out=out.concat("<tr><td>"+userRecord.getId()+"</td><td>"+userRecord.getName()+"</td><td>"+userRecord.getEmail()+"</td></tr>");
			
		}
		out =out.concat("</table>");
		return out;
	}
	
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public ModelAndView validateLoginDetails(HttpServletRequest req,HttpServletResponse res)
	{
		String username=req.getParameter("username");
		String pass=req.getParameter("pass");
		if(username.equals("admin") && pass.equals("password"))
		{
	 		RestTemplate restTemplate = new RestTemplate();
			String url = "https://jsonplaceholder.typicode.com/users";
			Users[] user = restTemplate.getForObject(url, Users[].class);
			//System.out.println("in Controller");
			return new ModelAndView("welcomePage","result",user);
		}
		else
		{
			return new ModelAndView("errorPage","result","Credentials are not matched");
		}
	}
	
	@RequestMapping(value="check", method=RequestMethod.GET)
	public ModelAndView getCourse()
	{
		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost/drupal/rest_service/news";
		//String data = restTemplate.getForObject(url, String.class);
		//return new ModelAndView("coursePage","result",data);
		Article[] data = restTemplate.getForObject(url, Article[].class);
		return new ModelAndView("coursePage","result",data);
	}
	
}
