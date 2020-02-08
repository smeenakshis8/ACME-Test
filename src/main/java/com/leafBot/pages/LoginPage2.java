package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginPage2 extends ProjectSpecificMethods{
	
	public LoginPage2(RemoteWebDriver driver, ExtentTest node, ExtentTest test){
		this.driver = driver;
		this.node = node;
		this.test = test;
		PageFactory.initElements(driver,this);
	}
	 
	@FindBy(how=How.ID,using="email")
	private WebElement eleUserName;	
	
	@FindBy(how=How.ID,using="password")
	private WebElement elePassword;	
	
	@FindBy(how=How.ID,using="buttonLogin")
	private WebElement eleLogin;
	
//	@FindBy(how=How.ID, using = "errorDiv")
//	private WebElement eleVerifyErrMsg;
	
	
	@Given("Enter the username as (.*)")
	public LoginPage2 enterUserName(String data) {	
		clearAndType(eleUserName, data);
		return this;
	}	

	@Given("Enter the Password as (.*)")
	public LoginPage2 enterPassword(String data) {
		clearAndType(elePassword, data);
		return this;
	}	
	
	@Given("Click on the Login")
	public MyHomePage2 clickLogin() {
		click(eleLogin);
		return new MyHomePage2(driver, node, test);		
	}
	
//	public LoginPage2 clickLogInForFailer() {
//		click(eleLogin);
//		return this;		
//	}
//	
//	@Given("Verify the error message (.*)")
//	public LoginPage2 verifyErrorMsg(String data) {
//		verifyPartialText(eleVerifyErrMsg, data);
//		return this;
//	}
	
	
}
