package com.lambda;

import java.util.ArrayList;
import java.util.List;
public class Impl {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.forEach((n) -> System.out.println(n));
		}
	}