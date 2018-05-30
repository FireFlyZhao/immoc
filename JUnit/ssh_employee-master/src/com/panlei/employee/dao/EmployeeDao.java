package com.panlei.employee.dao;

import java.util.List;

import com.panlei.employee.domain.Department;
import com.panlei.employee.domain.Employee;

public interface EmployeeDao {
	
	Employee findByUsernameAndPassword(Employee employee);
	
}
