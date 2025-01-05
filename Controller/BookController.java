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

import mca.dmi.module.Book;
import mca.dmi.module.Student;
import mca.dmi.repositry.BookRepositry;

@RestController
@RequestMapping(path="api/v1/Book")
@CrossOrigin(origins = "http://192.168.56.1.3000")
public class BookController {
	
	@Autowired
	BookRepositry repositry;
	
	@PostMapping("/save-book")
	public String saveStudent(@RequestBody Book book) {
		repositry.save(book);
		return "Book Save Successfully....";
	}
	
	@GetMapping("/get-book")
	public List<Book>getAll(){
		return repositry.findAll();
	}
	
	@PutMapping("/update-book")
	public String updateStudent(@RequestBody Book book) {
		repositry.save(book);
		return "Book Uodate Successfully...";
	}
	@DeleteMapping("/delete-book")
	public String deleteStudent(@RequestParam int id) {
		repositry.deleteById(id);
		return "Book Delete Successfully...";
	}

}
