package com.services;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BaseClass3Test extends BaseClassTest {

	@Test
	public void testMethodone() {
		int count = driver.findElements(By.xpath("//input[@name='vehicle']"))
				.size();

		for (int i = 0; i < count; i++) {
			String text = driver
					.findElements(By.xpath("//input[@name='vehicle']")).get(i)
					.getAttribute("value");
			if (text.equals("Car")) {

				driver.findElements(By.xpath("//input[@name='vehicle']"))
						.get(i).click();

			}

		}

	}
}
