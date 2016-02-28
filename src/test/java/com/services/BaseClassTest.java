package com.services;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClassTest {
	public static WebDriver driver = new FirefoxDriver();

	@BeforeSuite
	public void setup(){
		//System.setProperty("webdriver.chrome.driver", "C:\\SDSU\\jobs\\Selenium\\chromedriver.exe");
		//driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html#sthash.3b7awM2L.dpuf");
		driver.manage().window().maximize();
	}
	@AfterSuite
	public void tearDown(){
		driver.quit();
	}

}
