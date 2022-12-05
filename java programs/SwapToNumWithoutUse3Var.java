package com.xworkz.interview;

public class SwapToNumWithoutUse3Var {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=10;
		int num2=20;
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("swapping two numbers are " + num1 + " " + num2);
		

	}

}
