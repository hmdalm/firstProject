package com.demo;
// testing
public abstract class Abstraction1 {
	abstract void hotday(); 
	public void summer() {
		System.out.println("School holidays");
	}  
		
	class Summmer extends Abstraction1{  
		public void hotday(){
			System.out.println("The summer temprature is 35-42");}  
	}
	
	 
	public static void main(String args[]){  
		Summmer s = new Abstraction1();
	s.hotday();  
	}  }
	
	
	
	


