package com.demo;

import java.util.HashSet;
import java.util.Set;

public class Sethmd {
	public void add1() {
		Set<Integer> a1=new HashSet<>();
		a1.add(225);
		a1.add(228);
		a1.add(230);
		a1.add(289);
		a1.add(258);
		System.out.println(a1);
		Integer check = 258;
		System.out.println(check +" "+a1.contains(check));
	}
	public void addall1() {
		Set<Integer> data=new HashSet<>();
		data.add(2000);
		data.add(3000);
		data.add(5000);
		data.add(8000);
		data.add(9000);
		System.out.println("Set1 :"+data);
		Set<Integer> newdata=new HashSet<>();
		newdata.add(500);
		newdata.add(1000);
		newdata.add(1500);
		newdata.add(2500);
		System.out.println("Set2 :"+newdata);
		data.addAll(newdata);
		System.out.println(data);
		data.add(8000);
		System.out.println("Set01 :"+data);
		data.add(999);
		System.out.println("Set02 :"+data);
		data.clear();
		System.out.println("final set :"+data);
		
	}
	


}
