package com.xworkz.collection.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MetroCityNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String m1="Banglore";
		String m2="hydrabad";
		String m3="chenai";
		String m4="mumbai";
		String m5="trivenmdram";
		
		Collection<String> cities=new ArrayList<String>();
		cities.add(m1);
		cities.add(m2);
		cities.add(m3);
		cities.add(m4);
		cities.add(m5);
		
		
		System.out.println(cities);
		
		System.out.println("------------for each-----------------------------------------");
		
		for(String ref:cities)
		{
			System.out.println(ref);
		}
		
		
		System.out.println("------------------Iterator------------------------------------");
		
		Iterator<String> ref=cities.iterator();
		
		while(ref.hasNext()) {
			
			String element=ref.next();
			System.out.println(element);
		}
		

	}

}
