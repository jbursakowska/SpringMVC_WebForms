package com.yolonerds.web;
 
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yolonerds.model.Checkbox;
import com.yolonerds.model.WebFormModel;
import com.yolonerds.service.FormService;
 

@Controller
public class FormController {
	
	private FormService service;
	
	public FormController(){
		service = new FormService();
	}
 	
	// send html form to the browser
	
	@GetMapping("/form")
	public String getForm(Model model) { // accept new empty instance of a Model class
		
		//service.submitForm(webFormModel);
		
		//WebFormModel webFormModel = new WebFormModel();
 		
		ArrayList<Checkbox> list = new ArrayList<>();
		list.add(new Checkbox(1, "CEO"));
		list.add(new Checkbox(1, "President"));
		list.add(new Checkbox(1, "Maid"));
		
		model.addAttribute("list", list);
		model.addAttribute("description", "What is your job title");
		
		return "form"; // return form.html to the browser
	}
	
	@GetMapping("/products")
	public String getProducts(Model model) { // accept new empty instance of a Model class
		
		String [] prods = {"bannana","poo","pee"};
 		
		model.addAttribute("prods", prods);
		
		return "products"; // return products.html to the browser
	}
	
	// accept data from the submitted form
	
	@PostMapping("/form")
	public String postForm(@ModelAttribute("webFormModel") WebFormModel webFormModel) {
		
		//service.submitForm(webFormModel);
		
		return "redirect:/confirm?email=" + webFormModel.getEmail() + "&password=" + webFormModel.getPassword();
	}
	
	@GetMapping("/confirm")
	public String getConfirm(@RequestParam("email") String email, @RequestParam("password") String password, Model model) {
		
		model.addAttribute("email", email);
		model.addAttribute("password", password);
		
		return "confirm";
	}
}