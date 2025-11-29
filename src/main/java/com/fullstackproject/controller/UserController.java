package com.fullstackproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.fullstackproject.exception.UserNotFoundException;
import com.fullstackproject.model.User;
import com.fullstackproject.repository.UserRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
   @PostMapping("/createuser")
   public User newuser(@RequestBody User newuser) {    
       return userRepository.save(newuser);
   }
   
   @GetMapping("/viewall")
   public List<User> getAll( ) {
       return userRepository.findAll();
   }
   
   @GetMapping("view/{id}")
   public User getById(@PathVariable int id) {
	   return userRepository.findById(id).orElseThrow(()->new UserNotFoundException(id));
   }
   @PutMapping("/user/{id}")
   public User updateUser(@PathVariable int id, @RequestBody User newUser) {
       return userRepository.findById(id)
    		   .map(user->{
    			   user.setUsername(newUser.getUsername());
    			   user.setName(newUser.getName());
    			   user.setEmail(newUser.getEmail());
    			   return userRepository.save(user);
    		   }).orElseThrow(()->new UserNotFoundException(id));
   }
   @DeleteMapping("/user/{id}")
   public String deleteUser(@PathVariable int id) {
	   if(!userRepository.existsById(id)) {
		   throw new UserNotFoundException(id);
	   }
	   userRepository.deleteById(id);
	return "User is deleted";
   }
	
}
