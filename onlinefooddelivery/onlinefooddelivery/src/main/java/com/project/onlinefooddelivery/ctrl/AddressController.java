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

import com.project.onlinefooddelivery.entity.Address;
import com.project.onlinefooddelivery.service.AddressService;

@RestController
public class AddressController {
	@Autowired
	 AddressService addressService;
	@PostMapping("/address")
	 public Address createAddress(@RequestBody Address add) {

		 return addressService.createAddress(add);

		 

		}
	@GetMapping("/address")

	 public List<Address> getAddress()
	 {

	 return addressService.getAddress();
	 }
	 @GetMapping("/address/{id}")

	 public Address getAddressById(@PathVariable int id) {

	 return addressService.getAddressById(id);


}
	 
	 @DeleteMapping("/address")

	 public boolean deleteAllAddress() {

	 return addressService.deleteAllAddress();

	}

	 @DeleteMapping("/address/{id}")

	 public String deleteById(@PathVariable int id) {

	 return addressService.deleteById(id);

	 

	}

	 //http://localhost:8090/employees/4

	 @PutMapping("/address/{id}")

	 public Address updateAddress(@PathVariable int id,@RequestBody Address obj) {

	 return addressService.updateAddress(id,obj);

	 }

	 

	 

	 



}
