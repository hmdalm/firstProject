package com.demo;

import java.util.Scanner;

public class Throw {
	
	
	 
	public void vote(int age) {
	
	
	
	if(age<18) {throw new ArithmeticException("Voter Not applicable for vote");
	
}
	else {
		System.out.println("18 age and above voter are eligible for voting");
	}
	
}
public static void main(String[] args) {
	System.out.println("Please enter your Age");
	Throw hmd = new Throw();

	Scanner sc1 = new Scanner(System.in);
	
	
	
	int agthtbe=sc1.nextInt();
	
	
	hmd.vote(agthtbe);
	sc1.close();
}
}
