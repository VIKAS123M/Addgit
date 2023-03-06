package com.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee1{
	String ename;
	int esal;
	
	Employee1(String ename, int esal){
		this.ename=ename;
		this.esal=esal;
	}
}


public class Consumer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee1> emplist = new ArrayList<>();
		emplist.add(new Employee1("Don", 20000));
		emplist.add(new Employee1("Don1", 30000));
		emplist.add(new Employee1("Don2", 35000));
		emplist.add(new Employee1("Don3", 25000));
		emplist.add(new Employee1("Don4", 50000));
		
		
		Function<Employee1, Integer> f = emp->{
			if(emp.esal>=20000 && emp.esal < 30000)
				return (emp.esal*10/100);
			else if(emp.esal>=30000 && emp.esal<=40000)
				return (emp.esal*20/100);
			else
				return (emp.esal*30/100);
		};
		
		Predicate<Integer> p = (n)->n>5000;
		
		Consumer<Employee1> c = e->{
			System.out.println(e.ename + " " + e.esal);
		};
		
		for(Employee1 e1: emplist) {
			int bonus = f.apply(e1);
			if(p.test(bonus)) {
				c.accept(e1);
				System.out.println(bonus);
			}
		}
	}

}
