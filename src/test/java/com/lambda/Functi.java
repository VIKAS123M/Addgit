package com.lambda;

@FunctionalInterface
interface New{
	void show();
}

public class Functi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		New n = new New() {
			public void show() {
				System.out.println("Hello");
		}
		};
		n.show();

	}

}
