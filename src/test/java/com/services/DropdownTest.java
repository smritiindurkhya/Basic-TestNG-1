package com.services;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownTest {

	//public static void main(String[] args) throws InterruptedException {
@Test
public void invokeBrowser() throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.spicejet.com");
		driver.findElement(
				By.id("ctl00_mainContent_ddl_originStation1_CTXTaction"))
				.click();
		driver.findElement(By.linkText("Pune (PNQ)")).click();
		Thread.sleep(10000L);
		driver.findElement(By.linkText("Goa (GOI)")).click();
		Select dropdown = new Select(driver.findElement(By
				.id("ctl00_mainContent_ddl_Adult")));
		dropdown.selectByValue("6");
		Thread.sleep(10000L);
		driver.findElement(
				By.xpath("html/body/form/div[4]/div[2]/div/div[4]/div[1]/div/div[2]/div[2]/div/div[6]/div[1]/input"))
				.click();
		System.out.println("check");
		// clicking again to uncheck the button
		driver.findElement(
				By.xpath("html/body/form/div[4]/div[2]/div/div[4]/div[1]/div/div[2]/div[2]/div/div[6]/div[1]/input"))
				.click();
		System.out.println("uncheck");
		boolean a = driver
				.findElement(
						By.xpath("html/body/form/div[4]/div[2]/div/div[4]/div[1]/div/div[2]/div[2]/div/div[6]/div[1]/input"))
				.isSelected();
		
		System.out.println("is given checkbox is selected :" + a);
		driver.close();

	}

}

