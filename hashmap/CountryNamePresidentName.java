package com.xworkz.collection.hashmap;

import java.util.Map;
import java.util.TreeMap;

public class CountryNamePresidentName {

	public static void main(String[] args) {
		
		Map<String,String> p=new TreeMap<String, String>();
		p.put("India","droupadi murmu");
		p.put("America", "jeo baiden");
		p.put("Rashiya", "puthin");
		p.put("china", "jenping");
		p.put("Bangladesh", "abdul hamid");
		p.put("Belarus","Alexander lukashenko");
		p.put("Belgium", "philippe");
		p.put("Brazil","jair bolsonaro");
		p.put("Canada", "charles 111");
		p.put("Egypt", "abdel fattahel");
		p.put("France","Emmanuel marcron");
		p.put("Germany","frank walter");
		p.put("greece", "katerina");
		p.put("Iceland","johanson");
		p.put("Iran", "ali khamenei");
		p.put("Iraq","abdullatif rashid");
		p.put("Israel", "isaac herzong");
		p.put("Japan", "naruhito");
		p.put("Mali", "assimi goita");
		p.put("Mexico", "andres manuel lopez");
		p.put("Myanmar", "myiint swe");
		
		
		System.out.println(p.size());
		
		System.out.println(p.keySet());
		
		p.forEach((key,value)->{
			if(key.length() >5)
			{
				System.out.println("keys : " +key + " " + "value : " +value);
			}
			
		});
		

	}

}
