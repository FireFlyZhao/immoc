package com.imooc.aop.api;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class MoocAfterReturningAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("MoocAfterReturningAdvice : " + method.getName() + "     " + 
				target.getClass().getName() + "       " + returnValue);
	}

}
