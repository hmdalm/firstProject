package com.demo;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
public class ArrayndLinked {
	public void a1() {
	List <Integer> arrayL = new ArrayList<>();
	arrayL.add(522);
	arrayL.add(5222222);
	arrayL.add(555522);
	
	System.out.println("The ArrayList  :"+arrayL);
	arrayL.set(2,5000);
	System.out.println("The ArrayList1  :"+arrayL);
	}
	public void a2() {
		List <Integer> linkedL = new LinkedList<>();
		linkedL.add(2777);
		linkedL.add(4444);
		linkedL.add(46102);
		
		System.out.println("The LinkedList :"+linkedL);
		linkedL.set(2,9000);
		System.out.println("The LinkedList1 :"+linkedL);
		linkedL.add(0,53535353);
		System.out.println("The LinkedList3 :"+linkedL);

				}
	public void collection() {
		List<String>firstlist = new LinkedList<>();
		firstlist.add("Sare");
		firstlist.add("Jhaan");
		firstlist.add("hamara");
		List<String>secondlist = new LinkedList<>();
		secondlist.add("Acchha");
		secondlist.add("Hindustan");
		secondlist.add(0,"Se");
		System.out.println("The first list is as follow : "+firstlist);
		firstlist.addAll(2, secondlist);
		System.out.println("The Second list is as follow : "+firstlist);
		for(int i=0;i<firstlist.size();i++) {
			System.out.println("|");

			System.out.println(firstlist.get(i));
			
			
		}
		}
		
	
	
	public static void main(String[] args) {
		ArrayndLinked aa1 = new ArrayndLinked();
		aa1.a1();
		aa1.a2();
		aa1.collection();
		
		
	}

}
