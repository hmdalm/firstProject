package com.demo;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Xception1 {
	 public static void main(String args[])   
	    {   
	        Set<Integer> data = new LinkedHashSet<Integer>();   
	        data.add(31);   
	        data.add(21);   
	        data.add(41);   
	        data.add(51);   
	        data.add(11);   
	        data.add(81);   
	        System.out.println("Set1 :- " + data); 
	        System.out.println("the data Set contains '11'?" + data.contains(11));   
	        System.out.println("the data Set contains '112'?" + data.contains(112)); 
	        ArrayList<Integer>newData = new ArrayList<Integer>();
	        newData.add(2112);
	        newData.add(6151);
	        newData.add(654153);
	        newData.add(156416);
	        System.out.println("Set2 :- " + newData); 
	        data.addAll(newData);
	        
	        System.out.println("Set both :- " + data);
	        
}
}