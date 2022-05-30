package com.example.mvchtml1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	@GetMapping("/sayhello")
	public String greeting(@RequestParam(name="name",required=false,defaultValue ="DIEMS")String fname,Model model) {
		model.addAttribute("name",fname);
		return "hello";
	}
}
