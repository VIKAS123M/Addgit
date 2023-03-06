package com.lambda;

import java.util.function.Function;

public class Funtion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer, Integer> f = n-> n*n;
		
		System.out.println(f.apply(10));
		System.out.println(f.apply(25));
		
		Function<String, Integer> f1 = a -> a.length();
		
		System.out.println(f1.apply("Welcome"));
	}

}
