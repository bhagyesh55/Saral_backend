package com.axis.axissaral.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.axissaral.dto.employee.AddEmployeeDto;
import com.axis.axissaral.dto.employee.UpdateEmployeeDto;
import com.axis.axissaral.entity.Employee;
import com.axis.axissaral.entity.Manager;
import com.axis.axissaral.repository.EmployeeRepository;
import com.axis.axissaral.repository.ManagerRepository;
import com.axis.axissaral.repository.ModuleRepository;
import com.axis.axissaral.repository.ProjectRepository;


@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	ProjectRepository projectRepository;
	
	@Autowired
	ManagerRepository managerRepository;
	
	@Autowired
	ModuleRepository moduleRepository;
	
	
	
	public void addEmployee(AddEmployeeDto empdto) {
		
		
		if(empdto.getDesignation().equalsIgnoreCase("manager")) {
			Manager emp = new Manager();
			emp.setFirstName(empdto.getFirstName());
			emp.setLastName(empdto.getLastName());
			emp.setEmail(empdto.getEmail());
			emp.setPassword(empdto.getPassword());
			emp.setGender(empdto.getGender());
			emp.setStatus("Active");
			emp.setDateOfJoining(LocalDate.now());
			emp.setMobileNumber(empdto.getMobileNumber());
			emp.setDesignation("Manager");
			emp.setProjectName(empdto.getProjectName());
			emp.setModule(moduleRepository.findBymoduleName(empdto.getModuleName()));
			
			managerRepository.save(emp);
		}else {
			Employee emp = new Employee();
			emp.setFirstName(empdto.getFirstName());
			emp.setLastName(empdto.getLastName());
			emp.setEmail(empdto.getEmail());
			emp.setPassword(empdto.getPassword());
			emp.setGender(empdto.getGender());
			emp.setStatus("Active");
			emp.setDateOfJoining(LocalDate.now());
			emp.setMobileNumber(empdto.getMobileNumber());
			emp.setDesignation(empdto.getDesignation());
			emp.setProjectName(empdto.getProjectName());
			emp.setModule(moduleRepository.findBymoduleName(empdto.getModuleName()));
			
			employeeRepository.save(emp);
		}
		
		
	}
	public List<Employee> allEmployees() {
		return employeeRepository.findAll();
	}
	public Optional<Employee> getEmployeeById(Integer id) {
		return employeeRepository.findById(id);
	}

	
	
	public void updateEmployee(UpdateEmployeeDto empDto){
		
		if(empDto.getDesignation().equalsIgnoreCase("manager")) {
			Employee empOld = employeeRepository.getById(empDto.getId());
			
			Manager emp1 = new Manager();
			
	        emp1.setFirstName(empDto.getFirstName());
	        emp1.setLastName(empDto.getLastName());
	        emp1.setEmail(empDto.getEmail());
	        emp1.setPassword(empOld.getPassword());
	        emp1.setGender(empDto.getGender());
	        emp1.setStatus(empDto.getStatus());
	        emp1.setDateOfJoining(empOld.getDateOfJoining());
	        emp1.setMobileNumber(empDto.getMobileNumber());
	        emp1.setDesignation(empDto.getDesignation());
	        emp1.setProjectName(empDto.getProjectName());
			emp1.setModule(moduleRepository.findBymoduleName(empDto.getModuleName()));
			
			employeeRepository.deleteById(empDto.getId());
			managerRepository.save(emp1);

			
			
			
			
		}else {

	        Employee emp1 = employeeRepository.getById(empDto.getId());
	        emp1.setFirstName(empDto.getFirstName());
	        emp1.setLastName(empDto.getLastName());
	        emp1.setEmail(empDto.getEmail());
	        emp1.setGender(empDto.getGender());
	        emp1.setStatus(empDto.getStatus());
	        emp1.setMobileNumber(empDto.getMobileNumber());
	        emp1.setDesignation(empDto.getDesignation());
	        emp1.setProjectName(empDto.getProjectName());
			emp1.setModule(moduleRepository.findBymoduleName(empDto.getModuleName()));
	      
			employeeRepository.save(emp1);
		}
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
