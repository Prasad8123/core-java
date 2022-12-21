package com.xworkz.collection.treeset;

import java.util.Collection;
import java.util.TreeSet;

public class Coupoun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		String c1="Amezon";
		String c2="flipkart";
		String c3="zometo";
		String c4="sweegi";
		String c5="jio";
		String c6="myntra";
		String c7="airtel";
		String c8="vi";
		String c9="ajio";
		String c10="recharge coupon";
		String c11="food coupoun";
		String c12="cash coupoun";
		
		Collection<String> cp= new TreeSet<String>();
		cp.add(c12);
		cp.add(c11);
		cp.add(c10);
		cp.add(c9);
		cp.add(c8);
		cp.add(c7);
		cp.add(c6);
		cp.add(c5);
		cp.add(c4);
		cp.add(c3);
		cp.add(c2);
		cp.add(c1);
		
		System.out.println("no of coupouns " + cp.size());
		
		cp.clear();
		
		System.out.println("after clear method");
		
		System.out.println("no of coupouns " + cp.size());
		

	}

}
