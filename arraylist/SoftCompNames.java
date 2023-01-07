package com.xworkz.collection.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SoftCompNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String soft1="tcs";
		String soft2="wipro";
		String soft3="cognigent";
		String soft4="camgmini";
		String soft5="ntt data";
		String soft6="global quest";
		String soft7="facebook";
		String soft8="google";
		String soft9="first america";
		String soft10="sandi tect";
		String soft11="tata tech";
		String soft12="jio";
		String soft13="paytem";
		String soft14="tanragyan";
		String soft15="cgi tech";
		String soft16="infosys";
		String soft17="imposys";
		String soft18="acuvate";
		String soft19="ibm";
		String soft20="hcl";
		
		Collection<String> company=new ArrayList<String>();
		
		company.add(soft1);
		company.add(soft2);
		company.add(soft20);
		company.add(soft19);
		company.add(soft18);
		company.add(soft17);
		company.add(soft16);
		company.add(soft15);
		company.add(soft14);
		company.add(soft13);
		company.add(soft12);
		company.add(soft11);
		company.add(soft10);
		company.add(soft9);
		company.add(soft8);
		company.add(soft7);
		company.add(soft6);
		company.add(soft5);
		company.add(soft4);
		company.add(soft3);
		company.add(soft2);
		company.add(soft1);
		
		
		for(String element:company)
		{
			System.out.println(element);
		}
		
		System.out.println("--------------------Iterator---------------------------------------");
		
		
		Iterator<String> soft=company.iterator();
	
		while(soft.hasNext())
		{
			String element=soft.next();
			System.out.println(element);
		}
		
	}

}
