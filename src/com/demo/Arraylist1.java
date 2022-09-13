package com.demo;
import java.util.ArrayList;

import java.util.List;



public class Arraylist1 {
	public void emid() {
		List <Integer> Employeeid = new ArrayList<>();
		Employeeid.add(105);
		Employeeid.add(115);
		Employeeid.add(125);
		Employeeid.add(135);
		Employeeid.add(145);
		Employeeid.add(155);
		System.out.println("Employeeid");
		for(int i=0;i<Employeeid.size();i++) {
		System.out.println(Employeeid.get(i) );}
		Employeeid.set(2,786);
		System.out.println(Employeeid.get(2) );
		System.out.println("Checking again the array list after set new value" );
		for(int i=0;i<Employeeid.size();i++) {
			System.out.println(Employeeid.get(i) );}
		
				
	}
	public void emid1(){
		ArrayList <String> Employeenm = new ArrayList<>();
		Employeenm.add("Hammad");
		Employeenm.add("Guddu");
		Employeenm.add("Dinesh Bhai");
		Employeenm.add("Shehjad");
		Employeenm.add("Shadab");
		Employeenm.add("Jannat");
		System.out.println("Employee Name");
		int x=0;
		while(x<Employeenm.size()) {
			System.out.println(Employeenm.get(x) );
		   x++;	
		}}
		public void emid2() {
			ArrayList <String> EmpCity = new ArrayList<>();
			EmpCity.add("Delhi");
			EmpCity.add("Gurgaon");
			EmpCity.add("Chennai");
			EmpCity.add("Mumbai");
			EmpCity.add("Lucknow");
			EmpCity.add("Jammu");
			System.out.println("City Name");
			for(String data : EmpCity) {
				System.out.println(data);
			}
			
			
		}
		
		
			
}
	



