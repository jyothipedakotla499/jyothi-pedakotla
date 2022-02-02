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

import com.project.onlinefooddelivery.entity.Restaurant;
import com.project.onlinefooddelivery.service.RestaurantService;

@RestController
public class RestaurantController {
	
	@Autowired
	 RestaurantService restaurantService;
	@PostMapping("/restaurant")
	 public Restaurant createRestaurant(@RequestBody Restaurant rest) {

		 return restaurantService.createRestaurant(rest);

		 

		}

		 @GetMapping("/restaurant")

		 public List<Restaurant> getRestaurant()
		 {

		 return restaurantService.getRestaurant();
		 }
		 @GetMapping("/restaurant/{id}")

		 public Restaurant getRestaurantById(@PathVariable int id) {

		 return restaurantService.getRestaurantById(id);

		}

		 @DeleteMapping("/restaurant")

		 public boolean deleteAllRestaurant() {

		 return restaurantService.deleteAllRestaurants();

		}

		 @DeleteMapping("/restaurant/{id}")

		 public String deleteById(@PathVariable int id) {

		 return restaurantService.deleteById(id);

		 

		}

		 //http://localhost:8090/employees/4

		 @PutMapping("/restaurant/{id}")

		 public Restaurant updateRestaurant(@PathVariable int id,@RequestBody Restaurant obj) {

		 return restaurantService.updateRestaurant(id,obj);

		 }

		 

		 

		 



		}
	



