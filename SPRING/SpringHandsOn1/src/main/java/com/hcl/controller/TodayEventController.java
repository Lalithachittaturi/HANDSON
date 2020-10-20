package com.hcl.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.entity.TodayEvent;

@Controller
@RequestMapping("/TodayEvent")
public class TodayEventController {
	@GetMapping("/")
	public ModelAndView showPerson() {
		ModelAndView mv=new ModelAndView("TodayEvent");
		Map<String,Object> model=mv.getModel();
		TodayEvent p=new TodayEvent();
		model.put("p", p);
		return mv;
	}
}
