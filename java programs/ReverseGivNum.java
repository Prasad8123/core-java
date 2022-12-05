package com.xworkz.interview;

public class ReverseGivNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num =123456;
		int reverseNum=0;
		
		while(num !=0)
		{
			int digit =num %10;
			reverseNum = reverseNum *10 +digit;
			
			num /=10;	
		}
		
		System.out.println("Reverse the given num is := " + reverseNum );
	}

}
