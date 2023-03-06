package com.Interface;

public class AnonymousInner implements Fly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fly f = new Fly() {
			public void bird() {
				System.out.println("It is flying");
			}
			public void ostrich() {
				System.out.println("it cannot fly");
			}
		};
		f.bird();
		f.ostrich();
	}

}
