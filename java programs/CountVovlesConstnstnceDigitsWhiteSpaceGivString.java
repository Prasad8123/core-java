package com.xworkz.interview;

public class CountVovlesConstnstnceDigitsWhiteSpaceGivString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="java is a 6346  programin 624 language";
		int vowals=0;
		int consonents=0;
		int digits=0;
		int spaces=0;
		
		for(int i=0; i<s1.length() ; i++)
		{
			
	    char ch=s1.charAt(i);
		
		if(ch =='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			  vowals++;
		}
		else if(ch >='a' && ch <='z')
		{
			consonents++;
		}
		else if(ch >='0' && ch <='9')
		{
			digits++;
		}
		
		else if(ch==' ')
		{
			spaces++;
		}
		}
		
		System.out.println("vowles :- " +vowals);
		System.out.println("consonents: - " +consonents);
		System.out.println("digits :-"+digits);
		System.out.println("white spaces: " +spaces);
	}

}
