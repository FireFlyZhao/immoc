package com.fly;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class AnotationTest {

	@Test(expected=ArithmeticException.class)
	public void testDivide() {
		assertEquals(3,new Calculate().divide(6, 0));
	}
	
	@Ignore("�˴���˵��:")
	@Test(timeout=2000)
	public void testWhile() {
		while (true) {
			//��Ȼ��timeout,���ǽ����Errors1
			System.out.println("run forever....");
		}
	}
	
	@Test(timeout=3000)
	public void testReadFile() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
