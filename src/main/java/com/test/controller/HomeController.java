package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Value;

@Controller
public class HomeController {
   	
	@GetMapping("/home")
	public String showHome(Model model) {
		model.addAttribute("name", "Sasi");
		return "Home";
	}

	@GetMapping
	public ModelAndView redirectToHome() {
        return new ModelAndView("redirect:/home");
    }



}
