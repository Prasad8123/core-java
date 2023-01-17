package com.xworkz.collection.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PgAnDFees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Integer> maps=new HashMap<String,Integer>();
		
		maps.put("vijaya lakshimi", 6000);
		maps.put("majunatha", 4000);
		maps.put("svj", 4500);
		maps.put("sri durga", 4000);
		maps.put("sj vill", 5000);
		maps.put("buddha", 4500);
		maps.put("sri guru", 6000);
		maps.put("sln", 3500);
		
		
	Collection<String> keys=maps.keySet();
	for (String string : keys) {
		System.out.println("PG Names : "+string);
	}
	
	Collection<Integer> values=maps.values();
	for (Integer integer : values) {
		System.out.println("PG Fees :" +integer);
	}
	
	Set<Entry<String,Integer>> entry=maps.entrySet();
	
      for (Entry<String, Integer> entry2 : entry) {
		System.out.println("PG Name : "+entry2.getKey()+" " +"PG Fees :" +entry2.getValue());
	}
      
      System.out.println(maps.size());
      
     
      
	}

}
