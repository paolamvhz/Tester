package com.tester.app.service;

import java.util.List;

import com.tester.app.model.Category;

public interface ICategoriesService {
	
	public List<Category> getCategories ();
	
	public Category getCategory(int categoryId);

}
