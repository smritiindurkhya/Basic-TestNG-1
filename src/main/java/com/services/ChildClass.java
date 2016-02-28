package com.services;


public class ChildClass{
	
	
	protected int milege(int a) {
		return a * a * a;
	}
	
	
	public String carColor(){
		return "yellow";
		
	}
	
	public double interest(long p,double r,int t){
		double amt=p*r*t/100;
		return amt;
	}

}
