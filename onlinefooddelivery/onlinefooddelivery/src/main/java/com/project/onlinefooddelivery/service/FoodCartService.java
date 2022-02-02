package com.project.onlinefooddelivery.service;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.onlinefooddelivery.entity.FoodCart;
import com.project.onlinefooddelivery.entity.Item;
import com.project.onlinefooddelivery.exception.ItemIdNotFoundException;
import com.project.onlinefooddelivery.exception.ItemListEmptyException;
import com.project.onlinefooddelivery.repo.FoodCartRepo;
import com.project.onlinefooddelivery.repo.ItemRepo;

@Service
public class FoodCartService {

	@Autowired

	 FoodCartRepo   foodCartRepo;
	@Autowired
    ItemRepo itemRepo;

	public FoodCart createFoodCart(FoodCart food) {
		List<Item>  itemList =food.getItemList();
		if(itemList.size()>0)
		{
			List<Item> newItemList= new ArrayList<>();
			for(int i=0;i<itemList.size();i++)
			{
				Optional<Item> itContainer = itemRepo.findById(itemList.get(i).getItemId());
				if(!(itContainer.isPresent()))
				{
					throw new ItemIdNotFoundException("item is not found");
				}
				else {
					newItemList.add(itContainer.get());
					//cart.getVegetable().add(vegetableContainer.get());
				}
			}
			food.setItemList(newItemList);
		}
		else {
			throw new ItemListEmptyException("Item List is Empty");
		}
		return foodCartRepo.save(food);
	}

	public List<FoodCart> getFoodCart() {
		// TODO Auto-generated method stub
		return foodCartRepo.findAll();
	}

	public FoodCart getFoodCartById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteAllFoodCart() {
		// TODO Auto-generated method stub
		try {

			 foodCartRepo.deleteAll();

			 }catch(Exception e) {
		return false;
			 }
		return true;
	}

	public String deleteById(int id) {
		// TODO Auto-generated method stub
		 Optional<FoodCart> foodContainer =  foodCartRepo.findById(id);
		 if(foodContainer.isPresent()) {

			 FoodCart oldObj = foodContainer.get();

			 foodCartRepo.delete(oldObj);

			 return "Deleted Successfully!!!";

			 }else {

			 return "The specified id is not present in the DB :"+id;

			}

			
		
	}

	public FoodCart updateFoodCart(int id, FoodCart obj) {
		 Optional<FoodCart> foodContainer=foodCartRepo.findById(id);

		   if(foodContainer.isPresent()) {

		   return foodContainer.get();

		   }else {

		   return null; 

		  }

		 

		


		 

		
		
	}

}


