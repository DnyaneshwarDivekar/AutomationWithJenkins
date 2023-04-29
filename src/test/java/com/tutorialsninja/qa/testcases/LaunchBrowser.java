package com.tutorialsninja.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

import com.tutorialsninja.qa.base.Base;

public class LaunchBrowser extends Base {
	
public	WebDriver driver;
	
	@Test
	
	public void launchBrowser() {
		
//		FirefoxOptions opt = new FirefoxOptions();
//		
//		opt.addArguments("--headless");
//		
//		driver = new FirefoxDriver(opt);
//		
//		
	 driver = 	initializeBrowserAndOpenApplicationURL("firefox");
		
		
		System.out.println("*************Browser Started*********");
		
//		driver.get("http://tutorialsninja.com/demo/");
		
		System.out.println("*************Navigated to URL*********");
		
		String url = driver.getCurrentUrl();
		String title = 	driver.getTitle();	
		
		System.out.println(driver);
		
		driver.quit();
		
		System.out.println("*************Browser Closed*********");
		
		System.out.println(url);
		System.out.println(title);
		System.out.println(driver);
	}
	
	@Test
	public void getPageSource() {
		
		driver = 	initializeBrowserAndOpenApplicationURL("firefox");
		
		
		System.out.println("*************getPageSource Method Browser Started*********");
		
	//	String pageSource = driver.getPageSource();
		
	//	System.out.println(pageSource);
		
		System.out.println("**********getPageSource Method Done**********");
		
		
	}

}
