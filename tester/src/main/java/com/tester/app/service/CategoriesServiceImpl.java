package com.tester.app.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.tester.app.model.Category;

@Service
public class CategoriesServiceImpl implements ICategoriesService {
	List<Category> categories;
	public CategoriesServiceImpl() {
		categories = new ArrayList<Category>();
		Category cat1 = new Category();
		cat1.setCategoryId(1);
		cat1.setName("Skin");
		cat1.setDescription("Everything you need for your skin type");
		cat1.setImage("skincare.jpg");
		
		Category cat2 = new Category();
		cat2.setCategoryId(2);
		cat2.setName("Body");
		cat2.setDescription("Give your body some love");
		cat2.setImage("bodycare.jpg");
		
		Category cat3 = new Category();
		cat3.setCategoryId(3);
		cat3.setName("Hair");
		cat3.setDescription("Love your hair");
		cat3.setImage("haircare.jpeg");
		
		Category cat4 = new Category();
		cat4.setCategoryId(4);
		cat4.setName("Nails");
		cat4.setDescription("Your hands means a lot");
		cat4.setImage("nailcare.jpg");
		
		categories.add(cat1);
		categories.add(cat2);
		categories.add(cat3);
		categories.add(cat4);
	}

	@Override
	public List<Category> getCategories() {
	
	
		return categories;
	}

	@Override
	public Category getCategory(int categoryId) {
		// TODO Auto-generated method stub
		
		Category cat = categories.get(categoryId-1);
		return cat;
	}

}
