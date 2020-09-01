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
		list.add("Kota Factory");
		list.add("Permanent Roommates");
		list.add("Sacred Games");
		list.add("Made in Heaven");
		list.add("The Family Man");
		list.add("Little Things");
		list.add("Mirzapur");
		list.add("Yeh Meri Family");
		list.add("Pushpavalli");
		list.add("Special Ops");
		
		mv.addObject("message", list);
		return mv;
	}


}
