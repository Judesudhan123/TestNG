package org.tst;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Sample {
	@Parameters({"username", "password"})
	
	@Test
	public void Test(String S1 ,String S2) {
	System.out.println("S1");
	System.out.println("S2");

	}
	@AfterClass
	public void afterclass() {
		System.out.println("after class");

	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("before method");

	}

}
