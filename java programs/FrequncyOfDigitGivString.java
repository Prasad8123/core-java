package com.xworkz.interview;

import java.util.Scanner;

public class FrequncyOfDigitGivString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=sc.nextLine();
		
		System.out.println("frequnacy of character");
		char ch=sc.nextLine().charAt(0);
		int count=0;
		
		 for(int i=0; i<s1.length() ; i++)
			
		{
		 
			 if(ch==s1.charAt(i))
			 {
			 count++;
			
			 }
		}
		
		System.out.println("given string frequnacy of character " + count);

		sc.close();
	}

}
