package com.xworkz.interview;

import java.util.Scanner;

public class FrequncyOfDigitGivNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int digit,num;
		
		System.out.println("enter any number");
		
		   num=sc.nextInt();
		System.out.println("Digit\tFrequncy");
		
		for(int i=0; i<=9; i++)
		{
			int temp=num;
			int count=0;
			
			while(temp>0)
			{
				digit=temp%10;
				
				if(digit==i)
				{
					count++;
					
				}
				
				temp = temp/10;
				
			}
			
			if(count>0)
			{
				System.out.println(i+"\t"+count);
			}
		}
		
		sc.close();	

	}

}
