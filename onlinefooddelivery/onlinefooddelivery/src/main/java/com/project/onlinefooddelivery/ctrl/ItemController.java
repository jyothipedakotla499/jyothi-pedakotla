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

import com.project.onlinefooddelivery.entity.Item;
import com.project.onlinefooddelivery.service.ItemService;

@RestController
public class ItemController {
	@Autowired
	 ItemService  itemService;
	@PostMapping("/item")
	 public Item createItem(@RequestBody Item it) {

		 return itemService.createItem(it);

		 

		}

		 @GetMapping("/item")

		 public List<Item> getItem()
		 {

		 return itemService.getItem();
		 }
		 @GetMapping("/item/{id}")

		 public Item getItemById(@PathVariable int id) {

		 return itemService.getItemById(id);

		}

		 @DeleteMapping("/item")

		 public boolean deleteAllItem() {

		 return itemService.deleteAllItem();

		}

		 @DeleteMapping("/item/{id}")

		 public String deleteById(@PathVariable int id) {

		 return itemService.deleteById(id);

		 

		}

		 //http://localhost:8090/employees/4

		 @PutMapping("/employees/{id}")

		 public Item updateItem(@PathVariable int id,@RequestBody Item obj) {

		 return itemService.updateItem(id,obj);

		 }

		 

		 

		 



		}