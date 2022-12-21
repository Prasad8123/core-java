package com.xworkz.collection.treeset;

import java.util.ArrayList;
import java.util.Collection;

public class Sweets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String s1="laddu";
		String s2="geelebi";
		String s3="cova";
		String s4="gangri";
		String s5="gulab jamnu";
		String s6="kheer";
		String s7="halwa";
		String s8="rasagulla";
		String s9="kulfi";
		String s10="soan papadi";
		String s11="peda";
		String s12="modak";
		String s13="kesari bath";
		
		Collection<String> collect=new ArrayList<String>();
		collect.add(s1);
		collect.add(s2);
		collect.add(s3);
		collect.add(s4);
		collect.add(s5);
		collect.add(s6);
		collect.add(s7);
		collect.add(s8);
		collect.add(s9);
		collect.add(s10);
		collect.add(s11);
		collect.add(s12);
		collect.add(s13);
		
		System.out.println("no of sweets : " + collect.size());
		
		collect.clear();
		
		System.out.println("After the clear method");
		
		System.out.println("no of sweets : " + collect.size());
		
		
		

	}

}
