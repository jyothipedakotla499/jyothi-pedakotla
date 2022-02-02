package com.project.onlinefooddelivery.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.onlinefooddelivery.entity.Address;
import com.project.onlinefooddelivery.repo.AddressRepo;

@Service
public class AddressService {
	@Autowired

	 AddressRepo addressRepo;

	public Address createAddress(Address add) {
		// TODO Auto-generated method stub
		return addressRepo.save(add);
	}

	public List<Address> getAddress() {
		// TODO Auto-generated method stub
		return addressRepo.findAll();
	}

	public Address getAddressById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteAllAddress() {
		// TODO Auto-generated method stub
		try {

			 addressRepo.deleteAll();

			 }catch(Exception e) {
		return false;
			 }
		return true;
	}

	public String deleteById(int id) {
		// TODO Auto-generated method stub
		 Optional<Address> addContainer =  addressRepo.findById(id);
		 if(addContainer.isPresent()) {

			 Address oldObj = addContainer.get();

			 addressRepo.delete(oldObj);

			 return "Deleted Successfully!!!";

			 }else {

			 return "The specified id is not present in the DB :"+id;

			}
	}

		 public Address updateAddress(int id, Address obj) {
			 Optional<Address> addContainer=addressRepo.findById(id);

			   if(addContainer.isPresent()) {

			   return addContainer.get();

			   }else {

			   return null; 

			  }



}
}