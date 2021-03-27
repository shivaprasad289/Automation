package com.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Demo {

	@DataProvider
	public String [][] datavalue()
	{
		String [][] s = new String[2][2];
		s[0][0] = "admin";
		s[0][1] = "manager";
		return s;
	}
	
	@Test(dataProvider = "datavalue")
	public void test(String un,String pwd)
	{
		System.out.println(un);
		System.out.println(pwd);
	}
}
	