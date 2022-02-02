package com.project.onlinefooddelivery.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.onlinefooddelivery.entity.Category;
import com.project.onlinefooddelivery.repo.CategoryRepo;

@Service
public class CategoryService {
	
	@Autowired

	 CategoryRepo categoryRepo;

	public Category createCategory(Category cate) {
		// TODO Auto-generated method stub
		return categoryRepo.save(cate);
	}

	public List<Category> getCategory() {
		// TODO Auto-generated method stub
		return categoryRepo.findAll();
	}

	public Category getCategoryById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteAllCategory() {
		// TODO Auto-generated method stub
		try {

			 categoryRepo.deleteAll();

			 }catch(Exception e) {
		return false;
			 }
		return true;
	}

	public String deleteById(int id) {
		// TODO Auto-generated method stub
		 Optional<Category> cateContainer =  categoryRepo.findById(id);
		 if(cateContainer.isPresent()) {

			 Category oldObj = cateContainer.get();

			 categoryRepo.delete(oldObj);

			 return "Deleted Successfully!!!";

			 }else {

			 return "The specified id is not present in the DB :"+id;

			}

			
		
	}

	public Category updateCategory(int id,Category obj) {
		 Optional<Category> cateContainer=categoryRepo.findById(id);

		   if(cateContainer.isPresent()) {

		   return cateContainer.get();

		   }else {

		   return null; 

		  }

		 

		


		 

		
		
	}


}
