package com.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{
	String ename;
	int esal;
	
	Employee(String ename, int esal){
		this.ename = ename;
		this.esal = esal;
	}
}

public class Function2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> elist = new ArrayList<>();
		elist.add(new Employee("Don", 30000));
		elist.add(new Employee("Don1", 40000));
		elist.add(new Employee("Don2", 50000));
		elist.add(new Employee("Don3", 25000));
		
		Function<Employee, Integer> f = e->{
			int sal = e.esal;
			
			if(sal>=10000 && sal<=15000)
				return (sal*10/100);
			else if(sal > 15000 && sal <20000)
				return (sal*20/100);
			else
				return (sal*30/100);
			
		};
		
			
		for(Employee emp : elist) {
			int bonus =  f.apply(emp);
			
			System.out.println(emp.ename + " " + emp.esal);
			System.out.println(bonus);
		}
	}

}
