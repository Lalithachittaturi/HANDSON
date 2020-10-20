package com.hcl.controller;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.entity.Contact;
@Controller
@RequestMapping("/contact")
public class ContactController {
	@GetMapping("/")
	public ModelAndView showPerson() {
		ModelAndView mv=new ModelAndView("contact");
		Map<String,Object> model=mv.getModel();
		Contact p=new Contact();
		model.put("p", p);
		return mv;

	}
}
