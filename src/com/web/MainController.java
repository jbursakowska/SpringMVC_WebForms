package com.web;
 
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
 

@Controller
public class MainController {
 
	/*@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
 
		String message = "Subscribe to BowHunting Magazine";
		return new ModelAndView("welcome", "message", message);
	}*/
	
	@GetMapping("/form")
	public String getForm(Model model) {
 
		model.addAttribute("formModel", new FormModel());
		return "form";
	}
	
	@PostMapping("/form")
	public String postForm(@ModelAttribute FormModel formModel) {

		return "result";
	}
}