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

import mca.dmi.module.Student;
import mca.dmi.repositry.StudentRepositry;

@RestController
@RequestMapping(path="api/v1/Student")
@CrossOrigin(origins = "http://192.168.56.1.3000")
public class StudentController {
	
	@Autowired
	StudentRepositry repo;
	
	@PostMapping("/save-student")
	public String saveStudent(@RequestBody Student stud) {
		repo.save(stud);
		return "Student Save Successfully....";
	}
	
	@GetMapping("/get-student")
	public List<Student>getAll(){
		return repo.findAll();
	}
	
	@PutMapping("/update-student")
	public String updateStudent(@RequestBody Student stud) {
		repo.save(stud);
		return "Student Uodate Successfully...";
	}
	
	@DeleteMapping("/delete-student")
	public String deleteStudent(@RequestParam int id) {
		repo.deleteById(id);
		return "Stduent Delete Successfully...";
	}

}
