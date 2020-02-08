package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.pages.LoginPage2;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TC008_LoginLogOutPractice extends ProjectSpecificMethods{	

	@BeforeTest
	public void setValues() {
		testCaseName = "Login and LoginOut";
		testDescription = "Login testCase for ACME website";
		nodes = "Verify title";
		authors = "Suganya";
		category = "Smoke";
//		dataSheetName = "TC001";
	}

	@Test(dataProvider = "fetchData")
	public void createLeaf(String userName, String password) throws InterruptedException {
		new LoginPage2(driver, node, test)
		.enterUserName(userName)
		.enterPassword(password)
		.clickLogin()
		.verifyPageTitle();
	}
		
		
//		.enterUserName(userName)
//		.enterPassword(password)
//		.clickLogin()
//		.clickLogout();		
	}








