package com.blaze.testcases;

import org.testng.annotations.Test;

import com.blaze.base.Page;
import com.blaze.pages.actions.HomePage;
import com.blaze.pages.actions.LoginPage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestCaseLogin {
	@Test
	public void loginTest() throws InterruptedException {

		Page.initConfiguration();
		HomePage hp = new HomePage();
		LoginPage lp = hp.gotoLogin();
		hp = lp.enterLoginDetails();
		Page.quitBrowser();
	}

	@BeforeTest
	public void beforeTest() {

		System.out.println("before login test");
	}

	@AfterTest
	public void afterTest() {

		System.out.println("after login test");
	}

}
