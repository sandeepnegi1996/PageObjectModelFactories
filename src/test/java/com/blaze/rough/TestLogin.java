package com.blaze.rough;

import com.blaze.base.Page;
import com.blaze.pages.actions.HomePage;
import com.blaze.pages.actions.LoginPage;

public class TestLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Page.initConfiguration();
		HomePage hp=new HomePage();
		LoginPage lp=hp.gotoLogin();
		hp=lp.enterLoginDetails();	
		Page.quitBrowser();
		
	}
	
	
	

}
