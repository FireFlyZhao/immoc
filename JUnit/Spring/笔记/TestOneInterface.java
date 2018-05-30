package com.imooc.test.ioc.interfaces;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.imooc.ioc.interfaces.OneInterface;
import com.imooc.test.base.UnitTestBase;

public class TestOneInterface extends UnitTestBase {

	public TestOneInterface() {
		super("classpath*:spring-ioc.xml");		%%此处可以加星号,也可以不加星号,为什么可以加
	}
	
	@Test
	public void testHello() {
		OneInterface oneInterface = super.getBean("oneInterface");
		System.out.println(oneInterface.hello("我输入的参数"));
	}

}
