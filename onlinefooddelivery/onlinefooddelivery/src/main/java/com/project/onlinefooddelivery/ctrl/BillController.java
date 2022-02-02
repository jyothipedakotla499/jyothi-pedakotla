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

import com.project.onlinefooddelivery.entity.Bill;
import com.project.onlinefooddelivery.service.BillService;

@RestController
public class BillController {
	@Autowired
	 BillService billService;
	
	@PostMapping("/bill")
	 public Bill createBill(@RequestBody Bill bil) {

		 return billService.createBill(bil);

		 
	}


		 @GetMapping("/bill")

		 public List<Bill> getBill()
		 {

		 return billService.getBill();
		 }
		 @GetMapping("/bill/{id}")

		 public Bill getBillById(@PathVariable int id) {

		 return billService.getBillById(id);

		}

		 @DeleteMapping("/bill")

		 public boolean deleteAllBill() {

		 return billService.deleteAllBill();

		}

		 @DeleteMapping("/bill/{id}")

		 public String deleteById(@PathVariable int id) {

		 return billService.deleteById(id);

		 

		}

		 //http://localhost:8090/employees/4

		 @PutMapping("/bill/{id}")

		 public Bill updateBill(@PathVariable int id,@RequestBody Bill obj) {

		 return billService.updateBill(id,obj);

		 }

		 

		 

		 



		}
	


