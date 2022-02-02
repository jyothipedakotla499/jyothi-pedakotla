package com.project.onlinefooddelivery.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.onlinefooddelivery.entity.OrderDetails;
import com.project.onlinefooddelivery.repo.OrderDetailsRepo;

@Service
public class OrderDetailsService {

	@Autowired

	 OrderDetailsRepo   orderDetailsRepo;

	public OrderDetails createOrderDetails(OrderDetails details) {
		// TODO Auto-generated method stub
		return orderDetailsRepo.save(details);
	}

	public List<OrderDetails> getOrderDetails() {
		// TODO Auto-generated method stub
		return orderDetailsRepo.findAll();
	}

	public OrderDetails getOrderDetailsById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteAllOrderDetails() {
		// TODO Auto-generated method stub
		try {

			 orderDetailsRepo.deleteAll();

			 }catch(Exception e) {
		return false;
			 }
		return true;
	}

	public String deleteById(int id) {
		// TODO Auto-generated method stub
		 Optional<OrderDetails> detailsContainer =  orderDetailsRepo.findById(id);
		 if(detailsContainer.isPresent()) {

			 OrderDetails oldObj = detailsContainer.get();

			 orderDetailsRepo.delete(oldObj);

			 return "Deleted Successfully!!!";

			 }else {

			 return "The specified id is not present in the DB :"+id;

			}

			
		
	}

	public OrderDetails updateOrderDetails(int id, OrderDetails obj) {
		 Optional<OrderDetails> detailsContainer=orderDetailsRepo.findById(id);

		   if(detailsContainer.isPresent()) {

		   return detailsContainer.get();

		   }else {

		   return null; 

		  }

		 

		


		 

		
		
	}

}


