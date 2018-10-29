package org.test;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Employee {
	@Parameters({"name","userPass"})
	@Test
public void test4(@Optional("sample")String s1,String s2) {
	System.out.println(s1);
	System.out.println(s2);

}

}
