package com.xworkz.interview;

public class Multiplyes3And6GivArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {3,43,24,35,36,300,330,350,600,500,200,4366,70,37,30};
		
		System.out.print("multiplyes of 3 :-");
		for(int i=0; i<a.length; i++)
		{
			if(a[i] %3==0)
			{
				System.out.print(a[i]+ " ");
				
				
			}
			
		}
		System.out.println();
		
		System.out.print("multiplyes of 6 :-");
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%6 ==0)
			{
				System.out.print(a[i] + " ");
				
			}
		}

	}

}
