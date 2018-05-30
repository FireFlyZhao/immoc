package com.imooc.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MoocBeanName implements BeanNameAware, ApplicationContextAware{
	
	private String beanName;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("setApplicationContext : " + applicationContext.getBean(this.beanName).hashCode());
	}

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		this.beanName = name;
		System.out.println("MoocBeanName : " + name);
	}

}
