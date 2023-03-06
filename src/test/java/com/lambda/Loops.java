package com.lambda;

import java.util.ArrayList;
import java.util.List;

interface Loopss{
	int print(int a);
}

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loopss l = (n)->{
			if(n%2 == 0) {
				return n;
			}
			return 0;
		};
		
		List<Integer> li = new ArrayList<>();
		li.add(10);
		li.add(25);
		li.add(30);
		li.add(45);
		li.add(50);
		li.add(55);
		li.add(60);
		List<Integer> v = new ArrayList<>();
		for(int c : li) {
			int g = l.print(c);
			if(g>0) {
				v.add(g);
			}
		}
		for(int h:v)
			System.out.println(h);
	}

}
