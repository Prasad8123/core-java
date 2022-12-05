package com.xworkz.interview;

import java.util.Scanner;

public class FaibaonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstNo=0;
		int secondNo=1;
		int result;
		int userNo;
		int count=0;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter anyn number");
		userNo=sc.nextInt();
		
		while(true)
		{
			result=firstNo+secondNo;
			count++;
			
			if(result >=userNo)
			{
				break;
			}
			
			firstNo=secondNo;
			secondNo=result;
			
			System.out.println("\n Fibanacci No.[" +count + "] -> " + result);
			
		}
		
    sc.close();
	}

}
