package com.xworkz.collection.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String animal1="Dog";
		String animal2="cat";
		String animal3="lion";
		String animal4="tiger";
		String animal5="elephant";
		String animal6="hours";
		String animal7="camel";
		String animal8="snake";
		String animal9="egual";
		String animal10="heppopotamus";
		
		//Boxing
		
		Collection<String> animal= new ArrayList<String>();
		animal.add(animal10);
		animal.add(animal9);
		animal.add(animal8);
		animal.add(animal7);
		animal.add(animal6);
		animal.add(animal5);
		animal.add(animal4);
		animal.add(animal3);
		animal.add(animal2);
		animal.add(animal1);
		
		
		// Un-Boxing
		
		for(String ref :animal)
		{
			System.out.println(ref);
		}
		
		
		System.out.println("-------------Iterator -------------------------------");
		
		Iterator<String> ref=animal.iterator();
		
		while(ref.hasNext())
		{
			String element=ref.next();
			System.out.println(element);
		}
		
		

	}

}
