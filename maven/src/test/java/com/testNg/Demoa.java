package com.testNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demoa {
	@Test(priority = 0)
	public void testLogin()
	{
		Reporter.log("Login to the application successfull",true);
	}
	
	@Test(priority = 1)
	public void testCreateUser()
	{
		Assert.assertFalse(false);
		Reporter.log("User created successfully",true);
	}
	
	@Test(priority = 2)
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
