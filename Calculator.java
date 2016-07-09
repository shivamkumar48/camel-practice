package com.practice.calculator;

import javax.jws.*;

@WebService(serviceName="calci")
public class Calculator {

	@WebMethod
	public int addition(int a , int b) {
		
		int c = a+b;
		return c;
		
	}
}
