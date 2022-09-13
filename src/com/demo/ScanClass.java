package com.demo;

import java.util.Scanner;

public class ScanClass {
	public int addno(int a,int b){
        int r = a  / b;
        return r;

    }
    public static void main(String... agr){
        System.out.println("please enter the  first no ");
        ScanClass hmdobject= new ScanClass();
      
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
    
        System.out.println("please enter the  second no ");
        
        int b = sc.nextInt();
        int result =  hmdobject.addno(a,b);
        System.out.println("Final Value is = " + result);

    }
}


