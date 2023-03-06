package com.lambda;

@FunctionalInterface
interface N{
	int add(int a, int b);
}



public class Lam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		N n = (a, b) -> {return (a + b);};
		System.out.println(n.add(10, 30));

	}

}
