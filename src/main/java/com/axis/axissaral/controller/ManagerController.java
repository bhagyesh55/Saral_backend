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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axis.axissaral.dto.employee.UpdateEmployeeDto;
import com.axis.axissaral.entity.Employee;
import com.axis.axissaral.entity.Manager;
import com.axis.axissaral.service.ManagerService;

@RestController
@RequestMapping("/manager")
@CrossOrigin("http://localhost:3000")
public class ManagerController {

	@Autowired 
	private ManagerService managerService;
	
	@GetMapping("/")
    public List<Manager> getAllEmployees(){

        return managerService.getAllManagers();
    }
	@GetMapping("/{managerId}")
    public Optional<Manager> getAllProjects(@PathVariable Integer managerId ){

        return managerService.getManagerById(managerId);
    }
    @PutMapping("/update/")
    public ResponseEntity<String> updateManager(@RequestBody @Valid UpdateEmployeeDto empDto){
                                                      
    	managerService.updateEmployee(empDto);
        return new ResponseEntity<>("Manager has been updated", HttpStatus.OK);
    }
    
}
