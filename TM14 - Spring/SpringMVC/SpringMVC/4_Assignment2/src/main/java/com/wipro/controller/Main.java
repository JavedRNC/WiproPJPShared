package com.wipro.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Main {
	@RequestMapping("/MovieList")
	public ModelAndView sayHello() {
		
		
		ModelAndView mv = new ModelAndView("Movies");
		ArrayList<String> list = new ArrayList<String>();
		list.add("1. Kota Factory");
		list.add("2. Permanent Roommates");
		list.add("3. Sacred Games");
		list.add("4. Made in Heaven");
		list.add("5. The Family Man");
		list.add("6. Little Things");
		list.add("7. Mirzapur");
		list.add("8. Yeh Meri Family");
		list.add("9. Pushpavalli");
		list.add("10. Special Ops");
		
		mv.addObject("message", list);
		return mv;
	}


}
