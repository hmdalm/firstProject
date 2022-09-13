package com.demo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Student1 {
	public void rollno() {
		List <Integer> lsroll = new LinkedList<>();
		lsroll.add(626119);
		lsroll.add(626120);
		lsroll.add(626121);
		lsroll.add(626122);
		lsroll.add(626123);
		Iterator<Integer> it1=lsroll.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		
		}

	}
	public void stName() {
		List <String> lsname = new LinkedList<>();
		lsname.add("Daniel");
		lsname.add("Baron");
		lsname.add("Drew");
		lsname.add("Randy");
		lsname.add("Edge");
		Iterator<String> it2=lsname.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		
		}

	}
	

}
