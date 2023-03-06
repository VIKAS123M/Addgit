package com.Interface;

public class Interfaceimpl implements Fly {
	
	public void bird() {
		System.out.println("It is flying");
	}
	public void ostrich() {
		System.out.println("It cannot fly");
	}
	static Interfaceimpl i = new Interfaceimpl();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		i.bird();

	}

}
