package com.hcl.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.entity.TodayEvent;

@Controller

public class TodayEventController {
	@RequestMapping("/TodayEvent")
	public String showTodayEvent() {
		
		return "TodayEvent";
	}
}
