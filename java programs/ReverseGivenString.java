package com.xworkz.interview;

public class ReverseGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="java ";
		String reverseString="";
		
	for(int i=s1.length()-1; i>=0; i--)
		{
			reverseString= reverseString+s1.charAt(i);
	}
		
		System.out.println(reverseString);
		
	

	}

}
