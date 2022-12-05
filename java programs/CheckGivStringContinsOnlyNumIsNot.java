package com.xworkz.interview;

public class CheckGivStringContinsOnlyNumIsNot {
	
	
	public static boolean isEmpty( CharSequence cs)
	{
		return cs==null ||cs.length()==0;
	}
	
	public static boolean isDigits(CharSequence cs)
	{
		if(isEmpty(cs))
		{
			return false;
		}
		
		int len=cs.length();
		for(int i=0; i<len; i++)
		{
			if(!Character.isDigit(cs.charAt(i)))
			{
				return false;
			}
		}
		
		return true;
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isDigits("132242"));
		System.out.println(isDigits("gsh7668"));
    
	}

}
