package com.demo;

import java.util.Scanner;

public class HmdXsepson { 

	public int div(int a, int b) {
		int c;
		try {
			 c = a / b;
		} catch (ArithmeticException m) {
			m.printStackTrace();
			System.out.println("Some thing wrong happen so result is 0");
			c= 0;
		}
		System.out.println("Calculate the c");
		return c;
	}

	public static void main(String[] args) {
		HmdXsepson h1 = new HmdXsepson();
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int a = s1.nextInt();
		System.out.println("Enter the 2nd number");
		int b = s1.nextInt();
		int result = h1.div(a, b);
		System.out.println("Final Value is = " + result);

	}

}
