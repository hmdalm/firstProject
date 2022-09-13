package com.demo;
import java.util.ArrayList;
import java.util.Iterator;

public class GuesstList {
	public void newGuesst() {
		ArrayList<Integer> guesstID= new ArrayList<>();
		guesstID.add(17600);
		guesstID.add(17601);
		guesstID.add(17602);
		guesstID.add(17603);
		guesstID.add(17604);
		
		Iterator<Integer> itr = guesstID.iterator();
		while(itr.hasNext())
		System.out.println(itr.next());}
		public void newGuesstnm() {
			ArrayList<String>guesstNM= new ArrayList<>();
			guesstNM.add("Gurbaz");
			guesstNM.add("Nabi");
			guesstNM.add("Rashid");
			guesstNM.add("Mujeeb");
			guesstNM.add("Fazal");
			int r = guesstNM.size() -1 ;
			while(r >= 0) {
				System.out.println(guesstNM.get(r));
				r--;
			}}
			public void guesstcity() {
				ArrayList<String> gusCity=new ArrayList<>();
				gusCity.add("Chandigarh");
				gusCity.add("Lakhimpur");
				gusCity.add("Rampur");
				gusCity.add("Indore");
				gusCity.add("Faizabad");
				for (String data : gusCity) {
				System.out.println(data);}
			}
			
			
			
		}
			

		

		
		
	


