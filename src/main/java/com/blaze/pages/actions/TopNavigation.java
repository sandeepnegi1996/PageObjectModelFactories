package com.blaze.pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.blaze.base.Page;
import com.blaze.pages.locators.TopNavigationLocators;

public class TopNavigation {
	
	
	public TopNavigationLocators topNavigation;
	public TopNavigation(WebDriver driver) {
		this.topNavigation=new TopNavigationLocators();
		AjaxElementLocatorFactory factory=new AjaxElementLocatorFactory(driver, 15);
		PageFactory.initElements(factory,this.topNavigation );
		
	}

	public HomePage gotoCart() {
		//topNavigation.cartElement.click();
		
		Page.click(topNavigation.cartElement);
		
		//when we click on the cart it will be redirectoed to the home page
		System.out.println("clicked on the cart");
		return new HomePage();
	}
	
	
	


}
