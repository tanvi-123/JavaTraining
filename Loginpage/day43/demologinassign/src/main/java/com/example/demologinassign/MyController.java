package com.example.demologinassign;

import java.util.List;

import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

//import com.example.demojpahtml.Users;

@Controller
public class MyController {

	UsersRepository userrepo;
	
	
	
	@PostMapping("/registeruser")
	public String registerUser(@ModelAttribute Users user) {
		userrepo.save(user);
		return "index";	
		}
	@PostMapping("/check")
	public String loginUser(@ModelAttribute Users user) {
		String path="invalid";
		List<Users> list1=userrepo.findAll();
		String uname= user.getUsername();
		String pass=user.getPassword();
		
		for(Users ob:list1)
		{
			if(ob.getUsername().equals(uname) && ob.getPassword().equals(pass))
			{
				path="result";
				break;
			}
		}
		return path;
	
	
			
		
		
	}
	@GetMapping("/newuser")
	public String home() {
		return "register";
	}
	
}
