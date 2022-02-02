package com.project.onlinefooddelivery.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.onlinefooddelivery.entity.FoodCart;
import com.project.onlinefooddelivery.service.FoodCartService;

@RestController
public class FoodCartController {
	@Autowired
	 FoodCartService   foodCartService;
	@PostMapping("/foodCart")
	public FoodCart createFoodCart(@RequestBody FoodCart food) {

		 return foodCartService.createFoodCart(food);

		 

		}

	     @GetMapping("/foodCart")

		 public List<FoodCart> getFoodCart()
		 {

		 return foodCartService.getFoodCart();
		 }
		 @GetMapping("/foodCart/{id}")

		 public FoodCart getFoodCartById(@PathVariable int id) {

		 return foodCartService.getFoodCartById(id);

		}

		 @DeleteMapping("/foodCart")

		 public boolean deleteAllFoodCart() {

		 return foodCartService.deleteAllFoodCart();

		}

		 @DeleteMapping("/foodCart/{id}")

		 public String deleteById(@PathVariable int id) {

		 return foodCartService.deleteById(id);

		 

		}

		 //http://localhost:8090/employees/4

		 @PutMapping("/foodCart/{id}")

		 public FoodCart updateFoodCart(@PathVariable int id,@RequestBody FoodCart obj) {

		 return foodCartService.updateFoodCart(id,obj);

		 }

		 

		 

		 



		}
	
