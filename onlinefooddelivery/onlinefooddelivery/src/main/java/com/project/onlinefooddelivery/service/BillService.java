package com.project.onlinefooddelivery.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.onlinefooddelivery.entity.Bill;
import com.project.onlinefooddelivery.repo.BillRepo;

@Service
public class BillService {
	@Autowired

	

	 BillRepo billRepo;

	public Bill createBill(Bill bil) {
		// TODO Auto-generated method stub
		return billRepo.save(bil);
	}

	public List<Bill> getBill() {
		// TODO Auto-generated method stub
		return billRepo.findAll();
	}

	public Bill getBillById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteAllBill() {
		// TODO Auto-generated method stub
		try {

			 billRepo.deleteAll();

			 }catch(Exception e) {
		return false;
			 }
		return true;
	}

	public String deleteById(int id) {
		// TODO Auto-generated method stub
		 Optional<Bill> bilContainer =  billRepo.findById(id);
		 if(bilContainer.isPresent()) {

			 Bill oldObj = bilContainer.get();

			 billRepo.delete(oldObj);

			 return "Deleted Successfully!!!";

			 }else {

			 return "The specified id is not present in the DB :"+id;

			}

			
		
	}

	public Bill updateBill(int id, Bill obj) {
		 Optional<Bill> bilContainer=billRepo.findById(id);

		   if(bilContainer.isPresent()) {

		   return bilContainer.get();

		   }else {

		   return null; 

		  }

		 

		


		 

		
		
	}

}




