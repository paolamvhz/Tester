package com.tester.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tester.app.model.Category;

@Controller
@RequestMapping(value = "/manageCat")
public class ManageCategories {
	
	@GetMapping(value="/")
	public String create() {
		return "manageCategories";
	}
	@PostMapping(value="/save")
	public String save(Category cat) {
		System.out.println(" categoryName "+cat.getName()+" catDesc "+cat.getDescription()+" image "+cat.getImage() );
		return "manageCategories";
	}
}
