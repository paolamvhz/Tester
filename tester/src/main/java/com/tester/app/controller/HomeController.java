package com.tester.app.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tester.app.model.Category;
import com.tester.app.service.ICategoriesService;

@Controller
public class HomeController {
	
	@Autowired
	private ICategoriesService categories;
	
	@RequestMapping(value = "/")
	public String goHome(Model model) {
		model.addAttribute("categories",categories.getCategories());
		return "home";
	}
	
	@RequestMapping(value = "/category/{id}", method = RequestMethod.GET)
	public String showCategory(@PathVariable("id") int categoryId,Model model){
		
	model.addAttribute("category", categories.getCategory(categoryId));
	return "category";
	}
	

}
