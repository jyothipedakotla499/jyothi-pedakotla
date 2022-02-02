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

import com.project.onlinefooddelivery.entity.Login;
import com.project.onlinefooddelivery.service.LoginService;

@RestController
public class LoginController {

	@Autowired
	 LoginService loginService;
	@PostMapping("/login")
	 public Login createLogin(@RequestBody Login log) {

		 return loginService.createLogin(log);

		 

		}

		 @GetMapping("/login")

		 public List<Login> getLogin()
		 {

		 return loginService.getLogin();
		 }
		 @GetMapping("/login/{id}")

		 public Login getLoginById(@PathVariable int id) {

		 return loginService.getLoginById(id);

		}

		 @DeleteMapping("/login")

		 public boolean deleteAllLogin() {

		 return loginService.deleteAllLogin();

		}

		 @DeleteMapping("/login/{id}")

		 public String deleteById(@PathVariable int id) {

		 return loginService.deleteById(id);

		 

		}

		 //http://localhost:8090/employees/4

		 @PutMapping("/login/{id}")

		 public Login updateLogin(@PathVariable int id,@RequestBody Login obj) {

		 return loginService.updateLogin(id,obj);

		 }

		 

		 

		 



		}
	



