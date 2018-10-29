package org.tst;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test {
	

	@Test
	public void test1 () {
		System.out.println("start...........test1");
		Assert.assertTrue(false);
		Assert.assertTrue(false);
		Assert.assertTrue(true);
		Assert.assertTrue(false);
		System.out.println("end............test1");
		
	}
	@Test
	public void test2() {
		System.out.println("start...........test2");
		Assert.assertTrue(false);
		Assert.assertTrue(true);
		Assert.assertTrue(false);
		Assert.assertTrue(false);
		System.out.println("end..........test2");
	}
	
	
	
	

}
