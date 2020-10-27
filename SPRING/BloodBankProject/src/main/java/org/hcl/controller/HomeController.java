package org.hcl.controller;
import java.util.HashSet;
import java.util.Set;

import org.hcl.entities.BloodGroup;
import org.hcl.entities.User;
import org.hcl.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@Autowired
	private UserService service;
	@GetMapping("/")
	public String showHome() {
		return "home";
	}

	@PostMapping("/req")
	public String showForm(@RequestParam("reqType") String reqType, Model model) {
		if (reqType.equals("donor"))
		{
			model.addAttribute("donor", reqType);
		}
		if (reqType.equals("requestor"))
			model.addAttribute("requestor", reqType);
		return"registration";
	}

	@PostMapping("/process")
	public String processForm(@RequestParam("uname") String userName, @RequestParam("pwd") String pwd,
			@RequestParam("city") String city, @RequestParam("bg") String bloodGroup,Model model) {
		User user=new User();
		user.setUserName(userName);
		user.setPassword(pwd);
		user.setBloodGroup(bloodGroup);
		user.setCity(city);
		BloodGroup bg=new BloodGroup();
		bg.setGroupName(user.getBloodGroup());
		user.add(bg);
		bg.add(user);
		Set<User> users=new HashSet<>();
		Set<BloodGroup> bloodGroups=new HashSet<>();
		users.add(user);
		bloodGroups.add(bg);
		user.setBloodGroups(bloodGroups);
		bg.setUsers(users);

		model.addAttribute("generatedId",user.getUserName()+user.getUid()+user.getBloodGroup());
		if
		(service.insertUser(user));
		return "home";
		/*
		 * else return "RegistrationLogin";
		 */
	}
}