package com.t.controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ty.Task;

import jakarta.servlet.http.HttpServletRequest;

public class TestController {
	List<Task> l = new ArrayList<>();
	@GetMapping("/save")
	public ModelAndView display(HttpServletRequest req) {
		
		String title=(String) req.getParameter("title");
		String desc=(String) req.getParameter("description");
		if(title != null && desc != null) {
			Task u = new Task(title,desc);
			l.add(u);
			
		}
		ModelAndView m= new ModelAndView("display.jsp");
		
		m.addObject("task",l);
		
		String success="successfully added task";
		m.addObject(success);
		return m;
		
	}
	@GetMapping("/add")
	public String add() {
		return "AddTask";
	}
	
	@GetMapping("/delete")
	public String delete(HttpServletRequest req) {
		if(req.getParameter("title") != null && req.getParameter("desc") != null ) {
			Task t = new Task(req.getParameter("title"),req.getParameter("desc"));
			l.remove(t);
		}
		return "redirect:/save";
	}

}