package com.wipro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wipro.bean.Marks;

@RequestMapping("/marks")
@Controller
public class Main {
	@RequestMapping("/TotalMarks")
	public String TotalMarks(Model model) {
		
		Marks m = new Marks();
		model.addAttribute("marks", m);
		return "reservation-page";  
	}
	
	@RequestMapping("/submitForm")
	public String submitForm(@ModelAttribute("marks") Marks m) {
		return "confirmation-page";
	}
}