package com.testNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demob {
	@Test(priority = 0)
	public void testLogin()
	{
		Assert.assertTrue(true,"Sorry for the inconvinence...");
		Reporter.log("Login to the application successfull",true);
	}
	
	@Test(priority = 1,dependsOnMethods = "testLogin")
	public void testCreateUser()
	{
		Assert.assertTrue(false,"Sorry for the inconvinence...");
		Reporter.log("User created successfully",true);
	}
	
	@Test(priority = 2,dependsOnMethods = "testCreateUser")
	public void testUpdateUser()
	{
		Reporter.log("User profile updated successfully",true);
	}
	
	@Test(priority = 3)
	public void testDeleteUser()
	{
		Reporter.log("User deleted successfully",true);
	}
}
