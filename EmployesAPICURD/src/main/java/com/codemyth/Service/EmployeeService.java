package com.codemyth.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codemyth.model.Employee;
import com.codemyth.respositry.EmployeeRespositry;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRespositry employeeRepository;
	
	public Employee findByEmpcity(String emp_city) {
		return employeeRepository.findByEmpcity(emp_city);
	}

	Optional<List<Employee>> findByEmpageGreaterThan(int emp_age){
		return null;
		
	}

}
