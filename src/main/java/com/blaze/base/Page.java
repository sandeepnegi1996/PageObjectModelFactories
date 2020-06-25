package com.blaze.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.blaze.pages.actions.TopNavigation;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Page {

	public static WebDriver driver = null;
	public static TopNavigation topNavigation = null;

	public static void initConfiguration() {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--diable-infobars");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);

		driver.get(Constants.testsiteurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		topNavigation = new TopNavigation(driver);

	}

	public static void quitBrowser() {
		if (driver != null)
			driver.quit();
	}

}
