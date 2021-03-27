package com.testNga;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo extends BaseTest{
	@Test
	public void test_01()
	{
		Reporter.log("user purchased plan successfully",true);
	}
}
