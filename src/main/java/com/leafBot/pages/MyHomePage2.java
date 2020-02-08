package com.leafBot.pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;




public class MyHomePage2 extends ProjectSpecificMethods {

	public MyHomePage2(RemoteWebDriver driver, ExtentTest node, ExtentTest test){
		this.driver = driver;
		this.node = node;
		this.test = test;
		PageFactory.initElements(driver, this);
	}


	
	public MyHomePage2 verifyPageTitle() throws InterruptedException
	{
		Thread.sleep(2000);
		String title = "ACME System 1 - Dashboard";
		verifyTitle(title);
		return this;
	}


}
