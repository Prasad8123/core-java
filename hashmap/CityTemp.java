package com.xworkz.collection.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CityTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Double>  map=new HashMap<String, Double>();
		map.put("Banglore", 28.0);
		map.put("Ballari", 38.6);
		map.put("belagavi",30.5);
		map.put("gulbaraga",35.4);
		map.put("hubli",30.5);
		map.put("daravada",28.5);
		map.put("hasan",22.3);
		map.put("thumakuru",27.2);
		map.put("mangalur",21.2);
		map.put("udupi",24.6);
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		System.out.println(map.size());
		
		if(map.isEmpty())
		{
				System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		
		Set<String> keys=map.keySet();
		keys.forEach(e->System.out.println(e));
		
		Collection<Double> values=map.values();
		
		for(Double dou:values)
		{
			System.out.println(dou);
		}
		
		Set<Entry<String,Double>> entries=map.entrySet();
		
		for(Entry<String,Double> entr:entries)
		{
			System.out.println(entr.getKey() + " " + entr.getValue());
			
		}
		

		

	}

}
