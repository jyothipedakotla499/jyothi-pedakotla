package com.project.onlinefooddelivery.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.onlinefooddelivery.entity.Login;
import com.project.onlinefooddelivery.repo.LoginRepo;

@Service
public class LoginService {
	
	@Autowired

	 LoginRepo loginRepo;

	public Login createLogin(Login log) {
		// TODO Auto-generated method stub
		return loginRepo.save(log);
	}

	public List<Login> getLogin() {
		// TODO Auto-generated method stub
		return loginRepo.findAll();
	}

	public Login getLoginById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteAllLogin() {
		// TODO Auto-generated method stub
		try {

			 loginRepo.deleteAll();

			 }catch(Exception e) {
		return false;
			 }
		return true;
	}

	public String deleteById(int id) {
		// TODO Auto-generated method stub
		 Optional<Login> logContainer =  loginRepo.findById(id);
		 if(logContainer.isPresent()) {

			 Login oldObj = logContainer.get();

			 loginRepo.delete(oldObj);

			 return "Deleted Successfully!!!";

			 }else {

			 return "The specified id is not present in the DB :"+id;

			}

			
		
	}

	public Login updateLogin(int id, Login obj) {
		 Optional<Login> logContainer=loginRepo.findById(id);

		   if(logContainer.isPresent()) {

		   return logContainer.get();

		   }else {

		   return null; 

		  }

		 

		


		 

		
		
	}

}




