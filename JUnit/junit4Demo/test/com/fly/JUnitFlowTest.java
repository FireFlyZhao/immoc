package com.fly;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitFlowTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("this is beforeclass....");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("this is afterclass....");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("this is before...");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("this is after...");
	}

	@Test
	public void test1() {
		System.out.println("this is test1...");
	}
	
	@Test 
	public void test2() {
		System.out.println("this is test2...");
	}
	
	
}
