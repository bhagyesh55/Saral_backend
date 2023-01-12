package com.axis.axissaral.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.axissaral.dto.employee.UpdateEmployeeDto;
import com.axis.axissaral.entity.Employee;
import com.axis.axissaral.entity.Manager;
import com.axis.axissaral.repository.ManagerRepository;
import com.axis.axissaral.repository.ModuleRepository;
@Service
public class ManagerService {
	
	@Autowired
	private ManagerRepository managerRepository;
	
	@Autowired
	ModuleRepository moduleRepository;
	
	public List<Manager> getAllManagers() {
		return managerRepository.findAll();
	}

	public Optional<Manager> getManagerById(Integer id) {
		return managerRepository.findById(id);
	}
	
	
	public void updateEmployee(UpdateEmployeeDto empDto){
		
			Manager emp1 = managerRepository.getById(empDto.getId());
	        emp1.setFirstName(empDto.getFirstName());
	        emp1.setLastName(empDto.getLastName());
	        emp1.setEmail(empDto.getEmail());
	        emp1.setGender(empDto.getGender());
	        emp1.setStatus(empDto.getStatus());
	        emp1.setMobileNumber(empDto.getMobileNumber());
	        emp1.setDesignation(empDto.getDesignation());
	        emp1.setProjectName(empDto.getProjectName());
			emp1.setModule(moduleRepository.findBymoduleName(empDto.getModuleName()));
	      
			managerRepository.save(emp1);
		}
}
