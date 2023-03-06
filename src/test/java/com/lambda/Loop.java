package com.lambda;

interface Looping{
	void loops(int n);
}

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Looping l = (n) -> {
			for(int i = n; i > 0; i-- ) {
				System.out.println(i);
				
			}
		};
		l.loops(10);
	}

}
