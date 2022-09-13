package com.demo;

import java.util.HashMap;
import java.util.Map;

public class HashEqual {
	public static void main(String[] args) {
		
	
	Map<String,String>mp1=new HashMap<String,String>();
	mp1.put("Mera","Naam");
	mp1.put("Tera","Kaam");
	
	for(Map.Entry<String , String> st : mp1.entrySet() ) {
	System.out.println(st.getKey() + " "+st.getValue() );
	}

}}
