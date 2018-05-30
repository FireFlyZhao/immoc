package com.imooc.beanannotation.jsr;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.stereotype.Service;

//@Service
@Named
public class JsrServie {
	
	
	private JsrDAO jsrDAO;
	
//	@Resource
	@Inject
	public void setJsrDAO(@Named("jsrDAO")  JsrDAO jsrDAO) {
		this.jsrDAO = jsrDAO;
	}
	
	public void save() {
		jsrDAO.save();
	}
	
	@PostConstruct
	public void init() {
		System.out.println("JsrServie init.");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("JsrServie destroy.");
	}
}
