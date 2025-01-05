package mca.dmi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mca.dmi.module.Registrartion;
import mca.dmi.repositry.RegistrationRepositry;

@RestController

public class RegistrationController {
  
	@Autowired
	RegistrationRepositry repo;
	
	@PostMapping("/save-regi")
	public String svaeregi(@RequestBody Registrartion regi) {
		 repo.save(regi);
		 return "Registration Successfully.....";
	}
	
	@GetMapping("/get-data")
	public List<Registrartion>getAll() {
		return repo.findAll();
	}
	
	@PutMapping("/update-data")
	public String updtaeRegi(@RequestBody Registrartion regi) {
		repo.save(regi);
		return"Update Successfully.....";
	}

	@DeleteMapping("/delete-data")
	public String deletedata(@RequestParam int rid) {
		repo.deleteById(rid);
		return" Delete Successfully...";
	}
	
	
	
}
