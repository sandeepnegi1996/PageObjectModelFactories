package com.blaze.rough;

import org.openqa.selenium.support.PageFactory;

import com.blaze.base.Page;
import com.blaze.pages.actions.HomePage;
import com.blaze.pages.actions.LoginPage;

public class TestNavigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		Page.initConfiguration();
		HomePage hp= Page.topNavigation.gotoCart();
		LoginPage lp=hp.gotoLogin();
		hp=lp.enterLoginDetails();	
		Page.quitBrowser();

	}

}
