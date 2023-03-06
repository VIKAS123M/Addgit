package com.lambda;

import java.util.function.Predicate;

public class Pred1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 15;
		
		Predicate<Integer> p1 = i->i%2==0;
		
		System.out.println(p1.test(a));

	}

}
