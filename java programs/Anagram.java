package com.xworkz.interview;


import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the first string");
		String s1=sc.nextLine();
		
		System.out.println("enter the second string");
		String s2=sc.nextLine();
		
		if(s1.length() == s2.length())
		{
			char[] ch=s1.toCharArray();
			char ch1[]=s2.toCharArray();
			
			Arrays.sort(ch);
			Arrays.sort(ch1);
		
			boolean result=Arrays.equals(ch ,ch1);
			
			if(result)
			{
				System.out.println(s1 + "  and " + s2 + " is a anagram");
			}
			else
			{
				System.out.println(s1 + "  and" + s2 + "  is  not a anagram");
			}
			
		}
		
		else
		{
			System.out.println(s1 + "  and" + s2 + "  this is not anagram");
		}
		
     sc.close();
	}

}
