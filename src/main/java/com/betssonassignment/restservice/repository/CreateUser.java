package com.betssonassignment.restservice.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.betssonassignment.restservice.entity.User;

@RestController
@RequestMapping(path = "/users")
public class CreateUser {
   
	@Autowired
	private UserRepository jpa;
	
	@GetMapping
    public Iterable<User> findAll() {
        return jpa.findAll();
    }
	
	/*
	 * @GetMapping(path = "/{username}") public User find(@PathVariable("username")
	 * String username) { return jpa.; }
	 */
	//UserRepository ur;
	
	@PostMapping(consumes = "application/json")
		public void usercreation(@RequestBody User u) {
		System.out.print("Hi...Hi");
		System.out.print(u);
		//ur.save(u);
		   
		jpa.save(u);
		
	}
	
	/*@PostMapping("/users")	
	//@consumes("application/json")
		public void usercreation(@RequestParam("username") String username,@RequestParam("password") String password,@RequestParam("email") String email,@RequestParam("name") String name)  {
		System.out.print("Hi...Hi");
		User u=new User();
		u.setUsername(username);
		u.setPassword(password);
		u.setEmail(email);
		u.setName(name);
		System.out.print(u); 
		jpa.save(u);
		
		
		
		
	}*/
	
}

