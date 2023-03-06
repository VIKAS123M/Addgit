package com.lambda;

interface If{
	int func(int a);
}

public class Iff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		If b = (n) -> {
			if(n%2==0) {
				return n;
			}
			return 0;
		};
		System.out.println(b.func(10));
	}

}
