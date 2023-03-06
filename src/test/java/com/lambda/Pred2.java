package com.lambda;

import java.util.function.Predicate;

public class Pred2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,15,20,25,30,45,55};
		
		Predicate<Integer> p1 = i->i%2==0;
		Predicate<Integer> p2 = i->i>20;
		
		for(int n : a) {
			if(p1.and(p2).test(n)) {
				System.out.println(n);
			}
			//System.out.println("or");
//			if(p1.or(p2).test(n)) {
//				System.out.println(n);
//			}
			//System.out.println("negate");
//			if(p1.negate().test(n)) {
//				System.out.println(n);
//			}
		}

	}

}
