package com.xworkz.interview;

import java.util.Arrays;


public class TwinProgram {
	
	
	public static boolean twinWords(String s1, String s2)
	{
		boolean isTwin=false;
		
		if(s1.length() == s2.length())
		{
			char ch1[]=s1.toCharArray();
			char ch2[]=s2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
		    
			
			if(Arrays.equals(ch1, ch2))
			{
				isTwin=true;
			
			}
			
			else
			{
				isTwin=false;
			}	
		
		}
		
		else
		{
			isTwin=false;
			
			
		}
		
		return isTwin;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     
		System.out.println(twinWords("silent","listen"));
		System.out.println(twinWords("care","race"));
	    System.out.println(twinWords("java","jav"));
	    System.out.println(twinWords(" "," "));
		System.out.println(twinWords("java","program"));

	}

}
