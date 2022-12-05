package com.xworkz.interview;

public class CountNumCharGivStringWithoutLengthMethod {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		String s1="java is a programing language";
		int i=0;
		
		for(char c : s1.toCharArray())
		{
			i++;
		}
		System.out.println("String length : - " + i);

	}

}
