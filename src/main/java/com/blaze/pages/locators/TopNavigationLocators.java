package com.blaze.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopNavigationLocators {
	
	
	@FindBy(xpath = "//a[contains(text(),'Cart')]")
	public WebElement cartElement;

}
