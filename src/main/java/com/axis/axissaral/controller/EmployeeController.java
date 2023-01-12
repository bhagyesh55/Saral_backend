package com.axis.axissaral.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.axissaral.dto.employee.AddEmployeeDto;
import com.axis.axissaral.dto.employee.UpdateEmployeeDto;
import com.axis.axissaral.entity.Employee;

import com.axis.axissaral.service.EmployeeService;
@RestController
@RequestMapping("/employee")
@CrossOrigin("http://localhost:3000")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/add")
	public ResponseEntity<String> addEmployee(@RequestBody AddEmployeeDto empDto){
		
		employeeService.addEmployee(empDto);
		
		return new ResponseEntity<String>("Added Successfully", HttpStatus.CREATED);

	}
	@GetMapping("/")
    public List<Employee> getAllEmployees(){

        return employeeService.allEmployees();
    }
	@GetMapping("/{empId}")
    public Optional<Employee> getAllProjects(@PathVariable Integer empId ){

        return employeeService.getEmployeeById(empId);
    }

    @PutMapping("/update/")
    public ResponseEntity<String> updateEmployee(@RequestBody @Valid UpdateEmployeeDto empDto){
                                                      
        employeeService.updateEmployee(empDto);
        return new ResponseEntity<>("Employee has been updated", HttpStatus.OK);
    }
    
	
}
