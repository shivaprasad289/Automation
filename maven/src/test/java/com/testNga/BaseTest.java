package com.testNga;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest 
{
	@BeforeTest
	public void testRegister()
	{
		Reporter.log("Register to the application successfully",true);
	}
	
	@BeforeClass
	public void testUserCreate()
	{
		Reporter.log("Login to the application successfully",true);
	}
	
	@BeforeMethod
	public void testUserPermission()
	{
		Reporter.log("Permission allowed",true);
	}
	@AfterMethod
	public void testUserLogOut()
	{
		Reporter.log("User logged out successfully",true);
	}
}

