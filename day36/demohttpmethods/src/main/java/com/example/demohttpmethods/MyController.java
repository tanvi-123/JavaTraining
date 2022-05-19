package com.example.demohttpmethods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;
//import antlr.collections.List;

@RestController
public class MyController {
@Autowired
	private StudentRepository stud;
/*	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return stud.findAll();
	}
	
	@GetMapping("/student/{id}")
	
	public Student getStudentByID(@PathVariable("id")Integer studId) {
	Optional<Student> op=stud.findById(studId);
	Student st=op.get();
	return st;
	}

	@PostMapping("/save")
	public Student createStudent(@RequestBody Student st) {
		return stud.save(st);
	}
*/
/*
	@PutMapping("/updatestud/{id}")
	public boolean updateStudent(@PathVariable(value="id")Integer studId,@RequestBody Student studDetails) throws Exception{
		boolean f=true;
		try {
			Optional<Student> op=stud.findById(studId);
			Student st=op.get();
			final Student updatestud=stud.save(st);
		}
		catch(Exception e){
			f= false;
		}
		return f;
	}
*/	
	@DeleteMapping("/deletestud/{id}")
	public boolean deleteStudent(@PathVariable(value="id")Integer studId,@RequestBody Student studDetails) throws Exception{
		Optional<Student>op=stud.findById(studId);
		Student st=op.get();
		stud.delete(st);
		return true;
	}

}
