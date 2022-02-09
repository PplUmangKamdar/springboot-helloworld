package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {

	@GetMapping("/")
	public String indexPage(Model model) {
		model.addAttribute("message", "Hello World");
		return "index";
	}

	@GetMapping("/username")
	public String username(
			@RequestParam(name = "username", required = false, defaultValue = "Default User") String username,
			Model model) {

		model.addAttribute("username", username);

		return "welcome";
	}

}
