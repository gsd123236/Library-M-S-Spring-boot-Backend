package mca.dmi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mca.dmi.module.Admin;
import mca.dmi.module.user;
import mca.dmi.repositry.UserRepositry;

@RestController
@RequestMapping(path="api/v1/User")
@CrossOrigin(origins = "http://192.168.56.1.3000")
public class UserController {
	
	@Autowired
    UserRepositry repo;
	
	
	@PostMapping("/Save-user")
	public String UserSave(@RequestBody user user) {
		repo.save(user);
		return "User Save Successfully...";
	}
	
	@GetMapping("/get-user")
	public List<user> getAll(){
		return repo.findAll();
	}
	
	@PutMapping("/update-user")
	public String updateuser(@RequestBody user user) {
		repo.save(user);
		return "user update successefully.....";
	}
	
	@DeleteMapping("/delete-user")
	public String deleteuser(@RequestParam int uid) {
		repo.deleteById(uid);
		return "user delete successfully....";
	}
	
    
	
}
