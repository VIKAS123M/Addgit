package com.steps;

public class Ohhk {
	static int num = 100;
	public void calc(int num) {
		this.num = num;
	}
	public void printNum() {
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		Ohhk k = new Ohhk();
		k.calc(2);
		System.out.println(true);
		k.printNum();
	}

}
