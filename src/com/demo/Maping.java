package com.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Maping {
	public void map1() {
		Map<Integer,String> hmd = new HashMap<Integer,String>();
		hmd.put(200,"Hammad");
		hmd.put(205,"alam");
		hmd.put(215,"Javed");
		hmd.put(225,"Salman");
		for(Map.Entry<Integer,String> h : hmd.entrySet() ) {
		System.out.println(h.getKey()+": "+ h.getValue());
		

	}

	}
	public void map2() {
		Map<Integer,String> hmd1 = new HashMap<Integer,String>();
		hmd1.put(2099,"Guddu");
		hmd1.put(2095,"Dabbu");
		hmd1.put(2195,"Khabbu");
		hmd1.put(2295,"Sajju");
		Iterator<Map.Entry<Integer, String>> itr = hmd1.entrySet().iterator();
		 while(itr.hasNext())
	        {
	             Map.Entry<Integer, String> entry = itr.next();
	             System.out.println("Key = " + entry.getKey() + 
	                                 ", Value = " + entry.getValue());
	        }
		
	}
	public void map5() {
		Map<String,Integer>hmd12=new HashMap<String,Integer>();
		hmd12.put("1. HMD Mo.No :",100);
		hmd12.put("2. DNS Mo.No :",101);
		hmd12.put("3. SHDB Mo.No :",102);
		hmd12.put("4. SJD Mo.No :",103);
		for(Map.Entry<String, Integer> m:hmd12.entrySet()){
		
		System.out.println( m.getKey() + 
                 + m.getValue());}
	}
	public static void main(String[] args) {
		Maping m1 = new Maping();
		m1.map1();
		System.out.println("The Details as follow");
		m1.map2();
		System.out.println("the person & Mo.No is given below");
		m1.map5();
		
		

	}
}
