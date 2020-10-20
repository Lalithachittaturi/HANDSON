package com.hcl.controller;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.entity.Contact;
@Controller

public class ContactController {
	@RequestMapping("/contact")
	public String showContact() {
				return "contact";

	}
}
