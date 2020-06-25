package com.blaze.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.blaze.base.Page;
import com.blaze.pages.locators.LoginPageLocators;

public class LoginPage extends Page {

	public LoginPageLocators loginpage;

	public LoginPage() {
		this.loginpage = new LoginPageLocators();
		AjaxElementLocatorFactory factory=new AjaxElementLocatorFactory(driver, 15);
		PageFactory.initElements(factory, this.loginpage);
	}

	public HomePage enterLoginDetails() throws InterruptedException {

		//loginpage.userNameElement.sendKeys("sandeepnegi1996");
		
		type(loginpage.userNameElement,"sandeepnegi1996");
		

		System.out.println("Enetering the username for Login");

		Thread.sleep(3000);

/*		loginpage.inputPassword.sendKeys("S@ndeep96");
*/		
		type(loginpage.inputPassword,"S@ndeep96");

		//loginpage.loginBtn1.click();
		
		click(loginpage.loginBtn1);

		Thread.sleep(3000);

		return new HomePage();

	}

}