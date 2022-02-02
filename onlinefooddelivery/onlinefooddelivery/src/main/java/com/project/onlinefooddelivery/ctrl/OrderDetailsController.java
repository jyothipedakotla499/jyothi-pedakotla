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

import com.project.onlinefooddelivery.entity.OrderDetails;
import com.project.onlinefooddelivery.service.OrderDetailsService;

@RestController
public class OrderDetailsController {
	@Autowired
	 OrderDetailsService   orderDetailsService;
	@PostMapping("/orders")
	 public OrderDetails createOrderDetails(@RequestBody OrderDetails details) {

		 return orderDetailsService.createOrderDetails(details);

		 

		}

		 @GetMapping("/orders")

		 public List<OrderDetails> getOrderDetails()
		 {

		 return orderDetailsService.getOrderDetails();
		 }
		 @GetMapping("/orders/{id}")

		 public OrderDetails getOrderDetailsById(@PathVariable int id) {

		 return orderDetailsService.getOrderDetailsById(id);

		}

		 @DeleteMapping("/orders")

		 public boolean deleteAllOrderDetails() {

		 return orderDetailsService.deleteAllOrderDetails();

		}

		 @DeleteMapping("/orders/{id}")

		 public String deleteById(@PathVariable int id) {

		 return orderDetailsService.deleteById(id);

		 

		}

		 //http://localhost:8090/employees/4

		 @PutMapping("/orders/{id}")

		 public OrderDetails updateOrderDetails(@PathVariable int id,@RequestBody OrderDetails obj) {

		 return orderDetailsService.updateOrderDetails(id,obj);

		 }

		 

		 

		 



		}
	
