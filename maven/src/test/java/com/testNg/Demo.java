package com.testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo 
{
	
	@Test(priority = 1)
	public void test_01()
	{
		Reporter.log("Hii",true);
	}
	@Test(priority = 2)
	public void test_03()
	{
		Reporter.log("How are you",true);
	}
	@Test(priority = 3)
	public void test_02()
	{
		Reporter.log("Go for a tea",true);
	}
	
	
	
	
	
}
