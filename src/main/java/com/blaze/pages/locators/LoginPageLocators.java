package com.blaze.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
	
	@FindBy(css = "#loginusername")
	public  WebElement userNameElement;
	
	@FindBy(xpath = "//div[@id='logInModal']//input[@type='password']")
	public  WebElement inputPassword;
	 
	@FindBy(xpath =" //button[contains(text(),'Log in')]")
	public  WebElement loginBtn1;
	
	

}
