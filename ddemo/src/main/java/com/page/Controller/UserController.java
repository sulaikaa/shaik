package com.page.Controller;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.page.Repository.UserRepository;
import com.page.model.User;

@RestController
@RequestMapping("/api/auth")
public class UserController {

	@Autowired
	UserRepository ur;
	
	@PostMapping("/create")
	public  void createuser(@RequestBody User u) {
		User user=new User();
		LocalDate today = LocalDate.now();                          
		LocalDate dateofbirth =u.getDateofbirth();  
		 
		Period p = Period.between(dateofbirth, today);
		 
	
		
		ur.save(u);
		System.out.println( " age = " +p.getYears() );
	}

	
}
