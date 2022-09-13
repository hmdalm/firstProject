package com.demo;
import java.util.*;
public class Hmdreturn {
	
	 
	
	public static void main(String[] args) {
	    
	   	    HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
	 
	  
	    hash_map.put(10, "i am here");
	    hash_map.put(15, "some one");
	    hash_map.put(20, "you");
	    hash_map.put(25, "Welcomes");
	    hash_map.put(30, "me &");
	 
	   
	    System.out.println("Initial Mappings are: " + hash_map);
	 
	    
	    String returned_value = (String)hash_map.remove(20);
	 
	   
	    System.out.println("Returned value is: "+ returned_value);
	 
	    
	    System.out.println("New map is: "+ hash_map);
	}
	}

