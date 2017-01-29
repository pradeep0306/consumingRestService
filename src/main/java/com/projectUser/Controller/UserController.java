package com.projectUser.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

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
}
