package org.tst;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Pratice {
	@BeforeClass
	private void beforeclass() {
		System.out.println("beforeclass");
		

	}
	@AfterClass
	private void afterclass() {
		System.out.println("aftercalss");

	}
	@Test
	private void test1() {
		System.out.println("test");

	}
	

}

