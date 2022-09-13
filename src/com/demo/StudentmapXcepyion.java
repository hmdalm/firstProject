package com.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class StudentmapXcepyion {
	public static void main(String[] args) {
		Map<String, Integer> hmd = new HashMap<String,Integer>();
		try {
		hmd.put("Virat kholi", 18);
		hmd.put("MS Dhoni", 7);
		hmd.put("Mohammad Shami", 11);
		hmd.put("Rohit", 35);
		System.out.println("Initial Mappings are: " + hmd);
		System.out.println("The Value is: " + hmd.get("Roh").equals(35));}
		catch(NullPointerException x){ System.out.println("extract the exception");
		 System.out.println(x);
		 
		}
		finally{ System.out.println("the program should be executed");
		{ System.out.println(":: Finally Block:");
		}}
		Iterator<Map.Entry<String,Integer>>entry1=hmd.entrySet().iterator();
		while(entry1.hasNext()) {
			 Map.Entry<String, Integer> entry = entry1.next();
             System.out.println("Key = " + entry.getKey() + 
                                 ", Value = " + entry.getValue());
             
		}
	}
	

}
