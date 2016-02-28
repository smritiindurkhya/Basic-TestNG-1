package com.services;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BaseClass2Test extends BaseClassTest{

	@Test
	public void testMethodone(){
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Smriti");
		boolean a=driver.findElement(By.id("hidden1")).isEnabled();
		System.out.println("last name is hidden :" +a);
		boolean b=driver.findElement(By.id("text4")).isEnabled();
		System.out.println("Hide2 :" +b);
		
	}

}
