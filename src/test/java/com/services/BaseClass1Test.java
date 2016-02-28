package com.services;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BaseClass1Test extends BaseClassTest {

	@Test
	public void testmethodone(){
	String str1=driver.getTitle();
	System.out.println("Title of the page is : " +str1);
	String str2=driver.findElement(By.className("post-title")).getText();
	System.out.println("Post Title of the page is : " +str2);
		
	}

}
