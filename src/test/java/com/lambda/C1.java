package com.lambda;

import java.util.ArrayList;
import java.util.List;

interface Inemp{
	boolean result(c2 o);
	
	default int rere(int a) {
		int total = a * a;
		return total;
	}
}




class c2{
	String ename;
	int esalary;
	int eexperience;
	
	c2(String name, int sal, int exp){
		ename = name;
		esalary = sal;
		eexperience = exp;
	}
}




public class C1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inemp a = (o)->{
			if(o.esalary>35000 && o.eexperience>2)
				return true;
			return false;
		};
		List<c2> li = new ArrayList<>();
		li.add(new c2("David",20000,3));
		li.add(new c2("Finn",50000,4));
		li.add(new c2("Dave",60000,6));
		li.add(new c2("Rin",70000,2));
		li.add(new c2("Ad",80000,5));
		for(c2 r: li) {
			if(a.result(r)) {
				System.out.println(r.ename + "  " + r.esalary);
				System.out.println(a.rere(r.eexperience));
			}
		}
	}

}
