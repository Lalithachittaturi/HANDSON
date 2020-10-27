package org.hcl.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hcl.dao.UsersDaoImpl;
import org.hcl.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/donorblooddetails")
public class DonorController {
	@GetMapping("/")
	public ModelAndView showDonorBloodDetails() {
		ModelAndView mv=new ModelAndView("donorblooddetails");
		Map<String,Object> model=mv.getModel();
		DonorController p=new DonorController();
		model.put("p", p);
		return mv;
	}
	
	@PostMapping("/process")
	public String processForm(@ModelAttribute("p")DonorController p) {
		
//		  if(result.hasErrors()) 
//			  return "donorblooddetails";
//		 
		return "home";
		
	}
	

}
