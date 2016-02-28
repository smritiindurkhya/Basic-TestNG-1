package com.services;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ChildClassTest {
	

	@Test
	public void carColorTest(){
		ChildClass childClass = new ChildClass();
		String str = childClass.carColor();
		Assert.assertEquals(str, "yellow");
	}
	
	@Test
	public void interestTest(){
		ChildClass childClass = new ChildClass();
		double amt=childClass.interest(500, 1, 2);
		Assert.assertEquals(amt, 10.0);
	}

}
