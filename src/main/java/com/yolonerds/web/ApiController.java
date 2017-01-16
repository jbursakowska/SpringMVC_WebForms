package com.yolonerds.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yolonerds.model.Checkbox;

@Controller
public class ApiController {

	public ApiController() {
		
	}
	
	@GetMapping("/checkboxes")
	public @ResponseBody ArrayList<Checkbox> getCheckboxes() { // accept new empty instance of a Model class
		
		//WebFormModel webFormModel = new WebFormModel();
 		
		ArrayList<Checkbox> list = new ArrayList<>();
		list.add(new Checkbox(1, "CEO"));
		list.add(new Checkbox(1, "President"));
		list.add(new Checkbox(1, "Maid"));
		
		
		return list; // return form.html to the browser
	}
}
