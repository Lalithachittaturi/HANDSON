package org.com.controller;

import java.util.Map;

import org.com.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/persons")

public class PersonController {
	@GetMapping("/")
	public ModelAndView showPerson() {
		ModelAndView mv=new ModelAndView("persons");
		Map<String,Object> model=mv.getModel();
		Person p=new Person();
		model.put("p", p);
		return mv;
	}
	@PostMapping("/process")
	public String processForm(@ModelAttribute("p")Person p) {
		return "person-confirm";
		
	}
	

}
