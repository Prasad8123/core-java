package com.xworkz.collection.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class Watch {

	public static void main(String[] args) {
		
		String watch1="HMT";
		String watch2="fasttarck";
		String watch3="titan";
		String watch4="rolex";
		String watch5="timex";
		
		Collection<String> watch=new ArrayList<String>();
		
		watch.add(watch1);
		watch.add(watch2);
		watch.add(watch3);
		watch.add(watch4);
		watch.add(watch5);
		
		for(String ref:watch)
		{
			System.out.println(ref);
		}
		
		System.out.println("---------------Iterator--------------------------------");
		
		Iterator<String> ref=watch.iterator();
		
		while(ref.hasNext())
		{
			String element=ref.next();
			System.out.println(element);
		}
		
	}
}
