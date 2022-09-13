package com.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayTest1 {
	public static void main(String[] args) {
		System.out.println("Itreator city list :");
		
			ArrayList <String> EmpCity1 = new ArrayList<>();
			EmpCity1.add("bombay");
			EmpCity1.add("punjab");
			EmpCity1.add("roorkee");
			EmpCity1.add("deoband");
			EmpCity1.add("nagpur");
			EmpCity1.add("kashmir");
		
			Iterator<String> hmd = EmpCity1.iterator();
			while(hmd.hasNext()) {
			
				System.out.println(hmd.next());
			}
		
			Arraylist1 ar1= new Arraylist1();
			ar1.emid();
			
			Arraylist1 ar2 = new Arraylist1();
			ar2.emid1();
			Arraylist1 ar3 = new Arraylist1();
			ar3.emid2();
			Maping m1 =new Maping();
			m1.map1();
			
			
		
	}
	}

