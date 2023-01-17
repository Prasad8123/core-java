package com.xworkz.collection.hashmap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MobilePrice {

	public static void main(String[] args) {
		
		Map<String,Double> mobile=new TreeMap<String, Double>((e1,e2)->e2.compareTo(e1));
		mobile.put("Samsung galaxy note13",80000D);
		mobile.put("samsung galaxy fe12", 60000D);
		mobile.put("redmi note14", 15000D);
		mobile.put("redmi 9", 9000D);
		mobile.put("realme narzo10", 10000D);
		mobile.put("poco c3", 7000D);
		mobile.put("poco m4", 12000D);
		mobile.put("one pluse", 55000D);
		mobile.put("iquoo 2", 20000D);
		mobile.put("samsung galaxy m31", 16000D);
		
		
         System.out.println(mobile.size());
         
         System.out.println(mobile.keySet());
         System.out.println(mobile.values());
		
      Set<Entry<String, Double>> entry=mobile.entrySet();
		
		for (Entry<String, Double> entry2 : entry) {
			
		
			
			System.out.println(entry2.getKey().toUpperCase() + " " +entry2.getValue());
		}
		
		System.out.println(System.lineSeparator());
		
		 Set<Entry<String, Double>> entry1=mobile.entrySet();
			
			for (Entry<String, Double> entry2 : entry1) {
				
				if(entry2.getValue() >10000)
				
				System.out.println(entry2.getKey().toUpperCase() + " " +entry2.getValue());
			}
	

		mobile.forEach((e1,e2)->{
			
		if(e1.length() < 8)
			System.out.println(e1 + e2);
			
		});
		
		
		System.out.println(System.lineSeparator());
		
		Set<Entry<String,Double>> entry3= mobile.entrySet();
		for (Entry<String, Double> entry2 : entry3) {
			
			System.out.println(entry2.getKey() +  entry2.getValue());
		}
	}

}
