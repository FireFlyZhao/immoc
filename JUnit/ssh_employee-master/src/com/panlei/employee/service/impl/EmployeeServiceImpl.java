package com.panlei.employee.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.panlei.employee.dao.EmployeeDao;
import com.panlei.employee.domain.Department;
import com.panlei.employee.domain.Employee;
//import com.panlei.employee.domain.PageBean;
import com.panlei.employee.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDao employeeDao;
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public Employee login(Employee employee) {
		Employee existEmployee = employeeDao.findByUsernameAndPassword(employee);
		return existEmployee;
	}
	
	
	
}
