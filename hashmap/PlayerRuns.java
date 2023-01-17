package com.xworkz.collection.hashmap;

import java.util.Map;

import java.util.TreeMap;

public class PlayerRuns {

	public static void main(String[] args) {

		Map<String, Integer> player = new TreeMap<String, Integer>((e1, e2) -> e2.compareTo(e1));
		player.put("Sachine", 100000);
		player.put("Virat kholi", 30000);
		player.put("Dravid", 9000);
		player.put("Bhoomra", 50000);
		player.put("Kapil dev", 1100000);

		player.forEach((e1, e2) -> System.out.println(e1 + e2));
		
		System.out.println(System.lineSeparator());

	
	
    		  
	}

}
