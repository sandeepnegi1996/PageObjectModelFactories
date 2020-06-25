package com.blaze.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.blaze.base.Page;
import com.blaze.pages.locators.HomePageLocators;

public class HomePage extends Page{
	
	//findby finds the element and return the element whcich is stored in login button

	
	public HomePageLocators home;
	
	public HomePage() {
		this.home=new HomePageLocators();
		
		AjaxElementLocatorFactory factory=new AjaxElementLocatorFactory(driver, 15);
		PageFactory.initElements(factory,this.home);
	}

	public LoginPage gotoLogin() {
		
		System.out.println("Starting the login Action");
		home.loginBtn.click();
		System.out.println("clicked on the login button");
		return new LoginPage();
	}
	
	
	public void gotoSignup() {
		
	}
}
