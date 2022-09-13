package com.demo;

public class ArrayXception {
	public void college() {
		
		int [] studentrollno= {11201,11205,11206,11208,11209,11204,112010};
		
		
			try {for(int i=0;i<studentrollno.length;i++) 
			System.out.println("Find the R.no - "+studentrollno[10]);}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("there is index size is 6 so 10 is out of bond it is not possible");
		}
		
		
	}
	public static void main(String[] args) {
		ArrayXception a1 = new ArrayXception();
		a1.college();
		System.out.println("Exception handlling");

		
	}

}
