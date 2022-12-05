package com.xworkz.interview;

import java.util.Scanner;

public class GivNoEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter a num");
		int num =sc.nextInt();
		
		
		  if(num%2 ==0)
		{
			System.out.println("given num is even");
		}
		
		else
			System.out.println("given num is odd");
		  
		  sc.close();

	}

}
