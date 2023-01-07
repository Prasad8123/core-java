package com.xworkz.collection.streamimpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class Colors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Collection<String> color=new ArrayList<String>();
		color.add("red");
		color.add("blue");
		color.add("green");
		color.add("yellow");
		color.add("brown");
		color.add("orange");
		color.add("brown");
		
		//Retrieve data
		System.out.println("retrive the data using foreach....");
		color.stream().forEach(e->System.out.println(e));
		
		  //ToUppercase for list
		System.out.println("to uppercase for list");
		color.stream().map((ele)->ele.toUpperCase())
				.collect(Collectors.toList())
				.forEach(e->System.out.println(e));
		
		System.out.println("to uppercase for set");
		color.stream().map(e->e.toUpperCase())
		.collect(Collectors.toSet())
		.forEach(e->System.out.println(e));
		
		System.out.println("endswith using list");
		
		color.stream().filter(element->element.endsWith("e"))
		.map(element->element.toUpperCase())
		.collect(Collectors.toList())
		.forEach(e->System.out.println(e));
		
		System.out.println("contains and index");
		color.stream()
		.filter(element->element.endsWith("n"))
		.filter(element->element.contains("r"))
		.map(element->element.charAt(3))
		.collect(Collectors.toList())
		.forEach(e->System.out.println(e));

	}

}
