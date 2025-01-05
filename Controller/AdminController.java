package mca.dmi.controller;

import java.rmi.server.UID;
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
import mca.dmi.repositry.AdminRepositry;

@RestController
@RequestMapping(path="api/v1/Admin")
@CrossOrigin(origins = "http://192.168.56.1.3000")
public class AdminController {
	
	@Autowired
	AdminRepositry repo;
	
	@PostMapping("/Save-admin")
	public String AdminSave(@RequestBody Admin admin) {
		repo.save(admin);
		return "Admin Save Successfully...";
	}
	
	@GetMapping("/get-admin")
	public List<Admin> getAll(){
		return repo.findAll();
	}
	
	@PutMapping("/admin-update")
	public String updateadmin(@RequestBody Admin admin) {
		repo.save(admin);
		return "Admin Update Successfully...";
	}
	@DeleteMapping("/delete-admin")
	public String deleteadmin(@RequestParam int aid) {
		repo.deleteById(aid);
		return "Delete Admin Successfully....";
	}

}
