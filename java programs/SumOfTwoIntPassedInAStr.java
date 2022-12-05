package com.xworkz.interview;

public class SumOfTwoIntPassedInAStr {
	
	
	public static boolean isNumeric(String s1, String s2)
	{
		boolean isNumeri=false;
		
	     if()
	{
	    	int n1=Integer.parseInt(s1);
			int n2=Integer.parseInt(s2);
			
			isNumeri=true;
			int sum=n1+n2;
			
		System.out.println(sum);
			
	
	}
	     else
	     {
	    	 System.out.println("0");
	     }
		
	    
		
		
		return  isNumeri;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isNumeric("1", "1")); 
		System.out.println(isNumeric("1", "a"));
		System.out.println(isNumeric("1", " "));
		System.out.println(isNumeric(" ", " "));

	}

}
