package com.demo;

public class HmdXception {
	 int a;
	 int b;
	 public int hmd(int a,int b) {
	this.a=a;
	this.b=b;
		int c = a+b;
		System.out.println("the value of c ="+c);
		return c;
		 
	 }
		  public static void main(String args[]){  
		   try{  
		        
		      int data=100/0;  
		   }catch(ArithmeticException x){System.out.println(x.toString());}  
		   
		   System.out.println("rest of the code..." ); 
		   HmdXception h1=new HmdXception();
		   h1.hmd(35,100);
		   h1.array1();
		   
		  } 
		  
		        public void array1() {
		        int[] arr = new int[4];
		        try {
		       
		        int i = arr[4];}catch(ArrayIndexOutOfBoundsException h) {
		        	System.out.println(h);}
		        
		 
		       
		        System.out.println("Hi, I want to execute");
		    }
		
}
	

