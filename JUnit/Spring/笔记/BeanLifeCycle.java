package com.imooc.lifecycle;
	
import org.junit.Test;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.imooc.test.base.UnitTestBase;

%%%
%default-init-method="defautInit" default-destroy-method="defaultDestroy"
%以上两个全局方法会被覆盖.
%以上两个全局方法是可选项,可不写相应的代码


%%%
%init-method="start" destroy-method="stop"
%implements InitializingBean, DisposableBean
%接口先于init-method,destroy-method(初始化和销毁)


public class BeanLifeCycle implements InitializingBean, DisposableBean {
	
	public void defautInit() {
		System.out.println("Bean defautInit.");
	}
	
	public void defaultDestroy() {
		System.out.println("Bean defaultDestroy.");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Bean destroy.");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean afterPropertiesSet.");
	}
	
	public void start() {
		System.out.println("Bean start .");
	}
	
	public void stop() {
		System.out.println("Bean stop.");
	}
}


<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd" 
        default-init-method="defautInit" default-destroy-method="defaultDestroy" >
        
	 <bean id="beanLifeCycle" class="com.imooc.lifecycle.BeanLifeCycle"  init-method="start" destroy-method="stop"></bean>
	
 </beans>



 com.imooc.test.lifecycle;
 
 public class TestBeanLifecycle extends UnitTestBase{

		public TestBeanLifecycle() {
			super("classpath:spring-lifecycle.xml");
		}
		
		@Test
		public void test1() {
			super.getBean("beanLifeCycle");
		}

	}







