package com.xworkz.collection.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ShoesSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int s1=5;
		int s2=6;
		int s3=7;
		int s4=8;
		int s5=9;
		int s6=10;
		int s7=11;
		int s8=12;
		int s9=6;
		int s10=8;
		int s11=9;
		int s12=10;
		int s13=6;
		int s14=5;
		int s15=4;
		
		
		// Boxing
		
		Collection<Integer> shoesSize=new ArrayList<Integer>();
		shoesSize.add(s1);
		shoesSize.add(s2);
		shoesSize.add(s3);
		shoesSize.add(s4);
		shoesSize.add(s5);
		shoesSize.add(s6);
		shoesSize.add(s7);
		shoesSize.add(s8);
		shoesSize.add(s9);
		shoesSize.add(s10);
	    shoesSize.add(s11);
		shoesSize.add(s12);
		shoesSize.add(s13);
		shoesSize.add(s14);
		shoesSize.add(s15);
		
		
		System.out.println(shoesSize);
		
		// Un-Boxing
		for(int ref:shoesSize)
		{
			System.out.println(ref);
		}
		
		System.out.println("--------------------Iterator---------------------------");
		
		//Boxing
		
		Iterator<Integer> size=shoesSize.iterator();
		
		while(size.hasNext()) {
			
			
			// Un-Boxing
			
			int element=size.next();
			System.out.println(element);
		}
		

	}

}
