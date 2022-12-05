package com.xworkz.interview;

public class CountNoOfDigitsGivNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=36737738;
		int count =0;
		
		while(num!=0)
		{
		num /=10;
			
		    count++;
		}
		
		System.out.println("count the give no in digits:- " + count);

	}

}
