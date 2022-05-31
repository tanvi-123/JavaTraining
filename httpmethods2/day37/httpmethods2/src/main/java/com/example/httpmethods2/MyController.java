package com.example.httpmethods2;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demohttpmethods.Student;
import com.example.httpmethods2.EmployeeRepository;

@RestController
public class MyController {
@Autowired
	private EmployeeRepository emp;
	@GetMapping("/Employees")
	public List<Employee> getAllStudents(){
		return emp.findAll();
	}

@PostMapping("/save")
public Employee createStudent(@RequestBody Employee e) {
	return emp.save(e);
}

 

@PutMapping("/updateemp/{id}")
public boolean updateStudent(@PathVariable(value="id")Integer empId,@RequestBody Employee empDetails) throws Exception{
	boolean f=true;
	try {
		Optional<Employee> op=emp.findById(empId);
		Employee e=op.get();
		final Employee updateemp=emp.save(e);
	}
	catch(Exception e){
		f= false;
	}
	return f;
}

@DeleteMapping("/deletestud/{id}")
public boolean deleteStudent(@PathVariable(value="id")Integer empId,@RequestBody Employee empDetails) throws Exception{
	Optional<Employee>op=emp.findById(empId);
	Employee e=op.get();
	emp.delete(e);
	return true;
}

}
