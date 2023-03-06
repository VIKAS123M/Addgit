package com.lambda;

import java.util.Date;
import java.util.function.Supplier;

public class Supplier1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<Date> s = ()->new Date();
		
		System.out.println(s.get());

	}

}
