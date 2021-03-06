package org.hcl.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/requestblooddetails")
public class RequesterController {
	@GetMapping("/")
	public ModelAndView showRequestBloodDetails() {
		ModelAndView mv=new ModelAndView("requestblooddetails");
		Map<String,Object> model=mv.getModel();
		RequesterController p=new RequesterController();
		model.put("p", p);
		return mv;
	}
	
	@PostMapping("/process")
	public String processForm(@ModelAttribute("p")RequesterController p) {
		
		return "requestblooddetails-confirm";
		
	}
	

}
