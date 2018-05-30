package com.panlei.employee.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.panlei.employee.domain.Department;
import com.panlei.employee.domain.Employee;
//import com.panlei.employee.domain.PageBean;
//import com.panlei.employee.service.DepartmentService;
import com.panlei.employee.service.EmployeeService;

public class EmployeeAction extends ActionSupport implements ModelDriven<Employee>{
	private Employee employee = new Employee();
	@Override
	public Employee getModel() {
		// TODO Auto-generated method stub
		return employee;
	}

	//注入业务层类
	private EmployeeService employeeService;
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}	
		
		
	/**
	 * 登陆执行的方法
	 */
	public String login() {
		System.out.println("login执行了...");
		Employee existEmployee = employeeService.login(employee);
		if(existEmployee == null) {
			//登陆失败
			this.addActionError("用户名或密码错误！");
			return INPUT;
		} else{
			//登陆成功就将用户信息存入session对象
			ActionContext.getContext().getSession().put("existEmployee", existEmployee);
			return SUCCESS;
		}
	}
}
