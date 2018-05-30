package com.panlei.employee.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.panlei.employee.dao.EmployeeDao;
import com.panlei.employee.domain.Department;
import com.panlei.employee.domain.Employee;
//import com.panlei.employee.util.HibernateUtil;

public class EmployeeDaoImpl extends HibernateDaoSupport implements EmployeeDao{

	@Override
	public Employee findByUsernameAndPassword(Employee employee) {
		String hql = "from Employee where username=? and password=?";
		List<Employee> list = 
			this.getHibernateTemplate().find(hql,employee.getUsername(),employee.getPassword());
		if(list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

}
